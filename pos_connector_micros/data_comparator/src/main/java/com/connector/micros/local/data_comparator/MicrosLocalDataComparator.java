package com.connector.micros_micros.local.data_comparator;

import com.connector.micros.dto.AgentOrder;
import com.connector.micros.local.data_comparator.AgentLocalDataComparatorInterface;
import com.connector.micros_micros.dto.MicrosAgentOrder;

import java.util.HashMap;

public class MicrosLocalDataComparator implements AgentLocalDataComparatorInterface {

    @Override
    public HashMap<String, Object> getNewOrUpdatedPosOrders(HashMap<String, Object> localOrders, HashMap<String, Object> ordersFromPos) {

        /***
         * If in local I don't have anything yet (Agent just started, for example)
         * my new orders are the one that come from POS.
         */

        HashMap<String, Object> hashMapToReturn = new HashMap<String, Object>();

        if (localOrders == null || localOrders.size() == 0)
            return ordersFromPos;

        else {

            for (HashMap.Entry<String, Object> posOrder : ordersFromPos.entrySet()) {

                String key = posOrder.getKey();
                Object value = posOrder.getValue();
                if (!localOrders.containsKey(key))
                    hashMapToReturn.put(key, value);
                else if (this.posOrderBeenModified((MicrosAgentOrder) localOrders.get(key), (MicrosAgentOrder) posOrder.getValue()))
                    /*The function "put" replaces the old value if the key already exists*/
                    hashMapToReturn.put(key, value);
            }
        }

        return hashMapToReturn;
    }

    /***
     * @doc This method allows to find the <b>negative</b> differences between a local list,
     * to the new fresher one, that comes from the Agent
     * @param localOrders are the orders previously saved
     * @param ordersFromPos are the orders that come directly from pos
     * @return List<AgentOrder> the update List of orders contains the orders modified
     * as well the new orders found in the POS.
     */
    @Override
    public HashMap<String, Object> getDeletedPosOrders(HashMap<String, Object> localOrders, HashMap<String, Object> ordersFromPos) {

        HashMap<String, Object> hashMapToReturn = new HashMap<String, Object>();


        /*If there is at least one element*/
        if (localOrders != null)
            if (localOrders.size() > 0) {
                for (HashMap.Entry<String, Object> localOrder : localOrders.entrySet()) {

                    String key = localOrder.getKey();
                    Object value = localOrder.getValue();
                    if (!ordersFromPos.containsKey(key))
                        hashMapToReturn.put(key, value);

                }
            }
        return hashMapToReturn;
    }

    /***
     *
     * @param localOrder is the Order previsously saved, if any
     * @param posOrder is the Order that is coming from the Pos in this moment
     * @return true if the posOrder has been modified, has something new compared to localOrder
     */
    @Override
    public boolean posOrderBeenModified(AgentOrder localOrder, AgentOrder posOrder) {

        if (posOrder.getLastServiceTime() > localOrder.getLastServiceTime())
            return true;
        return false;
    }
}
