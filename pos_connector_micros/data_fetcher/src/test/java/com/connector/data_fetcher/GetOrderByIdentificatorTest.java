package com.connector.data_fetcher;

import com.pos.connector.dto.AgentOrder;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosOpenOrdersFetcher;
import com.connector.micros.data_fetcher.request.GetOrderByIdentificatorRequestMicros;
import com.connector.micros.dto.MicrosAgentOrder;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetOrderByIdentificatorTest extends TestCase {


    @Test
    public void testGetOrderByIdentificator() {

        ConfigReader configReader;
        GetOrderByIdentificatorRequestMicros getOrderByIdentificatorRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosOpenOrdersFetcher agentMicrosDataFetcher;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String agentInstallationUUID = configReader.getProperty(ApplicationProperty.AGENT_INSTALLATION_UUID);
        String currencyString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_CURRENCY);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("currencyString", currencyString);
        parametersMap.put("agentInstallationUUID", agentInstallationUUID);
        parametersMap.put("checkNumber", "1029");
        parametersMap.put("checkSequence", "75284743");
        parametersMap.put("tableNumber", "12");

        getOrderByIdentificatorRequestMicros = new GetOrderByIdentificatorRequestMicros(parametersMap);
        agentMicrosDataFetcher = MicrosOpenOrdersFetcher.getInstance();

        AgentOrder order = agentMicrosDataFetcher.getOrderbyIdentifier(getOrderByIdentificatorRequestMicros);

        MicrosAgentOrder microsOrder = (MicrosAgentOrder) order;
        assertEquals("This is the check with number: ", 1029, microsOrder.getNumber());
        // assertEquals (Money.of(new BigDecimal(-5), "EUR"), ((MicrosAgentDiscount)microsOrder.getDiscounts().get(0)).getFixedAmount());
        // assertEquals("This is the check with sequence: ", "24552323", microsOrder.getSequence());

//
//        /*We change the request and we ask for the check 1000 */
//        parametersMap.put("checkNumber", "1000");
//        parametersMap.put("checkSequence", "524086124");
//
//        order = agentMicrosDataFetcher.getOrderbyIdentifier(getOrderByIdentificatorRequestMicros);
//
//        MicrosAgentOrder microsOrder2 = (MicrosAgentOrder)order;
//        assertEquals("This is the check with number: ", "1000", microsOrder2.getNumber());
//
//        assertEquals("This check has 2.87 of tip: ", "2.87", String.valueOf(microsOrder2.getTipAmount().floatValue()));

    }
}
