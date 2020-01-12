package com.pos.common.rabbitmq.serialize;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paranamer.ParanamerModule;

import java.io.IOException;


public class JsonSerializer {

    private static final JsonSerializer INSTANCE;
    private static final ObjectMapper objectMapper;

    static {
        INSTANCE = new JsonSerializer();

        objectMapper = new ObjectMapper()
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                .registerModule(new JavaTimeModule())
                .registerModule(new Jdk8Module())
                .configure(JsonParser.Feature.IGNORE_UNDEFINED, true)
                //auto-detect names of Creator
                .registerModule(new ParanamerModule());
    }

    public static JsonSerializer instance() {
        return INSTANCE;
    }

    private JsonSerializer() {
    }

    public byte[] serialize(Object serializeIt) {
        try {
            return objectMapper.writeValueAsBytes(serializeIt);
        } catch (JsonProcessingException e) {
            throw new SerializationError("Error serializating: " + getClassName(serializeIt), e);
        }
    }

    private String getClassName(Object serializeIt) {
        if (serializeIt == null) {
            return null;
        }
        return serializeIt.getClass().getName();
    }

    public <T> T deserialize(byte[] serialization, final Class<T> classOfT) {
        try {
            return objectMapper.readValue(serialization, classOfT);
        } catch (IOException e) {
            final String string = serialization == null ? null : new String(serialization);
            throw new DeserializationError("Error deserializating: " + string + " to: " + classOfT, e);
        }
    }

    public <T> T deserialize(byte[] serialization, Class<?> parametrized, Class<?>... parameterClasses) {
        try {
            JavaType type = objectMapper.getTypeFactory().constructParametricType(parametrized, parameterClasses);
            return objectMapper.readValue(serialization, type);
        } catch (IOException e) {
            final String string = serialization == null ? null : new String(serialization);
            throw new DeserializationError("Error deserializating: " + string + " to: " + parametrized +" of: "+parameterClasses, e);
        }
    }

}
