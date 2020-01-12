package com.pos.connector.data_fetcher;

import com.pos.connector.dto.AgentDiscount;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;

import java.util.List;

public interface AgentDiscountsFetcherInterface {

    /***
     *
     * @param getDiscountsRequest
     * @return List Discounts in the POS
     * @throws PosException
     */
    public List<AgentDiscount> getDiscountsFromPos(PosRequest getDiscountsRequest) throws PosException;


}
