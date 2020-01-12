package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentOrderTypeFetcherInterface;
import com.pos.connector.dto.AgentOrderType;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetOrderTypesRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetOrderTypesConverter;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;
import lombok.Getter;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class MicrosOrderTypeFetcher implements AgentOrderTypeFetcherInterface {

    @Getter
    private List<AgentOrderType> orderTypes = new ArrayList<AgentOrderType>();
    private static final MicrosOrderTypeFetcher instance = new MicrosOrderTypeFetcher();

    private MicrosOrderTypeFetcher() {
    }

    public static MicrosOrderTypeFetcher getInstance() {
        return instance;
    }

    /****
     *
     * @param getOrderTypesRequest
     * @return the list of the all available types of orders in the POS AgentOrderType
     * @throws PosException
     */
    @Override
    public List<AgentOrderType> getOrderTypesFromPos(PosRequest getOrderTypesRequest) throws PosException {

        GetOrderTypesRequestMicros requestMicros = new GetOrderTypesRequestMicros(getOrderTypesRequest.getParameters());
        MicrosGetConfigurationInfoResponse response = null;


        MicrosSimphonyAPI microservice = MicrosSimphonyAPI.getInstance(
                null,
                requestMicros.getNamespaceUriServer(),
                requestMicros.getNamespaceUri(),
                requestMicros.getTargetEndPoint(),
                false);

        List<AgentOrderType> orderTypes = new ArrayList<AgentOrderType>();

        try {
            response = microservice.getConfigurationInfo(requestMicros.getEmployeeObjectNumber(), requestMicros.getEnumOrderType(), requestMicros.getRevenueCenter());
            orderTypes = GetOrderTypesConverter.convertResponse(response);
        } catch (RemoteException e) {
            System.out.println("Troubles retrieving the list of type of the Orders \n" + e.getMessage());
        }
        return orderTypes;
    }
}
