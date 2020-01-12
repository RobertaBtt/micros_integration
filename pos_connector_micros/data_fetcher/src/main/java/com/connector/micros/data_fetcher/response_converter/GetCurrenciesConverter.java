package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.AgentCurrency;
import com.connector.micros.dto.MicrosAgentCurrency;
import com.connector.micros.porting.element.ArrayOfDbCurrency;
import com.connector.micros.porting.element.DbCurrency;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class GetCurrenciesConverter {

    /***
     *
     * @param response MicrosGetConfigurationInfoResponse
     * @return The string that represents the configuration of Agent specific of Micros
     */
    public static List<AgentCurrency> convertResponse(MicrosGetConfigurationInfoResponse response) {

        ArrayOfDbCurrency arrayOfDbCurrency = null;
        List<DbCurrency> dbCurrencies;
        AgentCurrency currencyToRetrieve;

        List<AgentCurrency> currencies = new ArrayList<AgentCurrency>();

        if (response.getConfigInfoResponse().getOperationalResult().getSuccess()) {

            String currenciesXml = response.getConfigInfoResponse().getCurrency();

            if (!currenciesXml.isEmpty()) {

                try {
                    arrayOfDbCurrency = ArrayOfDbCurrency.Factory.parse(currenciesXml);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (arrayOfDbCurrency != null) {

                    dbCurrencies = arrayOfDbCurrency.getDbCurrencies();
                    if (dbCurrencies.size() > 0) {
                        for (DbCurrency currency : dbCurrencies) {

                            currencyToRetrieve = MicrosAgentCurrency.builder()
                                    .currencyID(String.valueOf(currency.getCurrencyID()))
                                    .name(currency.getName().getStringText())
                                    .symbol(currency.getSymbol().getStringText())
                                    .objectNumber(String.valueOf(currency.getObjectNumber()))
                                    .build();

                            currencies.add(currencyToRetrieve);
                        }
                    }

                }

            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return currencies;

    }
}
