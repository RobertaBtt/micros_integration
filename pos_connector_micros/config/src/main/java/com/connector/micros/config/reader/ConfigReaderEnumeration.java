package com.connector.micros.config.reader;

import com.connector.micros.config.ApplicationProperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReaderEnumeration implements ConfigReaderInterface {


    private static final ConfigReaderEnumeration instance = new ConfigReaderEnumeration();
    private static String enumPropertiesFile;
    private Properties enumProperties;

    private ConfigReaderEnumeration() {

    }

    public static ConfigReaderEnumeration getInstance(String enumPropertiesFile) {

        if (enumPropertiesFile != null) {
            instance.enumPropertiesFile = enumPropertiesFile;
        }

        if (instance.enumProperties == null) {
            instance.enumProperties = new Properties();
        }

        try {
            readPropertiesFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return instance;

    }

    @Override
    public Properties getProperties() {
        return enumProperties;
    }

    @Override
    public String getProperty(ApplicationProperty propertyKey) {
        return this.enumProperties.getProperty(propertyKey.getPropertyKey()).trim();
    }


    private static void readPropertiesFile() throws IOException {

        if (instance.enumPropertiesFile != null && instance.enumPropertiesFile.length() > 0) {
            readPropertiesFromFile();
        }

    }

    /***
     * @doc Reads the external, editable, application.properties file.
     * @throws IOException
     */
    public static void readPropertiesFromFile() throws IOException {

        try (InputStream input = new FileInputStream(enumPropertiesFile)) {
            instance.enumProperties.load(input);
        }
    }
}
