package com.pos.connector.data_fetcher;

import com.pos.connector.dto.*;

import java.util.List;

public interface AgentOpenOrdersFetcherInterface {

    /***
     *
     * @param getOpenOrdersRequest contains the value
     * @return a List of Orders directly from the POS
     */
    public List<AgentOrder> getOpenOrders(PosRequest getOpenOrdersRequest) throws PosException;

    /***
     * @doc providing the correct POS identifier, we returns the detailed order
     * @return the order directly from the POS
     */
    public AgentOrder getOrderbyIdentifier(PosRequest getOrderByIdentifierRequest) throws PosException;


}
