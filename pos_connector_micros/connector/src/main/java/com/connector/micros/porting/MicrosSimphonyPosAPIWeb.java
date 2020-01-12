package com.connector.micros.porting;

import com.connector.micros.porting.request.*;
import com.connector.micros.porting.response.*;
import com.connector.micros.stub.SimphonyPosAPIWebStub;
import com.micros_hosting.egateway.GetChecks;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.OperationClient;
import org.apache.axis2.client.Options;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.description.OutInAxisOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;

/*
 *  SimphonyPosAPIWebStub java implementation
 */
public class MicrosSimphonyPosAPIWeb extends SimphonyPosAPIWebStub {

    private String namespaceUriServer;
    private String namespaceUri;
    private String targetEndPoint;
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;
    private org.apache.axis2.description.AxisOperation[] _operations;

    private final static Logger logger = LoggerFactory.getLogger(MicrosSimphonyPosAPIWeb.class);

    /**
     * Constructor taking the target endpoint, namespace Uri
     * and namespace Uri Server
     */
    public MicrosSimphonyPosAPIWeb(org.apache.axis2.context.ConfigurationContext configurationContext,
                                   String namespaceUriServer,
                                   String namespaceUri,
                                   String targetEndpoint,
                                   boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {

        //super(null, targetEndpoint);

        this.namespaceUriServer = namespaceUriServer;
        this.namespaceUri = namespaceUri;
        this.targetEndPoint = targetEndpoint;

        populateAxisService();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);
        _serviceClient.getOptions()
                .setTo(new org.apache.axis2.addressing.EndpointReference(
                        targetEndpoint));

        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions()
                .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

        _serviceClient.getOptions().setProperty(org.apache.axiom.soap.SOAP12Constants.SOAP_12_CONTENT_TYPE, "text/xml; charset=UTF-8");
        Options overrideOptions = new Options();
        overrideOptions.setProperty(org.apache.axiom.soap.SOAP12Constants.SOAP_12_CONTENT_TYPE, "text/xml; charset=UTF-8");
        overrideOptions.setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, false);


        _serviceClient.setOverrideOptions(overrideOptions);

    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
                "_" + counter;
    }

    private void populateAxisService() throws AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "SimphonyPosAPIWeb" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[13];

        __operation = new OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "postTransactionEx"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "calculateTransactionTotals"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "getConfigurationInfo"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "addToExistingCheckEx", ""));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "getOpenChecksEx"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "getPrintedCheck"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "getChecks"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "GetOpenChecks", ""));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "getCheckDetail"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "voidTransaction"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "checkPrintJobStatus"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "getOpenChecksByRVC"));
        _service.addOperation(__operation);

        _operations[11] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(namespaceUriServer, "getConfigurationInfoEx"));
        _service.addOperation(__operation);

        _operations[12] = __operation;
    }

    public MicrosGetOpenChecksResponse getOpenChecks(MicrosGetOpenChecks getOpenChecksParam)
            throws java.rmi.RemoteException {

        MessageContext _messageContext = new MessageContext();

        try {
            MicrosSimphonySOAPEnvelope microsSimphonySOAPEnvelope = new MicrosSimphonySOAPEnvelope();

            OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            QName localQName = new QName(namespaceUriServer, "GetOpenChecks", "");

            env = microsSimphonySOAPEnvelope.toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getOpenChecksParam,
                    microsSimphonySOAPEnvelope.optimizeContent(localQName), localQName);

            logger.debug("Retrieving orders from POS");

//            if (logger.isTraceEnabled()) {
//                logger.trace("Get Open Checks Request: '{}' ", env);
//            } else if (logger.isDebugEnabled()) {
//                logger.debug("Get Open Checks Request: '{}' ", env);
//            }
//
//            System.out.println("-----------------GET OPEN CHECKS REQUEST---------------\n" + env);

            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

//            if (logger.isTraceEnabled()) {
//                logger.trace("Get Open Checks RESPONSE: '{}' ", _returnEnv);
//            } else
//            if (logger.isDebugEnabled()) {
//                logger.debug("Get Open Checks RESPONSE: '{}' ", _returnEnv);
//            }

//             System.out.println("#############GET OPEN CHECKS RESPONSE##################\n" + _returnEnv);


            java.lang.Object object = microsSimphonySOAPEnvelope.fromOM(
                    _returnEnv.getBody().getFirstElement(), MicrosGetOpenChecksResponse.class, namespaceUri);

            return (MicrosGetOpenChecksResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecks"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecks"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecks"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }


    public MicrosGetCheckDetailResponse getCheckDetail(MicrosGetCheckDetail getCheckDetailParam)
            throws java.rmi.RemoteException {

        MessageContext _messageContext = new MessageContext();

        try {
            OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());

            MicrosSimphonySOAPEnvelope microsSimphonySOAPEnvelope = new MicrosSimphonySOAPEnvelope();
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            QName localQName = new QName(namespaceUriServer, "GetCheckDetail", "");

            env = microsSimphonySOAPEnvelope.toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getCheckDetailParam,
                    microsSimphonySOAPEnvelope.optimizeContent(localQName), localQName);


//            if (logger.isTraceEnabled()) {
//                logger.trace("Get Check Details Request: '{}' ", env);
//            } else
            if (logger.isDebugEnabled()) {
                logger.debug("Get Check Details Request: '{}' ", env);
            }

//            System.out.println("--------------------GET CHECK DETAIL REQUEST---------------\n" + env);

            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


//            if (logger.isTraceEnabled()) {
//                logger.trace("Get Check Details RESPONSE: '{}' ", _returnEnv);
//            } else
            if (logger.isDebugEnabled()) {
                //logger.
                logger.info("Get Check Details RESPONSE: '{}' ", _returnEnv);
            }

//            System.out.println("###################GET CHECK DETAIL RESPONSE#################\n" + _returnEnv);

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), MicrosGetCheckDetailResponse.class);

            return (MicrosGetCheckDetailResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetCheckDetail"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetCheckDetail"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetCheckDetail"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    public MicrosAddToExistingCheckExResponse addToExistingCheckEx(MicrosAddToExistingCheckEx addToExistingCheckExParam)
            throws java.rmi.RemoteException {
        MessageContext _messageContext = new MessageContext();

        try {
            MicrosSimphonySOAPEnvelope microsSimphonySOAPEnvelope = new MicrosSimphonySOAPEnvelope();
            OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());

            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            QName localQName = new QName(namespaceUriServer, "AddToExistingCheckEx", "");

            env = microsSimphonySOAPEnvelope.toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    addToExistingCheckExParam,
                    microsSimphonySOAPEnvelope.optimizeContent(localQName), localQName);


            if (logger.isTraceEnabled()) {
                logger.trace("Add to Existing Check Request: '{}' ", env);
            } else if (logger.isDebugEnabled()) {
                logger.debug("Add to Existing Check Request: '{}' ", env);
            }

//            System.out.println("------------------ADD TO CHECK REQUEST --------------------\n" + env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            if (logger.isTraceEnabled()) {
                logger.trace("Add to Existing Check RESPONSE: '{}' ", _returnEnv);
            } else if (logger.isDebugEnabled()) {
                logger.debug("Add to existing Check RESPONSE: '{}' ", _returnEnv);
            }

