package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M05 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public MFI MasterFileIdentification;
public MFE MasterFileEntry;
public LOC LocationIdentification;
public LCH LocationCharacteristic;
public LRL LocationRelationship;
public LDP LocationDepartment;
public LCH LocationCharacteristic1;
public LCC LocationChargeCode;

    public MSH getMessageHeader() {
        return MessageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        MessageHeader = messageHeader;
    }

    public SFT getSoftwareSegment() {
        return SoftwareSegment;
    }

    public void setSoftwareSegment(SFT softwareSegment) {
        SoftwareSegment = softwareSegment;
    }

    public UAC getUserAuthenticationCredentialSegment() {
        return UserAuthenticationCredentialSegment;
    }

    public void setUserAuthenticationCredentialSegment(UAC userAuthenticationCredentialSegment) {
        UserAuthenticationCredentialSegment = userAuthenticationCredentialSegment;
    }

    public MFI getMasterFileIdentification() {
        return MasterFileIdentification;
    }

    public void setMasterFileIdentification(MFI masterFileIdentification) {
        MasterFileIdentification = masterFileIdentification;
    }

    public MFE getMasterFileEntry() {
        return MasterFileEntry;
    }

    public void setMasterFileEntry(MFE masterFileEntry) {
        MasterFileEntry = masterFileEntry;
    }

    public LOC getLocationIdentification() {
        return LocationIdentification;
    }

    public void setLocationIdentification(LOC locationIdentification) {
        LocationIdentification = locationIdentification;
    }

    public LCH getLocationCharacteristic() {
        return LocationCharacteristic;
    }

    public void setLocationCharacteristic(LCH locationCharacteristic) {
        LocationCharacteristic = locationCharacteristic;
    }

    public LRL getLocationRelationship() {
        return LocationRelationship;
    }

    public void setLocationRelationship(LRL locationRelationship) {
        LocationRelationship = locationRelationship;
    }

    public LDP getLocationDepartment() {
        return LocationDepartment;
    }

    public void setLocationDepartment(LDP locationDepartment) {
        LocationDepartment = locationDepartment;
    }

    public LCH getLocationCharacteristic1() {
        return LocationCharacteristic1;
    }

    public void setLocationCharacteristic1(LCH locationCharacteristic1) {
        LocationCharacteristic1 = locationCharacteristic1;
    }

    public LCC getLocationChargeCode() {
        return LocationChargeCode;
    }

    public void setLocationChargeCode(LCC locationChargeCode) {
        LocationChargeCode = locationChargeCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

