package com.connector.micros.config.writer;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.reader.ConfigReader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class ConfigWriter {

    public static void setProperty(ApplicationProperty propertyKey, String value) {

        if (value == null) {
            ConfigReader.getInstance(null).getProperties().remove(propertyKey.getPropertyKey());
        } else {
            ConfigReader.getInstance(null).getProperties().setProperty(propertyKey.getPropertyKey(), value.trim());
        }
    }

    public static void writePropertiesToFile(String externalPropertiesFile) throws IOException {

        try (OutputStream output = new FileOutputStream(externalPropertiesFile)) {

            ConfigReader.getInstance(externalPropertiesFile).getProperties().store(output, null);
        }
    }

    public static void setPropertyByString(String propertyKeyString, String value) {

        if (value == null) {
            ConfigReader.getInstance(null).getProperties().remove(propertyKeyString);
        } else {
            ConfigReader.getInstance(null).getProperties().setProperty(propertyKeyString, value.trim());
        }
    }
}
