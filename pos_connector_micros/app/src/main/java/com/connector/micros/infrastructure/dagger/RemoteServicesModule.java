package com.connector.micros.infrastructure.dagger;

import com.connector.micros.application.AddPaymentRemoteService;
import com.pos.common.rabbitmq.rpc.service.RPCRemoteService;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.List;


@Module
public class RemoteServicesModule {

    @Provides
    @Singleton
    List<RPCRemoteService> getRemoteServices() {
        return Arrays.asList(
                new AddPaymentRemoteService()
        );
    }


}
