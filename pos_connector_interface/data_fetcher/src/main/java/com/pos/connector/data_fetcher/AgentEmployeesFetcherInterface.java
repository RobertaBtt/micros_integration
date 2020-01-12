package com.pos.connector.data_fetcher;

import com.pos.connector.dto.*;

import java.util.List;

public interface AgentEmployeesFetcherInterface {


    /***
     * @param getEmployeesRequest     *
     * @return the list of the all available employees in the POS
     * @throws PosException
     */
    public List<AgentEmployee> getEmployeesFromPos(PosRequest getEmployeesRequest) throws PosException;


}
