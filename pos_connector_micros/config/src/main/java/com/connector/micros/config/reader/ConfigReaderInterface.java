package com.connector.micros.config.reader;

import com.connector.micros.config.ApplicationProperty;

import java.util.Properties;

public interface ConfigReaderInterface {

    Properties getProperties();

    String getProperty(ApplicationProperty propertyKey);

}
