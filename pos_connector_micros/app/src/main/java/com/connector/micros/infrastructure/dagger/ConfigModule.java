package com.connector.micros.infrastructure.dagger;

import com.connector.micros.config.ConfigurationTypesEnum;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.writer.ConfigWriter;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;


@Module
public class ConfigModule {

    private static String applicationPropertiesFile;

    private static List<String> applicationPropertiesFilesList;

//    public static void addApplicationPropertiesFile(String applicationPropertiesFile){
//
//        if (ConfigModule.applicationPropertiesFilesList == null){
//            ConfigModule.applicationPropertiesFilesList = new ArrayList<String>();
//        }
//
//        ConfigModule.applicationPropertiesFilesList.add(applicationPropertiesFile);
//
//
//    }
    public static void setApplicationPropertiesFile(String applicationPropertiesFile) {
        ConfigModule.applicationPropertiesFile = applicationPropertiesFile;
    }



    @Provides
    @Singleton
    String GetApplicationPropertiesFileByType(String type) {
        return applicationPropertiesFile == null ? "" : applicationPropertiesFile;
    }

    @Provides
    @Singleton
    @Named("applicationPropertiesFile")
    String provideApplicationPropertiesFile() {
        return applicationPropertiesFile == null ? "" : applicationPropertiesFile;
    }

    @Provides
    @Singleton
    ConfigReader provideConfigReader(@Named("applicationPropertiesFile") String applicationPropertiesFile) {
        return ConfigReader.getInstance(applicationPropertiesFile);
    }



    @Provides
    @Singleton
    ConfigWriter provideConfigWriter(@Named("applicationPropertiesFile") String applicationPropertiesFile) {

        return new ConfigWriter(applicationPropertiesFile);
    }
}
