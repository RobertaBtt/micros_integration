package com.connector.micros.task.callable;

import com.pos.connector.dto.AgentDiscount;
import com.pos.connector.dto.PosRequest;
import com.pos.connector.local.data_management.AgentLocalDiscountsManagementInterface;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.data_fetcher.MicrosDiscountsFetcher;
import com.connector.micros.data_fetcher.request.GetRequestMicros;
import com.connector.micros.local.data_management.MicrosLocalDiscountsManagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class StoreDiscountsFromPosTask implements Callable {

    ConfigReaderInterface ConfigReader;
    ConfigReaderInterface enumConfigReader;

    public StoreDiscountsFromPosTask(ConfigReaderInterface ConfigReader, ConfigReaderInterface enumConfigReader) {
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
        return this.storeDiscounts();
    }


    private Boolean storeDiscounts() {

        Map<String, String> parametersMap = new HashMap<String, String>();

        /* key-values*/
        String namespaceUriServer = ConfigReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = ConfigReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + ConfigReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = ConfigReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);
        String currencyString = ConfigReader.getProperty(ApplicationProperty.GLOBAL_POS_CURRENCY);

        /*This is an enumeration as well, but the special one, it is in both files,  and enumeration*/
        String revenueCenter = ConfigReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);

        /*Enumeration key-values*/
        String enumDiscounts = enumConfigReader.getProperty(ApplicationProperty.ENUM_DISCOUNTDEFINITIONS);


        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("enumDiscounts", enumDiscounts);
        parametersMap.put("revenueCenter", revenueCenter);
        parametersMap.put("currencyString", currencyString);

        MicrosDiscountsFetcher microsDiscountsFetcher = MicrosDiscountsFetcher.getInstance();
        PosRequest getDiscountsFromPos = new GetRequestMicros(parametersMap);
        AgentLocalDiscountsManagementInterface dataManagementMicros = MicrosLocalDiscountsManagement.getInstance();

        List<AgentDiscount> discounts = microsDiscountsFetcher.getDiscountsFromPos(getDiscountsFromPos);

        if (discounts.size() > 0) {

            for (AgentDiscount agentDiscount : discounts) {
                dataManagementMicros.saveSingleDiscountLocal(agentDiscount);
            }

            return true;
        }

        return false;
    }

}
