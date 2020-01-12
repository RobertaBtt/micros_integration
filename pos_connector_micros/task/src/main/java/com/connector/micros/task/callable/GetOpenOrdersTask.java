package com.connector.micros.task.callable;

import com.pos.connector.dto.AgentOrder;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.pos.connector.local.data_comparator.AgentLocalDataComparatorInterface;
import com.pos.connector.local.data_management.AgentLocalOpenOrdersManagementInterface;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.data_fetcher.MicrosOpenOrdersFetcher;
import com.connector.micros.data_fetcher.request.GetOrderByIdentificatorRequestMicros;
import com.connector.micros.data_fetcher.request.GetRequestMicros;
import com.connector.micros.dto.MicrosAgentOrder;
import com.connector.micros.local.data_comparator.MicrosLocalDataComparator;
import com.connector.micros.local.data_management.MicrosLocalOpenOrdersManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class GetOpenOrdersTask implements Callable {

    ConfigReaderInterface configReader;

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Object call() throws Exception {
        return this.getPosOrdersList();
    }


    public GetOpenOrdersTask(ConfigReaderInterface applicationPropertiesFile) {

        this.configReader = applicationPropertiesFile;
    }

    private HashMap<String, Object> getPosOrdersList() {

        Map<String, String> parametersMap = new HashMap<String, String>();
        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String currencyString = configReader.getProperty(ApplicationProperty.GLOBAL_POS_CURRENCY);
        String agentInstallationUUID = configReader.getProperty(ApplicationProperty.AGENT_INSTALLATION_UUID);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("currencyString", currencyString);
        parametersMap.put("agentInstallationUUID", agentInstallationUUID);

        MicrosOpenOrdersFetcher microsOpenOrdersFetcher = MicrosOpenOrdersFetcher.getInstance();
        PosRequest getOpenOrdersRequestMicros = new GetRequestMicros(parametersMap);
        GetOrderByIdentificatorRequestMicros getOrderByIdentificatorRequestMicros = null;
        AgentLocalOpenOrdersManagementInterface dataManagementMicros = MicrosLocalOpenOrdersManagement.getInstance();
        AgentLocalDataComparatorInterface dataComparatorMicros = new MicrosLocalDataComparator();
        HashMap<String, Object> newOrUpdatedOrders = new HashMap<String, Object>();
        HashMap<String, Object> enrichedMicrosOrders = new HashMap<String, Object>();

        List<AgentOrder> orders = new ArrayList<AgentOrder>();

        try {
            orders = microsOpenOrdersFetcher.getOpenOrders(getOpenOrdersRequestMicros);

        } catch (PosException ex) {

            System.out.println("PosException GetOpenOrdersTask " + ex.getErrorCode().getCode() +
                    " " + ex.getErrorCode().getMessage());

        }


        if (orders.size() > 0) {
            AgentOrder tempOrder;

            newOrUpdatedOrders = dataComparatorMicros.getNewOrUpdatedPosOrders(dataManagementMicros.getOrdersLocal(), dataManagementMicros.convertListToHash(orders));

            for (Map.Entry<String, Object> entry : newOrUpdatedOrders.entrySet()) {

                parametersMap.put("checkNumber", String.valueOf(((MicrosAgentOrder) entry.getValue()).getNumber()));
                parametersMap.put("checkSequence", String.valueOf(((MicrosAgentOrder) entry.getValue()).getSequence()));
                parametersMap.put("lastServiceTime", String.valueOf(((MicrosAgentOrder) entry.getValue()).getLastServiceTime()));
                parametersMap.put("tableNumber", String.valueOf(((MicrosAgentOrder) entry.getValue()).getTableNumber()));


                getOrderByIdentificatorRequestMicros = new GetOrderByIdentificatorRequestMicros(parametersMap);

                tempOrder = microsOpenOrdersFetcher.getOrderbyIdentifier(getOrderByIdentificatorRequestMicros);
                enrichedMicrosOrders.put(tempOrder.getIdentifier(), tempOrder);

            }
        }

        return enrichedMicrosOrders;
    }


}
