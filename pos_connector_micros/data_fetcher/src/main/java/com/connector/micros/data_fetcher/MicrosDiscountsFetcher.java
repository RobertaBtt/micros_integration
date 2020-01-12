package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentDiscountsFetcherInterface;
import com.pos.connector.dto.AgentDiscount;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetDiscountsRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetDiscountsConverter;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MicrosDiscountsFetcher implements AgentDiscountsFetcherInterface {

    private MicrosDiscountsFetcher() {
    }

    private static final MicrosDiscountsFetcher instance = new MicrosDiscountsFetcher();

    public static MicrosDiscountsFetcher getInstance() {

        return instance;
    }

    /***
     *
     * @param getDiscountsRequest
     * @return List of items of Type Discount
     * @throws PosException
     */
    public List<AgentDiscount> getDiscountsFromPos(PosRequest getDiscountsRequest) throws PosException {

        GetDiscountsRequestMicros requestMicros = new GetDiscountsRequestMicros(getDiscountsRequest.getParameters());
        MicrosGetConfigurationInfoResponse response = null;

        MicrosSimphonyAPI microservice = MicrosSimphonyAPI.getInstance(
                null,
                requestMicros.getNamespaceUriServer(),
                requestMicros.getNamespaceUri(),
                requestMicros.getTargetEndPoint(),
                false);

        List<AgentDiscount> discounts = new ArrayList<AgentDiscount>();

        try {
            response = microservice.getConfigurationInfo(
                    requestMicros.getEmployeeObjectNumber(),
                    requestMicros.getEnumDiscountsConfigInfo(),
                    requestMicros.getRevenueCenter());

            discounts = GetDiscountsConverter.convertResponse(response, getDiscountsRequest.getParameters().get("currencyString"));

        } catch (RemoteException e) {

            for(Map.Entry<String, String> entry : getDiscountsRequest.getParameters().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                System.out.println("key: " + key + " value: " + value);
            }

            System.out.println("\n\nTroubles retrieving getAvailableDiscounts \n" + e.getMessage());
        }


        return discounts;
    }


}
