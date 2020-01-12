package com.connector.micros.task.callable;

import com.pos.connector.dto.PosRequest;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.data_fetcher.MicrosMenuItemClassFetcher;
import com.connector.micros.data_fetcher.MicrosMenuItemDefinitionFetcher;
import com.connector.micros.data_fetcher.request.GetRequestMicros;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

public class GetPrefixCondimentsFromPosTask implements Callable {

    ConfigReader configReader;

    public GetPrefixCondimentsFromPosTask(ConfigReader applicationPropertiesFile) {
        this.configReader = applicationPropertiesFile;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Object call() throws Exception {
        return this.getPrefixCondiments();
    }


    private HashMap<String, String>  getPrefixCondiments() {

        Map<String, String> parametersMap = new HashMap<String, String>();
        String namespaceUriServer = configReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = configReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + configReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = configReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);

        /*Menu Item Class are the classification of the Items.
         * Here we can find the class of the Prefix Condiments*/

        String enumMenuItemClass = configReader.getProperty(ApplicationProperty.ENUM_MENUITEMCLASS);
        String enumMenuItemDefinitions = configReader.getProperty(ApplicationProperty.ENUM_MENUITEMDEFINITIONS);

        String revenueCenter = configReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);

        parametersMap.put("namespaceUriServer", namespaceUriServer);
        parametersMap.put("namespaceUri", namespaceUri);
        parametersMap.put("targetEndPoint", targetEndPoint);
        parametersMap.put("employeeObjectNumber", employeeObjectNumber);
        parametersMap.put("revenueCenter", revenueCenter);

        /*This parameter is used in the first request, MENUITEMCLASS Config Info*/
        parametersMap.put("enumMenuItemClass", enumMenuItemClass);

        /*This parameter is used in the second request, MENUITEMDEFINITIONS Config Info*/
        parametersMap.put("enumMenuItemDefinitions", enumMenuItemDefinitions);

        MicrosMenuItemClassFetcher menuItemsClassFetcher = MicrosMenuItemClassFetcher.getInstance();
        MicrosMenuItemDefinitionFetcher menuItemDefinitionFetcher = MicrosMenuItemDefinitionFetcher.getInstance();

        PosRequest getMenuItemsFromPos = new GetRequestMicros(parametersMap);

        /*First we get the MenuItemClass (MENUITEMCLASS ConfigInfo)*/
        HashMap<String, String> menuItemClasses = menuItemsClassFetcher.getHashMapMenuItemsFromPos(getMenuItemsFromPos);

        /*Then, we get the MenuItemDefinitions (MENUITEMDEFINITIONS ConfigInfo)*/
        HashMap<String, String> menuItemDefinitions = menuItemDefinitionFetcher.getHashMapMenuItemsFromPos(getMenuItemsFromPos);


        HashMap<String, String> condiments = new HashMap<String, String>();

        if (menuItemClasses.size() > 0 && menuItemDefinitions.size() > 0){


            Iterator it = menuItemDefinitions.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if (menuItemClasses.containsKey(pair.getKey()) ){
                    condiments.put((String)pair.getKey(), menuItemClasses.get(pair.getKey()));
                }

            }

        }



        return condiments;

    }

}
