package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentEmployeesFetcherInterface;
import com.pos.connector.dto.AgentEmployee;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetAvailableEmployeesRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetEmployeesConverter;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class MicrosEmployeesFetcher implements AgentEmployeesFetcherInterface {

    private static final MicrosEmployeesFetcher instance = new MicrosEmployeesFetcher();

    private MicrosEmployeesFetcher() {
    }

    public static MicrosEmployeesFetcher getInstance() {
        return instance;
    }

    @Override
    public List<AgentEmployee> getEmployeesFromPos(PosRequest getAvailableEmployeesRequest) throws PosException {

        GetAvailableEmployeesRequestMicros requestMicros = new GetAvailableEmployeesRequestMicros(getAvailableEmployeesRequest.getParameters());
        MicrosGetConfigurationInfoResponse response = null;

        MicrosSimphonyAPI microservice = MicrosSimphonyAPI.getInstance(null,
                requestMicros.getNamespaceUriServer(), requestMicros.getNamespaceUri(), requestMicros.getTargetEndPoint(),
                false);

        List<AgentEmployee> employees = new ArrayList<AgentEmployee>();

        try {
            response = microservice.getConfigurationInfo(requestMicros.getEmployeeObjectNumber(), requestMicros.getEnumEmployeesConfigInfo(), requestMicros.getRevenueCenter());
            employees = GetEmployeesConverter.convertResponse(response);
        } catch (RemoteException e) {
            System.out.println("Troubles retrieving GetAvailableEmployees \n" + e.getMessage());
        }

        return employees;

    }
}
