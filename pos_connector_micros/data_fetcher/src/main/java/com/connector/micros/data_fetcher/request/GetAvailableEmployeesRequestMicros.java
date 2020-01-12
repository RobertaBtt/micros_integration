package com.connector.micros.data_fetcher.request;

import java.util.Map;

public class GetAvailableEmployeesRequestMicros extends GetRequestMicros {


    public GetAvailableEmployeesRequestMicros(Map<String, String> requestParameters) {

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

    public int getEnumEmployeesConfigInfo() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("enumEmployees"))
            return Integer.valueOf(localParams.get("enumEmployees"));
        else
            return -1;

    }


}
