package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentMenuItemsFetcherInterface;
import com.pos.connector.dto.AgentMenuItem;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetMenuItemsRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetMenuItemConverter;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;


public class MicrosMenuItemDefinitionFetcher implements AgentMenuItemsFetcherInterface {

    private MicrosMenuItemDefinitionFetcher() {
    }

    private static final MicrosMenuItemDefinitionFetcher instance = new MicrosMenuItemDefinitionFetcher();

    public static MicrosMenuItemDefinitionFetcher getInstance() {

        return instance;
    }


    /***
     *
     * @param getMenuItemsRequest
     * @return List of the Menu Items in the POS
     * @throws PosException
     */
    @Override
    public HashMap<String, String> getHashMapMenuItemsFromPos(PosRequest getMenuItemsRequest) throws PosException {

        GetMenuItemsRequestMicros requestMicros = new GetMenuItemsRequestMicros(getMenuItemsRequest.getParameters());
        MicrosGetConfigurationInfoResponse response = null;

        MicrosSimphonyAPI microservice = MicrosSimphonyAPI.getInstance(
                null,
                requestMicros.getNamespaceUriServer(),
                requestMicros.getNamespaceUri(),
                requestMicros.getTargetEndPoint(),
                false);


        HashMap<String, String> menuItemsClassesHashMap = new HashMap<String, String>();

        try {
            response = microservice.getConfigurationInfo(
                    requestMicros.getEmployeeObjectNumber(),
                    requestMicros.getEnumMenuItemDefinitionConfigInfo(),
                    requestMicros.getRevenueCenter());

            menuItemsClassesHashMap = GetMenuItemConverter.convertResponse(response);

        } catch (RemoteException e) {

            System.out.println("Troubles retrieving getMenuItemDefinitions \n" + e.getMessage());
        }

        return menuItemsClassesHashMap;
    }

    @Override
    public List<AgentMenuItem> getListMenuItemsFromPos(PosRequest getMenuItemsRequest) throws PosException {
        return null;
    }


}
