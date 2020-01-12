package com.connector.micros.data_fetcher.request;

import java.util.Map;

public class GetOpenOrdersRequestMicros extends GetRequestMicros {


    public GetOpenOrdersRequestMicros(Map<String, String> requestParameters) {

        super(requestParameters);
    }


    public int getEmployeeObjectNumber() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("employeeObjectNumber"))
            return Integer.valueOf(localParams.get("employeeObjectNumber"));
        else
            return -1;

    }


}
