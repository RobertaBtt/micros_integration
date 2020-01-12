package com.pos.connector.local.data_management;

public interface AgentLocalOrderTypeManagementInterface {

    /***
     * @doc This interface allows to add a sinlge element of the AgentOrderType, from POS, locally to the Agent
     * @param agentOrderType is the AgentOrderType that comes from the POS
     */
    public void saveSingleOrderTypeLocal(Object agentOrderType);

    /***
     *
     * @param orderTypePosName is the String of the Name of the OrderType from POS
     * @return the AgentOrderType
     */
    public Object getOrderTypeByPosName(String orderTypePosName);
}
