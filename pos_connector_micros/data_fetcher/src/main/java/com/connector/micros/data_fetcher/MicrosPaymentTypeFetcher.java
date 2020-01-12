package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentPaymentTypeFetcherInterface;
import com.pos.connector.dto.AgentPayment;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetPaymentTypesRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetPaymentTypesConverter;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


public class MicrosPaymentTypeFetcher implements AgentPaymentTypeFetcherInterface {

    private MicrosPaymentTypeFetcher() {
    }

    private static final MicrosPaymentTypeFetcher instance = new MicrosPaymentTypeFetcher();

    public static MicrosPaymentTypeFetcher getInstance() {

        return instance;
    }

    /***
     *
     * @param getPaymentTypesRequest
     * @return List of items of Type Payment
     * @throws PosException
     */
    public List<AgentPayment> getPaymentTypesFromPos(PosRequest getPaymentTypesRequest) throws PosException {

        GetPaymentTypesRequestMicros requestMicros = new GetPaymentTypesRequestMicros(getPaymentTypesRequest.getParameters());
        MicrosGetConfigurationInfoResponse response = null;

        MicrosSimphonyAPI microservice = MicrosSimphonyAPI.getInstance(
                null,
                requestMicros.getNamespaceUriServer(),
                requestMicros.getNamespaceUri(),
                requestMicros.getTargetEndPoint(),
                false);

        List<AgentPayment> payments = new ArrayList<AgentPayment>();

        try {
            response = microservice.getConfigurationInfo(requestMicros.getEmployeeObjectNumber(), requestMicros.getEnumPaymentsConfigInfo(), requestMicros.getRevenueCenter());
            payments = GetPaymentTypesConverter.convertResponse(response);
        } catch (RemoteException e) {
            e.printStackTrace();
        }


        return payments;
    }


}
