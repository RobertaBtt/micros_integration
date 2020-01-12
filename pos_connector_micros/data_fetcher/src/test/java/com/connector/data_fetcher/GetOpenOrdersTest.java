package com.connector.data_fetcher;

import com.pos.connector.dto.AgentOrder;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosOpenOrdersFetcher;
import com.connector.micros.data_fetcher.request.GetOpenOrdersRequestMicros;
import com.connector.micros.dto.MicrosAgentOrder;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetOpenOrdersTest extends TestCase {

    @Test
    public void testGetOpenOrders() {

        ConfigReader configReader;
        GetOpenOrdersRequestMicros getOpenOrdersRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosOpenOrdersFetcher agentMicrosDataFetcher;


        Setup:
        configReader = ConfigReader.getInstance(null);
        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);

        getOpenOrdersRequestMicros = new GetOpenOrdersRequestMicros(parametersMap);

        agentMicrosDataFetcher = MicrosOpenOrdersFetcher.getInstance();

        List<AgentOrder> orders = agentMicrosDataFetcher.getOpenOrders(getOpenOrdersRequestMicros);
        if (orders.size() > 0) {
            MicrosAgentOrder order = (MicrosAgentOrder) orders.get(0);

            assertEquals("There are two checks", 3, orders.size());
            assertEquals("The order has number 1023", 1023, order.getNumber());
            assertEquals("The order has sequence", 569248240, order.getSequence());
            assertEquals("The order was created in the Table number", 0, order.getTableNumber());
//
//            MicrosAgentOrder order2 = (MicrosAgentOrder)orders.get(1);
//            assertEquals("The order has sequence", "634694889" , order2.getSequence());
//            assertEquals("The order is of type 1", "1" , ((MicrosAgentOrderType) order2.getOrderType()).getOrderTypeID());
//            assertEquals("The order has number", "1001" , order2.getNumber());
        }


    }


}
