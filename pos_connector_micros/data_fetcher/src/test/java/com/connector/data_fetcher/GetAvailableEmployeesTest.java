package com.connector.data_fetcher;

import com.pos.connector.dto.AgentEmployee;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.LocalConnectionExcludeTest;
import com.connector.micros.data_fetcher.MicrosEmployeesFetcher;
import com.connector.micros.data_fetcher.request.GetAvailableEmployeesRequestMicros;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Category(LocalConnectionExcludeTest.class)
public class GetAvailableEmployeesTest extends TestCase {


    @Test
    public void testGetAvailableEmployees() {

        ConfigReader configReader;

        GetAvailableEmployeesRequestMicros getAvailableEmployeesRequestMicros;
        Map<String, String> parametersMap = new HashMap<String, String>();

        MicrosEmployeesFetcher microsEmployeesFetcher;

        Setup:
        configReader = ConfigReader.getInstance(null);

        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);
        String ENUM_EMPLOYEES = configReader.getProperty(ApplicationProperty.ENUM_EMPLOYEES);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);

        parametersMap.put("revenueCenter", revenueCenter);
        parametersMap.put("enumEmployees", ENUM_EMPLOYEES);

        microsEmployeesFetcher = MicrosEmployeesFetcher.getInstance();


        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        getAvailableEmployeesRequestMicros = new GetAvailableEmployeesRequestMicros(parametersMap);
        List<AgentEmployee> listOfEmployees = microsEmployeesFetcher.getEmployeesFromPos(getAvailableEmployeesRequestMicros);

        assertEquals("There is 1 Employees in this POS", 1, listOfEmployees.size());

    }
}
