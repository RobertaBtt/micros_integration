package com.pos.common.rabbitmq.producer;


import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.serialize.JsonSerializer;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.UUID;

public class ProducerFactory {

    private final static Logger logger = LoggerFactory.getLogger(ProducerFactory.class);


    public static Builder newOne(Channel channel, String exchangeName, String routingKey) {
        return new Builder(channel, exchangeName, routingKey);
    }

    public static class Builder {

        private final Channel channel;
        private final String exchangeName;
        private final String routingKey;
        private AMQP.BasicProperties props;
        private byte[] body;

        public Builder(Channel channel, String exchangeName, String routingKey) {
            this.channel = channel;
            this.exchangeName = exchangeName;
            this.routingKey = routingKey;
        }

        public Builder withProperties(AMQP.BasicProperties props) {
            this.props = props;
            return this;
        }

        public Builder withBody(byte[] body) {
            this.body = body;
            return this;
        }

        public Builder withBody(Object body) {
            this.body = JsonSerializer.instance().serialize(body);
            return this;
        }

        public void publish() throws RemoteException {
            sanitizeProperties();

            try {
                channel.basicPublish(exchangeName, routingKey, props, body);
                if (logger.isTraceEnabled()) {
                    logger.trace("Published to '{}' replyTo '{}' messageId {} body '{}'", routingKey, props.getReplyTo(), props.getCorrelationId(), toStringBody(body));
                } else if (logger.isDebugEnabled()) {
                    logger.debug("Published to '{}' replyTo '{}' messageId {}", routingKey, props.getReplyTo(), props.getCorrelationId());
                }
            } catch (Exception e) {
                final String code = "Sending.Message.Rabbit.Unexpected.Error";
                final String description = "Error publishing to '" + routingKey + "' replyTo '" + props.getReplyTo() + "' messageId " + props.getCorrelationId() + " body '" + toStringBody(body) + "'";

                throw new RemoteException(ErrorCode.of(code, description), e);
                //throw new RemoteException("Error publishing to '" + routingKey + "' replyTo '" + props.getReplyTo() + "' messageId " + props.getCorrelationId() + " body '" + toStringBody(body) + "'", e);
            }
        }

        private void sanitizeProperties() {
            if (props == null) {
                props = new AMQP.BasicProperties
                        .Builder()
                        .correlationId(UUID.randomUUID().toString())
                        .timestamp(new Date())
                        .build();
            }
        }

        private static String toStringBody(byte[] body) {
            return new String(body);
        }

    }
}
