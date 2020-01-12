package com.pos.connector.local.data_management;

public interface AgentLocalDiscountsManagementInterface {

    /***
     * @doc This interface allows to add a single element of the AgentDiscount, from POS, locally to the Agent
     * @param discount is the AgentDiscount that comes from the POS
     */
    public void saveSingleDiscountLocal(Object discount);

    /***
     *
     * @param discountPosName is the String of the Name of the Discount from the POS
     * @return the AgentDiscount
     */
    public Object getDiscountByPosName(String discountPosName);
}
