package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentConfigurationFetcherInterface;
import com.pos.connector.dto.AgentConfiguration;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetConfigurationInfoRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetConfigurationInfoConverter;
import com.connector.micros.dto.MicrosAgentConfiguration;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

public class MicrosConfigurationFetcher implements AgentConfigurationFetcherInterface {

    private static final MicrosConfigurationFetcher instance = new MicrosConfigurationFetcher();

    private MicrosConfigurationFetcher() {
    }

    public static MicrosConfigurationFetcher getInstance() {
        return instance;
    }

    @Override
    public AgentConfiguration getConfigurationFromPos(PosRequest getConfigurationInfoRequest) throws PosException {


        /***
         * This conversion is mandatory. Now we have the specific request, valid for Micros only.
         */
        GetConfigurationInfoRequestMicros requestMicros = new GetConfigurationInfoRequestMicros(getConfigurationInfoRequest.getParameters());
        MicrosGetConfigurationInfoResponse response = null;
        AgentConfiguration agentConfiguration = new MicrosAgentConfiguration();

        MicrosSimphonyAPI microservice = MicrosSimphonyAPI.getInstance(null,
                requestMicros.getNamespaceUriServer(), requestMicros.getNamespaceUri(), requestMicros.getTargetEndPoint(), false);

        String configInfoType;


        for (int i = 0; i <= 26; i++) {

            try {
                response = microservice.getConfigurationInfo(requestMicros.getEmployeeObjectNumber(), i, requestMicros.getRevenueCenter());
                configInfoType = GetConfigurationInfoConverter.getConfigInfoType(response);

                ((MicrosAgentConfiguration) agentConfiguration).addAKeyValueToMicrosEnum(configInfoType, Integer.valueOf(i));

            } catch (java.rmi.RemoteException ex) {
                System.out.println("We were elaborating, without success, the GetConfigInfo with number: " + i + " ");
            }

        }

        return agentConfiguration;

    }
}
