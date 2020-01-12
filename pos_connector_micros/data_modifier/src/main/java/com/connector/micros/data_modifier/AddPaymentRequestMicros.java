package com.connector.micros_micros.data_modifier;

import java.util.Map;
import java.util.UUID;

public class AddPaymentRequestMicros extends PostRequestMicros {


    public AddPaymentRequestMicros(Map<String, String> requestParameters) {
        super(requestParameters);
    }

    public UUID getAgentInstallationUUID() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("agentInstallationUUID"))
            return UUID.fromString(localParams.get("agentInstallationUUID"));
        else
            return null;
    }

    public int getEmployeeObjectNumber() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("employeeObjectNumber"))
            return Integer.valueOf(localParams.get("employeeObjectNumber"));
        else
            return -1;
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


    public int getOrderType() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("orderType"))
            return Integer.valueOf(localParams.get("orderType"));
        else
            return -1;
    }


    public int getGuestCount() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("guestCount"))
            return Integer.valueOf(localParams.get("guestCount"));
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


    public int getStatusBit() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("statusBit"))
            return Integer.valueOf(localParams.get("statusBit"));
        else
            return -1;
    }

    public int getTableObjectNumber() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("tableObjectNumber"))
            return Integer.valueOf(localParams.get("tableObjectNumber"));
        else
            return -1;
    }


    public int getEventObjectNumber() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("eventObjectNumber"))
            return Integer.valueOf(localParams.get("eventObjectNumber"));
        else
            return -1;
    }

    public int getTenderMediaObjectNumber() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("tenderMediaObjectNumber"))
            return Integer.valueOf(localParams.get("tenderMediaObjectNumber"));
        else
            return -1;
    }

    public String getPartialPayment() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("partialPayment"))
            return localParams.get("partialPayment");
        else
            return "";
    }


    public String getTenderMediaReference() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("tenderMediaReference"))
            return localParams.get("tenderMediaReference");
        else
            return "";
    }

    public String getTipAmount() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("tipAmount"))
            return localParams.get("tipAmount");
        else
            return "0";
    }

    public boolean getHasDiscount() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("hasDiscount"))
            return Boolean.valueOf(localParams.get("hasDiscount"));
        else
            return false;
    }

    public String getDiscountAmount() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("discountAmount"))
            return localParams.get("discountAmount");
        else
            return "";
    }

    public int getDiscountObjectNumber() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("discountObjectNumber"))
            return Integer.valueOf(localParams.get("discountObjectNumber"));
        else
            return -1;
    }

    public String getDiscountReference() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("discountReference"))
            return localParams.get("discountReference");
        else
            return "";
    }

    public String getCurrencyString() {
        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("currencyString"))
            return (localParams.get("currencyString"));
        else
            return "";
    }

    public String getLocale() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("locale"))
            return localParams.get("locale");
        else
            return "";
    }

    public String getDateFormat() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("dateFormat"))
            return localParams.get("dateFormat");
        else
            return "";
    }

    public String getDateToFire() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("dateToFire"))
            return localParams.get("dateToFire");
        else
            return "";
    }


    public Long getPaymentTime() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("paymentTime"))
            return Long.valueOf(localParams.get("paymentTime"));
        else
            return 0L;
    }


    public boolean getHasServiceCharge() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("hasServiceCharge"))
            return Boolean.valueOf(localParams.get("hasServiceCharge"));
        else
            return false;
    }

    public String getServiceChargeAmount() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("serviceChargeAmount"))
            return localParams.get("serviceChargeAmount");
        else
            return "";
    }

    public int getServiceChargeObjectNumber() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("serviceChargeObjectNumber"))
            return Integer.valueOf(localParams.get("serviceChargeObjectNumber"));
        else
            return -1;
    }

    public String getServiceChargeReference() {

        Map<String, String> localParams = super.getParameters();
        if (!localParams.isEmpty() && localParams.containsKey("serviceChargeReference"))
            return localParams.get("serviceChargeReference");
        else
            return "";
    }


}
