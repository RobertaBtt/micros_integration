/**
 * SimphonyPosAPIWebStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.connector.micros.stub;


/*
 *  SimphonyPosAPIWebStub java implementation
 */
public class SimphonyPosAPIWebStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     * Constructor that takes in a configContext
     */
    public SimphonyPosAPIWebStub(
            org.apache.axis2.context.ConfigurationContext configurationContext,
            java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public SimphonyPosAPIWebStub(
            org.apache.axis2.context.ConfigurationContext configurationContext,
            java.lang.String targetEndpoint, boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                .setTo(new org.apache.axis2.addressing.EndpointReference(
                        targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions()
                .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Default Constructor
     */
    public SimphonyPosAPIWebStub(
            org.apache.axis2.context.ConfigurationContext configurationContext)
            throws org.apache.axis2.AxisFault {
        this(configurationContext,
                "http://83.125.26.252:8080/EGateway/SimphonyPosApiWeb.asmx");
    }

    /**
     * Default Constructor
     */
    public SimphonyPosAPIWebStub() throws org.apache.axis2.AxisFault {
        this("http://83.125.26.252:8080/EGateway/SimphonyPosApiWeb.asmx");
    }

    /**
     * Constructor taking the target endpoint
     */
    public SimphonyPosAPIWebStub(java.lang.String targetEndpoint)
            throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
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

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "SimphonyPosAPIWeb" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[13];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "postTransactionEx"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/",
                "calculateTransactionTotals"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "getConfigurationInfo"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "addToExistingCheckEx"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "getOpenChecksEx"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "getPrintedCheck"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "getChecks"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "getOpenChecks"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "getCheckDetail"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "voidTransaction"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "checkPrintJobStatus"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "getOpenChecksByRVC"));
        _service.addOperation(__operation);

        _operations[11] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "getConfigurationInfoEx"));
        _service.addOperation(__operation);

        _operations[12] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @param postTransactionEx130
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#postTransactionEx
     */
    public com.micros_hosting.egateway.PostTransactionExResponse postTransactionEx(
            com.micros_hosting.egateway.PostTransactionEx postTransactionEx130)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/PostTransactionEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    postTransactionEx130,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "postTransactionEx")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/",
                            "PostTransactionEx"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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

            return (com.micros_hosting.egateway.PostTransactionExResponse) object;
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

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param postTransactionEx130
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startpostTransactionEx
     */
    public void startpostTransactionEx(
            com.micros_hosting.egateway.PostTransactionEx postTransactionEx130,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/PostTransactionEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                postTransactionEx130,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "postTransactionEx")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "PostTransactionEx"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.PostTransactionExResponse.class);
                    callback.receiveResultpostTransactionEx((com.micros_hosting.egateway.PostTransactionExResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorpostTransactionEx(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "PostTransactionEx"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "PostTransactionEx"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "PostTransactionEx"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorpostTransactionEx(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpostTransactionEx(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpostTransactionEx(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpostTransactionEx(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpostTransactionEx(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpostTransactionEx(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpostTransactionEx(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorpostTransactionEx(f);
                            }
                        } else {
                            callback.receiveErrorpostTransactionEx(f);
                        }
                    } else {
                        callback.receiveErrorpostTransactionEx(f);
                    }
                } else {
                    callback.receiveErrorpostTransactionEx(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorpostTransactionEx(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[0].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param calculateTransactionTotals132
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#calculateTransactionTotals
     */
    public com.micros_hosting.egateway.CalculateTransactionTotalsResponse calculateTransactionTotals(
            com.micros_hosting.egateway.CalculateTransactionTotals calculateTransactionTotals132)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/CalculateTransactionTotals");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    calculateTransactionTotals132,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "calculateTransactionTotals")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/",
                            "CalculateTransactionTotals"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.CalculateTransactionTotalsResponse.class);

            return (com.micros_hosting.egateway.CalculateTransactionTotalsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "CalculateTransactionTotals"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "CalculateTransactionTotals"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "CalculateTransactionTotals"));
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
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param calculateTransactionTotals132
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startcalculateTransactionTotals
     */
    public void startcalculateTransactionTotals(
            com.micros_hosting.egateway.CalculateTransactionTotals calculateTransactionTotals132,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/CalculateTransactionTotals");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                calculateTransactionTotals132,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "calculateTransactionTotals")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/",
                        "CalculateTransactionTotals"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.CalculateTransactionTotalsResponse.class);
                    callback.receiveResultcalculateTransactionTotals((com.micros_hosting.egateway.CalculateTransactionTotalsResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcalculateTransactionTotals(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "CalculateTransactionTotals"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "CalculateTransactionTotals"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "CalculateTransactionTotals"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorcalculateTransactionTotals(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcalculateTransactionTotals(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcalculateTransactionTotals(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcalculateTransactionTotals(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcalculateTransactionTotals(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcalculateTransactionTotals(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcalculateTransactionTotals(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcalculateTransactionTotals(f);
                            }
                        } else {
                            callback.receiveErrorcalculateTransactionTotals(f);
                        }
                    } else {
                        callback.receiveErrorcalculateTransactionTotals(f);
                    }
                } else {
                    callback.receiveErrorcalculateTransactionTotals(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcalculateTransactionTotals(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[1].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param getConfigurationInfo134
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#getConfigurationInfo
     */
    public com.micros_hosting.egateway.GetConfigurationInfoResponse getConfigurationInfo(
            com.micros_hosting.egateway.GetConfigurationInfo getConfigurationInfo134)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/GetConfigurationInfo");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getConfigurationInfo134,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "getConfigurationInfo")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/",
                            "GetConfigurationInfo"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.GetConfigurationInfoResponse.class);

            return (com.micros_hosting.egateway.GetConfigurationInfoResponse) object;
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

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getConfigurationInfo134
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startgetConfigurationInfo
     */
    public void startgetConfigurationInfo(
            com.micros_hosting.egateway.GetConfigurationInfo getConfigurationInfo134,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/GetConfigurationInfo");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                getConfigurationInfo134,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "getConfigurationInfo")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/",
                        "GetConfigurationInfo"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetConfigurationInfoResponse.class);
                    callback.receiveResultgetConfigurationInfo((com.micros_hosting.egateway.GetConfigurationInfoResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetConfigurationInfo(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetConfigurationInfo"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetConfigurationInfo"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetConfigurationInfo"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorgetConfigurationInfo(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfo(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfo(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfo(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfo(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfo(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfo(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfo(f);
                            }
                        } else {
                            callback.receiveErrorgetConfigurationInfo(f);
                        }
                    } else {
                        callback.receiveErrorgetConfigurationInfo(f);
                    }
                } else {
                    callback.receiveErrorgetConfigurationInfo(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetConfigurationInfo(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[2].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param addToExistingCheckEx136
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#addToExistingCheckEx
     */
    public com.micros_hosting.egateway.AddToExistingCheckExResponse addToExistingCheckEx(
            com.micros_hosting.egateway.AddToExistingCheckEx addToExistingCheckEx136)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/AddToExistingCheckEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    addToExistingCheckEx136,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "addToExistingCheckEx")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/",
                            "AddToExistingCheckEx"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.AddToExistingCheckExResponse.class);

            return (com.micros_hosting.egateway.AddToExistingCheckExResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
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

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param addToExistingCheckEx136
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startaddToExistingCheckEx
     */
    public void startaddToExistingCheckEx(
            com.micros_hosting.egateway.AddToExistingCheckEx addToExistingCheckEx136,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/AddToExistingCheckEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                addToExistingCheckEx136,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "addToExistingCheckEx")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/",
                        "AddToExistingCheckEx"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.AddToExistingCheckExResponse.class);
                    callback.receiveResultaddToExistingCheckEx((com.micros_hosting.egateway.AddToExistingCheckExResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErroraddToExistingCheckEx(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "AddToExistingCheckEx"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "AddToExistingCheckEx"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "AddToExistingCheckEx"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErroraddToExistingCheckEx(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroraddToExistingCheckEx(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroraddToExistingCheckEx(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroraddToExistingCheckEx(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroraddToExistingCheckEx(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroraddToExistingCheckEx(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroraddToExistingCheckEx(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroraddToExistingCheckEx(f);
                            }
                        } else {
                            callback.receiveErroraddToExistingCheckEx(f);
                        }
                    } else {
                        callback.receiveErroraddToExistingCheckEx(f);
                    }
                } else {
                    callback.receiveErroraddToExistingCheckEx(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErroraddToExistingCheckEx(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[3].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param getOpenChecksEx138
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#getOpenChecksEx
     */
    public com.micros_hosting.egateway.GetOpenChecksExResponse getOpenChecksEx(
            com.micros_hosting.egateway.GetOpenChecksEx getOpenChecksEx138)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/GetOpenChecksEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getOpenChecksEx138,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "getOpenChecksEx")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "GetOpenChecksEx"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.GetOpenChecksExResponse.class);

            return (com.micros_hosting.egateway.GetOpenChecksExResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecksEx"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecksEx"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecksEx"));
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
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getOpenChecksEx138
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startgetOpenChecksEx
     */
    public void startgetOpenChecksEx(
            com.micros_hosting.egateway.GetOpenChecksEx getOpenChecksEx138,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/GetOpenChecksEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                getOpenChecksEx138,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "getOpenChecksEx")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "GetOpenChecksEx"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetOpenChecksExResponse.class);
                    callback.receiveResultgetOpenChecksEx((com.micros_hosting.egateway.GetOpenChecksExResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetOpenChecksEx(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetOpenChecksEx"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetOpenChecksEx"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetOpenChecksEx"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorgetOpenChecksEx(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksEx(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksEx(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksEx(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksEx(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksEx(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksEx(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksEx(f);
                            }
                        } else {
                            callback.receiveErrorgetOpenChecksEx(f);
                        }
                    } else {
                        callback.receiveErrorgetOpenChecksEx(f);
                    }
                } else {
                    callback.receiveErrorgetOpenChecksEx(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetOpenChecksEx(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[4].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param getPrintedCheck140
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#getPrintedCheck
     */
    public com.micros_hosting.egateway.GetPrintedCheckResponse getPrintedCheck(
            com.micros_hosting.egateway.GetPrintedCheck getPrintedCheck140)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/GetPrintedCheck");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getPrintedCheck140,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "getPrintedCheck")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "GetPrintedCheck"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.GetPrintedCheckResponse.class);

            return (com.micros_hosting.egateway.GetPrintedCheckResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetPrintedCheck"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetPrintedCheck"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetPrintedCheck"));
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
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getPrintedCheck140
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startgetPrintedCheck
     */
    public void startgetPrintedCheck(
            com.micros_hosting.egateway.GetPrintedCheck getPrintedCheck140,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/GetPrintedCheck");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                getPrintedCheck140,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "getPrintedCheck")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "GetPrintedCheck"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetPrintedCheckResponse.class);
                    callback.receiveResultgetPrintedCheck((com.micros_hosting.egateway.GetPrintedCheckResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetPrintedCheck(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetPrintedCheck"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetPrintedCheck"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetPrintedCheck"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorgetPrintedCheck(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetPrintedCheck(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetPrintedCheck(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetPrintedCheck(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetPrintedCheck(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetPrintedCheck(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetPrintedCheck(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetPrintedCheck(f);
                            }
                        } else {
                            callback.receiveErrorgetPrintedCheck(f);
                        }
                    } else {
                        callback.receiveErrorgetPrintedCheck(f);
                    }
                } else {
                    callback.receiveErrorgetPrintedCheck(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetPrintedCheck(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[5].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param getChecks142
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#getChecks
     */
    public com.micros_hosting.egateway.GetChecksResponse getChecks(
            com.micros_hosting.egateway.GetChecks getChecks142)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/GetChecks");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getChecks142,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/", "getChecks")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "GetChecks"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.GetChecksResponse.class);

            return (com.micros_hosting.egateway.GetChecksResponse) object;
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

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getChecks142
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startgetChecks
     */
    public void startgetChecks(
            com.micros_hosting.egateway.GetChecks getChecks142,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/GetChecks");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                getChecks142,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "getChecks")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "GetChecks"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetChecksResponse.class);
                    callback.receiveResultgetChecks((com.micros_hosting.egateway.GetChecksResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetChecks(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
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
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorgetChecks(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetChecks(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetChecks(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetChecks(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetChecks(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetChecks(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetChecks(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetChecks(f);
                            }
                        } else {
                            callback.receiveErrorgetChecks(f);
                        }
                    } else {
                        callback.receiveErrorgetChecks(f);
                    }
                } else {
                    callback.receiveErrorgetChecks(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetChecks(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[6].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param getOpenChecks144
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#getOpenChecks
     */
    public com.micros_hosting.egateway.GetOpenChecksResponse getOpenChecks(
            com.micros_hosting.egateway.GetOpenChecks getOpenChecks144)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/GetOpenChecks");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getOpenChecks144,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "getOpenChecks")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "GetOpenChecks"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.GetOpenChecksResponse.class);

            return (com.micros_hosting.egateway.GetOpenChecksResponse) object;
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

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getOpenChecks144
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startgetOpenChecks
     */
    public void startgetOpenChecks(
            com.micros_hosting.egateway.GetOpenChecks getOpenChecks144,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/GetOpenChecks");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                getOpenChecks144,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "getOpenChecks")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "GetOpenChecks"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetOpenChecksResponse.class);
                    callback.receiveResultgetOpenChecks((com.micros_hosting.egateway.GetOpenChecksResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetOpenChecks(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(), "GetOpenChecks"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetOpenChecks"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetOpenChecks"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorgetOpenChecks(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecks(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecks(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecks(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecks(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecks(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecks(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecks(f);
                            }
                        } else {
                            callback.receiveErrorgetOpenChecks(f);
                        }
                    } else {
                        callback.receiveErrorgetOpenChecks(f);
                    }
                } else {
                    callback.receiveErrorgetOpenChecks(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetOpenChecks(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[7].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param getCheckDetail146
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#getCheckDetail
     */
    public com.micros_hosting.egateway.GetCheckDetailResponse getCheckDetail(
            com.micros_hosting.egateway.GetCheckDetail getCheckDetail146)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/GetCheckDetail");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getCheckDetail146,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "getCheckDetail")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "GetCheckDetail"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.GetCheckDetailResponse.class);

            return (com.micros_hosting.egateway.GetCheckDetailResponse) object;
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

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCheckDetail146
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startgetCheckDetail
     */
    public void startgetCheckDetail(
            com.micros_hosting.egateway.GetCheckDetail getCheckDetail146,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/GetCheckDetail");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                getCheckDetail146,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "getCheckDetail")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "GetCheckDetail"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetCheckDetailResponse.class);
                    callback.receiveResultgetCheckDetail((com.micros_hosting.egateway.GetCheckDetailResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetCheckDetail(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetCheckDetail"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetCheckDetail"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetCheckDetail"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorgetCheckDetail(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCheckDetail(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCheckDetail(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCheckDetail(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCheckDetail(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCheckDetail(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCheckDetail(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetCheckDetail(f);
                            }
                        } else {
                            callback.receiveErrorgetCheckDetail(f);
                        }
                    } else {
                        callback.receiveErrorgetCheckDetail(f);
                    }
                } else {
                    callback.receiveErrorgetCheckDetail(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetCheckDetail(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[8].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[8].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param voidTransaction148
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#voidTransaction
     */
    public com.micros_hosting.egateway.VoidTransactionResponse voidTransaction(
            com.micros_hosting.egateway.VoidTransaction voidTransaction148)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/VoidTransaction");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    voidTransaction148,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "voidTransaction")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "VoidTransaction"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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

            return (com.micros_hosting.egateway.VoidTransactionResponse) object;
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
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param voidTransaction148
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startvoidTransaction
     */
    public void startvoidTransaction(
            com.micros_hosting.egateway.VoidTransaction voidTransaction148,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/VoidTransaction");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                voidTransaction148,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "voidTransaction")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "VoidTransaction"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.VoidTransactionResponse.class);
                    callback.receiveResultvoidTransaction((com.micros_hosting.egateway.VoidTransactionResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorvoidTransaction(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "VoidTransaction"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "VoidTransaction"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "VoidTransaction"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorvoidTransaction(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorvoidTransaction(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorvoidTransaction(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorvoidTransaction(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorvoidTransaction(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorvoidTransaction(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorvoidTransaction(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorvoidTransaction(f);
                            }
                        } else {
                            callback.receiveErrorvoidTransaction(f);
                        }
                    } else {
                        callback.receiveErrorvoidTransaction(f);
                    }
                } else {
                    callback.receiveErrorvoidTransaction(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorvoidTransaction(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[9].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[9].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param checkPrintJobStatus150
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#checkPrintJobStatus
     */
    public com.micros_hosting.egateway.CheckPrintJobStatusResponse checkPrintJobStatus(
            com.micros_hosting.egateway.CheckPrintJobStatus checkPrintJobStatus150)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/CheckPrintJobStatus");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    checkPrintJobStatus150,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "checkPrintJobStatus")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/",
                            "CheckPrintJobStatus"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.CheckPrintJobStatusResponse.class);

            return (com.micros_hosting.egateway.CheckPrintJobStatusResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CheckPrintJobStatus"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CheckPrintJobStatus"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CheckPrintJobStatus"));
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
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param checkPrintJobStatus150
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startcheckPrintJobStatus
     */
    public void startcheckPrintJobStatus(
            com.micros_hosting.egateway.CheckPrintJobStatus checkPrintJobStatus150,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/CheckPrintJobStatus");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                checkPrintJobStatus150,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "checkPrintJobStatus")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "CheckPrintJobStatus"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.CheckPrintJobStatusResponse.class);
                    callback.receiveResultcheckPrintJobStatus((com.micros_hosting.egateway.CheckPrintJobStatusResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorcheckPrintJobStatus(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "CheckPrintJobStatus"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "CheckPrintJobStatus"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "CheckPrintJobStatus"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorcheckPrintJobStatus(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcheckPrintJobStatus(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcheckPrintJobStatus(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcheckPrintJobStatus(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcheckPrintJobStatus(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcheckPrintJobStatus(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcheckPrintJobStatus(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorcheckPrintJobStatus(f);
                            }
                        } else {
                            callback.receiveErrorcheckPrintJobStatus(f);
                        }
                    } else {
                        callback.receiveErrorcheckPrintJobStatus(f);
                    }
                } else {
                    callback.receiveErrorcheckPrintJobStatus(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorcheckPrintJobStatus(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[10].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[10].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param getOpenChecksByRVC152
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#getOpenChecksByRVC
     */
    public com.micros_hosting.egateway.GetOpenChecksByRVCResponse getOpenChecksByRVC(
            com.micros_hosting.egateway.GetOpenChecksByRVC getOpenChecksByRVC152)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/GetOpenChecksByRVC");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getOpenChecksByRVC152,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "getOpenChecksByRVC")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/",
                            "GetOpenChecksByRVC"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.GetOpenChecksByRVCResponse.class);

            return (com.micros_hosting.egateway.GetOpenChecksByRVCResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecksByRVC"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecksByRVC"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetOpenChecksByRVC"));
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
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getOpenChecksByRVC152
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startgetOpenChecksByRVC
     */
    public void startgetOpenChecksByRVC(
            com.micros_hosting.egateway.GetOpenChecksByRVC getOpenChecksByRVC152,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/GetOpenChecksByRVC");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                getOpenChecksByRVC152,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "getOpenChecksByRVC")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "GetOpenChecksByRVC"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetOpenChecksByRVCResponse.class);
                    callback.receiveResultgetOpenChecksByRVC((com.micros_hosting.egateway.GetOpenChecksByRVCResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetOpenChecksByRVC(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetOpenChecksByRVC"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetOpenChecksByRVC"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetOpenChecksByRVC"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorgetOpenChecksByRVC(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksByRVC(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksByRVC(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksByRVC(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksByRVC(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksByRVC(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksByRVC(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetOpenChecksByRVC(f);
                            }
                        } else {
                            callback.receiveErrorgetOpenChecksByRVC(f);
                        }
                    } else {
                        callback.receiveErrorgetOpenChecksByRVC(f);
                    }
                } else {
                    callback.receiveErrorgetOpenChecksByRVC(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetOpenChecksByRVC(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[11].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[11].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @param getConfigurationInfoEx154
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#getConfigurationInfoEx
     */
    public com.micros_hosting.egateway.GetConfigurationInfoExResponse getConfigurationInfoEx(
            com.micros_hosting.egateway.GetConfigurationInfoEx getConfigurationInfoEx154)
            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions()
                    .setAction("http://micros-hosting.com/EGateway/GetConfigurationInfoEx");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                    org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                    "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                            .getSoapVersionURI()),
                    getConfigurationInfoEx154,
                    optimizeContent(
                            new javax.xml.namespace.QName(
                                    "http://micros-hosting.com/EGateway/",
                                    "getConfigurationInfoEx")),
                    new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/",
                            "GetConfigurationInfoEx"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
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
                    com.micros_hosting.egateway.GetConfigurationInfoExResponse.class);

            return (com.micros_hosting.egateway.GetConfigurationInfoExResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetConfigurationInfoEx"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "GetConfigurationInfoEx"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "GetConfigurationInfoEx"));
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
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getConfigurationInfoEx154
     * @see com.connector.micros.stub.SimphonyPosAPIWeb#startgetConfigurationInfoEx
     */
    public void startgetConfigurationInfoEx(
            com.micros_hosting.egateway.GetConfigurationInfoEx getConfigurationInfoEx154,
            final com.connector.micros.stub.SimphonyPosAPIWebCallbackHandler callback)
            throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
        _operationClient.getOptions()
                .setAction("http://micros-hosting.com/EGateway/GetConfigurationInfoEx");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        env = toEnvelope(getFactory(_operationClient.getOptions()
                        .getSoapVersionURI()),
                getConfigurationInfoEx154,
                optimizeContent(
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "getConfigurationInfoEx")),
                new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/",
                        "GetConfigurationInfoEx"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody()
                                    .getFirstElement(),
                            com.micros_hosting.egateway.GetConfigurationInfoExResponse.class);
                    callback.receiveResultgetConfigurationInfoEx((com.micros_hosting.egateway.GetConfigurationInfoExResponse) object);
                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorgetConfigurationInfoEx(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();

                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(
                                new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetConfigurationInfoEx"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetConfigurationInfoEx"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                        faultElt.getQName(),
                                        "GetConfigurationInfoEx"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt,
                                        messageClass);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        new java.lang.Class[]{messageClass});
                                m.invoke(ex,
                                        new java.lang.Object[]{messageObject});

                                callback.receiveErrorgetConfigurationInfoEx(new java.rmi.RemoteException(
                                        ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfoEx(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfoEx(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfoEx(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfoEx(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfoEx(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfoEx(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorgetConfigurationInfoEx(f);
                            }
                        } else {
                            callback.receiveErrorgetConfigurationInfoEx(f);
                        }
                    } else {
                        callback.receiveErrorgetConfigurationInfoEx(f);
                    }
                } else {
                    callback.receiveErrorgetConfigurationInfoEx(error);
                }
            }

            public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender()
                            .cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorgetConfigurationInfoEx(axisFault);
                }
            }
        });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[12].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[12].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    //http://83.125.26.252:8080/EGateway/SimphonyPosApiWeb.asmx
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
            com.micros_hosting.egateway.PostTransactionEx param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.PostTransactionEx.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.CalculateTransactionTotals param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.CalculateTransactionTotals.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetConfigurationInfo param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetConfigurationInfo.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.AddToExistingCheckEx param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.AddToExistingCheckEx.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetOpenChecksEx param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetOpenChecksEx.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetPrintedCheck param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetPrintedCheck.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetChecks param, boolean optimizeContent,
            javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetChecks.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetOpenChecks param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetOpenChecks.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetCheckDetail param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetCheckDetail.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.VoidTransaction param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.VoidTransaction.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.CheckPrintJobStatus param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.CheckPrintJobStatus.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetOpenChecksByRVC param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetOpenChecksByRVC.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            com.micros_hosting.egateway.GetConfigurationInfoEx param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(
                            com.micros_hosting.egateway.GetConfigurationInfoEx.MY_QNAME,
                            factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */

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
}
