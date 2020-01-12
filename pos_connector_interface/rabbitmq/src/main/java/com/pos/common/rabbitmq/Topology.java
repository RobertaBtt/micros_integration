package com.pos.common.rabbitmq;

import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.utils.RetryWithDelay;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Topology {

    private final static Logger logger = LoggerFactory.getLogger(Topology.class);

    private static Integer INIT_MAX_RETRIES_ON_FAILURE = RabbitProperties.DEFAULT_INIT_MAX_RETRIES_ON_FAILURE;
    private static Long INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = RabbitProperties.DEFAULT_INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE;

    public static void overrideDefaults(RabbitProperties properties) {
        INIT_MAX_RETRIES_ON_FAILURE = properties.getINIT_MAX_RETRIES_ON_FAILURE();
        INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = properties.getINIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE();
    }

    public static Builder newOne(Channel channel) {
        return new Builder(channel);
    }

    public static class Builder {

        private Channel channel;
        private String exchangeName;
        private String queueName;
        private String routingKey;

        public Builder(Channel channel) {
            this.channel = channel;
        }

        public Builder withQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public Builder withExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }

        public Builder withRoutingKey(String routingKey) {
            this.routingKey = routingKey;
            return this;
        }

        public void declare() {
            Observable.just(channel)
                    .doOnNext(ch -> ch.exchangeDeclare(exchangeName, BuiltinExchangeType.DIRECT, false, false, null))
                    .doOnError(e -> logger.warn("Error declaring exchange", e))
                    .doOnNext(ch -> ch.queueDeclare(queueName, false, false, false, null))
                    .doOnError(e -> logger.warn("Error declaring queue", e))
                    .doOnNext(ch -> ch.queueBind(queueName, exchangeName, Optional.ofNullable(routingKey).orElse(queueName)))
                    .doOnError(e -> logger.warn("Error binding queue to exchange", e))
                    .retryWhen(new RetryWithDelay(INIT_MAX_RETRIES_ON_FAILURE, INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE))
                    .doOnError(e -> logger.error("Error declaring topology", e))
                    .blockingFirst();

        }


    }

}
