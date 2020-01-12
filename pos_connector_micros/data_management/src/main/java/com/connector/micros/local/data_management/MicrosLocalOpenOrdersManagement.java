package com.connector.micros.local.data_management;

import com.pos.connector.dto.AgentOrder;
import com.pos.connector.local.data_management.AgentLocalOpenOrdersManagementInterface;
import com.connector.micros.dto.MicrosAgentOrder;

import java.util.HashMap;
import java.util.List;

public class MicrosLocalOpenOrdersManagement implements AgentLocalOpenOrdersManagementInterface {

    private MicrosLocalOpenOrdersManagement() {
    }

    private static HashMap<String, Object> agentOrdersHashMap;
    private static HashMap<String, Object> deletedOrdersOrdersHashMap;
    private static final MicrosLocalOpenOrdersManagement instance = new MicrosLocalOpenOrdersManagement();

    public static MicrosLocalOpenOrdersManagement getInstance() {
        if (agentOrdersHashMap == null)
            agentOrdersHashMap = new HashMap<String, Object>();

        if (deletedOrdersOrdersHashMap == null)
            deletedOrdersOrdersHashMap = new HashMap<String, Object>();
        return instance;
    }


    /***
     * @doc This interface allows to add a sinlge Element of the AgentOrder, from POS, locally to the Agent
     * @param agentOrder is the AgentOrder that comes from the POS
     */
    @Override
    public void saveSingleOrderLocal(Object agentOrder) {
        if (agentOrdersHashMap == null)
            agentOrdersHashMap = new HashMap<String, Object>();

        agentOrdersHashMap.put(((MicrosAgentOrder) agentOrder).getIdentifier(), (MicrosAgentOrder) agentOrder);

    }

    @Override
    public void removeSingleOrderLocal(Object agentOrder) {
        if (agentOrdersHashMap != null)
            agentOrdersHashMap.remove(((MicrosAgentOrder) agentOrder).getIdentifier());
    }

    /***
     * @doc This method allows to retrieve the list o the AgentOrders saved locally in the Agent.
     * @return Hashmap of AgentOrders previous saved locally
     */
    @Override
    public HashMap<String, Object> getOrdersLocal() {

        return agentOrdersHashMap;
    }

    /***
     *
     * @param agentOrders the Simple List of the AgentOrders
     * @return and HashMap of the Orders, where key = identificator, value = the AgentORder
     */
    @Override
    public HashMap<String, Object> convertListToHash(List<AgentOrder> agentOrders) {

        HashMap<String, Object> hashMapOrders = new HashMap<String, Object>();

        for (AgentOrder order : agentOrders) {
            hashMapOrders.put(((MicrosAgentOrder) order).getIdentifier(), (MicrosAgentOrder) order);
        }
        return hashMapOrders;
    }

    /***
     *
     * @param orderPosIdentifier is a number, or a string, or a concatenation ot these elements, that identify the Order inside the POS
     * @return the AgentOrder locally memorized
     */
    @Override
    public Object getOrderByPosIdentifier(String orderPosIdentifier) {
        return agentOrdersHashMap.get(orderPosIdentifier);
    }


}
