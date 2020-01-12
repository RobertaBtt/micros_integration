package com.pos.connector.local.data_comparator;

import com.pos.connector.dto.AgentOrder;
import java.util.HashMap;

public interface AgentLocalDataComparatorInterface {


    /***
     * @doc This method allows to find the <b>positive</b> differences between a local list,
     * to the new fresher one, that comes from the Agent
     * @param localOrders are the orders previously saved
     * @param ordersFromPos are the orders that come directly from pos
     * @return List<AgentOrder> the update List of orders contains the orders modified
     * as well the new orders found in the POS.
     */
    public HashMap<String, Object> getNewOrUpdatedPosOrders(HashMap<String, Object> localOrders, HashMap<String, Object> ordersFromPos);


    /***
     * @doc This method allows to find the <b>negative</b> differences between a local list,
     * to the new fresher one, that comes from the Agent
     * @param localOrders are the orders previously saved
     * @param ordersFromPos are the orders that come directly from pos
     * @return List<AgentOrder> the update List of orders contains the orders modified
     * as well the new orders found in the POS.
     */
    public HashMap<String, Object> getDeletedPosOrders(HashMap<String, Object> localOrders, HashMap<String, Object> ordersFromPos);

    /***
     *
     * @param localOrder is the Order previsously saved, if any
     * @param posOrder is the Order that is coming from the Pos in this moment
     * @return true if the posOrder has been modified, has something new compared to localOrder
     */
    public boolean posOrderBeenModified(AgentOrder localOrder, AgentOrder posOrder);
}
