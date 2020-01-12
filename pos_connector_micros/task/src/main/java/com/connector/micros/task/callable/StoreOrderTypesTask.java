package com.connector.micros.task.callable;

import com.pos.connector.dto.AgentOrderType;
import com.pos.connector.dto.PosRequest;
import com.pos.connector.local.data_management.AgentLocalOrderTypeManagementInterface;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.data_fetcher.MicrosOrderTypeFetcher;
import com.connector.micros.data_fetcher.request.GetRequestMicros;
import com.connector.micros.local.data_management.MicrosLocalOrderTypeManagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class StoreOrderTypesTask implements Callable {

    ConfigReaderInterface configReader;


    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Object call() throws Exception {
        return this.storeOrderTypes();
    }


    public StoreOrderTypesTask(ConfigReaderInterface applicationPropertiesFile) {
        this.configReader = applicationPropertiesFile;
    }


    private Boolean storeOrderTypes() {

        Map<String, String> parametersMap = new HashMap<String, String>();
        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String enumOrderType = configReader.getProperty(ApplicationProperty.ENUM_ORDERTYPE);
        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("enumOrderType", enumOrderType);
        parametersMap.put("revenueCenter", revenueCenter);

        MicrosOrderTypeFetcher microsOrderTypeFetcher = MicrosOrderTypeFetcher.getInstance();
        PosRequest getOrderTypesRequestMicros = new GetRequestMicros(parametersMap);

        AgentLocalOrderTypeManagementInterface dataManagementMicros = MicrosLocalOrderTypeManagement.getInstance();


        List<AgentOrderType> orderTypes = microsOrderTypeFetcher.getOrderTypesFromPos(getOrderTypesRequestMicros);

        if (orderTypes.size() > 0) {

            for (AgentOrderType agentOrderType : orderTypes) {
                dataManagementMicros.saveSingleOrderTypeLocal(agentOrderType);
            }

            return true;
        }

        return false;
    }

}
