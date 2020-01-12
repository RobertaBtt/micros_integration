package com.connector.micros.application;

import com.pos.connector.dto.PosRequest;
import com.connector.micros.config.ApplicationProperty;
import com.connector.micros.config.reader.ConfigReader;
import com.connector.micros.config.reader.ConfigReaderInterface;
import com.connector.micros.config.writer.ConfigWriter;
import com.connector.micros.config.writer.ConfigWriter;
import com.connector.micros.data_fetcher.MicrosMenuItemClassFetcher;
import com.connector.micros.data_fetcher.MicrosMenuItemDefinitionFetcher;
import com.connector.micros.data_fetcher.request.GetRequestMicros;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SetPrefixCondiments {

    public static void setPrefixCondiments(ConfigReaderInterface ConfigReader, ConfigReaderInterface enumConfigReader,  String externalPropertiesFile) {


        Map<String, String> parametersMap = new HashMap<String, String>();
        String namespaceUriServer = ConfigReader.getProperty(ApplicationProperty.NAMESPACE_URI_SERVER);
        String namespaceUri = ConfigReader.getProperty(ApplicationProperty.NAMESPACE_URI);
        String targetEndPoint = namespaceUriServer + ConfigReader.getProperty(ApplicationProperty.END_POINT_ASMX);
        String employeeObjectNumber = ConfigReader.getProperty(ApplicationProperty.EMPLOYEE_OBJ_NUM);

        /*Menu Item Class are the classification of the Items.
         * Here we can find the class of the Prefix Condiments*/

        String enumMenuItemClass = enumConfigReader.getProperty(ApplicationProperty.ENUM_MENUITEMCLASS);
        String enumMenuItemDefinitions = enumConfigReader.getProperty(ApplicationProperty.ENUM_MENUITEMDEFINITIONS);

        String revenueCenter = ConfigReader.getProperty(ApplicationProperty.ENUM_REVENUECENTERS);

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
                    condiments.put((String)pair.getValue(), menuItemClasses.get(pair.getKey()));

                    try {
                        ConfigWriter.setPropertyByString(( String)pair.getValue(), menuItemClasses.get(pair.getKey()));
                        ConfigWriter.writePropertiesToFile(externalPropertiesFile);
                    } catch (IOException ex) {
                        System.out.println("Error writing property " + pair.getValue() + " in the file " + externalPropertiesFile);
                    }
                }

            }

                    /*Only at the end of the config process, we set up the enum_config = on*/

            ConfigWriter.setProperty(ApplicationProperty.PREFIX_CONDIMENTS_SETTED, "on");

            try {
                ConfigWriter.writePropertiesToFile(externalPropertiesFile);
            } catch (IOException ex) {
                System.out.println("Error writing property PREFIX_CONDIMENTS_SETTED in the file " + externalPropertiesFile);
            }


        }



    }
}
