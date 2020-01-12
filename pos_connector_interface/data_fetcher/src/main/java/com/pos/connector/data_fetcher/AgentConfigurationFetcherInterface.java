package com.pos.connector.data_fetcher;

import com.pos.connector.dto.AgentConfiguration;
import com.pos.connector.dto.AgentEmployee;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;

import java.util.List;

public interface AgentConfigurationFetcherInterface {

    /***
     * @param getConfigurationRequest
     * @return an Object that contains the configuration of the POS
     * @throws PosException
     */

    public AgentConfiguration getConfigurationFromPos(PosRequest getConfigurationRequest) throws PosException;


}
