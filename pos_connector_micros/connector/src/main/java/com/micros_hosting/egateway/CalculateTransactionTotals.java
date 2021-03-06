/**
 * CalculateTransactionTotals.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.micros_hosting.egateway;


/**
 * CalculateTransactionTotals bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class CalculateTransactionTotals implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://micros-hosting.com/EGateway/",
            "CalculateTransactionTotals", "");

    /**
     * field for VendorCode
     */
    protected java.lang.String localVendorCode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVendorCodeTracker = false;

    /**
     * field for PpMenuItems
     */
    protected com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem localPpMenuItems;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPpMenuItemsTracker = false;

    /**
     * field for PpComboMeals
     */
    protected com.micros_hosting.egateway.ArrayOfSimphonyPosApi_ComboMeal localPpComboMeals;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPpComboMealsTracker = false;

    /**
     * field for PSvcCharge
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_SvcCharge localPSvcCharge;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPSvcChargeTracker = false;

    /**
     * field for PSubtotalDiscount
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_Discount localPSubtotalDiscount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPSubtotalDiscountTracker = false;

    /**
     * field for RevenueCenter
     */
    protected int localRevenueCenter;

    /**
     * field for OrderType
     */
    protected short localOrderType;

    /**
     * field for EmployeeNumber
     */
    protected int localEmployeeNumber;

    /**
     * field for PTotalsResponse
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_TotalsResponse localPTotalsResponse;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPTotalsResponseTracker = false;

    public boolean isVendorCodeSpecified() {
        return localVendorCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getVendorCode() {
        return localVendorCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param VendorCode
     */
    public void setVendorCode(java.lang.String param) {
        localVendorCodeTracker = param != null;

        this.localVendorCode = param;
    }

    public boolean isPpMenuItemsSpecified() {
        return localPpMenuItemsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem
     */
    public com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem getPpMenuItems() {
        return localPpMenuItems;
    }

    /**
     * Auto generated setter method
     *
     * @param param PpMenuItems
     */
    public void setPpMenuItems(
            com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem param) {
        localPpMenuItemsTracker = param != null;

        this.localPpMenuItems = param;
    }

    public boolean isPpComboMealsSpecified() {
        return localPpComboMealsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.ArrayOfSimphonyPosApi_ComboMeal
     */
    public com.micros_hosting.egateway.ArrayOfSimphonyPosApi_ComboMeal getPpComboMeals() {
        return localPpComboMeals;
    }

    /**
     * Auto generated setter method
     *
     * @param param PpComboMeals
     */
    public void setPpComboMeals(
            com.micros_hosting.egateway.ArrayOfSimphonyPosApi_ComboMeal param) {
        localPpComboMealsTracker = param != null;

        this.localPpComboMeals = param;
    }

    public boolean isPSvcChargeSpecified() {
        return localPSvcChargeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_SvcCharge
     */
    public com.micros_hosting.egateway.SimphonyPosApi_SvcCharge getPSvcCharge() {
        return localPSvcCharge;
    }

    /**
     * Auto generated setter method
     *
     * @param param PSvcCharge
     */
    public void setPSvcCharge(
            com.micros_hosting.egateway.SimphonyPosApi_SvcCharge param) {
        localPSvcChargeTracker = param != null;

        this.localPSvcCharge = param;
    }

    public boolean isPSubtotalDiscountSpecified() {
        return localPSubtotalDiscountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_Discount
     */
    public com.micros_hosting.egateway.SimphonyPosApi_Discount getPSubtotalDiscount() {
        return localPSubtotalDiscount;
    }

    /**
     * Auto generated setter method
     *
     * @param param PSubtotalDiscount
     */
    public void setPSubtotalDiscount(
            com.micros_hosting.egateway.SimphonyPosApi_Discount param) {
        localPSubtotalDiscountTracker = param != null;

        this.localPSubtotalDiscount = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getRevenueCenter() {
        return localRevenueCenter;
    }

    /**
     * Auto generated setter method
     *
     * @param param RevenueCenter
     */
    public void setRevenueCenter(int param) {
        this.localRevenueCenter = param;
    }

    /**
     * Auto generated getter method
     *
     * @return short
     */
    public short getOrderType() {
        return localOrderType;
    }

    /**
     * Auto generated setter method
     *
     * @param param OrderType
     */
    public void setOrderType(short param) {
        this.localOrderType = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getEmployeeNumber() {
        return localEmployeeNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param EmployeeNumber
     */
    public void setEmployeeNumber(int param) {
        this.localEmployeeNumber = param;
    }

    public boolean isPTotalsResponseSpecified() {
        return localPTotalsResponseTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_TotalsResponse
     */
    public com.micros_hosting.egateway.SimphonyPosApi_TotalsResponse getPTotalsResponse() {
        return localPTotalsResponse;
    }

    /**
     * Auto generated setter method
     *
     * @param param PTotalsResponse
     */
    public void setPTotalsResponse(
            com.micros_hosting.egateway.SimphonyPosApi_TotalsResponse param) {
        localPTotalsResponseTracker = param != null;

        this.localPTotalsResponse = param;
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
                this, MY_QNAME));
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
                        namespacePrefix + ":CalculateTransactionTotals", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "CalculateTransactionTotals", xmlWriter);
            }
        }

        if (localVendorCodeTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "vendorCode", xmlWriter);

            if (localVendorCode == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "vendorCode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localVendorCode);
            }

            xmlWriter.writeEndElement();
        }

        if (localPpMenuItemsTracker) {
            if (localPpMenuItems == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ppMenuItems cannot be null!!");
            }

            localPpMenuItems.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "ppMenuItems"),
                    xmlWriter);
        }

        if (localPpComboMealsTracker) {
            if (localPpComboMeals == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ppComboMeals cannot be null!!");
            }

            localPpComboMeals.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "ppComboMeals"),
                    xmlWriter);
        }

        if (localPSvcChargeTracker) {
            if (localPSvcCharge == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pSvcCharge cannot be null!!");
            }

            localPSvcCharge.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "pSvcCharge"),
                    xmlWriter);
        }

        if (localPSubtotalDiscountTracker) {
            if (localPSubtotalDiscount == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pSubtotalDiscount cannot be null!!");
            }

            localPSubtotalDiscount.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "pSubtotalDiscount"),
                    xmlWriter);
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "revenueCenter", xmlWriter);

        if (localRevenueCenter == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "revenueCenter cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localRevenueCenter));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "orderType", xmlWriter);

        if (localOrderType == java.lang.Short.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "orderType cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localOrderType));
        }

        xmlWriter.writeEndElement();

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "employeeNumber", xmlWriter);

        if (localEmployeeNumber == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "employeeNumber cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localEmployeeNumber));
        }

        xmlWriter.writeEndElement();

        if (localPTotalsResponseTracker) {
            if (localPTotalsResponse == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pTotalsResponse cannot be null!!");
            }

            localPTotalsResponse.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "pTotalsResponse"),
                    xmlWriter);
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
        public static CalculateTransactionTotals parse(
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            CalculateTransactionTotals object = new CalculateTransactionTotals();

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

                        if (!"CalculateTransactionTotals".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (CalculateTransactionTotals) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
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
                                "http://micros-hosting.com/EGateway/", "vendorCode").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "vendorCode" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVendorCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "ppMenuItems").equals(
                                reader.getName())) {
                    object.setPpMenuItems(com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem.Factory.parse(
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
                                "ppComboMeals").equals(reader.getName())) {
                    object.setPpComboMeals(com.micros_hosting.egateway.ArrayOfSimphonyPosApi_ComboMeal.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "pSvcCharge").equals(
                                reader.getName())) {
                    object.setPSvcCharge(com.micros_hosting.egateway.SimphonyPosApi_SvcCharge.Factory.parse(
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
                                "pSubtotalDiscount").equals(reader.getName())) {
                    object.setPSubtotalDiscount(com.micros_hosting.egateway.SimphonyPosApi_Discount.Factory.parse(
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
                                "revenueCenter").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "revenueCenter" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRevenueCenter(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "http://micros-hosting.com/EGateway/", "orderType").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "orderType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOrderType(org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(
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
                                "employeeNumber").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "employeeNumber" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEmployeeNumber(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "pTotalsResponse").equals(reader.getName())) {
                    object.setPTotalsResponse(com.micros_hosting.egateway.SimphonyPosApi_TotalsResponse.Factory.parse(
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
