package com.pos.connector.data_fetcher;

import com.pos.connector.dto.AgentOrderType;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;

import java.util.List;

public interface AgentOrderTypeFetcherInterface {

    /****
     *
     * @param getOrderTypesRequest
     * @return the list of the all available types of orders in the POS
     * @throws PosException
     */
    public List<AgentOrderType> getOrderTypesFromPos(PosRequest getOrderTypesRequest) throws PosException;


}
