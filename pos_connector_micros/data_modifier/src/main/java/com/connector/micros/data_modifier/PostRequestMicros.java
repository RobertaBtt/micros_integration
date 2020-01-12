package com.connector.micros_micros.data_modifier;


import com.connector.micros.dto.PosRequest;

import java.util.Map;

public class PostRequestMicros implements PosRequest {


    private Map<String, String> requestParameters;

    public PostRequestMicros(Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

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
