package com.connector.micros.porting;

import com.connector.micros.porting.request.*;
import com.micros_hosting.egateway.GetChecks;
import com.micros_hosting.egateway.VoidTransaction;
import org.apache.axiom.om.OMNamespace;

public class MicrosSimphonySOAPEnvelope {

    private javax.xml.namespace.QName[] opNameArray = null;

    public MicrosSimphonySOAPEnvelope() {
    }

    /* methods to provide back word compatibility */
    public org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            MicrosGetOpenChecks param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            OMNamespace namespace = factory.createOMNamespace("http://schemas.xmlsoap.org/soap/envelope/", "soap");
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.setNamespace(namespace);
            emptyEnvelope.getBody().setNamespace(namespace);

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(elementQName, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    public org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory, MicrosGetCheckDetail param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            OMNamespace namespace = factory.createOMNamespace("http://schemas.xmlsoap.org/soap/envelope/", "soap");
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.setNamespace(namespace);
            emptyEnvelope.getBody().setNamespace(namespace);

            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(elementQName, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    public org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            MicrosAddToExistingCheckEx param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            OMNamespace namespace = factory.createOMNamespace("http://schemas.xmlsoap.org/soap/envelope/", "soap");

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.setNamespace(namespace);
            emptyEnvelope.getBody().setNamespace(namespace);
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(elementQName, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    public org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            MicrosPostTransactionEx param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            OMNamespace namespace = factory.createOMNamespace("http://schemas.xmlsoap.org/soap/envelope/", "soap");

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.setNamespace(namespace);
            emptyEnvelope.getBody().setNamespace(namespace);
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(elementQName, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    public org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            MicrosGetConfigurationInfo param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            OMNamespace namespace = factory.createOMNamespace("http://schemas.xmlsoap.org/soap/envelope/", "soap");

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.setNamespace(namespace);
            emptyEnvelope.getBody().setNamespace(namespace);
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(elementQName, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    public org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            VoidTransaction param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            OMNamespace namespace = factory.createOMNamespace("http://schemas.xmlsoap.org/soap/envelope/", "soap");

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.setNamespace(namespace);
            emptyEnvelope.getBody().setNamespace(namespace);
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(elementQName, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }


    public org.apache.axiom.soap.SOAPEnvelope toEnvelope(
            org.apache.axiom.soap.SOAPFactory factory,
            GetChecks param,
            boolean optimizeContent, javax.xml.namespace.QName elementQName)
            throws org.apache.axis2.AxisFault {
        try {
            OMNamespace namespace = factory.createOMNamespace("http://schemas.xmlsoap.org/soap/envelope/", "soap");

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.setNamespace(namespace);
            emptyEnvelope.getBody().setNamespace(namespace);
            emptyEnvelope.getBody()
                    .addChild(param.getOMElement(elementQName, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }


    public boolean optimizeContent(javax.xml.namespace.QName opName) {
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

    public java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type, String namespaceuri) throws org.apache.axis2.AxisFault {
        try {

//            if (com.micros_hosting.egateway.GetOpenChecksExResponse.class.equals(type)) {
//                return com.micros_hosting.egateway.GetOpenChecksExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }

            if (com.connector.micros.porting.response.MicrosGetOpenChecksResponse.class.equals(type)) {
                return com.connector.micros.porting.response.MicrosGetOpenChecksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.connector.micros.porting.request.MicrosGetCheckDetail.class.equals(type)) {
                return com.connector.micros.porting.request.MicrosGetCheckDetail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.connector.micros.porting.response.MicrosGetCheckDetailResponse.class.equals(type)) {
                return com.connector.micros.porting.response.MicrosGetCheckDetailResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.connector.micros.porting.request.MicrosAddToExistingCheckEx.class.equals(type)) {
                return com.connector.micros.porting.request.MicrosAddToExistingCheckEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.connector.micros.porting.response.MicrosAddToExistingCheckExResponse.class.equals(type)) {
                return com.connector.micros.porting.response.MicrosAddToExistingCheckExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching(), namespaceuri);
            }

            if (com.micros_hosting.egateway.AddToExistingCheckExResponse.class.equals(type)) {
                return com.micros_hosting.egateway.AddToExistingCheckExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.micros_hosting.egateway.GetChecksResponse.class.equals(type)) {
                return com.micros_hosting.egateway.GetChecksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }


//            if (com.micros_hosting.egateway.CalculateTransactionTotals.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.CalculateTransactionTotals.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.CalculateTransactionTotalsResponse.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.CalculateTransactionTotalsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.CheckPrintJobStatus.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.CheckPrintJobStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.CheckPrintJobStatusResponse.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.CheckPrintJobStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//            if (com.micros_hosting.egateway.GetChecks.class.equals(type)) {
//                return com.micros_hosting.egateway.GetChecks.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//

//
//            if (com.micros_hosting.egateway.GetConfigurationInfo.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.GetConfigurationInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.GetConfigurationInfoEx.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.GetConfigurationInfoEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.GetConfigurationInfoExResponse.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.GetConfigurationInfoExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.GetConfigurationInfoResponse.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.GetConfigurationInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//
//
//            if (com.micros_hosting.egateway.GetOpenChecksByRVC.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.GetOpenChecksByRVC.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.GetOpenChecksByRVCResponse.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.GetOpenChecksByRVCResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.GetOpenChecksEx.class.equals(type)) {
//                return com.micros_hosting.egateway.GetOpenChecksEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//            if (com.micros_hosting.egateway.GetPrintedCheck.class.equals(type)) {
//                return com.micros_hosting.egateway.GetPrintedCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.GetPrintedCheckResponse.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.GetPrintedCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.PostTransactionEx.class.equals(type)) {
//                return com.micros_hosting.egateway.PostTransactionEx.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.PostTransactionExResponse.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.PostTransactionExResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.VoidTransaction.class.equals(type)) {
//                return com.micros_hosting.egateway.VoidTransaction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
//
//            if (com.micros_hosting.egateway.VoidTransactionResponse.class.equals(
//                    type)) {
//                return com.micros_hosting.egateway.VoidTransactionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
//            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

}
