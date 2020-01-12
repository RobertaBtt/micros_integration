package com.connector.micros.config.writer;

import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReaderEnumeration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class EnumerationConfigWriter {

    public static void setProperty(ApplicationProperty propertyKey, String value) {

        if (value == null) {
            ConfigReaderEnumeration.getInstance(null).getProperties().remove(propertyKey.getPropertyKey());
        } else {
            ConfigReaderEnumeration.getInstance(null).getProperties().setProperty(propertyKey.getPropertyKey(), value.trim());
        }
    }

    public static void writePropertiesToFile(String externalPropertiesFile) throws IOException {

        try (OutputStream output = new FileOutputStream(externalPropertiesFile)) {

            ConfigReaderEnumeration.getInstance(externalPropertiesFile).getProperties().store(output, null);
        }
    }
}
