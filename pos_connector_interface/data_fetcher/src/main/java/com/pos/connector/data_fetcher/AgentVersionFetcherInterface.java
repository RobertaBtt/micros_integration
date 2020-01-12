package com.pos.connector.data_fetcher;

import com.pos.connector.dto.AgentConfiguration;
import com.pos.connector.dto.AgentVersion;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;

public interface AgentVersionFetcherInterface {

    /***
     * @param getPosVersionRequest
     * @return an Object that contains the Information of the POS
     * @throws PosException
     */
    public AgentVersion getPosVersion(PosRequest getPosVersionRequest) throws PosException;

}
