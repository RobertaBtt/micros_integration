/**
 * SimphonyPosApi_EPayment.java
 */
package com.connector.micros.porting.element;


import com.micros_hosting.egateway.SimphonyPosApi_EPayment;
import org.apache.axis2.databinding.ADBException;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

@SuppressWarnings({"unchecked",
        "unused"
})
public class MicrosSimphonyPosApi_EPayment extends SimphonyPosApi_EPayment {


    private static String namespaceUri;

    public MicrosSimphonyPosApi_EPayment(String namespaceUri) {

        this.namespaceUri = namespaceUri;
    }


    public void serialize(final QName parentQName, XMLStreamWriter xmlWriter, boolean serializeType)
            throws XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        String prefix = null;
        String namespace = null;

        namespace = "";
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

        if (serializeType) {
            String namespacePrefix = registerPrefix(xmlWriter, namespaceUri);

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":SimphonyPosApi_EPayment", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SimphonyPosApi_EPayment", xmlWriter);
            }
        }

        if (localAccountDataSource == null) {
            throw new ADBException("AccountDataSource cannot be null!!");
        }

        localAccountDataSource.serialize(new QName(namespaceUri, "AccountDataSource", ""),
                xmlWriter);

        if (localAccountType == null) {
            throw new ADBException("AccountType cannot be null!!");
        }

        localAccountType.serialize(new QName(namespaceUri, "AccountType", ""), xmlWriter);

        if (localAcctNumberTracker) {
            namespace = "";
            writeStartElement(null, namespace, "AcctNumber", xmlWriter);

            if (localAcctNumber == null) {
                // write the nil attribute
                throw new ADBException("AcctNumber cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAcctNumber);
            }

            xmlWriter.writeEndElement();
        }

        if (localAddressVerificationTracker) {
            namespace = "";
            writeStartElement(null, namespace, "AddressVerification", xmlWriter);

            if (localAddressVerification == null) {
                // write the nil attribute
                throw new ADBException("AddressVerification cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAddressVerification);
            }

            xmlWriter.writeEndElement();
        }

        if (localAuthorizationCodeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "AuthorizationCode", xmlWriter);

            if (localAuthorizationCode == null) {
                // write the nil attribute
                throw new ADBException("AuthorizationCode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAuthorizationCode);
            }

            xmlWriter.writeEndElement();
        }

        if (localBaseAmountTracker) {
            namespace = "";
            writeStartElement(null, namespace, "BaseAmount", xmlWriter);

            if (localBaseAmount == null) {
                // write the nil attribute
                throw new ADBException("BaseAmount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBaseAmount);
            }

            xmlWriter.writeEndElement();
        }

        if (localCashBackAmountTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "CashBackAmount", xmlWriter);

            if (localCashBackAmount == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "CashBackAmount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCashBackAmount);
            }

            xmlWriter.writeEndElement();
        }

        if (localCVVNumberTracker) {
            namespace = "";
            writeStartElement(null, namespace, "CVVNumber", xmlWriter);

            if (localCVVNumber == null) {
                // write the nil attribute
                throw new ADBException("CVVNumber cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCVVNumber);
            }

            xmlWriter.writeEndElement();
        }

        if (localDeviceIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "DeviceId", xmlWriter);

            if (localDeviceId == null) {
                // write the nil attribute
                throw new ADBException("DeviceId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDeviceId);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "ExpirationDate", xmlWriter);

        if (localExpirationDate == null) {
            // write the nil attribute
            throw new ADBException("ExpirationDate cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localExpirationDate));
        }

        xmlWriter.writeEndElement();

        if (localInterfaceNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "InterfaceName", xmlWriter);

            if (localInterfaceName == null) {
                // write the nil attribute
                throw new ADBException("InterfaceName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localInterfaceName);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "IssueNumber", xmlWriter);

        if (localIssueNumber == Short.MIN_VALUE) {
            throw new ADBException("IssueNumber cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localIssueNumber));
        }

        xmlWriter.writeEndElement();

        if (localKeySerialNumTracker) {
            namespace = "";
            writeStartElement(null, namespace, "KeySerialNum", xmlWriter);

            if (localKeySerialNum == null) {
                // write the nil attribute
                throw new ADBException(
                        "KeySerialNum cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localKeySerialNum);
            }

            xmlWriter.writeEndElement();
        }

        if (localPaymentCommand == null) {
            throw new ADBException("PaymentCommand cannot be null!!");
        }

        localPaymentCommand.serialize(new QName(namespaceUri, "PaymentCommand", ""),
                xmlWriter);

        if (localPinBlockTracker) {
            namespace = "";
            writeStartElement(null, namespace, "PinBlock", xmlWriter);

            if (localPinBlock == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "PinBlock cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPinBlock);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "StartDate", xmlWriter);

        if (localStartDate == null) {
            // write the nil attribute
            throw new ADBException("StartDate cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localStartDate));
        }

        xmlWriter.writeEndElement();

        if (localSvcAccountTypeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "SvcAccountType", xmlWriter);

            if (localSvcAccountType == null) {
                // write the nil attribute
                throw new ADBException("SvcAccountType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSvcAccountType);
            }

            xmlWriter.writeEndElement();
        }

        if (localSvcResponseTracker) {
            namespace = "";
            writeStartElement(null, namespace, "SvcResponse", xmlWriter);

            if (localSvcResponse == null) {
                // write the nil attribute
                throw new ADBException("SvcResponse cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSvcResponse);
            }

            xmlWriter.writeEndElement();
        }

        if (localTipAmountTracker) {
            namespace = "";
            writeStartElement(null, namespace, "TipAmount", xmlWriter);

            if (localTipAmount == null) {
                // write the nil attribute
                throw new ADBException("TipAmount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTipAmount);
            }

            xmlWriter.writeEndElement();
        }

        if (localTrack1DataTracker) {
            namespace = "";
            writeStartElement(null, namespace, "Track1Data", xmlWriter);

            if (localTrack1Data == null) {
                // write the nil attribute
                throw new ADBException("Track1Data cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTrack1Data);
            }

            xmlWriter.writeEndElement();
        }

        if (localTrack2DataTracker) {
            namespace = "";
            writeStartElement(null, namespace, "Track2Data", xmlWriter);

            if (localTrack2Data == null) {
                // write the nil attribute
                throw new ADBException("Track2Data cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTrack2Data);
            }

            xmlWriter.writeEndElement();
        }

        if (localTrack3DataTracker) {
            namespace = "";
            writeStartElement(null, namespace, "Track3Data", xmlWriter);

            if (localTrack3Data == null) {
                // write the nil attribute
                throw new ADBException("Track3Data cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTrack3Data);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
        if (namespace.equals(namespaceUri)) {
            return "";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(String prefix,
                                   String namespace, String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(String prefix,
                                String namespace, String attName,
                                String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(String namespace,
                                String attName, String attValue,
                                javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                    namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(String namespace,
                                     String attName, javax.xml.namespace.QName qname,
                                     javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        String attributeNamespace = qname.getNamespaceURI();
        String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                    attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
                            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
                             javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            StringBuffer stringToWrite = new StringBuffer();
            String namespaceURI = null;
            String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                        qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
            throws javax.xml.stream.XMLStreamException {
        String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory extends SimphonyPosApi_EPayment.Factory {

        public static MicrosSimphonyPosApi_EPayment parse(XMLStreamReader reader, String namespaceUri) throws Exception {

            MicrosSimphonyPosApi_EPayment object = new MicrosSimphonyPosApi_EPayment(namespaceUri);

            int event;
            javax.xml.namespace.QName currentQName = null;
            String nillableValue = null;
            String prefix = "";
            String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                        "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        String type = fullTypeName.substring(fullTypeName.indexOf(
                                ":") + 1);

                        if (!"SimphonyPosApi_EPayment".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (MicrosSimphonyPosApi_EPayment) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "AccountDataSource").equals(reader.getName())) {
                    object.setAccountDataSource(com.micros_hosting.egateway.EAccountDataSource.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "AccountType").equals(
                                reader.getName())) {
                    object.setAccountType(com.micros_hosting.egateway.EAccountType.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "AcctNumber").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "AcctNumber" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setAcctNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "AddressVerification").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "AddressVerification" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setAddressVerification(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "AuthorizationCode").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "AuthorizationCode" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setAuthorizationCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "BaseAmount").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "BaseAmount" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setBaseAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "CashBackAmount").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CashBackAmount" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCashBackAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "CVVNumber").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CVVNumber" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCVVNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "DeviceId").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "DeviceId" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setDeviceId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "ExpirationDate").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ExpirationDate" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setExpirationDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "InterfaceName").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "InterfaceName" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setInterfaceName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "IssueNumber").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "IssueNumber" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setIssueNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "KeySerialNum").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "KeySerialNum" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setKeySerialNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "PaymentCommand").equals(reader.getName())) {
                    object.setPaymentCommand(com.micros_hosting.egateway.EPaymentDirective.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "PinBlock").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "PinBlock" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setPinBlock(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "StartDate").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "StartDate" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setStartDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "SvcAccountType").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "SvcAccountType" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setSvcAccountType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "SvcResponse").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "SvcResponse" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setSvcResponse(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "TipAmount").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "TipAmount" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setTipAmount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "Track1Data").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Track1Data" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setTrack1Data(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "Track2Data").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Track2Data" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setTrack2Data(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "Track3Data").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "Track3Data" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setTrack3Data(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }
    } //end of factory class
}
