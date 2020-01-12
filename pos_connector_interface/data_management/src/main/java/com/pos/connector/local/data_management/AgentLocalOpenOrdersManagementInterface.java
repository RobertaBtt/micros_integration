package com.pos.connector.local.data_management;

import com.pos.connector.dto.AgentOrder;

import java.util.HashMap;
import java.util.List;

public interface AgentLocalOpenOrdersManagementInterface {


    /***
     * @doc This interface allows to add a single element of the AgentOrder, from POS, locally to the Agent
     * @param agentOrder is the AgentOrder that comes from the POS
     */
    public void saveSingleOrderLocal(Object agentOrder);

    /***
     * @doc This interface allows to remove a single element of the AgentOrder, from POS, locally to the Agent
     * @param agentOrder is the AgentOrder that no longer exists in the POS
     */
    public void removeSingleOrderLocal(Object agentOrder);


    /***
     * @doc This method allows to retrieve the list of the AgentOrders saved locally in the Agent.
     * @return Hashmap of AgentOrders previous saved locally
     */
    public HashMap<String, Object> getOrdersLocal();

    /***
     *
     * @param agentOrders the Simple List of the AgentOrders
     * @return and HashMap of the Orders, where key = identifier of the AgentOrder, value = the AgentOrder object
     */
    public HashMap<String, Object> convertListToHash(List<AgentOrder> agentOrders);


    /***
     *
     * @param orderPosIdentifier is a number, or a string, or a concatenation ot these elements, that identify the Order inside the POS
     * @return the AgentOrder locally memorized
     */
    public Object getOrderByPosIdentifier(String orderPosIdentifier);
}
