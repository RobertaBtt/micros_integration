package com.connector.micros.data_fetcher.request;

import java.util.Map;

public class GetAvailableCurrenciesRequestMicros extends GetRequestMicros {


    public GetAvailableCurrenciesRequestMicros(Map<String, String> requestParameters) {

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

    public int getEnumCurrenciesConfigInfo() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("enumCurrency"))
            return Integer.valueOf(localParams.get("enumCurrency"));
        else
            return -1;

    }

    public String getCurrencyString() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("currencyString"))
            return (localParams.get("currencyString"));
        else
            return "";
    }


}
