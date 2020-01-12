package com.pos.connector.data_fetcher;

import com.pos.connector.dto.AgentCurrency;
import com.pos.connector.dto.AgentEmployee;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;

import java.util.List;

public interface AgentCurrenciesFetcherInterface {


    /***
     * @param getCurrenciesRequest
     * @return the list of all the available currencies in the POS
     * @throws PosException
     */
    public List<AgentCurrency> getCurrenciesFromPos(PosRequest getCurrenciesRequest) throws PosException;




}
