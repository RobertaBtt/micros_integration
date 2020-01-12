package com.connector.micros_micros.local.data_comparator;

import com.connector.micros.dto.AgentOrder;
import com.connector.micros_micros.config.ApplicationProperty;
import com.connector.micros_micros.config.reader.ConfigReader;
import com.connector.micros_micros.config.LocalConnectionExcludeTest;
import com.connector.micros_micros.data_fetcher.MicrosOpenOrdersFetcher;
import com.connector.micros_micros.data_fetcher.request.GetOpenOrdersRequestMicros;
import com.connector.micros_micros.dto.MicrosAgentOrder;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class AgentDataComparatorMicrosTest extends TestCase {

    private Map<String, String> configParameters() {

        ConfigReader configReader;
        Map<String, String> parametersMap = new HashMap<String, String>();

        Setup:
        configReader = ConfigReader.getInstance(null);
        //Is equivalent to : configReader = new ConfigReader("./application.properties");
        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);

        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);

        return parametersMap;

    }

    @Test
    public void testANewOrderIsFound() {

        ConfigReader configReader;
        GetOpenOrdersRequestMicros getOpenOrdersRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosOpenOrdersFetcher agentMicrosDataFetcher;


        Setup:
        parametersMap = this.configParameters();


        getOpenOrdersRequestMicros = new GetOpenOrdersRequestMicros(parametersMap);
        agentMicrosDataFetcher = MicrosOpenOrdersFetcher.getInstance();

        List<AgentOrder> orders = agentMicrosDataFetcher.getOpenOrders(getOpenOrdersRequestMicros);

        /*
         * With this process we are simulating the local orders
         * We are excluding the third element, which is the newest
         * */

        HashMap<String, Object> localOrders = new HashMap<String, Object>();
        HashMap<String, Object> posOrders = new HashMap<String, Object>();

        if (orders.size() > 0) {

            localOrders.put(orders.get(0).getIdentifier(), orders.get(0));
            localOrders.put(orders.get(1).getIdentifier(), orders.get(1));

            posOrders.put(orders.get(0).getIdentifier(), orders.get(0));
            posOrders.put(orders.get(1).getIdentifier(), orders.get(1));
            posOrders.put(orders.get(2).getIdentifier(), orders.get(2));

        }

        MicrosLocalDataComparator comparator = new MicrosLocalDataComparator();
        HashMap<String, Object> onlyTheNew = comparator.getNewOrUpdatedPosOrders(localOrders, posOrders);
        assertEquals(1, onlyTheNew.size());

        /*Now we simulate the update a POS Order */

        /*Qua creare un nuovo oggetto !!*/
        MicrosAgentOrder orderModified = (MicrosAgentOrder) orders.get(0);
        MicrosAgentOrder orderModify = MicrosAgentOrder.builder()

                .number(orderModified.getNumber())
                .sequence(orderModified.getSequence())
                .orderType(orderModified.getOrderType())
                .lastServiceTime(orderModified.getLastServiceTime() + 150)
                .openTime(orderModified.getOpenTime())
                .tableNumber(orderModified.getTableNumber())
                .totalDue(orderModified.getTotalDue())

                .build();

        /*Simulate the update od posOrders HashMap*/
        /*The put method overwrite the object if it founds the key in the HashMap*/
        posOrders.put(orderModify.getIdentifier(), orderModify);


        HashMap<String, Object> modified = comparator.getNewOrUpdatedPosOrders(localOrders, posOrders);
        assertEquals(2, modified.size());
    }


    @Test
    public void testAOrderIsClosedInThePos() {

        ConfigReader configReader;
        GetOpenOrdersRequestMicros getOpenOrdersRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosOpenOrdersFetcher agentMicrosDataFetcher;


        Setup:
        parametersMap = this.configParameters();


        getOpenOrdersRequestMicros = new GetOpenOrdersRequestMicros(parametersMap);
        agentMicrosDataFetcher = MicrosOpenOrdersFetcher.getInstance();

        List<AgentOrder> orders = agentMicrosDataFetcher.getOpenOrders(getOpenOrdersRequestMicros);

        /*
         * With this process we are simulating the local orders
         * We are excluding the third element, which is the newest
         * */

        HashMap<String, Object> localOrders = new HashMap<String, Object>();
        HashMap<String, Object> posOrders = new HashMap<String, Object>();

        if (orders.size() > 0) {

            localOrders.put(orders.get(0).getIdentifier(), orders.get(0));
            localOrders.put(orders.get(1).getIdentifier(), orders.get(1));
            localOrders.put(orders.get(2).getIdentifier(), orders.get(2));

            posOrders.put(orders.get(0).getIdentifier(), orders.get(0));
            posOrders.put(orders.get(1).getIdentifier(), orders.get(1));

        }

        MicrosLocalDataComparator comparator = new MicrosLocalDataComparator();
        HashMap<String, Object> orderClosedInThePos = comparator.getDeletedPosOrders(localOrders, posOrders);
        assertEquals(1, orderClosedInThePos.size());

    }


}
