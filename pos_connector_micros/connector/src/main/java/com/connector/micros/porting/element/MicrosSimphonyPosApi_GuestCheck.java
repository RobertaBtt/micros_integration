/**
 * SimphonyPosApi_GuestCheck.java
 */
package com.connector.micros.porting.element;


import com.micros_hosting.egateway.SimphonyPosApi_GuestCheck;
import org.apache.axis2.databinding.ADBException;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;

@SuppressWarnings({"unchecked",
        "unused"
})
public class MicrosSimphonyPosApi_GuestCheck extends SimphonyPosApi_GuestCheck {

    //private static String namespaceUriServer;
    private static String namespaceUri;
    //private static String targetEndPoint;

    public MicrosSimphonyPosApi_GuestCheck(String namespaceUri) {
        this.namespaceUri = namespaceUri;
        //this.targetEndPoint = targetEndPoint;
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        String prefix = null;
        String namespace = null;

        //prefix = parentQName.getPrefix();
        namespace = "";
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

        if (serializeType) {
            String namespacePrefix = registerPrefix(xmlWriter, namespaceUri);

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
                throw new ADBException(
                        "OperationalResult cannot be null!!");
            }

            localOperationalResult.serialize(new QName(namespaceUri, "OperationalResult", ""),
                    xmlWriter);
        }

        namespace = "";
        writeStartElement(null, namespace, "CheckDateToFire", xmlWriter);

        if (localCheckDateToFire == null) {
            // write the nil attribute
            throw new ADBException(
                    "CheckDateToFire cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckDateToFire));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "CheckEmployeeObjectNum", xmlWriter);

        if (localCheckEmployeeObjectNum == Integer.MIN_VALUE) {
            throw new ADBException(
                    "CheckEmployeeObjectNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckEmployeeObjectNum));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "CheckGuestCount", xmlWriter);

        if (localCheckGuestCount == Integer.MIN_VALUE) {
            throw new ADBException(
                    "CheckGuestCount cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckGuestCount));
        }

        xmlWriter.writeEndElement();

        if (localCheckIDTracker) {
            namespace = "";
            writeStartElement(null, namespace, "CheckID", xmlWriter);

            if (localCheckID == null) {
                // write the nil attribute
                throw new ADBException(
                        "CheckID cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCheckID);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "CheckNum", xmlWriter);

        if (localCheckNum == Integer.MIN_VALUE) {
            throw new ADBException(
                    "CheckNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckNum));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "CheckOrderType", xmlWriter);

        if (localCheckOrderType == Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "CheckOrderType cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckOrderType));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "CheckRevenueCenterID", xmlWriter);

        if (localCheckRevenueCenterID == Long.MIN_VALUE) {
            throw new ADBException(
                    "CheckRevenueCenterID cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckRevenueCenterID));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "CheckSeq", xmlWriter);

        if (localCheckSeq == Integer.MIN_VALUE) {
            throw new ADBException(
                    "CheckSeq cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckSeq));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "CheckStatusBits", xmlWriter);

        if (localCheckStatusBits == Integer.MIN_VALUE) {
            throw new ADBException(
                    "CheckStatusBits cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckStatusBits));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "CheckTableObjectNum", xmlWriter);

        if (localCheckTableObjectNum == Integer.MIN_VALUE) {
            throw new ADBException(
                    "CheckTableObjectNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCheckTableObjectNum));
        }

        xmlWriter.writeEndElement();


        if (localPCheckInfoLinesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "PCheckInfoLines", xmlWriter);
            if (localPCheckInfoLines == null) {
                throw new ADBException(
                        "PCheckInfoLines cannot be null!!");
            }

            localPCheckInfoLines.serialize(new javax.xml.namespace.QName(namespaceUri, "PCheckInfoLines", ""),
                    xmlWriter);

            xmlWriter.writeEndElement();
        }


        if (localPPrintJobIdsTracker) {
            if (localPPrintJobIds == null) {
                throw new ADBException(
                        "PPrintJobIds cannot be null!!");
            }

            localPPrintJobIds.serialize(new QName(namespaceUri, "PPrintJobIds", ""),
                    xmlWriter);
        }

        namespace = "";
        writeStartElement(null, namespace, "EventObjectNum", xmlWriter);

        if (localEventObjectNum == Integer.MIN_VALUE) {
            throw new ADBException(
                    "EventObjectNum cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localEventObjectNum));
        }

        xmlWriter.writeEndElement();

        xmlWriter.writeEndElement();
    }

    //robyb
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
    public static class Factory extends SimphonyPosApi_GuestCheck.Factory {


        public static MicrosSimphonyPosApi_GuestCheck microsParse(XMLStreamReader reader,
                                                                  String namespaceUri) throws Exception {
            MicrosSimphonyPosApi_GuestCheck object = new MicrosSimphonyPosApi_GuestCheck(namespaceUri);

            int event;
            javax.xml.namespace.QName currentQName = null;
            String nillableValue = null;
            String prefix = "";
            //String namespaceuri = "";

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

                        if (!"SimphonyPosApi_GuestCheck".equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (MicrosSimphonyPosApi_GuestCheck) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
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
                        new QName(namespaceUri, "OperationalResult", "").equals(reader.getName())) {
                    object.setOperationalResult(com.micros_hosting.egateway.SimphonyPosApi_OperationalResult.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckDateToFire", "").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckDateToFire" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckDateToFire(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckEmployeeObjectNum", "").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckEmployeeObjectNum" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckEmployeeObjectNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckGuestCount", "").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CheckGuestCount" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckGuestCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckID", "").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckID" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckNum", "").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckNum" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckOrderType", "").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckOrderType" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckOrderType(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckRevenueCenterID", "").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckRevenueCenterID" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckRevenueCenterID(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckSeq", "").equals(
                                reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckSeq" + "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckSeq(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckStatusBits", "").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckStatusBits" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckStatusBits(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "CheckTableObjectNum", "").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "CheckTableObjectNum" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setCheckTableObjectNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "EventObjectNum", "").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new ADBException(
                                "The element: " + "EventObjectNum" +
                                        "  cannot be null");
                    }

                    String content = reader.getElementText();

                    object.setEventObjectNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new ADBException(
                            "Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "PCheckInfoLines", "").equals(reader.getName())) {
                    object.setPCheckInfoLines(com.micros_hosting.egateway.ArrayOfString.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new QName(namespaceUri, "PPrintJobIds", "").equals(reader.getName())) {
                    object.setPPrintJobIds(com.micros_hosting.egateway.ArrayOfInt.Factory.parse(
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
                throw new Exception(e);
            }

            return object;
        }
    } //end of factory class
}
