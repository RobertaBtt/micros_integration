package com.pos.common.rabbitmq.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.function.Supplier;

public class RabbitEnvironmentProperties extends RabbitProperties {

    private static final Logger logger = LoggerFactory.getLogger(RabbitEnvironmentProperties.class);



    private static final String[] _APPLICATION_NAME = {"spring.application.name", "micronaut.application.name"};
    private static final String _HOST = "pos.rabbit.host";
    private static final String _PORT = "pos.rabbit.port";
    private static final String _USERNAME = "pos.rabbit.username";
    private static final String _PASSWORD = "pos.rabbit.password";
    private static final String _RPC_INVOKE_METHOD_TIMEOUT_IN_MILLIS = "pos.rabbit.rpc.invoke.method.timeout.in.millis";
    private static final String _EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES = "pos.rabbit.expiry.old.message.task.period.in.minutes";
    private static final String _LONG_LIVED_MESSAGE_IN_MILLIS = "pos.rabbit.long.lived.message.in.millis";
    private static final String _INIT_MAX_RETRIES_ON_FAILURE = "pos.rabbit.init.max.retries.on.failure";
    private static final String _INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = "pos.rabbit.init.next.retry.in.millis.on.failure";
    private static final String _RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE = "pos.rabbit.rpc.invoke.method.max.retries.on.failure";
    private static final String _RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE = "pos.rabbit.rpc.invoke.method.next.retry.in.millis.on.failure";
    private static final String _CHANNEL_QOS_BUFFER_SIZE = "pos.rabbit.channel.qos.buffer.size";
    private static final String _CONNECTION_HEARTBEAT_IN_SECONDS = "pos.rabbit.connection.hearbeat.in.seconds";
    private static final String _CONNECTION_NETWORK_RECOVERY_IN_MILLIS = "pos.rabbit.connection.network.recovery.in.millis";

    public RabbitEnvironmentProperties(RabbitEnvironment enviroment) {
        //required
        Optional<String> appName = enviroment.getProperty(_APPLICATION_NAME[0], String.class);
        if (!appName.isPresent()) {
            this.applicationName = enviroment.getProperty(_APPLICATION_NAME[1], String.class).orElseThrow(throwRequiredProperty(_APPLICATION_NAME));
        }
        this.host = enviroment.getProperty(_HOST, String.class).orElseThrow(throwRequiredProperty(_HOST));
        this.port = enviroment.getProperty(_PORT, Integer.class).orElseThrow(throwRequiredProperty(_PORT));
        this.username = enviroment.getProperty(_USERNAME, String.class).orElseThrow(throwRequiredProperty(_USERNAME));
        this.password = enviroment.getProperty(_PASSWORD, String.class).orElseThrow(throwRequiredProperty(_PASSWORD));

        //optinal
        this.rpcInvokeMethodTimeOutInMillis = enviroment.getProperty(_RPC_INVOKE_METHOD_TIMEOUT_IN_MILLIS, Long.class).orElse(DEFAULT_RPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS);
        this.expiryOldMessageTaskPeriodInMinutes = enviroment.getProperty(_EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES, Long.class).orElse(DEFAULT_EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES);
        this.longLivedMessageInMillis = enviroment.getProperty(_LONG_LIVED_MESSAGE_IN_MILLIS, Long.class).orElse(DEFAULT_LONG_LIVED_MESSAGE_IN_MILLIS);
        this.initMaxRetriesOnFailure = enviroment.getProperty(_INIT_MAX_RETRIES_ON_FAILURE, Integer.class).orElse(DEFAULT_INIT_MAX_RETRIES_ON_FAILURE);
        this.initNextRetryInMillisOnFailure = enviroment.getProperty(_INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE, Long.class).orElse(DEFAULT_INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE);
        this.rpcInvokeMethodMaxRetriesOnFailure = enviroment.getProperty(_RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE, Integer.class).orElse(DEFAULT_RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE);
        this.rpcInvokeMethodNextRetryInMillisOnFailure = enviroment.getProperty(_RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE, Integer.class).orElse(DEFAULT_RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE);
        this.channelQosBufferSize = enviroment.getProperty(_CHANNEL_QOS_BUFFER_SIZE, Integer.class).orElse(DEFAULT_CHANNEL_QOS_BUFFER_SIZE);
        this.connectionHeartbeatInSeconds = enviroment.getProperty(_CONNECTION_HEARTBEAT_IN_SECONDS, Integer.class).orElse(DEFAULT_CONNECTION_HEARTBEAT_IN_SECONDS);
        this.connectionNetworkRecoveryInMillis = enviroment.getProperty(_CONNECTION_NETWORK_RECOVERY_IN_MILLIS, Integer.class).orElse(DEFAULT_CONNECTION_NETWORK_RECOVERY_IN_MILLIS);

        overrideDefaults();

        logger.info("{}={}", _APPLICATION_NAME, this.applicationName);
        logger.info("{}={}", _HOST, this.host);
        logger.info("{}={}", _PORT, this.port);
        //logger.info("{}={}", _USERNAME, username);
        //logger.info("{}={}", _PASSWORD, password);
        logger.info("{}={}", _RPC_INVOKE_METHOD_TIMEOUT_IN_MILLIS, rpcInvokeMethodTimeOutInMillis);
        logger.info("{}={}", _EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES, expiryOldMessageTaskPeriodInMinutes);
        logger.info("{}={}", _LONG_LIVED_MESSAGE_IN_MILLIS, longLivedMessageInMillis);
        logger.info("{}={}", _INIT_MAX_RETRIES_ON_FAILURE, initMaxRetriesOnFailure);
        logger.info("{}={}", _INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE, initNextRetryInMillisOnFailure);
        logger.info("{}={}", _RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE, rpcInvokeMethodMaxRetriesOnFailure);
        logger.info("{}={}", _RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE, rpcInvokeMethodNextRetryInMillisOnFailure);
        logger.info("{}={}", _CHANNEL_QOS_BUFFER_SIZE, channelQosBufferSize);
        logger.info("{}={}", _CONNECTION_HEARTBEAT_IN_SECONDS, connectionHeartbeatInSeconds);
        logger.info("{}={}", _CONNECTION_NETWORK_RECOVERY_IN_MILLIS, connectionNetworkRecoveryInMillis);
    }

    private Supplier<RuntimeException> throwRequiredProperty(String key) {
        return () -> new RuntimeException("Please, inform the property '" + key + "' in the .yml file.");
    }
    private Supplier<RuntimeException> throwRequiredProperty(String[] key) {
        return () -> new RuntimeException("Please, inform the property '"+key[0]+"' or '"+key[1]+"'  in the .yml file.");
    }
}
