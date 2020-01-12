package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.AgentVersion;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

public class GetVersionConverter {

    /***
     *
     * @param response MicrosGetConfigurationInfoResponse
     * @return The string that contains the information of the version
     */
    public static AgentVersion convertResponse(MicrosGetConfigurationInfoResponse response) {

        String posVersion = null;
        AgentVersion agentVersion = null;

        if (response.getConfigInfoResponse().getOperationalResult().getSuccess()) {

            String versionXml = response.getConfigInfoResponse().getVersion();

            if (!versionXml.isEmpty()) {

                posVersion = versionXml.substring(versionXml.indexOf("<string>") + 8, versionXml.indexOf("</string>"));

                agentVersion = AgentVersion.builder()
                        .content(posVersion)
                        .build();
            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return agentVersion;

    }
}
