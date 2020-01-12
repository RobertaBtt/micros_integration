package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.AgentMenuItem;
import com.connector.micros.dto.MicrosAgentMenuItem;
import com.connector.micros.porting.element.ArrayOfDbMenuItemClass;
import com.connector.micros.porting.element.ArrayOfDbMenuItemDefinition;
import com.connector.micros.porting.element.DbMenuItemClass;
import com.connector.micros.porting.element.DbMenuItemDefinition;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;
import com.micros_hosting.egateway.EConfigurationInfoType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GetMenuItemConverter {

    /***
     *
     * @param response MicrosGetConfigurationInfoResponse
     * @return The string that represents the configuration of Agent specific of Micros
     */
    public static HashMap<String, String> convertResponse(MicrosGetConfigurationInfoResponse response) {

        /*MENUITEMCLASS*/
        ArrayOfDbMenuItemClass arrayOfDbMenuItemClass = null;
        List<DbMenuItemClass> dbMenuItemClasses;

        /*MENUITEMDEFINITIONS*/
        ArrayOfDbMenuItemDefinition arrayOfDbMenuDefinition = null;
        List<DbMenuItemDefinition> dbMenuItemDefinitions;

        AgentMenuItem menuItemToRetrieve;

        HashMap<String, String> menuItemsHashMap = new HashMap<String,String>();


        if (response.getConfigInfoResponse().getOperationalResult().getSuccess()) {

            /*We are parsing the MENUITEMCLASS*/
            if (getResponseType(response).equalsIgnoreCase("MENUITEMCLASS")) {
                String menuItemClassXml = response.getConfigInfoResponse().getMenuItemClass();

                if (!menuItemClassXml.isEmpty()) {
                    try {
                        arrayOfDbMenuItemClass = ArrayOfDbMenuItemClass.Factory.parse(menuItemClassXml);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    if (arrayOfDbMenuItemClass != null) {
                        dbMenuItemClasses = arrayOfDbMenuItemClass.getDbMenuItemClass();
                        if (dbMenuItemClasses.size() > 0) {

                            for (DbMenuItemClass dbMenuItemClass : dbMenuItemClasses) {
                                if (dbMenuItemClass.getCondimentPrefixType() != 0){
                                    menuItemsHashMap.put(dbMenuItemClass.getObjectNumber(),dbMenuItemClass.getName().getStringText() );
                                }

                            }

                        }
                    }
                }
            } else if (getResponseType(response).equalsIgnoreCase("MENUITEMDEFINITIONS")) {

                String menuItemDefinitionsXml = response.getConfigInfoResponse().getMenuItemDefinitions();

                if (!menuItemDefinitionsXml.isEmpty()) {
                    try {
                        arrayOfDbMenuDefinition = ArrayOfDbMenuItemDefinition.Factory.parse(menuItemDefinitionsXml);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (arrayOfDbMenuDefinition != null) {
                        dbMenuItemDefinitions = arrayOfDbMenuDefinition.getDbMenuItemDefinition();
                        if (dbMenuItemDefinitions.size() > 0) {

                            for (DbMenuItemDefinition dbMenuItemDefinition : dbMenuItemDefinitions) {
                                menuItemsHashMap.put(dbMenuItemDefinition.getMenuItemClassObjNum(),dbMenuItemDefinition.getMiMasterObjNum() );

//                                menuItemToRetrieve = MicrosAgentMenuItem.builder()
//                                        .name(dbMenuItemDefinition.getName1().getStringText())
//                                        .identifier(dbMenuItemDefinition.getMenuItemClassObjNum())
//                                        .build();
//                                ((MicrosAgentMenuItem) menuItemToRetrieve).setMiMasterObjNum(dbMenuItemDefinition.getMiMasterObjNum());
//                                menuItems.add(menuItemToRetrieve);
                            }

                        }
                    }

                }


            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return menuItemsHashMap;

    }

    private static String getResponseType(MicrosGetConfigurationInfoResponse response) {

        EConfigurationInfoType[] configInfoType = response.getConfigInfoResponse().getConfigInfoType().getEConfigurationInfoType();
        String configInfoTypeValue = configInfoType[0].getValue();
        return configInfoTypeValue;
    }
}
