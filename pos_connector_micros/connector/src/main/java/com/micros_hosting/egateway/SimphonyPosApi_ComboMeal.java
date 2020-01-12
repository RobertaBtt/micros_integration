/**
 * SimphonyPosApi_ComboMeal.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.micros_hosting.egateway;


/**
 * SimphonyPosApi_ComboMeal bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class SimphonyPosApi_ComboMeal implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of dbName that had
       name = SimphonyPosApi_ComboMeal
       Namespace URI = http://micros-hosting.com/EGateway/
       Namespace Prefix =
     */

    /**
     * field for ComboMealMainItem
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_MenuItem localComboMealMainItem;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localComboMealMainItemTracker = false;

    /**
     * field for ComboMealMenuItem
     */
    protected com.micros_hosting.egateway.SimphonyPosApi_MenuItem localComboMealMenuItem;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localComboMealMenuItemTracker = false;

    /**
     * field for ComboMealObjectNum
     */
    protected int localComboMealObjectNum;

    /**
     * field for SideItems
     */
    protected com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem localSideItems;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSideItemsTracker = false;

    public boolean isComboMealMainItemSpecified() {
        return localComboMealMainItemTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_MenuItem
     */
    public com.micros_hosting.egateway.SimphonyPosApi_MenuItem getComboMealMainItem() {
        return localComboMealMainItem;
    }

    /**
     * Auto generated setter method
     *
     * @param param ComboMealMainItem
     */
    public void setComboMealMainItem(
            com.micros_hosting.egateway.SimphonyPosApi_MenuItem param) {
        localComboMealMainItemTracker = param != null;

        this.localComboMealMainItem = param;
    }

    public boolean isComboMealMenuItemSpecified() {
        return localComboMealMenuItemTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.SimphonyPosApi_MenuItem
     */
    public com.micros_hosting.egateway.SimphonyPosApi_MenuItem getComboMealMenuItem() {
        return localComboMealMenuItem;
    }

    /**
     * Auto generated setter method
     *
     * @param param ComboMealMenuItem
     */
    public void setComboMealMenuItem(
            com.micros_hosting.egateway.SimphonyPosApi_MenuItem param) {
        localComboMealMenuItemTracker = param != null;

        this.localComboMealMenuItem = param;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getComboMealObjectNum() {
        return localComboMealObjectNum;
    }

    /**
     * Auto generated setter method
     *
     * @param param ComboMealObjectNum
     */
    public void setComboMealObjectNum(int param) {
        this.localComboMealObjectNum = param;
    }

    public boolean isSideItemsSpecified() {
        return localSideItemsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem
     */
    public com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem getSideItems() {
        return localSideItems;
    }

    /**
     * Auto generated setter method
     *
     * @param param SideItems
     */
    public void setSideItems(
            com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem param) {
        localSideItemsTracker = param != null;

        this.localSideItems = param;
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
                        namespacePrefix + ":SimphonyPosApi_ComboMeal", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SimphonyPosApi_ComboMeal", xmlWriter);
            }
        }

        if (localComboMealMainItemTracker) {
            if (localComboMealMainItem == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ComboMealMainItem cannot be null!!");
            }

            localComboMealMainItem.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "ComboMealMainItem"),
                    xmlWriter);
        }

        if (localComboMealMenuItemTracker) {
            if (localComboMealMenuItem == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "ComboMealMenuItem cannot be null!!");
            }

            localComboMealMenuItem.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "ComboMealMenuItem"),
                    xmlWriter);
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "ComboMealObjectNum", xmlWriter);

        if (localComboMealObjectNum == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "ComboMealObjectNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localComboMealObjectNum));
        }

        xmlWriter.writeEndElement();

        if (localSideItemsTracker) {
            if (localSideItems == null) {
                throw new org.apache.axis2.databinding.ADBException(
                        "SideItems cannot be null!!");
            }

            localSideItems.serialize(new javax.xml.namespace.QName(
                            "http://micros-hosting.com/EGateway/", "SideItems"),
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
        public static SimphonyPosApi_ComboMeal parse(
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SimphonyPosApi_ComboMeal object = new SimphonyPosApi_ComboMeal();

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

                        if (!"SimphonyPosApi_ComboMeal".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (SimphonyPosApi_ComboMeal) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
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
                                "ComboMealMainItem").equals(reader.getName())) {
                    object.setComboMealMainItem(com.micros_hosting.egateway.SimphonyPosApi_MenuItem.Factory.parse(
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
                                "ComboMealMenuItem").equals(reader.getName())) {
                    object.setComboMealMenuItem(com.micros_hosting.egateway.SimphonyPosApi_MenuItem.Factory.parse(
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
                                "ComboMealObjectNum").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "ComboMealObjectNum" +
                                        "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setComboMealObjectNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                                "http://micros-hosting.com/EGateway/", "SideItems").equals(
                                reader.getName())) {
                    object.setSideItems(com.micros_hosting.egateway.ArrayOfSimphonyPosApi_MenuItem.Factory.parse(
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