//            System.out.println("###################ADD TO CHECK RESPONSE ################\n" + _returnEnv);

            java.lang.Object object = microsSimphonySOAPEnvelope.fromOM(
                    _returnEnv.getBody().getFirstElement(), MicrosAddToExistingCheckExResponse.class, namespaceUri);

            return (MicrosAddToExistingCheckExResponse) object;
        } catch (AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "AddToExistingCheckEx"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "AddToExistingCheckEx"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "AddToExistingCheckEx"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    public MicrosPostTransactionExResponse postTransactionEx(MicrosPostTransactionEx postTransactionExParam)
            throws java.rmi.RemoteException {
        MessageContext _messageContext = new MessageContext();

        try {
            MicrosSimphonySOAPEnvelope microsSimphonySOAPEnvelope = new MicrosSimphonySOAPEnvelope();
            OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());

            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            QName localQName = new QName(namespaceUriServer, "PostTransactionEx", "");

            env = microsSimphonySOAPEnvelope.toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    postTransactionExParam,
                    microsSimphonySOAPEnvelope.optimizeContent(localQName), localQName);

            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                            .getFirstElement(),
                    com.micros_hosting.egateway.PostTransactionExResponse.class);

            return (MicrosPostTransactionExResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "PostTransactionEx"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "PostTransactionEx"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "PostTransactionEx"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }


    public MicrosGetConfigurationInfoResponse getConfigurationInfo(MicrosGetConfigurationInfo getConfigurationInfoParam)
            throws java.rmi.RemoteException {

        MessageContext _messageContext = new MessageContext();

        try {

            MicrosSimphonySOAPEnvelope microsSimphonySOAPEnvelope = new MicrosSimphonySOAPEnvelope();

            OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());

            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            QName localQName = new QName(namespaceUriServer, "GetConfigurationInfo", "");

            env = microsSimphonySOAPEnvelope.toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getConfigurationInfoParam,
                    microsSimphonySOAPEnvelope.optimizeContent(localQName), localQName);


//            if (logger.isTraceEnabled()) {
//                logger.trace("Get Config Request: '{}' ", env);
//            } else
//            if (logger.isDebugEnabled()) {
//                logger.debug("Get Config Request: '{}' ", env);
//            }

//            System.out.println("------------------GET CONFIG INFO REQUEST----------------------\n" + env);

            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


