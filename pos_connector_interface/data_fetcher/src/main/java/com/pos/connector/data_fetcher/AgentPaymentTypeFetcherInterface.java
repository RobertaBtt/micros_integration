package com.pos.connector.data_fetcher;

import com.pos.connector.dto.AgentPayment;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;

import java.util.List;

public interface AgentPaymentTypeFetcherInterface {

    /***
     *
     * @param getPaymentTypesRequest
     * @return List of items of Type Payment
     * @throws PosException
     */
    public List<AgentPayment> getPaymentTypesFromPos(PosRequest getPaymentTypesRequest) throws PosException;


}
