/**
 * SimphonyPosApi_GuestCheck.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.micros_hosting.egateway;


/**
 * SimphonyPosApi_GuestCheck bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class SimphonyPosApi_GuestCheck implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of dbName that had
       name = SimphonyPosApi_GuestCheck
       Namespace URI = http://micros-hosting.com/EGateway/
       Namespace Prefix =
     */

    /**
     * field for OperationalResult
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_OperationalResult localOperationalResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOperationalResultTracker = false;

    /**
     * field for CheckDateToFire
     */
    protected java.util.Calendar localCheckDateToFire;

    /**
     * field for CheckEmployeeObjectNum
     */
    protected int localCheckEmployeeObjectNum;

    /**
     * field for CheckGuestCount
     */
    protected int localCheckGuestCount;

    /**
     * field for CheckID
     */
    protected java.lang.String localCheckID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCheckIDTracker = false;

    /**
     * field for CheckNum
     */
    protected int localCheckNum;

    /**
     * field for CheckOrderType
     */
    protected int localCheckOrderType;

    /**
     * field for CheckRevenueCenterID
     */
    protected long localCheckRevenueCenterID;

    /**
     * field for CheckSeq
     */
    protected int localCheckSeq;

    /**
     * field for CheckStatusBits
     */
    protected int localCheckStatusBits;

    /**
     * field for CheckTableObjectNum
     */
    protected int localCheckTableObjectNum;

    /**
     * field for PCheckInfoLines
     */
    protected com.micros_hosting.egateway.ArrayOfString localPCheckInfoLines;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPCheckInfoLinesTracker = false;

    /**
     * field for PPrintJobIds
     */
    protected com.micros_hosting.egateway.ArrayOfInt localPPrintJobIds;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPPrintJobIdsTracker = false;

    /**
     * field for EventObjectNum
     */
    protected int localEventObjectNum;

    public boolean isOperationalResultSpecified() {
        return localOperationalResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_OperationalResult
     */
    public com.micros_hosting.egateway.SimphonyPosApi_OperationalResult getOperationalResult() {
        return localOperationalResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param OperationalResult
     */
    public void setOperationalResult(
            com.micros_hosting.egateway.SimphonyPosApi_OperationalResult param) {
        localOperationalResultTracker = param != null;

        this.localOperationalResult = param;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getCheckDateToFire() {
        return localCheckDateToFire;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckDateToFire
     */
    public void setCheckDateToFire(java.util.Calendar param) {
        this.localCheckDateToFire = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCheckEmployeeObjectNum() {
        return localCheckEmployeeObjectNum;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckEmployeeObjectNum
     */
    public void setCheckEmployeeObjectNum(int param) {
        this.localCheckEmployeeObjectNum = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCheckGuestCount() {
        return localCheckGuestCount;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckGuestCount
     */
    public void setCheckGuestCount(int param) {
        this.localCheckGuestCount = param;
    }

    public boolean isCheckIDSpecified() {
        return localCheckIDTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCheckID() {
        return localCheckID;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckID
     */
    public void setCheckID(java.lang.String param) {
        localCheckIDTracker = param != null;

        this.localCheckID = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCheckNum() {
        return localCheckNum;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckNum
     */
    public void setCheckNum(int param) {
        this.localCheckNum = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCheckOrderType() {
        return localCheckOrderType;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckOrderType
     */
    public void setCheckOrderType(int param) {
        this.localCheckOrderType = param;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getCheckRevenueCenterID() {
        return localCheckRevenueCenterID;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckRevenueCenterID
     */
    public void setCheckRevenueCenterID(long param) {
        this.localCheckRevenueCenterID = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCheckSeq() {
        return localCheckSeq;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckSeq
     */
    public void setCheckSeq(int param) {
        this.localCheckSeq = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCheckStatusBits() {
        return localCheckStatusBits;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckStatusBits
     */
    public void setCheckStatusBits(int param) {
        this.localCheckStatusBits = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCheckTableObjectNum() {
        return localCheckTableObjectNum;
    }

    /**
     * Auto generated setter method
     *
     * @param param CheckTableObjectNum
     */
    public void setCheckTableObjectNum(int param) {
        this.localCheckTableObjectNum = param;
    }

    public boolean isPCheckInfoLinesSpecified() {
        return localPCheckInfoLinesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.ArrayOfString
     */
    public com.micros_hosting.egateway.ArrayOfString getPCheckInfoLines() {
        return localPCheckInfoLines;
    }

    /**
     * Auto generated setter method
     *
     * @param param PCheckInfoLines
     */
    public void setPCheckInfoLines(
            com.micros_hosting.egateway.ArrayOfString param) {
        localPCheckInfoLinesTracker = param != null;

        this.localPCheckInfoLines = param;
    }

    public boolean isPPrintJobIdsSpecified() {
        return localPPrintJobIdsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.ArrayOfInt
     */
    public com.micros_hosting.egateway.ArrayOfInt getPPrintJobIds() {
        return localPPrintJobIds;
    }

    /**
     * Auto generated setter method
     *
     * @param param PPrintJobIds
     */
    public void setPPrintJobIds(com.micros_hosting.egateway.ArrayOfInt param) {
        localPPrintJobIdsTracker = param != null;

        this.localPPrintJobIds = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getEventObjectNum() {
        return localEventObjectNum;
    }

    /**
     * Auto generated setter method
     *
     * @param param EventObjectNum
     */
    public void setEventObjectNum(int param) {
        this.localEventObjectNum = param;
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

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://micros-hosting.com/EGateway/");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":SimphonyPosApi_GuestCheck", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SimphonyPosApi_GuestCheck", xmlWriter);
            }
        }

        if (localOperationalResultTracker) {
            if (localOperationalResult == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "OperationalResult cannot be null!!");
            }

            localOperationalResult.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "OperationalResult"),
                    xmlWriter);
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckDateToFire", xmlWriter);

        if (localCheckDateToFire == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckDateToFire cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckDateToFire));
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

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "CheckGuestCount", xmlWriter);

        if (localCheckGuestCount == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckGuestCount cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckGuestCount));
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
        writeStartElement(null, namespace, "CheckRevenueCenterID", xmlWriter);

        if (localCheckRevenueCenterID == java.lang.Long.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckRevenueCenterID cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckRevenueCenterID));
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
        writeStartElement(null, namespace, "CheckStatusBits", xmlWriter);

        if (localCheckStatusBits == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckStatusBits cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckStatusBits));
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

        if (localPCheckInfoLinesTracker) {
            if (localPCheckInfoLines == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "PCheckInfoLines cannot be null!!");
            }

            localPCheckInfoLines.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "PCheckInfoLines"),
                    xmlWriter);
        }

        if (localPPrintJobIdsTracker) {
            if (localPPrintJobIds == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "PPrintJobIds cannot be null!!");
            }

            localPPrintJobIds.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "PPrintJobIds"),
                    xmlWriter);
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "EventObjectNum", xmlWriter);

        if (localEventObjectNum == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "EventObjectNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localEventObjectNum));
        }

        xmlWriter.writeEndElement();

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
        public static SimphonyPosApi_GuestCheck parse(
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SimphonyPosApi_GuestCheck object = new SimphonyPosApi_GuestCheck();

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

                        if (!"SimphonyPosApi_GuestCheck".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (SimphonyPosApi_GuestCheck) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
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
                                "OperationalResult").equals(reader.getName())) {
                    object.setOperationalResult(com.micros_hosting.egateway.SimphonyPosApi_OperationalResult.Factory.parse(
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
                                "CheckDateToFire").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckDateToFire" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckDateToFire(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
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
                                "http://micros-hosting.com/EGateway/",
                                "CheckGuestCount").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckGuestCount" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckGuestCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "CheckRevenueCenterID").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckRevenueCenterID" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckRevenueCenterID(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
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
                                "CheckStatusBits").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckStatusBits" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCheckStatusBits(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "PCheckInfoLines").equals(reader.getName())) {
                    object.setPCheckInfoLines(com.micros_hosting.egateway.ArrayOfString.Factory.parse(
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
                                "PPrintJobIds").equals(reader.getName())) {
                    object.setPPrintJobIds(com.micros_hosting.egateway.ArrayOfInt.Factory.parse(
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
                                "EventObjectNum").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "EventObjectNum" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEventObjectNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
