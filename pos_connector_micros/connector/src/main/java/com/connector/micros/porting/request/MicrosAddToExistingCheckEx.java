package com.connector.micros.porting.request;

import com.connector.micros.porting.element.MicrosSimphonyPosApi_GuestCheck;
import com.micros_hosting.egateway.AddToExistingCheckEx;
import org.apache.axis2.databinding.ADBException;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 * AddToExistingCheckEx bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class MicrosAddToExistingCheckEx extends AddToExistingCheckEx {


    private static String namespaceUriServer;
    private static String namespaceUri;
    private static String targetEndPoint;
    private QName MY_QNAME;

    public QName getMY_QNAME() {
        return MY_QNAME;
    }


    public MicrosAddToExistingCheckEx(String namespaceUriServer, String namespaceUri, String targetEndPoint) {
        //super();
        this.namespaceUriServer = namespaceUriServer;
        this.namespaceUri = namespaceUri;
        this.targetEndPoint = targetEndPoint;
        this.MY_QNAME = new QName(namespaceUriServer, "AddToExistingCheckEx", "");
    }


    public void serialize(final QName parentQName, XMLStreamWriter xmlWriter, boolean serializeType)
            throws XMLStreamException, ADBException {
        String prefix = null;
        String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = "";

        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

        if (serializeType) {
            String namespacePrefix = registerPrefix(xmlWriter, namespaceUriServer);

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":AddToExistingCheckEx", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "AddToExistingCheckEx", xmlWriter);
            }
        }

        if (localVendorCodeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "vendorCode", xmlWriter);

            if (localVendorCode == null) {
                // write the nil attribute
                throw new ADBException(
                        "vendorCode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localVendorCode);
            }

            xmlWriter.writeEndElement();
        }
        namespace = "";
        if (localPGuestCheckTracker) {
            if (localPGuestCheck == null) {
                throw new ADBException(
                        "pGuestCheck cannot be null!!");
            }

            localPGuestCheck.serialize(new QName(namespaceUriServer, "pGuestCheck", ""),
                    xmlWriter);
        }

        if (localPpMenuItemsTracker) {
            if (localPpMenuItems == null) {
                throw new ADBException(
                        "ppMenuItems cannot be null!!");
            }

            localPpMenuItems.serialize(new QName(namespaceUriServer, "ppMenuItems", ""),
                    xmlWriter);
        }

        if (localPpComboMealsTracker) {
            if (localPpComboMeals == null) {
                throw new ADBException(
                        "ppComboMeals cannot be null!!");
            }

            localPpComboMeals.serialize(new QName(namespaceUriServer, "ppComboMeals", ""),
                    xmlWriter);
        }

        if (localPServiceChgTracker) {
            if (localPServiceChg == null) {
                throw new ADBException(
                        "pServiceChg cannot be null!!");
            }

            localPServiceChg.serialize(new QName(namespaceUriServer, "pServiceChg", ""),
                    xmlWriter);
        }

        if (localPSubTotalDiscountTracker) {
            if (localPSubTotalDiscount == null) {
                throw new ADBException(
                        "pSubTotalDiscount cannot be null!!");
            }

            localPSubTotalDiscount.serialize(new QName(namespaceUriServer, "pSubTotalDiscount", ""),
                    xmlWriter);
        }

        if (localPTmedDetailTracker) {
            if (localPTmedDetail == null) {
                throw new ADBException(
                        "pTmedDetail cannot be null!!");
            }

            localPTmedDetail.serialize(new QName(namespaceUriServer, "pTmedDetail", ""),
                    xmlWriter);
        }

        if (localPTotalsResponseTracker) {
            if (localPTotalsResponse == null) {
                throw new ADBException(
                        "pTotalsResponse cannot be null!!");
            }

            localPTotalsResponse.serialize(new QName(namespaceUriServer, "pTotalsResponse", ""),
                    xmlWriter);
        }

        if (localPpCheckPrintLinesTracker) {
            if (localPpCheckPrintLines == null) {
                throw new ADBException(
                        "ppCheckPrintLines cannot be null!!");
            }

            localPpCheckPrintLines.serialize(new QName(namespaceUriServer, "ppCheckPrintLines", ""),
                    xmlWriter);
        }

        if (localPpVoucherOutputTracker) {
            if (localPpVoucherOutput == null) {
                throw new ADBException(
                        "ppVoucherOutput cannot be null!!");
            }

            localPpVoucherOutput.serialize(new QName(namespaceUriServer, "ppVoucherOutput", ""),
                    xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
        if (namespace.equals(namespaceUriServer)) {
            return "";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(String prefix,
                                   String namespace, String localPart,
                                   XMLStreamWriter xmlWriter)
            throws XMLStreamException {
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
                                String attValue, XMLStreamWriter xmlWriter)
            throws XMLStreamException {
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
                                XMLStreamWriter xmlWriter)
            throws XMLStreamException {
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
                                     String attName, QName qname,
                                     XMLStreamWriter xmlWriter)
            throws XMLStreamException {
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
    private void writeQName(QName qname,
                            XMLStreamWriter xmlWriter)
            throws XMLStreamException {
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

    private void writeQNames(QName[] qnames,
                             XMLStreamWriter xmlWriter)
            throws XMLStreamException {
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
            XMLStreamWriter xmlWriter, String namespace)
            throws XMLStreamException {
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
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         * If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static AddToExistingCheckEx parse(
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AddToExistingCheckEx object = new AddToExistingCheckEx();

            int event;
            QName currentQName = null;
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

                        if (!"AddToExistingCheckEx".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (AddToExistingCheckEx) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
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
                        new QName(
                                namespaceuri, "vendorCode", "").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "vendorCode" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setVendorCode(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "pGuestCheck", "").equals(reader.getName())) {
                    object.setPGuestCheck(MicrosSimphonyPosApi_GuestCheck.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "ppMenuItems", "").equals(
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
                        new QName(namespaceUri,
                                "ppComboMeals", "").equals(reader.getName())) {
                    object.setPpComboMeals(com.micros_hosting.egateway.ArrayOfSimphonyPosApi_ComboMeal.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "pServiceChg", "").equals(
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
                        new QName(namespaceUri,
                                "pSubTotalDiscount", "").equals(reader.getName())) {
                    object.setPSubTotalDiscount(com.micros_hosting.egateway.SimphonyPosApi_Discount.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "pTmedDetail", "").equals(
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
                        new QName(namespaceUri,
                                "pTotalsResponse", "").equals(reader.getName())) {
                    object.setPTotalsResponse(com.micros_hosting.egateway.SimphonyPosApi_TotalsResponse.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri,
                                "ppCheckPrintLines", "").equals(reader.getName())) {
                    object.setPpCheckPrintLines(com.micros_hosting.egateway.ArrayOfString.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri,
                                "ppVoucherOutput", "").equals(reader.getName())) {
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
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
