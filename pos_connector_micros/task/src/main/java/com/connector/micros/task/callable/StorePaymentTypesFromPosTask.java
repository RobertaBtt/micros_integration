package com.connector.micros.task.callable;

import com.pos.connector.dto.AgentPayment;
import com.pos.connector.dto.PosRequest;
import com.pos.connector.local.data_management.AgentLocalPaymentTypeManagementInterface;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.data_fetcher.MicrosPaymentTypeFetcher;
import com.connector.micros.data_fetcher.request.GetRequestMicros;
import com.connector.micros.local.data_management.MicrosLocalPaymentTypeManagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class StorePaymentTypesFromPosTask implements Callable {

    ConfigReaderInterface ConfigReader;
    ConfigReaderInterface enumConfigReader;

    public StorePaymentTypesFromPosTask(ConfigReaderInterface ConfigReader, ConfigReaderInterface enumConfigReader) {
        this.ConfigReader = ConfigReader;
        this.enumConfigReader = enumConfigReader;
    }


    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Object call() throws Exception {
        return this.storePaymentTypes();

    }

    private Boolean storePaymentTypes() {

        Map<String, String> parametersMap = new HashMap<String, String>();

        /* key-values*/
        String namespaceUriServer = ConfigReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = ConfigReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + ConfigReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = ConfigReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);

        /*Enumeration key-values*/
        String enumTenderMedia = enumConfigReader.getProperty(ApplicationProperty.ENUM_TENDERMEDIA);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("enumTenderMedia", enumTenderMedia);
        parametersMap.put("revenueCenter", "11");

        MicrosPaymentTypeFetcher microsPaymentTypeFetcherMicros = MicrosPaymentTypeFetcher.getInstance();
        PosRequest getOrderTypesFromPos = new GetRequestMicros(parametersMap);
        AgentLocalPaymentTypeManagementInterface dataManagementMicros = MicrosLocalPaymentTypeManagement.getInstance();

        List<AgentPayment> payments = microsPaymentTypeFetcherMicros.getPaymentTypesFromPos(getOrderTypesFromPos);

        if (payments.size() > 0) {

            for (AgentPayment agentPayment : payments) {
                dataManagementMicros.saveSinglePaymentTypeLocal(agentPayment);
            }

            return true;
        }

        return false;
    }


}
