package com.pos.common.rabbitmq.rpc;

import com.pos.common.rabbitmq.Topology;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RPCTopology {

    private final static Logger logger = LoggerFactory.getLogger(RPCTopology.class);

    public static Builder newOne(Channel channel) {
        return new Builder(channel);
    }

    public static class Builder {

        private Channel channel;
        private String exchangeName;
        private String requestQueueName;
        private String replyQueueName;


        public Builder(Channel channel) {
            this.channel = channel;
        }

        public Builder withExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }

        public Builder withRequestQueueName(String requestQueueName) {
            this.requestQueueName = requestQueueName;
            return this;
        }

        public Builder withReplyQueueName(String replyQueueName) {
            this.replyQueueName = replyQueueName;
            return this;
        }

        public void declare() {

            Topology.newOne(channel)
                    .withExchangeName(exchangeName)
                    .withQueueName(requestQueueName)
                    .declare();

            Topology.newOne(channel)
                    .withExchangeName(exchangeName)
                    .withQueueName(replyQueueName)
                    .declare();

        }


    }

}
