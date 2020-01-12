package com.connector.micros_micros.data_modifier;

import com.connector.micros.dto.AgentOrder;
import com.connector.micros_micros.config.ApplicationProperty;
import com.connector.micros_micros.config.reader.ConfigReader;
import com.connector.micros_micros.config.LocalConnectionExcludeTest;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class AddPaymentTest extends TestCase {


    @Test
    public void testAddPaymentWithDiscount() {

        ConfigReader configReader;

        AddPaymentRequestMicros addPaymentRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosOrderModifier agentPOSDataModifierMicros;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String currencyString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_CURRENCY);
        String agentInstallationUUID = configReader.getProperty(ApplicationProperty.AGENT_INSTALLATION_UUID);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);

        String localeString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_LOCALE);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("currencyString", currencyString);
        parametersMap.put("locale", localeString);
        parametersMap.put("agentInstallationUUID", agentInstallationUUID);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);

        parametersMap.put("checkNumber", "1034");
        parametersMap.put("checkSequence", "820560874");
        parametersMap.put("guestCount", "0");
        parametersMap.put("orderType", "11");
        parametersMap.put("statusBit", "0");
        parametersMap.put("tableObjectNumber", "0");
        parametersMap.put("eventObjectNumber", "0");
        parametersMap.put("tenderMediaObjectNumber", "1");
        parametersMap.put("tenderMediaReference", "Payed with pleasure ");
        parametersMap.put("partialPayment", "0.02");

        parametersMap.put("tipAmount", "0.01");
        parametersMap.put("dateToFire", "0001-01-01 00:00:00");
        parametersMap.put("cardExpirationDate", "0001-01-01 00:00:00");
        parametersMap.put("paymentTime", "1539094635");
        parametersMap.put("dateFormat", "yyyy-mm-dd HH:mm:ss");

        /*Adding discount details*/

        parametersMap.put("hasDiscount", "false");
        parametersMap.put("discountAmount", "0.03");
        parametersMap.put("discountObjectNumber", "810");
        parametersMap.put("discountReference", " Discount");


        addPaymentRequestMicros = new AddPaymentRequestMicros(parametersMap);
        agentPOSDataModifierMicros = new MicrosOrderModifier();


        AgentOrder order = agentPOSDataModifierMicros.addPayment(addPaymentRequestMicros);


    }


    @Test
    public void testAddPaymentWithServiceCharge() {

        ConfigReader configReader;

        AddPaymentRequestMicros addPaymentRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosOrderModifier agentPOSDataModifierMicros;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String currencyString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_CURRENCY);
        String agentInstallationUUID = configReader.getProperty(ApplicationProperty.AGENT_INSTALLATION_UUID);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);

        String localeString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_LOCALE);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("currencyString", currencyString);
        parametersMap.put("locale", localeString);
        parametersMap.put("agentInstallationUUID", agentInstallationUUID);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);

        parametersMap.put("checkNumber", "1030");
        parametersMap.put("checkSequence", "777354414");
        parametersMap.put("guestCount", "1");
        parametersMap.put("orderType", "41");
        parametersMap.put("statusBit", "0");
        parametersMap.put("tableObjectNumber", "0");
        parametersMap.put("eventObjectNumber", "0");
        parametersMap.put("tenderMediaObjectNumber", "101");
        parametersMap.put("tenderMediaReference", "");
        parametersMap.put("partialPayment", "0");

        parametersMap.put("tipAmount", "0.00");
        parametersMap.put("dateToFire", "0001-01-01 00:00:00");
        parametersMap.put("cardExpirationDate", "0001-01-01 00:00:00");
        parametersMap.put("paymentTime", "1539094635");
        parametersMap.put("dateFormat", "yyyy-mm-dd HH:mm:ss");

        /*Adding service charge details*/

        parametersMap.put("hasServiceCharge", "true");
        parametersMap.put("serviceChargeAmount", "");
        parametersMap.put("serviceChargeObjectNumber", "3");
        parametersMap.put("serviceChargeReference", "Service Charge ");


        addPaymentRequestMicros = new AddPaymentRequestMicros(parametersMap);
        agentPOSDataModifierMicros = new MicrosOrderModifier();


        AgentOrder order = agentPOSDataModifierMicros.addPayment(addPaymentRequestMicros);


    }


}
