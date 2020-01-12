package com.pos.connector.local.data_management;

public interface AgentLocalPaymentTypeManagementInterface {

    /***
     * @doc This interface allows to add a single element of the AgentPayment, from POS, locally to the Agent
     * @param agentPaymentType is the AgentPayment that comes from the POS
     */
    public void saveSinglePaymentTypeLocal(Object agentPaymentType);

    /***
     *
     * @param paymentTypePosName is the String of the Name of the OrderType from the POS
     * @return the AgentPayment
     */
    public Object getPaymentTypeByPosName(String paymentTypePosName);
}
