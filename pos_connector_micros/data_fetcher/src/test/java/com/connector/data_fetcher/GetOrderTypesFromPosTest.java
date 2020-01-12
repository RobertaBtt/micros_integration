package com.connector.data_fetcher;

import com.pos.connector.data_fetcher.AgentOrderTypeFetcherInterface;
import com.pos.connector.dto.AgentOrderType;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosOrderTypeFetcher;
import com.connector.micros.data_fetcher.request.GetOrderTypesRequestMicros;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetOrderTypesFromPosTest extends TestCase {


    @Test
    public void testGetOrderTypeListFromPOS() {

        ConfigReader configReader;

        GetOrderTypesRequestMicros getOrderTypesRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        AgentOrderTypeFetcherInterface agentOrderTypeFetcherInterface;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);
        String ENUM_ORDERTYPE = configReader.getProperty(ApplicationProperty.ENUM_ORDERTYPE);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("currencyString", "EUR");
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);
        parametersMap.put("enumOrderType", ENUM_ORDERTYPE);

        getOrderTypesRequestMicros = new GetOrderTypesRequestMicros(parametersMap);
        agentOrderTypeFetcherInterface = MicrosOrderTypeFetcher.getInstance();

        List<AgentOrderType> listOfOrderTypes = agentOrderTypeFetcherInterface.getOrderTypesFromPos(getOrderTypesRequestMicros);

        assertEquals("There are 32 types of order int this POS", 32, listOfOrderTypes.size());

    }
}
