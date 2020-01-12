package com.connector.micros.infrastructure.dagger;

import com.connector.micros.config.ConfigurationTypesEnum;
import com.connector.micros.config.reader.ConfigReaderEnumeration;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.config.reader.ConfigReader;

import javax.inject.Named;

public class ConfigModule extends ConfigModule {


    public static ConfigReaderInterface provideConfigReaderByType(String PropertiesFile, String enumPropertiesFile, ConfigurationTypesEnum configurationType) {
        if (configurationType.equals(ConfigurationTypesEnum.)){
            return ConfigReader.getInstance(PropertiesFile);
        }
        else if (configurationType.equals(ConfigurationTypesEnum.ENUMERATION)){
            return ConfigReaderEnumeration.getInstance(enumPropertiesFile);
        }

        return null;
    }

}
