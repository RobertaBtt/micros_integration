package com.connector.data_fetcher;

import com.pos.connector.dto.AgentPayment;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosPaymentTypeFetcher;
import com.connector.micros.data_fetcher.request.GetPaymentTypesRequestMicros;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetPaymentTypesFromPosTest extends TestCase {


    @Test
    public void testGetPaymentTypeListFromPOS() {

        ConfigReader configReader;

        GetPaymentTypesRequestMicros getPaymentTypesRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosPaymentTypeFetcher microsPaymentTypeFetcher;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);
        String ENUM_TENDERMEDIA = configReader.getProperty(ApplicationProperty.ENUM_TENDERMEDIA);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);
        parametersMap.put("enumTenderMedia", ENUM_TENDERMEDIA);

        getPaymentTypesRequestMicros = new GetPaymentTypesRequestMicros(parametersMap);
        microsPaymentTypeFetcher = MicrosPaymentTypeFetcher.getInstance();

        List<AgentPayment> listOfPayments = microsPaymentTypeFetcher.getPaymentTypesFromPos(getPaymentTypesRequestMicros);

        assertEquals("There are 64 type of Payment in this POS", 64, listOfPayments.size());

    }
}
