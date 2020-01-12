package com.connector.micros.infrastructure.dagger;

import com.pos.common.rabbitmq.rpc.service.RPCRemoteService;
import dagger.Component;

import javax.inject.Singleton;
import java.util.List;


@Singleton
@Component(modules = {RemoteServicesModule.class})
public interface RemoteServicesComponent {

    List<RPCRemoteService> getRemoteServices();

}