//            if (logger.isTraceEnabled()) {
//                logger.trace("Get Config RESPONSE: '{}' ", _returnEnv);
//            } else
            if (logger.isDebugEnabled()) {
                logger.debug("Get Config RESPONSE: '{}' ", _returnEnv);
            }


//            System.out.println("###################### GET CONFIG INFO RESPONSE ######################à\n" + _returnEnv);


            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), MicrosGetConfigurationInfoResponse.class);

            return (MicrosGetConfigurationInfoResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetConfigurationInfo"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetConfigurationInfo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetConfigurationInfo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    public MicrosVoidTransactionResponse voidTransaction(MicrosVoidTransaction voidTransactionParam)
            throws java.rmi.RemoteException {

        MessageContext _messageContext = new MessageContext();

        try {
            MicrosSimphonySOAPEnvelope microsSimphonySOAPEnvelope = new MicrosSimphonySOAPEnvelope();

            OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());

            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            QName localQName = new QName(namespaceUriServer, "VoidTransaction", "");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = microsSimphonySOAPEnvelope.toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    voidTransactionParam,
                    microsSimphonySOAPEnvelope.optimizeContent(localQName), localQName);

            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                            .getFirstElement(),
                    com.micros_hosting.egateway.VoidTransactionResponse.class);

            return (MicrosVoidTransactionResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "VoidTransaction"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "VoidTransaction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "VoidTransaction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @param getChecksParam
     * @see com.connector.micros.stub.SimphonyPosAPIWebStub#getChecks(GetChecks)
     */
    public MicrosGetChecksResponse getChecks(MicrosGetChecks getChecksParam)
            throws java.rmi.RemoteException {

        MessageContext _messageContext = new MessageContext();

        try {

            MicrosSimphonySOAPEnvelope microsSimphonySOAPEnvelope = new MicrosSimphonySOAPEnvelope();

            OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            QName localQName = new QName(namespaceUriServer, "GetChecks", "");


            env = microsSimphonySOAPEnvelope.toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getChecksParam,
                    microsSimphonySOAPEnvelope.optimizeContent(localQName), localQName);

            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                    .getFirstElement(), MicrosGetChecksResponse.class);

            return (MicrosGetChecksResponse) object;

        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetChecks"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetChecks"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetChecks"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[]{messageClass});
                        m.invoke(ex, new java.lang.Object[]{messageObject});

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                        .cleanup(_messageContext);
            }
        }
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
                                    java.lang.Class type) throws AxisFault {
        try {
//            if (SimphonyPosAPIWebStub.AddToExistingCheckEx.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.AddToExistingCheckEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }

//            if (SimphonyPosAPIWebStub.AddToExistingCheckExResponse.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.AddToExistingCheckExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }

//            if (SimphonyPosAPIWebStub.CalculateTransactionTotals.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.CalculateTransactionTotals.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }

//            if (SimphonyPosAPIWebStub.CalculateTransactionTotalsResponse.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.CalculateTransactionTotalsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }

//            if (SimphonyPosAPIWebStub.CheckPrintJobStatus.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.CheckPrintJobStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }

//            if (SimphonyPosAPIWebStub.CheckPrintJobStatusResponse.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.CheckPrintJobStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
            if (MicrosGetConfigurationInfo.class.equals(type)) {
                return MicrosGetConfigurationInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (MicrosGetConfigurationInfoResponse.class.equals(type)) {
                return MicrosGetConfigurationInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (MicrosGetOpenChecks.class.equals(type)) {
                return MicrosGetOpenChecks.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (MicrosGetOpenChecksResponse.class.equals(type)) {
                return MicrosGetOpenChecksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (MicrosGetCheckDetail.class.equals(type)) {
                return MicrosGetCheckDetail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (MicrosGetCheckDetailResponse.class.equals(type)) {
                return MicrosGetCheckDetailResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (MicrosPostTransactionEx.class.equals(
                    type)) {
                return MicrosPostTransactionEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (MicrosPostTransactionExResponse.class.equals(type)) {
                return MicrosPostTransactionExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (MicrosGetChecks.class.equals(type)) {
                return MicrosGetChecks.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (MicrosGetChecksResponse.class.equals(type)) {
                return MicrosGetChecksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

//            if (SimphonyPosAPIWebStub.GetPrintedCheck.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.GetPrintedCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (SimphonyPosAPIWebStub.GetPrintedCheckResponse.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.GetPrintedCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//
//
//            if (SimphonyPosAPIWebStub.VoidTransaction.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.VoidTransaction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (SimphonyPosAPIWebStub.VoidTransactionResponse.class.equals(
//                    type)) {
//                return SimphonyPosAPIWebStub.VoidTransactionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
        } catch (java.lang.Exception e) {
            throw AxisFault.makeFault(e);
        }

        return null;
    }

}