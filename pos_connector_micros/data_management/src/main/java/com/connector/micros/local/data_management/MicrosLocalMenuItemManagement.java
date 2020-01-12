package com.connector.micros.local.data_management;

import com.pos.connector.local.data_management.AgentLocalMenuItemManagementInterface;
import com.connector.micros.dto.MicrosAgentMenuItem;

import java.util.HashMap;

public class MicrosLocalMenuItemManagement implements AgentLocalMenuItemManagementInterface {

    private MicrosLocalMenuItemManagement() {
    }

    private HashMap<String, Object> agentMenuItemsHashMap;
    private static final MicrosLocalMenuItemManagement instance = new MicrosLocalMenuItemManagement();

    public static MicrosLocalMenuItemManagement getInstance() {
        return instance;
    }


    @Override
    public void saveSingleMenuItemLocal(Object menuItem) {

        if (agentMenuItemsHashMap == null)
            agentMenuItemsHashMap = new HashMap<String, Object>();

        /**
         * @doc We base this HashMap by MenuItem name, the key is the MenuItem Name
         * */
        agentMenuItemsHashMap.put(((MicrosAgentMenuItem) menuItem).getName(), (MicrosAgentMenuItem) menuItem);

    }

    @Override
    public Object getMenuItemByPosName(String menuItemPosName) {
        return agentMenuItemsHashMap.get(menuItemPosName);
    }
}
