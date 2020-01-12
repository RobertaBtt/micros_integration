package com.pos.common.rabbitmq;

import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.utils.RetryWithDelay;
import com.rabbitmq.client.AlreadyClosedException;
import com.rabbitmq.client.Connection;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.LinkedBlockingQueue;



public class ConnectionFactory {

    private final static Logger logger = LoggerFactory.getLogger(ConnectionFactory.class);

    private static LinkedBlockingQueue<Connection> connections = new LinkedBlockingQueue();

    private static Integer INIT_MAX_RETRIES_ON_FAILURE = RabbitProperties.DEFAULT_INIT_MAX_RETRIES_ON_FAILURE;
    private static Long INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = RabbitProperties.DEFAULT_INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE;
    private static int CONNECTION_HEARTBEAT_IN_SECONDS = RabbitProperties.DEFAULT_CONNECTION_HEARTBEAT_IN_SECONDS;
    private static int CONNECTION_NETWORK_RECOVERY_IN_MILLIS = RabbitProperties.DEFAULT_CONNECTION_NETWORK_RECOVERY_IN_MILLIS;

    public static void overrideDefaults(RabbitProperties properties) {
        INIT_MAX_RETRIES_ON_FAILURE = properties.getINIT_MAX_RETRIES_ON_FAILURE();
        CONNECTION_HEARTBEAT_IN_SECONDS = properties.getCONNECTION_HEARTBEAT_IN_SECONDS();
        CONNECTION_NETWORK_RECOVERY_IN_MILLIS = properties.getCONNECTION_NETWORK_RECOVERY_IN_MILLIS();
        INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = properties.getINIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE();
    }

    public static Builder newOne(com.rabbitmq.client.ConnectionFactory rabbitConnectionFactory) {
        return new Builder(rabbitConnectionFactory);
    }

    public static Builder newOne() {
        return new Builder(new com.rabbitmq.client.ConnectionFactory());
    }

    public static class Builder {

        private final com.rabbitmq.client.ConnectionFactory rabbitConnectionFactory;

        private String host;
        private String username;
        private String password;
        private Integer port;

        private int maxRetries = INIT_MAX_RETRIES_ON_FAILURE;
        private long retryMillis = INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE;

        public Builder(com.rabbitmq.client.ConnectionFactory rabbitConnectionFactory) {
            this.rabbitConnectionFactory = rabbitConnectionFactory;
        }

        public Builder withHost(String host) {
            this.host = host;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withPort(int port) {
            this.port = port;
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


        private void setPort(com.rabbitmq.client.ConnectionFactory factory) {
            if (this.port == null) {
                return;
            }

            factory.setPort(port);
        }

        private void setPassword(com.rabbitmq.client.ConnectionFactory factory) {
            if (this.password == null) {
                return;
            }

            factory.setPassword(password);
        }

        private void setUsername(com.rabbitmq.client.ConnectionFactory factory) {
            if (this.username == null) {
                return;
            }

            factory.setUsername(username);
        }

        private void setHost(com.rabbitmq.client.ConnectionFactory factory) {
            if (this.host == null) {
                return;
            }

            factory.setHost(host);
        }


        public Connection create() {

            setHost(rabbitConnectionFactory);

            setUsername(rabbitConnectionFactory);

            setPassword(rabbitConnectionFactory);

            setPort(rabbitConnectionFactory);

            // set the heartbeat timeout to 60 seconds
            rabbitConnectionFactory.setRequestedHeartbeat(CONNECTION_HEARTBEAT_IN_SECONDS);

            // enable automatic recovery
            rabbitConnectionFactory.setAutomaticRecoveryEnabled(true);

            // disable topology recovery
            rabbitConnectionFactory.setTopologyRecoveryEnabled(true);

            // attempt recovery every 10 seconds
            rabbitConnectionFactory.setNetworkRecoveryInterval(CONNECTION_NETWORK_RECOVERY_IN_MILLIS);

            Connection connection = Observable.fromCallable(() -> rabbitConnectionFactory.newConnection())
                    .doOnError(e -> logger.warn("Error creating connection to {}:{} {}",host, port, username, e))
                    .retryWhen(new RetryWithDelay(maxRetries, retryMillis))
                    .doOnError(e -> logger.error("Error creating connection to {}:{} {}",host, port, username, e))
                    .blockingFirst();

            connections.add(connection);

            return connection;
        }


    }

    public static synchronized void close() {
        connections.stream().forEach(ConnectionFactory::close);
        connections.clear();
    }

    public static final void close(Connection connection) {
        try {
            connection.close();
            connections.remove(connection);
        } catch (AlreadyClosedException e) {
        } catch (Exception e) {
            logger.warn("Unexpected error closing connection", e);
        }
    }

}
