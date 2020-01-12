package com.connector.micros.local.data_management;

import com.pos.connector.local.data_management.AgentLocalOrderTypeManagementInterface;
import com.connector.micros.dto.MicrosAgentOrderType;

import java.util.HashMap;

public class MicrosLocalOrderTypeManagement implements AgentLocalOrderTypeManagementInterface {

    private MicrosLocalOrderTypeManagement() {
    }

    private HashMap<String, Object> agentOrderTypeHashMap;
    private static final MicrosLocalOrderTypeManagement instance = new MicrosLocalOrderTypeManagement();

    public static MicrosLocalOrderTypeManagement getInstance() {
        return instance;
    }


    /***
     * @doc This interface allows to add a sinlge element of the AgentOrderType, from POS, locally to the Agent
     * The key is the Name
     * @param agentOrderType is the AgentOrderType that comes from the POS
     */
    @Override
    public void saveSingleOrderTypeLocal(Object agentOrderType) {
        if (agentOrderTypeHashMap == null)
            agentOrderTypeHashMap = new HashMap<String, Object>();

        agentOrderTypeHashMap.put(((MicrosAgentOrderType) agentOrderType).getName(), (MicrosAgentOrderType) agentOrderType);

    }


    /***
     *
     * @param orderTypePosName is the String of the Name of the OrderType from POS
     * @return the AgentOrderType
     */
    @Override
    public Object getOrderTypeByPosName(String orderTypePosName) {
        if (agentOrderTypeHashMap != null)
            return agentOrderTypeHashMap.get(orderTypePosName);
        return null;
    }
}
