package com.redhat.idaas.eventbuilder.pojos.financial;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class otherpayername {
    private String companyName;
    private String address;
    private String address2;
    private String city;
    private String stateID;
    private String zipCode;
    private String phoneNumber;
    private String claimType;
    private String npi;
    private String feeSchedule;
    private String payorId;
    private String payerID;
    private String clearingHouseName;
    private String clearingHouseID;
    private String clearingHouseReceiverQualifierID;
    private String clearingHouseReceiverQualifier;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateID() {
        return stateID;
    }

    public void setStateID(String stateID) {
        this.stateID = stateID;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

    public String getFeeSchedule() {
        return feeSchedule;
    }

    public void setFeeSchedule(String feeSchedule) {
        this.feeSchedule = feeSchedule;
    }

    public String getPayorId() {
        return payorId;
    }

    public void setPayorId(String payorId) {
        this.payorId = payorId;
    }

    public String getPayerID() {
        return payerID;
    }

    public void setPayerID(String payerID) {
        this.payerID = payerID;
    }

    public String getClearingHouseName() {
        return clearingHouseName;
    }

    public void setClearingHouseName(String clearingHouseName) {
        this.clearingHouseName = clearingHouseName;
    }

    public String getClearingHouseID() {
        return clearingHouseID;
    }

    public void setClearingHouseID(String clearingHouseID) {
        this.clearingHouseID = clearingHouseID;
    }

    public String getClearingHouseReceiverQualifierID() {
        return clearingHouseReceiverQualifierID;
    }

    public void setClearingHouseReceiverQualifierID(String clearingHouseReceiverQualifierID) {
        this.clearingHouseReceiverQualifierID = clearingHouseReceiverQualifierID;
    }

    public String getClearingHouseReceiverQualifier() {
        return clearingHouseReceiverQualifier;
    }

    public void setClearingHouseReceiverQualifier(String clearingHouseReceiverQualifier) {
        this.clearingHouseReceiverQualifier = clearingHouseReceiverQualifier;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
