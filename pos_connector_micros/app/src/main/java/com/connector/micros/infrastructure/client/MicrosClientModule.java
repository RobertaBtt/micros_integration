package com.connector.micros.infrastructure.client;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.pos.common.rabbitmq.ConnectionFactory;
import com.rabbitmq.client.Connection;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;


@Module
public class ClientModule {

    @Provides
    @Singleton
    @Inject
    @Named("connectionProducer")
    Connection connectionProducer(ConfigReader properties) {
        return ConnectionFactory.newOne(new com.rabbitmq.client.ConnectionFactory())
                .withHost(getHost(properties))
                .withUsername(getUsername(properties))
                .withPassword(getPassword(properties))
                .withPort(getPort(properties))
                .create();
    }

    @Provides
    @Singleton
    @Inject
    Client Client(ConfigReader properties, @Named("connectionProducer") Connection connection) {
        return new Client(properties, connection);
    }

    private static Integer getPort(ConfigReader properties) {
        return Integer.valueOf(properties.getProperty(ApplicationProperty.RABBITMQ_SENDER_PORT));
    }

    private static String getPassword(ConfigReader properties) {
        return properties.getProperty(ApplicationProperty.RABBITMQ_SENDER_PASSWORD);
    }

    private static String getUsername(ConfigReader properties) {
        return properties.getProperty(ApplicationProperty.RABBITMQ_SENDER_USERNAME);
    }

    private static String getHost(ConfigReader properties) {
        return properties.getProperty(ApplicationProperty.RABBITMQ_SENDER_HOST);
    }

}
