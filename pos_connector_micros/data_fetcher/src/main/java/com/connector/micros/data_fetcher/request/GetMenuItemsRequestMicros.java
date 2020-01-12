package com.connector.micros.data_fetcher.request;

import java.util.Map;

public class GetMenuItemsRequestMicros extends GetRequestMicros {


    public GetMenuItemsRequestMicros(Map<String, String> requestParameters) {

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

    public int getEnumMenuItemClassConfigInfo() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("enumMenuItemClass"))
            return Integer.valueOf(localParams.get("enumMenuItemClass"));
        else
            return -1;

    }

    public int getEnumMenuItemDefinitionConfigInfo() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("enumMenuItemDefinitions"))
            return Integer.valueOf(localParams.get("enumMenuItemDefinitions"));
        else
            return -1;

    }

}
