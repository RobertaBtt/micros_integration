package com.connector.micros.config.reader;

import com.connector.micros.config.ApplicationProperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;


public class ConfigReader {

    //List of groups of Properties
    private static HashMap<String, Properties> hashMapProperties;
    private static String externalPropertiesFile;
    private Properties properties;

    private Boolean externalPropertiesFileRead = false;
    private Boolean propertiesResourceRead = false;

    private static final ConfigReader instance = new ConfigReader();

    private ConfigReader() {

    }

    public Properties getProperties() {
        return instance.properties;
    }

    public Properties getProperties(String propertyType) {
        return instance.hashMapProperties.get(propertyType);
    }

    public static ConfigReader getInstance(String externalPropertiesFile) {

        if (externalPropertiesFile != null) {
            instance.externalPropertiesFile = externalPropertiesFile;
        }

        if (instance.properties == null) {
            instance.properties = new Properties();
        }

        if (instance.hashMapProperties == null) {
            instance.hashMapProperties = new HashMap<String, Properties>();
        }

        try {
            readPropertiesFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return instance;

    }

    private static void readPropertiesFile() throws IOException {

        if (!instance.propertiesResourceRead) {
            readPropertiesResource();
        }

        if (!instance.externalPropertiesFileRead) {
            if (instance.externalPropertiesFile != null && instance.externalPropertiesFile.length() > 0) {
                readPropertiesFromFile();
            }
        }

    }

    /***
     * @doc Reads the default, not external, not editable, application.properties file.
     * @throws IOException
     */
    private static void readPropertiesResource() throws IOException {

        try (InputStream input = ConfigReader.class.getResourceAsStream("/application.properties")) {
            instance.properties.load(input);
            instance.propertiesResourceRead = true;
        }
    }


    /***
     * @doc Reads the external, editable, application.properties file.
     * @throws IOException
     */
    public static void readPropertiesFromFile() throws IOException {

        try (InputStream input = new FileInputStream(externalPropertiesFile)) {
            instance.properties.load(input);
            instance.externalPropertiesFileRead = true;
        }
    }


    /***
     *
     * @param propertyKey Is the Key of the Property Map
     * @return The Value of the Property Map
     */
    public String getProperty(ApplicationProperty propertyKey) {
        return this.properties.getProperty(propertyKey.getPropertyKey()).trim();
    }

    public String getPropertyByString(String propertyKeyString) {
        return this.properties.getProperty(propertyKeyString.trim());
    }






}
