package com.connector.micros.infrastructure.client;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.infrastructure.agent.AgentProducer;
import com.pos.common.rabbitmq.infrastructure.microservice.AgentTopology;
import com.pos.common.rabbitmq.producer.RemoteException;
import com.rabbitmq.client.Connection;

public class Client {

    private ConfigReader properties;
    private Connection connection;

    public Client(ConfigReader properties, Connection connection) {
        this.properties = properties;
        this.connection = connection;

        //create topology
        AgentTopology.newOne(ChannelFactory.newOne(connection).withBufferSize(null).create())
                .withApplicationName(getApplicationName(properties))
                .declare(getAgentId(properties), getPositiveDeltaOrdersQueueName());
    }

    public void sendPositiveDeltaOrders(com.pos.connector.dto.AgentOrder posOrder) throws RemoteException {
        AgentProducer.newOne(connection)
                .withApplicationName(getApplicationName(properties))
                .withAgentId(getAgentId(properties))
                .withQueueName(getPositiveDeltaOrdersQueueName())
                .publish(posOrder);
    }

    public void sendNegativeDeltaOrders(com.pos.connector.dto.AgentId posOrderId) throws RemoteException {
        AgentProducer.newOne(connection)
                .withApplicationName(getApplicationName(properties))
                .withAgentId(getAgentId(properties))
                .withQueueName(getNegativeDeltaOrdersQueueName())
                .publish(posOrderId);
    }

    private String getPositiveDeltaOrdersQueueName() {
        return properties.getProperty(ApplicationProperty.RABBITMQ_QUEUE_NAME_ORDERS);
    }

    private String getNegativeDeltaOrdersQueueName() {
        return properties.getProperty(ApplicationProperty.RABBITMQ_QUEUE_NAME_REMOVED_ORDERS);
    }

    private static String getAgentId(ConfigReader properties) {
        return properties.getProperty(ApplicationProperty.AGENT_ID);
    }

    private static String getApplicationName(ConfigReader properties) {
        return properties.getProperty(ApplicationProperty.MICROSERVICE_NAME);
    }


}
