package com.connector.micros.data_fetcher.request;

import java.util.Map;

public class GetPosInformationRequestMicros extends GetRequestMicros {


    public GetPosInformationRequestMicros(Map<String, String> requestParameters) {

        super(requestParameters);
    }


    public int getEmployeeObjectNumber() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("employeeObjectNumber"))
            return Integer.valueOf(localParams.get("employeeObjectNumber"));
        else
            return -1;

    }

    public int getRevenueCenter() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("revenueCenter"))
            return Integer.valueOf(localParams.get("revenueCenter"));
        else
            return -1;

    }

    public int getEnumVersionConfigInfo() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("enumVersion"))
            return Integer.valueOf(localParams.get("enumVersion"));
        else
            return -1;

    }


}
