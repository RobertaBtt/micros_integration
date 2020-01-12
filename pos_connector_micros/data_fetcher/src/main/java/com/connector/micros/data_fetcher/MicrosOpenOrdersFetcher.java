package com.connector.micros.data_fetcher;

import com.pos.connector.data_fetcher.AgentOpenOrdersFetcherInterface;
import com.pos.connector.dto.AgentOrder;
import com.pos.connector.dto.PosException;
import com.pos.connector.dto.PosRequest;
import com.connector.micros.data_fetcher.request.GetOpenOrdersRequestMicros;
import com.connector.micros.data_fetcher.request.GetOrderByIdentificatorRequestMicros;
import com.connector.micros.data_fetcher.response_converter.GetOpenOrdersConverter;
import com.connector.micros.data_fetcher.response_converter.GetOrderByIdentifierConverter;
import com.connector.micros.dto.MicrosAgentErrorCode;
import com.connector.micros.dto.MicrosAgentOrder;
import pos.common.exceptions.ErrorCode;
import com.connector.micros.porting.MicrosSimphonyAPI;
import com.connector.micros.porting.response.MicrosGetCheckDetailResponse;
import com.connector.micros.porting.response.MicrosGetOpenChecksResponse;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class MicrosOpenOrdersFetcher implements AgentOpenOrdersFetcherInterface {

    @Getter
    private List<AgentOrder> openChecks = new ArrayList<AgentOrder>();
    private static final MicrosOpenOrdersFetcher instance = new MicrosOpenOrdersFetcher();

    private MicrosOpenOrdersFetcher() {
    }

    public static MicrosOpenOrdersFetcher getInstance() {
        return instance;
    }

    /***
     *
     * @param getOpenOrdersRequest
     * @return
     */
    @Override
    public List<AgentOrder> getOpenOrders(PosRequest getOpenOrdersRequest) throws PosException {

        /***
         * This convertion is mandatory. Now we have the specific request, valid for Micros only.
         */
        GetOpenOrdersRequestMicros requestMicros = new GetOpenOrdersRequestMicros(getOpenOrdersRequest.getParameters());
        MicrosGetOpenChecksResponse response = null;

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(null,
                requestMicros.getNamespaceUriServer(), requestMicros.getNamespaceUri(), requestMicros.getTargetEndPoint(),
                false);

        try {
            response = microsService.getOpenChecks(requestMicros.getEmployeeObjectNumber());
        } catch (java.rmi.RemoteException ex) {

            String code = MicrosAgentErrorCode.HOST_UNREACHABLE.getCode();
            String message = MicrosAgentErrorCode.HOST_UNREACHABLE.getMessage();

            throw new PosException(ErrorCode.of(code, message));
        }

        return GetOpenOrdersConverter.convertResponse(response);

    }


    /***
     * @param getOrderByIdentifierRequest
     * @return
     */
    @Override
    public AgentOrder getOrderbyIdentifier(PosRequest getOrderByIdentifierRequest) throws PosException {

        /***
         * This conversation is mandatory. Now we have the specific request, valid for Micros only.
         */
        GetOrderByIdentificatorRequestMicros requestMicros = new GetOrderByIdentificatorRequestMicros(getOrderByIdentifierRequest.getParameters());
        MicrosGetCheckDetailResponse response = null;

        MicrosSimphonyAPI microsService = MicrosSimphonyAPI.getInstance(null,
                requestMicros.getNamespaceUriServer(), requestMicros.getNamespaceUri(), requestMicros.getTargetEndPoint(),
                false);

        try {
            response = microsService.getCheckDetail(requestMicros.getCheckNumber(), requestMicros.getCheckSequence());
        } catch (java.rmi.RemoteException ex) {
            System.out.println("Troubles retrieving the order with number " + requestMicros.getCheckNumber() + " and sequence: "
                    + requestMicros.getCheckSequence() + "\n" + ex.getMessage());

        }
        if (response != null)
            return GetOrderByIdentifierConverter.convertResponse(response,
                    requestMicros.getCheckNumber(),
                    requestMicros.getCheckSequence(),
                    requestMicros.getTableNumber(),
                    requestMicros.getCurrencyString(),
                    requestMicros.getLastServiceTime(),
                    requestMicros.getAgentInstallationUUID()
            );
        else
            //TODO: Study what could be returned !!!!
            return new MicrosAgentOrder();

    }


}
