/**
 * SimphonyPosAPIWebCallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.connector.micros.stub;


/**
 * SimphonyPosAPIWebCallbackHandler Callback class, Users can extend this class and implement
 * their own receiveResult and receiveError methods.
 */
public abstract class SimphonyPosAPIWebCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     *
     * @param clientData Object mechanism by which the user can pass in user data
     *                   that will be avilable at the time this callback is called.
     */
    public SimphonyPosAPIWebCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public SimphonyPosAPIWebCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for postTransactionEx method
     * override this method for handling normal response from postTransactionEx operation
     */
    public void receiveResultpostTransactionEx(
            com.micros_hosting.egateway.PostTransactionExResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from postTransactionEx operation
     */
    public void receiveErrorpostTransactionEx(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for calculateTransactionTotals method
     * override this method for handling normal response from calculateTransactionTotals operation
     */
    public void receiveResultcalculateTransactionTotals(
            com.micros_hosting.egateway.CalculateTransactionTotalsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from calculateTransactionTotals operation
     */
    public void receiveErrorcalculateTransactionTotals(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getConfigurationInfo method
     * override this method for handling normal response from getConfigurationInfo operation
     */
    public void receiveResultgetConfigurationInfo(
            com.micros_hosting.egateway.GetConfigurationInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getConfigurationInfo operation
     */
    public void receiveErrorgetConfigurationInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addToExistingCheckEx method
     * override this method for handling normal response from addToExistingCheckEx operation
     */
    public void receiveResultaddToExistingCheckEx(
            com.micros_hosting.egateway.AddToExistingCheckExResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addToExistingCheckEx operation
     */
    public void receiveErroraddToExistingCheckEx(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOpenChecksEx method
     * override this method for handling normal response from getOpenChecksEx operation
     */
    public void receiveResultgetOpenChecksEx(
            com.micros_hosting.egateway.GetOpenChecksExResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOpenChecksEx operation
     */
    public void receiveErrorgetOpenChecksEx(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getPrintedCheck method
     * override this method for handling normal response from getPrintedCheck operation
     */
    public void receiveResultgetPrintedCheck(
            com.micros_hosting.egateway.GetPrintedCheckResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getPrintedCheck operation
     */
    public void receiveErrorgetPrintedCheck(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getChecks method
     * override this method for handling normal response from getChecks operation
     */
    public void receiveResultgetChecks(
            com.micros_hosting.egateway.GetChecksResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getChecks operation
     */
    public void receiveErrorgetChecks(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOpenChecks method
     * override this method for handling normal response from getOpenChecks operation
     */
    public void receiveResultgetOpenChecks(
            com.micros_hosting.egateway.GetOpenChecksResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOpenChecks operation
     */
    public void receiveErrorgetOpenChecks(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCheckDetail method
     * override this method for handling normal response from getCheckDetail operation
     */
    public void receiveResultgetCheckDetail(
            com.micros_hosting.egateway.GetCheckDetailResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCheckDetail operation
     */
    public void receiveErrorgetCheckDetail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for voidTransaction method
     * override this method for handling normal response from voidTransaction operation
     */
    public void receiveResultvoidTransaction(
            com.micros_hosting.egateway.VoidTransactionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from voidTransaction operation
     */
    public void receiveErrorvoidTransaction(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkPrintJobStatus method
     * override this method for handling normal response from checkPrintJobStatus operation
     */
    public void receiveResultcheckPrintJobStatus(
            com.micros_hosting.egateway.CheckPrintJobStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkPrintJobStatus operation
     */
    public void receiveErrorcheckPrintJobStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getOpenChecksByRVC method
     * override this method for handling normal response from getOpenChecksByRVC operation
     */
    public void receiveResultgetOpenChecksByRVC(
            com.micros_hosting.egateway.GetOpenChecksByRVCResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getOpenChecksByRVC operation
     */
    public void receiveErrorgetOpenChecksByRVC(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getConfigurationInfoEx method
     * override this method for handling normal response from getConfigurationInfoEx operation
     */
    public void receiveResultgetConfigurationInfoEx(
            com.micros_hosting.egateway.GetConfigurationInfoExResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getConfigurationInfoEx operation
     */
    public void receiveErrorgetConfigurationInfoEx(java.lang.Exception e) {
    }
}
