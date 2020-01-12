package com.pos.common.rabbitmq.config;

import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.ConnectionFactory;
import com.pos.common.rabbitmq.Topology;
import com.pos.common.rabbitmq.consumer.ConsumerFactory;
import com.pos.common.rabbitmq.infrastructure.agent.AgentProducer;
import com.pos.common.rabbitmq.infrastructure.agent.RPCAgentServer;
import com.pos.common.rabbitmq.message.Message;
import com.pos.common.rabbitmq.rpc.client.RPCClient;
import com.pos.common.rabbitmq.rpc.client.RPCResponses;
import com.pos.common.rabbitmq.rpc.server.RPCServer;

import java.util.concurrent.TimeUnit;

public abstract class RabbitProperties {

    public static final long DEFAULT_RPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS = TimeUnit.MINUTES.toMillis(1);
    public static final long DEFAULT_EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES = 20;
    public static final long DEFAULT_LONG_LIVED_MESSAGE_IN_MILLIS = TimeUnit.SECONDS.toMillis(90);

    public static final Integer DEFAULT_INIT_MAX_RETRIES_ON_FAILURE = Integer.MAX_VALUE;
    public static final Long DEFAULT_INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = TimeUnit.SECONDS.toMillis(10L);
    public static final Integer DEFAULT_RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE = 3;
    public static final Integer DEFAULT_RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE = 250/ DEFAULT_RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE;

    /**
     * The consumer utilisation should increase with the prefetch limit until we reach a limit of about 30.
     * https://www.rabbitmq.com/blog/2014/04/14/finding-bottlenecks-with-rabbitmq-3-3/
     */
    public static final Integer DEFAULT_CHANNEL_QOS_BUFFER_SIZE = 30;

    public static final int DEFAULT_CONNECTION_HEARTBEAT_IN_SECONDS = 60;

    // attempt recovery every 10 seconds
    public static final int DEFAULT_CONNECTION_NETWORK_RECOVERY_IN_MILLIS = 10000;

    protected String applicationName;
    protected String host;
    protected Integer port;
    protected String username;
    protected String password;

    protected Long rpcInvokeMethodTimeOutInMillis= DEFAULT_RPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS;
    protected Long expiryOldMessageTaskPeriodInMinutes= DEFAULT_EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES;
    protected Long longLivedMessageInMillis= DEFAULT_LONG_LIVED_MESSAGE_IN_MILLIS;
    protected Integer initMaxRetriesOnFailure= DEFAULT_INIT_MAX_RETRIES_ON_FAILURE;
    protected Long initNextRetryInMillisOnFailure= DEFAULT_INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE;
    protected Integer rpcInvokeMethodMaxRetriesOnFailure= DEFAULT_RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE;
    protected Integer rpcInvokeMethodNextRetryInMillisOnFailure= DEFAULT_RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE;
    protected Integer channelQosBufferSize= DEFAULT_CHANNEL_QOS_BUFFER_SIZE;
    protected Integer connectionHeartbeatInSeconds= DEFAULT_CONNECTION_HEARTBEAT_IN_SECONDS;
    protected Integer connectionNetworkRecoveryInMillis= DEFAULT_CONNECTION_NETWORK_RECOVERY_IN_MILLIS;

    public String getAPPLICATION_NAME() {
        return applicationName;
    }

    public String getHOST() {
        return host;
    }

    public Integer getPORT() {
        return port;
    }

    public String getUSERNAME() {
        return username;
    }

    public String getPASSWORD() {
        return password;
    }

    public Long getRPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS() {
        return rpcInvokeMethodTimeOutInMillis;
    }

    public Long getEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES() {
        return expiryOldMessageTaskPeriodInMinutes;
    }

    public Long getLONG_LIVED_MESSAGE_IN_MILLIS() {
        return longLivedMessageInMillis;
    }

    public Integer getINIT_MAX_RETRIES_ON_FAILURE() {
        return initMaxRetriesOnFailure;
    }

    public Long getINIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE() {
        return initNextRetryInMillisOnFailure;
    }

    public Integer getRPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE() {
        return rpcInvokeMethodMaxRetriesOnFailure;
    }

    public Integer getRPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE() {
        return rpcInvokeMethodNextRetryInMillisOnFailure;
    }

    public Integer getCHANNEL_QOS_BUFFER_SIZE() {
        return channelQosBufferSize;
    }

    public Integer getCONNECTION_HEARTBEAT_IN_SECONDS() {
        return connectionHeartbeatInSeconds;
    }

    public Integer getCONNECTION_NETWORK_RECOVERY_IN_MILLIS() {
        return connectionNetworkRecoveryInMillis;
    }


    protected void overrideDefaults() {
        RPCServer.overrideDefaults(this);
        ConsumerFactory.overrideDefaults(this);
        ConnectionFactory.overrideDefaults(this);
        ChannelFactory.overrideDefaults(this);
        RPCClient.overrideDefaults(this);
        Topology.overrideDefaults(this);
        RPCResponses.overrideDefaults(this);
        AgentProducer.overrideDefaults(this);
        RPCAgentServer.overrideDefaults(this);
        Message.overrideDefaults(this);
    }

}
