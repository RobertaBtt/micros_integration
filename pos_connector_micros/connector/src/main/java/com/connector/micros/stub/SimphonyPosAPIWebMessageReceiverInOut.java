/**
 * SimphonyPosAPIWebMessageReceiverInOut.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.connector.micros.stub;


/**
 * SimphonyPosAPIWebMessageReceiverInOut message receiver
 */
public class SimphonyPosAPIWebMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
            org.apache.axis2.context.MessageContext msgContext,
            org.apache.axis2.context.MessageContext newMsgContext)
            throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            SimphonyPosAPIWebSkeletonInterface skel = (SimphonyPosAPIWebSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                    .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                        "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("postTransactionEx".equals(methodName)) {
                    com.micros_hosting.egateway.PostTransactionExResponse postTransactionExResponse53 =
                            null;
                    com.micros_hosting.egateway.PostTransactionEx wrappedParam = (com.micros_hosting.egateway.PostTransactionEx) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.PostTransactionEx.class);

                    postTransactionExResponse53 = skel.postTransactionEx(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            postTransactionExResponse53, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "PostTransactionExResponse"));
                } else if ("calculateTransactionTotals".equals(methodName)) {
                    com.micros_hosting.egateway.CalculateTransactionTotalsResponse calculateTransactionTotalsResponse55 =
                            null;
                    com.micros_hosting.egateway.CalculateTransactionTotals wrappedParam =
                            (com.micros_hosting.egateway.CalculateTransactionTotals) fromOM(msgContext.getEnvelope()
                                            .getBody()
                                            .getFirstElement(),
                                    com.micros_hosting.egateway.CalculateTransactionTotals.class);

                    calculateTransactionTotalsResponse55 = skel.calculateTransactionTotals(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            calculateTransactionTotalsResponse55, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "CalculateTransactionTotalsResponse"));
                } else if ("getConfigurationInfo".equals(methodName)) {
                    com.micros_hosting.egateway.GetConfigurationInfoResponse getConfigurationInfoResponse57 =
                            null;
                    com.micros_hosting.egateway.GetConfigurationInfo wrappedParam =
                            (com.micros_hosting.egateway.GetConfigurationInfo) fromOM(msgContext.getEnvelope()
                                            .getBody()
                                            .getFirstElement(),
                                    com.micros_hosting.egateway.GetConfigurationInfo.class);

                    getConfigurationInfoResponse57 = skel.getConfigurationInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getConfigurationInfoResponse57, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "GetConfigurationInfoResponse"));
                } else if ("addToExistingCheckEx".equals(methodName)) {
                    com.micros_hosting.egateway.AddToExistingCheckExResponse addToExistingCheckExResponse59 =
                            null;
                    com.micros_hosting.egateway.AddToExistingCheckEx wrappedParam =
                            (com.micros_hosting.egateway.AddToExistingCheckEx) fromOM(msgContext.getEnvelope()
                                            .getBody()
                                            .getFirstElement(),
                                    com.micros_hosting.egateway.AddToExistingCheckEx.class);

                    addToExistingCheckExResponse59 = skel.addToExistingCheckEx(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            addToExistingCheckExResponse59, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "AddToExistingCheckExResponse"));
                } else if ("getOpenChecksEx".equals(methodName)) {
                    com.micros_hosting.egateway.GetOpenChecksExResponse getOpenChecksExResponse61 =
                            null;
                    com.micros_hosting.egateway.GetOpenChecksEx wrappedParam = (com.micros_hosting.egateway.GetOpenChecksEx) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetOpenChecksEx.class);

                    getOpenChecksExResponse61 = skel.getOpenChecksEx(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getOpenChecksExResponse61, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "GetOpenChecksExResponse"));
                } else if ("getPrintedCheck".equals(methodName)) {
                    com.micros_hosting.egateway.GetPrintedCheckResponse getPrintedCheckResponse63 =
                            null;
                    com.micros_hosting.egateway.GetPrintedCheck wrappedParam = (com.micros_hosting.egateway.GetPrintedCheck) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetPrintedCheck.class);

                    getPrintedCheckResponse63 = skel.getPrintedCheck(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getPrintedCheckResponse63, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "GetPrintedCheckResponse"));
                } else if ("getChecks".equals(methodName)) {
                    com.micros_hosting.egateway.GetChecksResponse getChecksResponse65 =
                            null;
                    com.micros_hosting.egateway.GetChecks wrappedParam = (com.micros_hosting.egateway.GetChecks) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetChecks.class);

                    getChecksResponse65 = skel.getChecks(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getChecksResponse65, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "GetChecksResponse"));
                } else if ("getOpenChecks".equals(methodName)) {
                    com.micros_hosting.egateway.GetOpenChecksResponse getOpenChecksResponse67 =
                            null;
                    com.micros_hosting.egateway.GetOpenChecks wrappedParam = (com.micros_hosting.egateway.GetOpenChecks) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetOpenChecks.class);

                    getOpenChecksResponse67 = skel.getOpenChecks(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getOpenChecksResponse67, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "GetOpenChecksResponse"));
                } else if ("getCheckDetail".equals(methodName)) {
                    com.micros_hosting.egateway.GetCheckDetailResponse getCheckDetailResponse69 =
                            null;
                    com.micros_hosting.egateway.GetCheckDetail wrappedParam = (com.micros_hosting.egateway.GetCheckDetail) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetCheckDetail.class);

                    getCheckDetailResponse69 = skel.getCheckDetail(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getCheckDetailResponse69, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "GetCheckDetailResponse"));
                } else if ("voidTransaction".equals(methodName)) {
                    com.micros_hosting.egateway.VoidTransactionResponse voidTransactionResponse71 =
                            null;
                    com.micros_hosting.egateway.VoidTransaction wrappedParam = (com.micros_hosting.egateway.VoidTransaction) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.VoidTransaction.class);

                    voidTransactionResponse71 = skel.voidTransaction(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            voidTransactionResponse71, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "VoidTransactionResponse"));
                } else if ("checkPrintJobStatus".equals(methodName)) {
                    com.micros_hosting.egateway.CheckPrintJobStatusResponse checkPrintJobStatusResponse73 =
                            null;
                    com.micros_hosting.egateway.CheckPrintJobStatus wrappedParam =
                            (com.micros_hosting.egateway.CheckPrintJobStatus) fromOM(msgContext.getEnvelope()
                                            .getBody()
                                            .getFirstElement(),
                                    com.micros_hosting.egateway.CheckPrintJobStatus.class);

                    checkPrintJobStatusResponse73 = skel.checkPrintJobStatus(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            checkPrintJobStatusResponse73, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "CheckPrintJobStatusResponse"));
                } else if ("getOpenChecksByRVC".equals(methodName)) {
                    com.micros_hosting.egateway.GetOpenChecksByRVCResponse getOpenChecksByRVCResponse75 =
                            null;
                    com.micros_hosting.egateway.GetOpenChecksByRVC wrappedParam = (com.micros_hosting.egateway.GetOpenChecksByRVC) fromOM(msgContext.getEnvelope()
                                    .getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetOpenChecksByRVC.class);

                    getOpenChecksByRVCResponse75 = skel.getOpenChecksByRVC(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getOpenChecksByRVCResponse75, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "GetOpenChecksByRVCResponse"));
                } else if ("getConfigurationInfoEx".equals(methodName)) {
                    com.micros_hosting.egateway.GetConfigurationInfoExResponse getConfigurationInfoExResponse77 =
                            null;
                    com.micros_hosting.egateway.GetConfigurationInfoEx wrappedParam =
                            (com.micros_hosting.egateway.GetConfigurationInfoEx) fromOM(msgContext.getEnvelope()
                                            .getBody()
                                            .getFirstElement(),
                                    com.micros_hosting.egateway.GetConfigurationInfoEx.class);

                    getConfigurationInfoExResponse77 = skel.getConfigurationInfoEx(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getConfigurationInfoExResponse77, false,
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "GetConfigurationInfoExResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.PostTransactionEx param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.PostTransactionEx.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.PostTransactionExResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.PostTransactionExResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.CalculateTransactionTotals param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.CalculateTransactionTotals.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.CalculateTransactionTotalsResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.CalculateTransactionTotalsResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetConfigurationInfo param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetConfigurationInfo.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetConfigurationInfoResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetConfigurationInfoResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.AddToExistingCheckEx param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.AddToExistingCheckEx.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.AddToExistingCheckExResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.AddToExistingCheckExResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetOpenChecksEx param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetOpenChecksEx.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetOpenChecksExResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetOpenChecksExResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetPrintedCheck param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetPrintedCheck.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetPrintedCheckResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetPrintedCheckResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetChecks param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetChecks.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetChecksResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetChecksResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetOpenChecks param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetOpenChecks.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetOpenChecksResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetOpenChecksResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetCheckDetail param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetCheckDetail.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetCheckDetailResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetCheckDetailResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.VoidTransaction param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.VoidTransaction.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.VoidTransactionResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.VoidTransactionResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.CheckPrintJobStatus param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.CheckPrintJobStatus.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.CheckPrintJobStatusResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.CheckPrintJobStatusResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetOpenChecksByRVC param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetOpenChecksByRVC.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetOpenChecksByRVCResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetOpenChecksByRVCResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetConfigurationInfoEx param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetConfigurationInfoEx.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
            com.micros_hosting.egateway.GetConfigurationInfoExResponse param,
            boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.micros_hosting.egateway.GetConfigurationInfoExResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.PostTransactionExResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.PostTransactionExResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.PostTransactionExResponse wrapPostTransactionEx() {
        com.micros_hosting.egateway.PostTransactionExResponse wrappedElement = new com.micros_hosting.egateway.PostTransactionExResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.CalculateTransactionTotalsResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.CalculateTransactionTotalsResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.CalculateTransactionTotalsResponse wrapCalculateTransactionTotals() {
        com.micros_hosting.egateway.CalculateTransactionTotalsResponse wrappedElement =
                new com.micros_hosting.egateway.CalculateTransactionTotalsResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetConfigurationInfoResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetConfigurationInfoResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.GetConfigurationInfoResponse wrapGetConfigurationInfo() {
        com.micros_hosting.egateway.GetConfigurationInfoResponse wrappedElement = new com.micros_hosting.egateway.GetConfigurationInfoResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.AddToExistingCheckExResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.AddToExistingCheckExResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.AddToExistingCheckExResponse wrapAddToExistingCheckEx() {
        com.micros_hosting.egateway.AddToExistingCheckExResponse wrappedElement = new com.micros_hosting.egateway.AddToExistingCheckExResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetOpenChecksExResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetOpenChecksExResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.GetOpenChecksExResponse wrapGetOpenChecksEx() {
        com.micros_hosting.egateway.GetOpenChecksExResponse wrappedElement = new com.micros_hosting.egateway.GetOpenChecksExResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetPrintedCheckResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetPrintedCheckResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.GetPrintedCheckResponse wrapGetPrintedCheck() {
        com.micros_hosting.egateway.GetPrintedCheckResponse wrappedElement = new com.micros_hosting.egateway.GetPrintedCheckResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetChecksResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetChecksResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.GetChecksResponse wrapGetChecks() {
        com.micros_hosting.egateway.GetChecksResponse wrappedElement = new com.micros_hosting.egateway.GetChecksResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetOpenChecksResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetOpenChecksResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.GetOpenChecksResponse wrapGetOpenChecks() {
        com.micros_hosting.egateway.GetOpenChecksResponse wrappedElement = new com.micros_hosting.egateway.GetOpenChecksResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetCheckDetailResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetCheckDetailResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.GetCheckDetailResponse wrapGetCheckDetail() {
        com.micros_hosting.egateway.GetCheckDetailResponse wrappedElement = new com.micros_hosting.egateway.GetCheckDetailResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.VoidTransactionResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.VoidTransactionResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.VoidTransactionResponse wrapVoidTransaction() {
        com.micros_hosting.egateway.VoidTransactionResponse wrappedElement = new com.micros_hosting.egateway.VoidTransactionResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.CheckPrintJobStatusResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.CheckPrintJobStatusResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.CheckPrintJobStatusResponse wrapCheckPrintJobStatus() {
        com.micros_hosting.egateway.CheckPrintJobStatusResponse wrappedElement = new com.micros_hosting.egateway.CheckPrintJobStatusResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetOpenChecksByRVCResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetOpenChecksByRVCResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.GetOpenChecksByRVCResponse wrapGetOpenChecksByRVC() {
        com.micros_hosting.egateway.GetOpenChecksByRVCResponse wrappedElement = new com.micros_hosting.egateway.GetOpenChecksByRVCResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetConfigurationInfoExResponse param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetConfigurationInfoExResponse.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.micros_hosting.egateway.GetConfigurationInfoExResponse wrapGetConfigurationInfoEx() {
        com.micros_hosting.egateway.GetConfigurationInfoExResponse wrappedElement =
                new com.micros_hosting.egateway.GetConfigurationInfoExResponse();

        return wrappedElement;
    }

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
                                    java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (com.micros_hosting.egateway.AddToExistingCheckEx.class.equals(
                    type)) {
                return com.micros_hosting.egateway.AddToExistingCheckEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.AddToExistingCheckExResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.AddToExistingCheckExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.CalculateTransactionTotals.class.equals(
                    type)) {
                return com.micros_hosting.egateway.CalculateTransactionTotals.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.CalculateTransactionTotalsResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.CalculateTransactionTotalsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.CheckPrintJobStatus.class.equals(
                    type)) {
                return com.micros_hosting.egateway.CheckPrintJobStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.CheckPrintJobStatusResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.CheckPrintJobStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetCheckDetail.class.equals(type)) {
                return com.micros_hosting.egateway.GetCheckDetail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetCheckDetailResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetCheckDetailResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetChecks.class.equals(type)) {
                return com.micros_hosting.egateway.GetChecks.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetChecksResponse.class.equals(type)) {
                return com.micros_hosting.egateway.GetChecksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetConfigurationInfo.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetConfigurationInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetConfigurationInfoEx.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetConfigurationInfoEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetConfigurationInfoExResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetConfigurationInfoExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetConfigurationInfoResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetConfigurationInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetOpenChecks.class.equals(type)) {
                return com.micros_hosting.egateway.GetOpenChecks.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetOpenChecksByRVC.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetOpenChecksByRVC.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetOpenChecksByRVCResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetOpenChecksByRVCResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetOpenChecksEx.class.equals(type)) {
                return com.micros_hosting.egateway.GetOpenChecksEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetOpenChecksExResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetOpenChecksExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetOpenChecksResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetOpenChecksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetPrintedCheck.class.equals(type)) {
                return com.micros_hosting.egateway.GetPrintedCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetPrintedCheckResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.GetPrintedCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.PostTransactionEx.class.equals(type)) {
                return com.micros_hosting.egateway.PostTransactionEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.PostTransactionExResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.PostTransactionExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.VoidTransaction.class.equals(type)) {
                return com.micros_hosting.egateway.VoidTransaction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.VoidTransactionResponse.class.equals(
                    type)) {
                return com.micros_hosting.egateway.VoidTransactionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
