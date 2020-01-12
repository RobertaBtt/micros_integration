package com.connector.data_fetcher;

import com.pos.connector.dto.AgentCurrency;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosCurrenciesFetcher;
import com.connector.micros.data_fetcher.request.GetAvailableCurrenciesRequestMicros;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetAvailableCurrenciesTest extends TestCase {


    @Test
    public void testGetAvailableCurrencies() {

        ConfigReader configReader;

        GetAvailableCurrenciesRequestMicros getAvailableCurrenciesRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosCurrenciesFetcher microsCurrenciesFetcher;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);
        String ENUM_CURRENCY = configReader.getProperty(ApplicationProperty.ENUM_CURRENCY);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("currencyString", "EUR");

        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);
        parametersMap.put("enumCurrency", ENUM_CURRENCY);

        getAvailableCurrenciesRequestMicros = new GetAvailableCurrenciesRequestMicros(parametersMap);
        microsCurrenciesFetcher = MicrosCurrenciesFetcher.getInstance();

        List<AgentCurrency> listOfCurrency = microsCurrenciesFetcher.getCurrenciesFromPos(getAvailableCurrenciesRequestMicros);

        assertEquals("There are 4 currencies in this POS", 4, listOfCurrency.size());

    }
}
