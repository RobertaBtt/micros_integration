package com.pos.common.rabbitmq;

import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.utils.RetryWithDelay;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChannelFactory {

    private final static Logger logger = LoggerFactory.getLogger(ChannelFactory.class);

    private static Integer CHANNEL_QOS_BUFFER_SIZE = RabbitProperties.DEFAULT_CHANNEL_QOS_BUFFER_SIZE;
    private static Integer INIT_MAX_RETRIES_ON_FAILURE = RabbitProperties.DEFAULT_INIT_MAX_RETRIES_ON_FAILURE;
    private static Long INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = RabbitProperties.DEFAULT_INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE;

    public static void overrideDefaults(RabbitProperties properties) {
        CHANNEL_QOS_BUFFER_SIZE = properties.getCHANNEL_QOS_BUFFER_SIZE();
        INIT_MAX_RETRIES_ON_FAILURE = properties.getINIT_MAX_RETRIES_ON_FAILURE();
        INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = properties.getINIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE();
    }

    public static Builder newOne(Connection connection) {
        return new Builder(connection);
    }

    public static class Builder {

        private final Connection connection;
        private Integer bufferSize = CHANNEL_QOS_BUFFER_SIZE;
        private int maxRetries = INIT_MAX_RETRIES_ON_FAILURE;
        private long retryMillis = INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE;

        public Builder(Connection connection) {
            this.connection = connection;
        }

        public Builder withBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }

        public Builder withRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder withRetryMillis(long millis) {
            if (millis > 0) {
                this.retryMillis = millis;
            } else {
                this.retryMillis = 1;
            }
            return this;
        }

        public Channel create() {

            Channel channel = Observable.fromCallable(() -> connection.createChannel())
                    .doOnError(e -> logger.warn("Error creating channel", e))
                    .retryWhen(new RetryWithDelay(maxRetries, retryMillis))
                    .doOnError(e -> logger.error("Error creating channel", e))
                    .blockingFirst();

            if (bufferSize != null) {
                Observable.just(channel)
                        .doOnNext(ch -> ch.basicQos(bufferSize))
                        .doOnError(e -> logger.warn("Error setting basicQos", e))
                        .retryWhen(new RetryWithDelay(maxRetries, retryMillis))
                        .doOnError(e -> logger.error("Error setting basicQos", e))
                        .blockingFirst();
            }

            return channel;
        }

    }

}
