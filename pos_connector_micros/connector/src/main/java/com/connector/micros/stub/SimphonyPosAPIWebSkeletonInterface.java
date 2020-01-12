/**
 * SimphonyPosAPIWebSkeletonInterface.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.connector.micros.stub;

/**
 * SimphonyPosAPIWebSkeletonInterface java skeleton interface for the axisService
 */
public interface SimphonyPosAPIWebSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param postTransactionEx
     */
    public com.micros_hosting.egateway.PostTransactionExResponse postTransactionEx(
            com.micros_hosting.egateway.PostTransactionEx postTransactionEx);

    /**
     * Auto generated method signature
     *
     * @param calculateTransactionTotals
     */
    public com.micros_hosting.egateway.CalculateTransactionTotalsResponse calculateTransactionTotals(
            com.micros_hosting.egateway.CalculateTransactionTotals calculateTransactionTotals);

    /**
     * Auto generated method signature
     *
     * @param getConfigurationInfo
     */
    public com.micros_hosting.egateway.GetConfigurationInfoResponse getConfigurationInfo(
            com.micros_hosting.egateway.GetConfigurationInfo getConfigurationInfo);

    /**
     * Auto generated method signature
     *
     * @param addToExistingCheckEx
     */
    public com.micros_hosting.egateway.AddToExistingCheckExResponse addToExistingCheckEx(
            com.micros_hosting.egateway.AddToExistingCheckEx addToExistingCheckEx);

    /**
     * Auto generated method signature
     *
     * @param getOpenChecksEx
     */
    public com.micros_hosting.egateway.GetOpenChecksExResponse getOpenChecksEx(
            com.micros_hosting.egateway.GetOpenChecksEx getOpenChecksEx);

    /**
     * Auto generated method signature
     *
     * @param getPrintedCheck
     */
    public com.micros_hosting.egateway.GetPrintedCheckResponse getPrintedCheck(
            com.micros_hosting.egateway.GetPrintedCheck getPrintedCheck);

    /**
     * Auto generated method signature
     *
     * @param getChecks
     */
    public com.micros_hosting.egateway.GetChecksResponse getChecks(
            com.micros_hosting.egateway.GetChecks getChecks);

    /**
     * Auto generated method signature
     *
     * @param getOpenChecks
     */
    public com.micros_hosting.egateway.GetOpenChecksResponse getOpenChecks(
            com.micros_hosting.egateway.GetOpenChecks getOpenChecks);

    /**
     * Auto generated method signature
     *
     * @param getCheckDetail
     */
    public com.micros_hosting.egateway.GetCheckDetailResponse getCheckDetail(
            com.micros_hosting.egateway.GetCheckDetail getCheckDetail);

    /**
     * Auto generated method signature
     *
     * @param voidTransaction
     */
    public com.micros_hosting.egateway.VoidTransactionResponse voidTransaction(
            com.micros_hosting.egateway.VoidTransaction voidTransaction);

    /**
     * Auto generated method signature
     *
     * @param checkPrintJobStatus
     */
    public com.micros_hosting.egateway.CheckPrintJobStatusResponse checkPrintJobStatus(
            com.micros_hosting.egateway.CheckPrintJobStatus checkPrintJobStatus);

    /**
     * Auto generated method signature
     *
     * @param getOpenChecksByRVC
     */
    public com.micros_hosting.egateway.GetOpenChecksByRVCResponse getOpenChecksByRVC(
            com.micros_hosting.egateway.GetOpenChecksByRVC getOpenChecksByRVC);

    /**
     * Auto generated method signature
     *
     * @param getConfigurationInfoEx
     */
    public com.micros_hosting.egateway.GetConfigurationInfoExResponse getConfigurationInfoEx(
            com.micros_hosting.egateway.GetConfigurationInfoEx getConfigurationInfoEx);
}
