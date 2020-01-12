package com.connector.micros.infrastructure.client;

import com.connector.micros.infrastructure.dagger.ConfigModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ConfigModule.class, ClientModule.class})
public interface ClientComponent {

    Client Client();

}
