package com.connector.micros.infrastructure.dagger;

import com.connector.micros.config.ConfigurationTypesEnum;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.config.writer.ConfigWriter;
import dagger.Component;

import javax.inject.Singleton;


@Singleton
@Component(modules = {ConfigModule.class})
public interface ConfigComponent {

    ConfigReader provideConfigReader();

//
//    ConfigReaderInterface provideConfigReaderByType(String applicationPropertiesFile,
//                                                    ConfigurationTypesEnum configurationType);

    ConfigWriter provideConfigWriter();
}
