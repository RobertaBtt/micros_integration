/**
 * SimphonyPosApi_EPayment.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.micros_hosting.egateway;


/**
 * SimphonyPosApi_EPayment bean class
 */
@SuppressWarnings({"unchecked",
        "unused"
})
public class SimphonyPosApi_EPayment implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of dbName that had
       name = SimphonyPosApi_EPayment
       Namespace URI = http://micros-hosting.com/EGateway/
       Namespace Prefix =
     */

    /**
     * field for AccountDataSource
     */
    protected com.micros_hosting.egateway.EAccountDataSource localAccountDataSource;

    /**
     * field for AccountType
     */
    protected com.micros_hosting.egateway.EAccountType localAccountType;

    /**
     * field for AcctNumber
     */
    protected java.lang.String localAcctNumber;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAcctNumberTracker = false;

    /**
     * field for AddressVerification
     */
    protected java.lang.String localAddressVerification;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAddressVerificationTracker = false;

    /**
     * field for AuthorizationCode
     */
    protected java.lang.String localAuthorizationCode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuthorizationCodeTracker = false;

    /**
     * field for BaseAmount
     */
    protected java.lang.String localBaseAmount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBaseAmountTracker = false;

    /**
     * field for CashBackAmount
     */
    protected java.lang.String localCashBackAmount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCashBackAmountTracker = false;

    /**
     * field for CVVNumber
     */
    protected java.lang.String localCVVNumber;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCVVNumberTracker = false;

    /**
     * field for DeviceId
     */
    protected java.lang.String localDeviceId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDeviceIdTracker = false;

    /**
     * field for ExpirationDate
     */
    protected java.util.Calendar localExpirationDate;

    /**
     * field for InterfaceName
     */
    protected java.lang.String localInterfaceName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInterfaceNameTracker = false;

    /**
     * field for IssueNumber
     */
    protected short localIssueNumber;

    /**
     * field for KeySerialNum
     */
    protected java.lang.String localKeySerialNum;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localKeySerialNumTracker = false;

    /**
     * field for PaymentCommand
     */
    protected com.micros_hosting.egateway.EPaymentDirective localPaymentCommand;

    /**
     * field for PinBlock
     */
    protected java.lang.String localPinBlock;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPinBlockTracker = false;

    /**
     * field for StartDate
     */
    protected java.util.Calendar localStartDate;

    /**
     * field for SvcAccountType
     */
    protected java.lang.String localSvcAccountType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSvcAccountTypeTracker = false;

    /**
     * field for SvcResponse
     */
    protected java.lang.String localSvcResponse;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSvcResponseTracker = false;

    /**
     * field for TipAmount
     */
    protected java.lang.String localTipAmount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTipAmountTracker = false;

    /**
     * field for Track1Data
     */
    protected java.lang.String localTrack1Data;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTrack1DataTracker = false;

    /**
     * field for Track2Data
     */
    protected java.lang.String localTrack2Data;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTrack2DataTracker = false;

    /**
     * field for Track3Data
     */
    protected java.lang.String localTrack3Data;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTrack3DataTracker = false;

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.EAccountDataSource
     */
    public com.micros_hosting.egateway.EAccountDataSource getAccountDataSource() {
        return localAccountDataSource;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccountDataSource
     */
    public void setAccountDataSource(
            com.micros_hosting.egateway.EAccountDataSource param) {
        this.localAccountDataSource = param;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.EAccountType
     */
    public com.micros_hosting.egateway.EAccountType getAccountType() {
        return localAccountType;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccountType
     */
    public void setAccountType(com.micros_hosting.egateway.EAccountType param) {
        this.localAccountType = param;
    }

    public boolean isAcctNumberSpecified() {
        return localAcctNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAcctNumber() {
        return localAcctNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param AcctNumber
     */
    public void setAcctNumber(java.lang.String param) {
        localAcctNumberTracker = param != null;

        this.localAcctNumber = param;
    }

    public boolean isAddressVerificationSpecified() {
        return localAddressVerificationTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAddressVerification() {
        return localAddressVerification;
    }

    /**
     * Auto generated setter method
     *
     * @param param AddressVerification
     */
    public void setAddressVerification(java.lang.String param) {
        localAddressVerificationTracker = param != null;

        this.localAddressVerification = param;
    }

    public boolean isAuthorizationCodeSpecified() {
        return localAuthorizationCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuthorizationCode() {
        return localAuthorizationCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param AuthorizationCode
     */
    public void setAuthorizationCode(java.lang.String param) {
        localAuthorizationCodeTracker = param != null;

        this.localAuthorizationCode = param;
    }

    public boolean isBaseAmountSpecified() {
        return localBaseAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBaseAmount() {
        return localBaseAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param BaseAmount
     */
    public void setBaseAmount(java.lang.String param) {
        localBaseAmountTracker = param != null;

        this.localBaseAmount = param;
    }

    public boolean isCashBackAmountSpecified() {
        return localCashBackAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCashBackAmount() {
        return localCashBackAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param CashBackAmount
     */
    public void setCashBackAmount(java.lang.String param) {
        localCashBackAmountTracker = param != null;

        this.localCashBackAmount = param;
    }

    public boolean isCVVNumberSpecified() {
        return localCVVNumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCVVNumber() {
        return localCVVNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param CVVNumber
     */
    public void setCVVNumber(java.lang.String param) {
        localCVVNumberTracker = param != null;

        this.localCVVNumber = param;
    }

    public boolean isDeviceIdSpecified() {
        return localDeviceIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDeviceId() {
        return localDeviceId;
    }

    /**
     * Auto generated setter method
     *
     * @param param DeviceId
     */
    public void setDeviceId(java.lang.String param) {
        localDeviceIdTracker = param != null;

        this.localDeviceId = param;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getExpirationDate() {
        return localExpirationDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExpirationDate
     */
    public void setExpirationDate(java.util.Calendar param) {
        this.localExpirationDate = param;
    }

    public boolean isInterfaceNameSpecified() {
        return localInterfaceNameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getInterfaceName() {
        return localInterfaceName;
    }

    /**
     * Auto generated setter method
     *
     * @param param InterfaceName
     */
    public void setInterfaceName(java.lang.String param) {
        localInterfaceNameTracker = param != null;

        this.localInterfaceName = param;
    }

    /**
     * Auto generated getter method
     *
     * @return short
     */
    public short getIssueNumber() {
        return localIssueNumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param IssueNumber
     */
    public void setIssueNumber(short param) {
        this.localIssueNumber = param;
    }

    public boolean isKeySerialNumSpecified() {
        return localKeySerialNumTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getKeySerialNum() {
        return localKeySerialNum;
    }

    /**
     * Auto generated setter method
     *
     * @param param KeySerialNum
     */
    public void setKeySerialNum(java.lang.String param) {
        localKeySerialNumTracker = param != null;

        this.localKeySerialNum = param;
    }

    /**
     * Auto generated getter method
     *
     * @return com.micros_hosting.egateway.EPaymentDirective
     */
    public com.micros_hosting.egateway.EPaymentDirective getPaymentCommand() {
        return localPaymentCommand;
    }

    /**
     * Auto generated setter method
     *
     * @param param PaymentCommand
     */
    public void setPaymentCommand(
            com.micros_hosting.egateway.EPaymentDirective param) {
        this.localPaymentCommand = param;
    }

    public boolean isPinBlockSpecified() {
        return localPinBlockTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPinBlock() {
        return localPinBlock;
    }

    /**
     * Auto generated setter method
     *
     * @param param PinBlock
     */
    public void setPinBlock(java.lang.String param) {
        localPinBlockTracker = param != null;

        this.localPinBlock = param;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getStartDate() {
        return localStartDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param StartDate
     */
    public void setStartDate(java.util.Calendar param) {
        this.localStartDate = param;
    }

    public boolean isSvcAccountTypeSpecified() {
        return localSvcAccountTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSvcAccountType() {
        return localSvcAccountType;
    }

    /**
     * Auto generated setter method
     *
     * @param param SvcAccountType
     */
    public void setSvcAccountType(java.lang.String param) {
        localSvcAccountTypeTracker = param != null;

        this.localSvcAccountType = param;
    }

    public boolean isSvcResponseSpecified() {
        return localSvcResponseTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSvcResponse() {
        return localSvcResponse;
    }

    /**
     * Auto generated setter method
     *
     * @param param SvcResponse
     */
    public void setSvcResponse(java.lang.String param) {
        localSvcResponseTracker = param != null;

        this.localSvcResponse = param;
    }

    public boolean isTipAmountSpecified() {
        return localTipAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTipAmount() {
        return localTipAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param TipAmount
     */
    public void setTipAmount(java.lang.String param) {
        localTipAmountTracker = param != null;

        this.localTipAmount = param;
    }

    public boolean isTrack1DataSpecified() {
        return localTrack1DataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTrack1Data() {
        return localTrack1Data;
    }

    /**
     * Auto generated setter method
     *
     * @param param Track1Data
     */
    public void setTrack1Data(java.lang.String param) {
        localTrack1DataTracker = param != null;

        this.localTrack1Data = param;
    }

    public boolean isTrack2DataSpecified() {
        return localTrack2DataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTrack2Data() {
        return localTrack2Data;
    }

    /**
     * Auto generated setter method
     *
     * @param param Track2Data
     */
    public void setTrack2Data(java.lang.String param) {
        localTrack2DataTracker = param != null;

        this.localTrack2Data = param;
    }

    public boolean isTrack3DataSpecified() {
        return localTrack3DataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTrack3Data() {
        return localTrack3Data;
    }

    /**
     * Auto generated setter method
     *
     * @param param Track3Data
     */
    public void setTrack3Data(java.lang.String param) {
        localTrack3DataTracker = param != null;

        this.localTrack3Data = param;
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
                        namespacePrefix + ":SimphonyPosApi_EPayment", xmlWriter);
            } else {
                writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SimphonyPosApi_EPayment", xmlWriter);
            }
        }

        if (localAccountDataSource == null) {
            throw new org.apache.axis2.databinding.ADBException(
                    "AccountDataSource cannot be null!!");
        }

        localAccountDataSource.serialize(new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "AccountDataSource"),
                xmlWriter);

        if (localAccountType == null) {
            throw new org.apache.axis2.databinding.ADBException(
                    "AccountType cannot be null!!");
        }

        localAccountType.serialize(new javax.xml.namespace.QName(
                "http://micros-hosting.com/EGateway/", "AccountType"), xmlWriter);

        if (localAcctNumberTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "AcctNumber", xmlWriter);

            if (localAcctNumber == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "AcctNumber cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAcctNumber);
            }

            xmlWriter.writeEndElement();
        }

        if (localAddressVerificationTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "AddressVerification", xmlWriter);

            if (localAddressVerification == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "AddressVerification cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAddressVerification);
            }

            xmlWriter.writeEndElement();
        }

        if (localAuthorizationCodeTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "AuthorizationCode", xmlWriter);

            if (localAuthorizationCode == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "AuthorizationCode cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAuthorizationCode);
            }

            xmlWriter.writeEndElement();
        }

        if (localBaseAmountTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "BaseAmount", xmlWriter);

            if (localBaseAmount == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "BaseAmount cannot be null!!");
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
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "CVVNumber", xmlWriter);

            if (localCVVNumber == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "CVVNumber cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCVVNumber);
            }

            xmlWriter.writeEndElement();
        }

        if (localDeviceIdTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "DeviceId", xmlWriter);

            if (localDeviceId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "DeviceId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDeviceId);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "ExpirationDate", xmlWriter);

        if (localExpirationDate == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                    "ExpirationDate cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localExpirationDate));
        }

        xmlWriter.writeEndElement();

        if (localInterfaceNameTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "InterfaceName", xmlWriter);

            if (localInterfaceName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "InterfaceName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localInterfaceName);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "IssueNumber", xmlWriter);

        if (localIssueNumber == java.lang.Short.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                    "IssueNumber cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localIssueNumber));
        }

        xmlWriter.writeEndElement();

        if (localKeySerialNumTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "KeySerialNum", xmlWriter);

            if (localKeySerialNum == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "KeySerialNum cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localKeySerialNum);
            }

            xmlWriter.writeEndElement();
        }

        if (localPaymentCommand == null) {
            throw new org.apache.axis2.databinding.ADBException(
                    "PaymentCommand cannot be null!!");
        }

        localPaymentCommand.serialize(new javax.xml.namespace.QName(
                        "http://micros-hosting.com/EGateway/", "PaymentCommand"),
                xmlWriter);

        if (localPinBlockTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
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

        namespace = "http://micros-hosting.com/EGateway/";
        writeStartElement(null, namespace, "StartDate", xmlWriter);

        if (localStartDate == null) {
            // write the nil attribute
            throw new org.apache.axis2.databinding.ADBException(
                    "StartDate cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localStartDate));
        }

        xmlWriter.writeEndElement();

        if (localSvcAccountTypeTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "SvcAccountType", xmlWriter);

            if (localSvcAccountType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "SvcAccountType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSvcAccountType);
            }

            xmlWriter.writeEndElement();
        }

        if (localSvcResponseTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "SvcResponse", xmlWriter);

            if (localSvcResponse == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "SvcResponse cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSvcResponse);
            }

            xmlWriter.writeEndElement();
        }

        if (localTipAmountTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "TipAmount", xmlWriter);

            if (localTipAmount == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "TipAmount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTipAmount);
            }

            xmlWriter.writeEndElement();
        }

        if (localTrack1DataTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "Track1Data", xmlWriter);

            if (localTrack1Data == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "Track1Data cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTrack1Data);
            }

            xmlWriter.writeEndElement();
        }

        if (localTrack2DataTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "Track2Data", xmlWriter);

            if (localTrack2Data == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "Track2Data cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTrack2Data);
            }

            xmlWriter.writeEndElement();
        }

        if (localTrack3DataTracker) {
            namespace = "http://micros-hosting.com/EGateway/";
            writeStartElement(null, namespace, "Track3Data", xmlWriter);

            if (localTrack3Data == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                        "Track3Data cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTrack3Data);
            }

            xmlWriter.writeEndElement();
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
        public static SimphonyPosApi_EPayment parse(
                javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SimphonyPosApi_EPayment object = new SimphonyPosApi_EPayment();

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

                        if (!"SimphonyPosApi_EPayment".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (SimphonyPosApi_EPayment) com.micros_hosting.egateway.ExtensionMapper.getTypeObject(nsUri,
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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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

                    java.lang.String content = reader.getElementText();

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
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
