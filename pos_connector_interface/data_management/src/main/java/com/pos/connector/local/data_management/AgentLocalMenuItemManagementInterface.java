package com.pos.connector.local.data_management;

public interface AgentLocalMenuItemManagementInterface {

    /***
     * @doc This interface allows to add a single element of the MenuItem, from POS, locally to the Agent
     * @param menuItem is the MenuItem that comes from the POS
     */
    public void saveSingleMenuItemLocal(Object menuItem);

    /***
     *
     * @param menuItemPosName is the String of the Name of the MenuItem from the POS
     * @return the AgentMenuItem
     */
    public Object getMenuItemByPosName(String menuItemPosName);


}
