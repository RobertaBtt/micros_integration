/**
 * AddToExistingCheckExResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.micros_hosting.egateway;


/**
 * AddToExistingCheckExResponse bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class AddToExistingCheckExResponse implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://micros-hosting.com/EGateway/",
            "AddToExistingCheckExResponse", "");

    /**
     * field for PGuestCheck
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_GuestCheck localPGuestCheck;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPGuestCheckTracker = false;

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
     * field for PServiceChg
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_SvcCharge localPServiceChg;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPServiceChgTracker = false;

    /**
     * field for PSubTotalDiscount
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_Discount localPSubTotalDiscount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPSubTotalDiscountTracker = false;

    /**
     * field for PTmedDetail
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_TmedDetailItemEx localPTmedDetail;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPTmedDetailTracker = false;

    /**
     * field for PTotalsResponse
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_TotalsResponse localPTotalsResponse;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPTotalsResponseTracker = false;

    /**
     * field for PpCheckPrintLines
     */
    protected com.micros_hosting.egateway.ArrayOfString localPpCheckPrintLines;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPpCheckPrintLinesTracker = false;

    /**
     * field for PpVoucherOutput
     */
    protected com.micros_hosting.egateway.ArrayOfString localPpVoucherOutput;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPpVoucherOutputTracker = false;

    public boolean isPGuestCheckSpecified() {
        return localPGuestCheckTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_GuestCheck
     */
    public com.micros_hosting.egateway.SimphonyPosApi_GuestCheck getPGuestCheck() {
        return localPGuestCheck;
    }

    /**
     * Auto generated setter method
     *
     * @param param PGuestCheck
     */
    public void setPGuestCheck(
            com.micros_hosting.egateway.SimphonyPosApi_GuestCheck param) {
        localPGuestCheckTracker = param != null;

        this.localPGuestCheck = param;
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

    public boolean isPServiceChgSpecified() {
        return localPServiceChgTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_SvcCharge
     */
    public com.micros_hosting.egateway.SimphonyPosApi_SvcCharge getPServiceChg() {
        return localPServiceChg;
    }

    /**
     * Auto generated setter method
     *
     * @param param PServiceChg
     */
    public void setPServiceChg(
            com.micros_hosting.egateway.SimphonyPosApi_SvcCharge param) {
        localPServiceChgTracker = param != null;

        this.localPServiceChg = param;
    }

    public boolean isPSubTotalDiscountSpecified() {
        return localPSubTotalDiscountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_Discount
     */
    public com.micros_hosting.egateway.SimphonyPosApi_Discount getPSubTotalDiscount() {
        return localPSubTotalDiscount;
    }

    /**
     * Auto generated setter method
     *
     * @param param PSubTotalDiscount
     */
    public void setPSubTotalDiscount(
            com.micros_hosting.egateway.SimphonyPosApi_Discount param) {
        localPSubTotalDiscountTracker = param != null;

        this.localPSubTotalDiscount = param;
    }

    public boolean isPTmedDetailSpecified() {
        return localPTmedDetailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_TmedDetailItemEx
     */
    public com.micros_hosting.egateway.SimphonyPosApi_TmedDetailItemEx getPTmedDetail() {
        return localPTmedDetail;
    }

    /**
     * Auto generated setter method
     *
     * @param param PTmedDetail
     */
    public void setPTmedDetail(
            com.micros_hosting.egateway.SimphonyPosApi_TmedDetailItemEx param) {
        localPTmedDetailTracker = param != null;

        this.localPTmedDetail = param;
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

    public boolean isPpCheckPrintLinesSpecified() {
        return localPpCheckPrintLinesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.ArrayOfString
     */
    public com.micros_hosting.egateway.ArrayOfString getPpCheckPrintLines() {
        return localPpCheckPrintLines;
    }

    /**
     * Auto generated setter method
     *
     * @param param PpCheckPrintLines
     */
    public void setPpCheckPrintLines(
            com.micros_hosting.egateway.ArrayOfString param) {
        localPpCheckPrintLinesTracker = param != null;

        this.localPpCheckPrintLines = param;
    }

    public boolean isPpVoucherOutputSpecified() {
        return localPpVoucherOutputTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.ArrayOfString
     */
    public com.micros_hosting.egateway.ArrayOfString getPpVoucherOutput() {
        return localPpVoucherOutput;
    }

    /**
     * Auto generated setter method
     *
     * @param param PpVoucherOutput
     */
    public void setPpVoucherOutput(
            com.micros_hosting.egateway.ArrayOfString param) {
        localPpVoucherOutputTracker = param != null;

        this.localPpVoucherOutput = param;
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
                        namespacePrefix + ":AddToExistingCheckExResponse", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "AddToExistingCheckExResponse", xmlWriter);
            }
        }

        if (localPGuestCheckTracker) {
            if (localPGuestCheck == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pGuestCheck cannot be null!!");
            }

            localPGuestCheck.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "pGuestCheck"),
                    xmlWriter);
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

        // TODO: Also here, changed from pServiceChg, to pSvcCharge
        if (localPServiceChgTracker) {
            if (localPServiceChg == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pSvcCharge cannot be null!!");
            }

            localPServiceChg.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "pSvcCharge"),
                    xmlWriter);
        }

        if (localPSubTotalDiscountTracker) {
            if (localPSubTotalDiscount == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pSubTotalDiscount cannot be null!!");
            }

            localPSubTotalDiscount.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "pSubTotalDiscount"),
                    xmlWriter);
        }

        if (localPTmedDetailTracker) {
            if (localPTmedDetail == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pTmedDetail cannot be null!!");
            }

            localPTmedDetail.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "pTmedDetail"),
                    xmlWriter);
        }

        if (localPTotalsResponseTracker) {
            if (localPTotalsResponse == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "pTotalsResponse cannot be null!!");
            }

            localPTotalsResponse.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "pTotalsResponse"),
                    xmlWriter);
        }

        if (localPpCheckPrintLinesTracker) {
            if (localPpCheckPrintLines == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ppCheckPrintLines cannot be null!!");
            }

            localPpCheckPrintLines.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "ppCheckPrintLines"),
                    xmlWriter);
        }

        if (localPpVoucherOutputTracker) {
            if (localPpVoucherOutput == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ppVoucherOutput cannot be null!!");
            }

            localPpVoucherOutput.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "ppVoucherOutput"),
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
        public static AddToExistingCheckExResponse parse(
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AddToExistingCheckExResponse object = new AddToExistingCheckExResponse();

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

                        if (!"AddToExistingCheckExResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (AddToExistingCheckExResponse) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
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
                                "http://micros-hosting.com/EGateway/", "pGuestCheck").equals(
                                reader.getName())) {
                    object.setPGuestCheck(com.micros_hosting.egateway.SimphonyPosApi_GuestCheck.Factory.parse(
                            reader));

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

                //TODO:  PAY Attentio, before was pServiceChg, now is pSvcCharge
                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "pSvcCharge").equals(
                                reader.getName())) {
                    object.setPServiceChg(com.micros_hosting.egateway.SimphonyPosApi_SvcCharge.Factory.parse(
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
                                "pSubTotalDiscount").equals(reader.getName())) {
                    object.setPSubTotalDiscount(com.micros_hosting.egateway.SimphonyPosApi_Discount.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                                "http://micros-hosting.com/EGateway/", "pTmedDetail").equals(
                                reader.getName())) {
                    object.setPTmedDetail(com.micros_hosting.egateway.SimphonyPosApi_TmedDetailItemEx.Factory.parse(
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
                                "pTotalsResponse").equals(reader.getName())) {
                    object.setPTotalsResponse(com.micros_hosting.egateway.SimphonyPosApi_TotalsResponse.Factory.parse(
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
                                "ppCheckPrintLines").equals(reader.getName())) {
                    object.setPpCheckPrintLines(com.micros_hosting.egateway.ArrayOfString.Factory.parse(
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
                                "ppVoucherOutput").equals(reader.getName())) {
                    object.setPpVoucherOutput(com.micros_hosting.egateway.ArrayOfString.Factory.parse(
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
