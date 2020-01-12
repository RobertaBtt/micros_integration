package com.connector.micros.data_fetcher.request;

import com.pos.connector.dto.PosRequest;

import java.util.Map;

public class GetRequestMicros implements PosRequest {


    private Map<String, String> requestParameters;

    public GetRequestMicros(Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    @Override
    public Map<String, String> getParameters() {

        return this.requestParameters;
    }

    public String getNamespaceUriServer() {

        if (!requestParameters.isEmpty() && requestParameters.containsKey("namespaceUriServer"))
            return requestParameters.get("namespaceUriServer");
        else
            return "";
    }


    public String getNamespaceUri() {

        if (!requestParameters.isEmpty() && requestParameters.containsKey("namespaceUri"))
            return requestParameters.get("namespaceUri");
        else
            return "";
    }

    public String getTargetEndPoint() {

        if (!requestParameters.isEmpty() && requestParameters.containsKey("targetEndPoint"))
            return requestParameters.get("targetEndPoint");
        else
            return "";
    }


}
