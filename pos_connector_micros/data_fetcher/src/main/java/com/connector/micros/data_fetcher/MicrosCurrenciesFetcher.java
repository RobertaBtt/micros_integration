package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentCurrenciesFetcherInterface;
import com.pos.connector.dto.AgentCurrency;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetAvailableCurrenciesRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetCurrenciesConverter;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class MicrosCurrenciesFetcher implements AgentCurrenciesFetcherInterface {


    private static final MicrosCurrenciesFetcher instance = new MicrosCurrenciesFetcher();

    private MicrosCurrenciesFetcher() {
    }

    public static MicrosCurrenciesFetcher getInstance() {
        return instance;
    }

    @Override
    public List<AgentCurrency> getCurrenciesFromPos(PosRequest getAvailableCurrenciesRequest) throws PosException {
        GetAvailableCurrenciesRequestMicros requestMicros = new GetAvailableCurrenciesRequestMicros(getAvailableCurrenciesRequest.getParameters());
        MicrosGetConfigurationInfoResponse response = null;

        MicrosSimphonyAPI microservice = MicrosSimphonyAPI.getInstance(null,
                requestMicros.getNamespaceUriServer(), requestMicros.getNamespaceUri(), requestMicros.getTargetEndPoint(),
                false);

        List<AgentCurrency> currencies = new ArrayList<AgentCurrency>();
        try {
            response = microservice.getConfigurationInfo(requestMicros.getEmployeeObjectNumber(), requestMicros.getEnumCurrenciesConfigInfo(), requestMicros.getRevenueCenter());
            currencies = GetCurrenciesConverter.convertResponse(response);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return currencies;
    }
}
