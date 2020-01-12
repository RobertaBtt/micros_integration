package com.pos.common.rabbitmq.config;

import java.util.Optional;

public interface RabbitEnvironment {

    <T> Optional<T> getProperty(String name, Class<T> requiredType);

}
