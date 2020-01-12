package com.connector.micros.config.reader;

import com.connector.micros.config.ApplicationProperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class ConfigReader implements ConfigReaderInterface {

    private static final ConfigReader instance = new ConfigReader();
    private static String PropertiesFile;
    private Properties Properties;
    private ConfigReader() {

    }


    public static ConfigReader getInstance(String PropertiesFile) {

        if (PropertiesFile != null) {
            instance.PropertiesFile = PropertiesFile;
        }

        if (instance.Properties == null) {
            instance.Properties = new Properties();
        }

        try {
            readPropertiesFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return instance;

    }

    public String getProperty(ApplicationProperty propertyKey) {
        return this.Properties.getProperty(propertyKey.getPropertyKey()).trim();
    }

    public static boolean isEnumerationCompleted() {

        String enumCompleted = instance.getProperty(ApplicationProperty.ENUM_COMPLETED);
        if (enumCompleted.equalsIgnoreCase("on")) {
            return true;
        }
        return false;

    }

    @Override
    public Properties getProperties() {
        return Properties;
    }

    private static void readPropertiesFile() throws IOException {

        if (instance.PropertiesFile != null && instance.PropertiesFile.length() > 0) {
            readPropertiesFromFile();
        }

    }

    /***
     * @doc Reads the external, editable, application.properties file.
     * @throws IOException
     */
    public static void readPropertiesFromFile() throws IOException {

        try (InputStream input = new FileInputStream(PropertiesFile)) {
            instance.Properties.load(input);
        }
    }




    public static boolean checkDiscountConfig() {

        String DiscountMicrosId = "";

        try {
            DiscountMicrosId = instance.getProperty(ApplicationProperty.DISCOUNT_ID);
        } catch (NullPointerException ex) { return false;}

        if (DiscountMicrosId.isEmpty()) {
            return false;
        }
        return true;

    }


    public static boolean checkPaymentConfig() {

        String PaymentMicrosId = "";

        try {
            PaymentMicrosId = instance.getProperty(ApplicationProperty.PAYMENT_ID);

        } catch (NullPointerException ex) {
            return false;
        }

        if (PaymentMicrosId.isEmpty()) {
            return false;
        }
        return true;

    }

    public static boolean checkPrefixCondiments() {

        String prefixCondimentsSetted = instance.getProperty(ApplicationProperty.PREFIX_CONDIMENTS_SETTED);
        if (prefixCondimentsSetted.equalsIgnoreCase("on")) {
            return true;
        }
        return false;

    }

}
