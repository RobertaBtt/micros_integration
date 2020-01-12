package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentVersionFetcherInterface;
import com.pos.connector.dto.AgentVersion;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetPosInformationRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetVersionConverter;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.rmi.RemoteException;

public class MicrosVersionFetcher implements AgentVersionFetcherInterface {

    private static final MicrosVersionFetcher instance = new MicrosVersionFetcher();

    private MicrosVersionFetcher() {
    }

    public static MicrosVersionFetcher getInstance() {

        return instance;
    }


    @Override
    public AgentVersion getPosVersion(PosRequest getPOSInformation) throws PosException {
        GetPosInformationRequestMicros requestMicros = new GetPosInformationRequestMicros(getPOSInformation.getParameters());
        MicrosGetConfigurationInfoResponse response = null;

        MicrosSimphonyAPI microservice = MicrosSimphonyAPI.getInstance(null,
                requestMicros.getNamespaceUriServer(), requestMicros.getNamespaceUri(), requestMicros.getTargetEndPoint(),
                false);

        AgentVersion posInformation = null;

        try {
            response = microservice.getConfigurationInfo(requestMicros.getEmployeeObjectNumber(), requestMicros.getEnumVersionConfigInfo(),
                    requestMicros.getRevenueCenter());
            posInformation = GetVersionConverter.convertResponse(response);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return posInformation;
    }


}
