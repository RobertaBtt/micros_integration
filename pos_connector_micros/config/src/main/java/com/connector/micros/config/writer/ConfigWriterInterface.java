package com.connector.micros.config.writer;

import com.connector.micros.config.ApplicationProperty;

import java.io.IOException;

public interface ConfigWriterInterface {

    public void writePropertiesToFile(String externalPropertiesFile) throws IOException;

    public void setProperty(ApplicationProperty propertyKey, String value, String externalPropertiesFile);
}
