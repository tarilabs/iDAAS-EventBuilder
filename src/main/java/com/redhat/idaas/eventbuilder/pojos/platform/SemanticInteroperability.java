package com.redhat.idaas.eventbuilder.pojos.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import com.redhat.idaas.eventbuilder.pojos.clinical.*;
public class SemanticInteroperability {
    private String sendingApp;
    private String facilityId;
    private String organizationId;
    private String messageType;
    private String messageEvent;
    private String messageId;
    private String uniqueMessageId;
    private String messageVersion;
    private String terminologyFieldLocation;
    private String terminologyVersion;
    private String terminologyName;
    private String terminologyCode;
    private String terminologyDesc;
    private String[] terminologyResponses;


    public String getSendingApp() {
        return sendingApp;
    }

    public void setSendingApp(String sendingApp) {
        this.sendingApp = sendingApp;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageEvent() {
        return messageEvent;
    }

    public void setMessageEvent(String messageEvent) {
        this.messageEvent = messageEvent;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getUniqueMessageId() {
        return uniqueMessageId;
    }

    public void setUniqueMessageId(String uniqueMessageId) {
        this.uniqueMessageId = uniqueMessageId;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public String getTerminologyFieldLocation() {
        return terminologyFieldLocation;
    }

    public void setTerminologyFieldLocation(String terminologyFieldLocation) {
        this.terminologyFieldLocation = terminologyFieldLocation;
    }

    public String getTerminologyVersion() {
        return terminologyVersion;
    }

    public void setTerminologyVersion(String terminologyVersion) {
        this.terminologyVersion = terminologyVersion;
    }

    public String getTerminologyName() {
        return terminologyName;
    }

    public void setTerminologyName(String terminologyName) {
        this.terminologyName = terminologyName;
    }

    public String getTerminologyCode() {
        return terminologyCode;
    }

    public void setTerminologyCode(String terminologyCode) {
        this.terminologyCode = terminologyCode;
    }

    public String getTerminologyDesc() {
        return terminologyDesc;
    }

    public void setTerminologyDesc(String terminologyDesc) {
        this.terminologyDesc = terminologyDesc;
    }

    public String[] getTerminologyResponses() {
        return terminologyResponses;
    }

    public void setTerminologyResponses(String[] terminologyResponses) {
        this.terminologyResponses = terminologyResponses;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
