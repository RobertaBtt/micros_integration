/**
 * SimphonyPosApi_CheckSummaryEx.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.micros_hosting.egateway;


/**
 * SimphonyPosApi_CheckSummaryEx bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class SimphonyPosApi_CheckSummaryEx extends com.micros_hosting.egateway.SimphonyPosApi_CheckSummary
        implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of dbName that had
       name = SimphonyPosApi_CheckSummaryEx
       Namespace URI = http://micros-hosting.com/EGateway/
       Namespace Prefix =
     */

    /**
     * field for LastKnownKdsOrderStatus
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_KdsOrderStatus localLastKnownKdsOrderStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastKnownKdsOrderStatusTracker = false;

    /**
     * field for KdsOrderStatusHistory
     */
    protected com.micros_hosting.egateway.ArrayOfSimphonyPosApi_KdsOrderStatus localKdsOrderStatusHistory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localKdsOrderStatusHistoryTracker = false;

    public boolean isLastKnownKdsOrderStatusSpecified() {
        return localLastKnownKdsOrderStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_KdsOrderStatus
     */
    public com.micros_hosting.egateway.SimphonyPosApi_KdsOrderStatus getLastKnownKdsOrderStatus() {
        return localLastKnownKdsOrderStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastKnownKdsOrderStatus
     */
    public void setLastKnownKdsOrderStatus(
            com.micros_hosting.egateway.SimphonyPosApi_KdsOrderStatus param) {
        localLastKnownKdsOrderStatusTracker = param != null;

        this.localLastKnownKdsOrderStatus = param;
    }

    public boolean isKdsOrderStatusHistorySpecified() {
        return localKdsOrderStatusHistoryTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.ArrayOfSimphonyPosApi_KdsOrderStatus
     */
    public com.micros_hosting.egateway.ArrayOfSimphonyPosApi_KdsOrderStatus getKdsOrderStatusHistory() {
        return localKdsOrderStatusHistory;
    }

    /**
     * Auto generated setter method
     *
     * @param param KdsOrderStatusHistory
     */
    public void setKdsOrderStatusHistory(
            com.micros_hosting.egateway.ArrayOfSimphonyPosApi_KdsOrderStatus param) {
        localKdsOrderStatusHistoryTracker = param != null;

        this.localKdsOrderStatusHistory = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

        java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                "http://micros-hosting.com/EGateway/");

        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", namespacePrefix + ":SimphonyPosApi_CheckSummaryEx",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                    "type", "SimphonyPosApi_CheckSummaryEx", xmlWriter);
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckAutoFireTime", xmlWriter);

        if (localCheckAutoFireTime == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckAutoFireTime cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckAutoFireTime));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckCurrentlyOpenOnWorkstation",
                xmlWriter);

        if (localCheckCurrentlyOpenOnWorkstation == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckCurrentlyOpenOnWorkstation cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckCurrentlyOpenOnWorkstation));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckEmployeeObjectNum", xmlWriter);

        if (localCheckEmployeeObjectNum == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckEmployeeObjectNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckEmployeeObjectNum));
        }

        xmlWriter.writeEndElement();

        if (localCheckIDTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "CheckID", xmlWriter);

            if (localCheckID == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "CheckID cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCheckID);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckInsufficientBeverage",
                xmlWriter);

        if (localCheckInsufficientBeverage == java.lang.Short.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckInsufficientBeverage cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckInsufficientBeverage));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckInTraining", xmlWriter);

        if (localCheckInTraining == java.lang.Short.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckInTraining cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckInTraining));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckIsDelayedOrder", xmlWriter);

        if (localCheckIsDelayedOrder == java.lang.Short.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckIsDelayedOrder cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckIsDelayedOrder));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckIsFutureOrder", xmlWriter);

        if (localCheckIsFutureOrder == java.lang.Short.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckIsFutureOrder cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckIsFutureOrder));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckLastServiceTime", xmlWriter);

        if (localCheckLastServiceTime == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckLastServiceTime cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckLastServiceTime));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckLastWorkstationOwner",
                xmlWriter);

        if (localCheckLastWorkstationOwner == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckLastWorkstationOwner cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckLastWorkstationOwner));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckNum", xmlWriter);

        if (localCheckNum == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckNum));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckOpenTime", xmlWriter);

        if (localCheckOpenTime == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckOpenTime cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckOpenTime));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckOrderType", xmlWriter);

        if (localCheckOrderType == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckOrderType cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckOrderType));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckRevenueCenterObjectNum",
                xmlWriter);

        if (localCheckRevenueCenterObjectNum == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckRevenueCenterObjectNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckRevenueCenterObjectNum));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckSeq", xmlWriter);

        if (localCheckSeq == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckSeq cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckSeq));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckTableGroup", xmlWriter);

        if (localCheckTableGroup == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckTableGroup cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckTableGroup));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckTableObjectNum", xmlWriter);

        if (localCheckTableObjectNum == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckTableObjectNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckTableObjectNum));
        }

        xmlWriter.writeEndElement();

        if (localCheckTotalDueTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "CheckTotalDue", xmlWriter);

            if (localCheckTotalDue == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "CheckTotalDue cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCheckTotalDue);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckTransferedToDriver", xmlWriter);

        if (localCheckTransferedToDriver == java.lang.Short.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckTransferedToDriver cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckTransferedToDriver));
        }

        xmlWriter.writeEndElement();

        if (localLastKnownKdsOrderStatusTracker) {
            if (localLastKnownKdsOrderStatus == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "LastKnownKdsOrderStatus cannot be null!!");
            }

            localLastKnownKdsOrderStatus.serialize(new javax.xml.namespace.QName(
                    "http://micros-hosting.com/EGateway/",
                    "LastKnownKdsOrderStatus"), xmlWriter);
        }

        if (localKdsOrderStatusHistoryTracker) {
            if (localKdsOrderStatusHistory == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "KdsOrderStatusHistory cannot be null!!");
            }

            localKdsOrderStatusHistory.serialize(new javax.xml.namespace.QName(
                    "http://micros-hosting.com/EGateway/",
                    "KdsOrderStatusHistory"), xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://micros-hosting.com/EGateway/")) {
            return "";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
                                   java.lang.String namespace, java.lang.String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

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
    private void writeAttribute(java.lang.String prefix,
                                java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

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
    private void writeAttribute(java.lang.String namespace,
                                java.lang.String attName, java.lang.String attValue,
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
    private void writeQNameAttribute(java.lang.String namespace,
                                     java.lang.String attName, javax.xml.namespace.QName qname,
                                     javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

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
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

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
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

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
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

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
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         * If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static SimphonyPosApi_CheckSummaryEx parse(
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SimphonyPosApi_CheckSummaryEx object = new SimphonyPosApi_CheckSummaryEx();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                        "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                ":") + 1);

                        if (!"SimphonyPosApi_CheckSummaryEx".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (SimphonyPosApi_CheckSummaryEx) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
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
                                "CheckAutoFireTime").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckAutoFireTime" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckAutoFireTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
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
                                "CheckCurrentlyOpenOnWorkstation").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " +
                                        "CheckCurrentlyOpenOnWorkstation" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckCurrentlyOpenOnWorkstation(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "CheckEmployeeObjectNum").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckEmployeeObjectNum" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckEmployeeObjectNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "http://micros-hosting.com/EGateway/", "CheckID").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckID" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "CheckInsufficientBeverage").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckInsufficientBeverage" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckInsufficientBeverage(org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(
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
                                "CheckInTraining").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckInTraining" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckInTraining(org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(
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
                                "CheckIsDelayedOrder").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckIsDelayedOrder" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckIsDelayedOrder(org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(
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
                                "CheckIsFutureOrder").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckIsFutureOrder" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckIsFutureOrder(org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(
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
                                "CheckLastServiceTime").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckLastServiceTime" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckLastServiceTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
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
                                "CheckLastWorkstationOwner").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckLastWorkstationOwner" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckLastWorkstationOwner(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "http://micros-hosting.com/EGateway/", "CheckNum").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckNum" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "CheckOpenTime").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckOpenTime" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckOpenTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
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
                                "CheckOrderType").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckOrderType" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckOrderType(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "CheckRevenueCenterObjectNum").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckRevenueCenterObjectNum" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckRevenueCenterObjectNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "http://micros-hosting.com/EGateway/", "CheckSeq").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckSeq" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckSeq(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "CheckTableGroup").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckTableGroup" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckTableGroup(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "CheckTableObjectNum").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckTableObjectNum" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckTableObjectNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "CheckTotalDue").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckTotalDue" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckTotalDue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
                                "CheckTransferedToDriver").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckTransferedToDriver" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckTransferedToDriver(org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(
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
                                "LastKnownKdsOrderStatus").equals(reader.getName())) {
                    object.setLastKnownKdsOrderStatus(com.micros_hosting.egateway.SimphonyPosApi_KdsOrderStatus.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/",
                                "KdsOrderStatusHistory").equals(reader.getName())) {
                    object.setKdsOrderStatusHistory(com.micros_hosting.egateway.ArrayOfSimphonyPosApi_KdsOrderStatus.Factory.parse(
                            reader));

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
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
