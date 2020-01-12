package com.connector.micros.data_fetcher.response_converter;

import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;
import com.micros_hosting.egateway.EConfigurationInfoType;

public class GetConfigurationInfoConverter {

    /***
     *
     * @param response MicrosGetConfigurationInfoResponse
     * @return The string that represents the configuration of Agent specific of Micros
     */
    public static String getConfigInfoType(MicrosGetConfigurationInfoResponse response) {

        String configInfoTypeValue = null;

        if (response.getConfigInfoResponse().getOperationalResult().getSuccess()) {

            EConfigurationInfoType[] configInfoType = response.getConfigInfoResponse().getConfigInfoType().getEConfigurationInfoType();

            if (configInfoType.length > 0) {
                configInfoTypeValue = configInfoType[0].getValue();

            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return configInfoTypeValue;

    }
}
