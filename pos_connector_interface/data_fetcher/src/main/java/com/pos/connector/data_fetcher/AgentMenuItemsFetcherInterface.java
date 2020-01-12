package com.pos.connector.data_fetcher;

import com.pos.connector.dto.AgentMenuItem;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;

import java.util.HashMap;
import java.util.List;

/*A Menu Item is a generic object that could represet food, condiment, subItem
* that can be ordered inside an Order*/
public interface AgentMenuItemsFetcherInterface {

    /***
     *
     * @param getMenuItemsRequest
     * @return List of the Menu Items in the POS
     * @throws PosException
     */
    public List<AgentMenuItem> getListMenuItemsFromPos(PosRequest getMenuItemsRequest) throws PosException;

    public HashMap<String, String> getHashMapMenuItemsFromPos(PosRequest getMenuItemsRequest) throws PosException;



}
