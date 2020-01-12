package com.connector.micros.application;

import com.pos.connector.data_converter.AgentDataConverterInterface;
import com.pos.connector.local.data_management.AgentLocalOpenOrdersManagementInterface;
import com.connector.micros.data_converter.MicrosDataConverter;
import com.connector.micros.dto.MicrosAgentOrder;
import com.connector.micros.infrastructure.client.Client;
import com.connector.micros.local.data_management.MicrosLocalOpenOrdersManagement;
import com.pos.common.rabbitmq.producer.RemoteException;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class SendPositiveDeltaTask {


    public static void sendPositiveDelta(Future<HashMap<String, Object>> posOrders, Client Client) {

        AgentDataConverterInterface dataPortingMicros = new MicrosDataConverter();
        AgentLocalOpenOrdersManagementInterface dataManagementMicros = MicrosLocalOpenOrdersManagement.getInstance();
        HashMap<String, Object> posOrderHashMap = null;
        com.pos.connector.dto.AgentOrder tempPosOrder = null;

        try {
            posOrderHashMap = posOrders.get();

            if (posOrderHashMap != null) {
                for (Map.Entry<String, Object> entry : posOrderHashMap.entrySet()) {

                    tempPosOrder = dataPortingMicros.convert((MicrosAgentOrder) entry.getValue());
                    try {
                        Client.sendPositiveDeltaOrders(tempPosOrder);

                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }

                    System.out.println("\n Send and saving locally the Entry:  --> " + entry.getKey());
                    dataManagementMicros.saveSingleOrderLocal(entry.getValue());

                }
            } else {
                System.out.println("PosOrders cannot be retrieved at this moment");
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("Error while retrieving the result from Future " + e.getMessage());
            e.printStackTrace();
        }


    }
}
