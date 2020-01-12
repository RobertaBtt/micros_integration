package com.pos.common.rabbitmq.message;


import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.message.task.FailedAckRetryTask;
import com.pos.common.rabbitmq.message.task.FailedRejectRetryTask;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Envelope;
import io.reactivex.disposables.Disposable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@EqualsAndHashCode
public class Message implements Acknowledger {

    private final static Logger logger = LoggerFactory.getLogger(Message.class);

    private static final ConcurrentHashMap<String, Message> failedAckByCorrelationId = new ConcurrentHashMap();
    private static final ConcurrentHashMap<String, Message> failedRejectByCorrelationId = new ConcurrentHashMap();

    private static long LONG_LIVED_MESSAGE_IN_MILLIS = RabbitProperties.DEFAULT_LONG_LIVED_MESSAGE_IN_MILLIS;


    private static Disposable FAILED_ACK_RETRY_TASK = FailedAckRetryTask.newOne(failedAckByCorrelationId)
            .withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(RabbitProperties.DEFAULT_EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES)
            .withLONG_LIVED_MESSAGE_IN_MILLIS(RabbitProperties.DEFAULT_LONG_LIVED_MESSAGE_IN_MILLIS)
            .runInBackground();

    private static Disposable FAILED_REJECT_RETRY_TASK = FailedRejectRetryTask.newOne(failedRejectByCorrelationId)
            .withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(RabbitProperties.DEFAULT_EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES)
            .withLONG_LIVED_MESSAGE_IN_MILLIS(RabbitProperties.DEFAULT_LONG_LIVED_MESSAGE_IN_MILLIS)
            .runInBackground();

    public static void overrideDefaults(RabbitProperties properties) {
        FAILED_ACK_RETRY_TASK.dispose();
        FAILED_ACK_RETRY_TASK = FailedAckRetryTask.newOne(failedAckByCorrelationId)
                .withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(properties.getEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES())
                .withLONG_LIVED_MESSAGE_IN_MILLIS(properties.getLONG_LIVED_MESSAGE_IN_MILLIS())
                .runInBackground();
        FAILED_REJECT_RETRY_TASK.dispose();
        FAILED_REJECT_RETRY_TASK = FailedRejectRetryTask.newOne(failedRejectByCorrelationId)
                .withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(properties.getEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES())
                .withLONG_LIVED_MESSAGE_IN_MILLIS(properties.getLONG_LIVED_MESSAGE_IN_MILLIS())
                .runInBackground();
        LONG_LIVED_MESSAGE_IN_MILLIS = properties.getLONG_LIVED_MESSAGE_IN_MILLIS();
    }

    private final Channel channel;
    private final String consumerTag;
    private final Envelope envelope;
    private final AMQP.BasicProperties headers;
    private final byte[] body;

    public Message(Channel channel, String consumerTag, Envelope envelope, AMQP.BasicProperties headers, byte[] body) {
        this.channel = channel;
        this.consumerTag = consumerTag;
        this.envelope = envelope;
        this.headers = headers;
        this.body = body;
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - headers.getTimestamp().getTime();
    }

    private void basicAck() throws IOException {
        channel.basicAck(envelope.getDeliveryTag(), false);
    }

    private void basicNack() throws IOException {
        channel.basicNack(envelope.getDeliveryTag(), false, true);
    }

    @Override
    public void ack() {
        try {
            basicAck();
            if (logger.isTraceEnabled()) {
                logger.trace("Acked message to '{}' replyTo '{}' messageId {} body '{}'", envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body));
            } else if (logger.isDebugEnabled()) {
                logger.debug("Acked message to '{}' replyTo '{}' messageId {}", envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId());
            }
        } catch (Exception e) {
            logger.error("Error Acking message to '{}' replyTo '{}' messageId {} body '{}'", envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body), e);
            failedAckByCorrelationId.put(headers.getCorrelationId(), this);
        }
    }

    @Override
    public void reject() {
        try {
            basicNack();
            if (logger.isTraceEnabled()) {
                logger.trace("Rejected message to '{}' replyTo '{}' messageId {} body '{}'", envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body));
            } else if (logger.isDebugEnabled()) {
                logger.debug("Rejected message to '{}' replyTo '{}' messageId {}", envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId());
            }
        } catch (Exception e) {
            logger.error("Error rejecting message to '{}' replyTo '{}' messageId {} body '{}'", envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body), e);
            failedRejectByCorrelationId.put(headers.getCorrelationId(), this);
        }
    }

    @Override
    public void ackUnwanted(Throwable cause) {
        try {
            basicAck();
            logger.error("Acked '{}' to '{}' replyTo '{}' messageId {} body '{}'", cause.getMessage(), envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body), cause);
        } catch (Exception e) {
            logger.error("Error Acking '{}' to '{}' replyTo '{}' messageId {} body '{}'", cause.getMessage(), envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body), e);
            failedAckByCorrelationId.put(headers.getCorrelationId(), this);
        }
    }

    @Override
    public void ackUnwanted(String reason) {
        try {
            basicAck();
            logger.warn("Acked '{}' to '{}' replyTo '{}' messageId {} body '{}'", reason, envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body));
        } catch (Exception e) {
            logger.error("Error Acking '{}' to '{}' replyTo '{}' messageId {} body '{}'", reason, envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body), e);
            failedAckByCorrelationId.put(headers.getCorrelationId(), this);
        }
    }

    @Override
    public void rejectUnwanted(String reason) {
        try {
            basicNack();
            logger.warn("Rejected '{}' to '{}' replyTo '{}' messageId {} body '{}'", reason, envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body));
        } catch (Exception e) {
            logger.error("Error rejecting '{}' to '{}' replyTo '{}' messageId {} body '{}'", reason, envelope.getRoutingKey(), headers.getReplyTo(), headers.getCorrelationId(), toStringBody(body), e);
            failedRejectByCorrelationId.put(headers.getCorrelationId(), this);
        }
    }

    public static void stopExpiryMessagesTask() {
        FAILED_ACK_RETRY_TASK.dispose();
        FAILED_REJECT_RETRY_TASK.dispose();
    }

    private static String toStringBody(byte[] body) {
        return new String(body);
    }
}
