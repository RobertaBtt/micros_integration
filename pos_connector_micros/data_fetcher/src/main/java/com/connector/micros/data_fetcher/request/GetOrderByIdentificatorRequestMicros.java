package com.connector.micros.data_fetcher.request;


import java.util.Map;
import java.util.UUID;

public class GetOrderByIdentificatorRequestMicros extends GetRequestMicros {


    public GetOrderByIdentificatorRequestMicros(Map<String, String> requestParameters) {

        super(requestParameters);
    }

    public int getCheckNumber() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("checkNumber"))
            return Integer.valueOf(localParams.get("checkNumber"));
        else
            return -1;
    }

    public int getCheckSequence() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("checkSequence"))
            return Integer.valueOf(localParams.get("checkSequence"));
        else
            return -1;
    }

    /*TODO: maybe substitute with "locale" ?
     * */
    public String getCurrencyString() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("currencyString"))
            return (localParams.get("currencyString"));
        else
            return "";
    }


    public UUID getAgentInstallationUUID() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("agentInstallationUUID"))
            return UUID.fromString(localParams.get("agentInstallationUUID"));
        else
            return null;
    }

    public Long getLastServiceTime() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("lastServiceTime"))
            return (Long.valueOf(localParams.get("lastServiceTime")));
        else
            return 0L;
    }

    public int getTableNumber() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("tableNumber"))
            return (Integer.valueOf(localParams.get("tableNumber")));
        else
            return -1;
    }

}
