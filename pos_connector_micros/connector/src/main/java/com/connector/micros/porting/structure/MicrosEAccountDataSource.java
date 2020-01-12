/**
 * EAccountDataSource.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.connector.micros.porting.structure;


import com.micros_hosting.egateway.EAccountDataSource;
import org.apache.axis2.databinding.ADBException;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * EAccountDataSource bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class MicrosEAccountDataSource extends EAccountDataSource {

    private static java.util.HashMap _table_ = new java.util.HashMap();

    public static final java.lang.String _SOURCE_UNDEFINED = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SOURCE_UNDEFINED");
    public static final java.lang.String _MAGNETIC_STRIPE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MAGNETIC_STRIPE");
    public static final java.lang.String _RFID_TRACK_DATA_RULES = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RFID_TRACK_DATA_RULES");
    public static final java.lang.String _RFID_M_CHIP_RULES = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RFID_M_CHIP_RULES");
    public static final java.lang.String _MANUALLY_KEYED_TRACK_1_CAPABLE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MANUALLY_KEYED_TRACK_1_CAPABLE");
    public static final java.lang.String _MANUALLY_KEYED_TRACK_2_CAPABLE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MANUALLY_KEYED_TRACK_2_CAPABLE");
    public static final java.lang.String _MANUALLY_KEYED_NO_CARD_READER = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MANUALLY_KEYED_NO_CARD_READER");
    public static final EAccountDataSource SOURCE_UNDEFINED = new MicrosEAccountDataSource(_SOURCE_UNDEFINED,
            true);
    public static final EAccountDataSource MAGNETIC_STRIPE = new MicrosEAccountDataSource(_MAGNETIC_STRIPE,
            true);
    public static final EAccountDataSource RFID_TRACK_DATA_RULES = new MicrosEAccountDataSource(_RFID_TRACK_DATA_RULES,
            true);
    public static final EAccountDataSource RFID_M_CHIP_RULES = new MicrosEAccountDataSource(_RFID_M_CHIP_RULES,
            true);
    public static final EAccountDataSource MANUALLY_KEYED_TRACK_1_CAPABLE = new MicrosEAccountDataSource(_MANUALLY_KEYED_TRACK_1_CAPABLE,
            true);
    public static final EAccountDataSource MANUALLY_KEYED_TRACK_2_CAPABLE = new MicrosEAccountDataSource(_MANUALLY_KEYED_TRACK_2_CAPABLE,
            true);
    public static final EAccountDataSource MANUALLY_KEYED_NO_CARD_READER = new MicrosEAccountDataSource(_MANUALLY_KEYED_NO_CARD_READER,
            true);

    private static String namespaceUri;

    public void setNamespace(String namespaceUri) {
        this.namespaceUri = namespaceUri;

    }

    protected MicrosEAccountDataSource(String value, boolean isRegisterValue) {
        super(value, isRegisterValue);
    }

    public void serialize(final QName parentQName, XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        //We can safely assume an element has only one type associated with it
        String prefix = null;
        String namespace = null;

        namespace = "";

        String _localName = parentQName.getLocalPart();

        writeStartElement(null, namespace, _localName, xmlWriter);

        // add the type details if this is used in a simple type
        if (serializeType) {
            String namespacePrefix = registerPrefix(xmlWriter, namespaceUri);

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":EAccountDataSource", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "EAccountDataSource", xmlWriter);
            }
        }

        if (localEAccountDataSource == null) {
            throw new ADBException(
                    "EAccountDataSource cannot be null !!");
        } else {
            xmlWriter.writeCharacters(localEAccountDataSource);
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
    public static class Factory extends EAccountDataSource.Factory {

        public static MicrosEAccountDataSource fromValue(java.lang.String value)
                throws java.lang.IllegalArgumentException {

            MicrosEAccountDataSource enumeration = (MicrosEAccountDataSource) _table_.get(value);

            // handle unexpected enumeration values properly
            if (enumeration == null) {
                throw new java.lang.IllegalArgumentException();
            }

            return enumeration;
        }

        public static MicrosEAccountDataSource fromString(java.lang.String value,
                                                          java.lang.String namespaceURI)
                throws java.lang.IllegalArgumentException {
            try {
                return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        value));
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException();
            }
        }

        public static MicrosEAccountDataSource fromString(
                javax.xml.stream.XMLStreamReader xmlStreamReader,
                java.lang.String content) {
            if (content.indexOf(":") > -1) {
                java.lang.String prefix = content.substring(0,
                        content.indexOf(":"));
                java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext()
                        .getNamespaceURI(prefix);

                return MicrosEAccountDataSource.Factory.fromString(content, namespaceUri);
            } else {
                return MicrosEAccountDataSource.Factory.fromString(content, "");
            }
        }


        public static MicrosEAccountDataSource parse(XMLStreamReader reader, String namespaceUri) throws Exception {

            MicrosEAccountDataSource object = null;

            // initialize a hash map to keep values
            java.util.Map attributeMap = new java.util.HashMap();
            java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

            int event;
            javax.xml.namespace.QName currentQName = null;
            String nillableValue = null;
            String prefix = "";
            String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "EAccountDataSource" +
                                            "  cannot be null");
                        }

                        String content = reader.getElementText();

                        if (content.indexOf(":") > 0) {
                            // this seems to be a Qname so find the namespace and send
                            prefix = content.substring(0, content.indexOf(":"));
                            namespaceuri = reader.getNamespaceURI(prefix);
                            object = MicrosEAccountDataSource.Factory.fromString(content,
                                    namespaceuri);
                        } else {
                            // this seems to be not a qname send and empty namespace incase of it is
                            // check is done in fromString method
                            object = MicrosEAccountDataSource.Factory.fromString(content,
                                    "");
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new Exception(e);
            }

            return object;
        }
    } //end of factory class
}
