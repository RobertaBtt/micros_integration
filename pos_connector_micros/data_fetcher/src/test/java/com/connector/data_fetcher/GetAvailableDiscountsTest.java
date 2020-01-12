package com.connector.data_fetcher;

import com.pos.connector.dto.AgentDiscount;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosDiscountsFetcher;
import com.connector.micros.data_fetcher.request.GetDiscountsRequestMicros;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetAvailableDiscountsTest extends TestCase {


    @Test
    public void testGetAvailableDiscounts() {

        ConfigReader configReader;

        GetDiscountsRequestMicros getDiscountsRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosDiscountsFetcher microsDiscountsFetcher;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);
        String currencyString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_CURRENCY);
        String ENUM_DISCOUNTDEFINITIONS = configReader.getProperty(ApplicationProperty.ENUM_DISCOUNTDEFINITIONS);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);

        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);
        parametersMap.put("enumDiscounts", ENUM_DISCOUNTDEFINITIONS);
        parametersMap.put("currencyString", currencyString);

        getDiscountsRequestMicros = new GetDiscountsRequestMicros(parametersMap);
        microsDiscountsFetcher = MicrosDiscountsFetcher.getInstance();

        List<AgentDiscount> listOfDiscounts = microsDiscountsFetcher.getDiscountsFromPos(getDiscountsRequestMicros);

        assertEquals("There are 19 discounts in this POS", 19, listOfDiscounts.size());

    }
}
