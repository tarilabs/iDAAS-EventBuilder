package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M16 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public MFI MasterFileIdentification;
public MFE MasterFileEntry;
public ITM MaterialItem;
public NTE NotesandComments;
public STZ SterilizationParameter;
public NTE NotesandComments1;
public VND PurchasingVendor;
public PKG ItemPackaging;
public PCE PatientChargeCostCenterExceptions;
public IVT MaterialLocation;
public ILT MaterialLot;
public NTE NotesandComments2;

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

    public ITM getMaterialItem() {
        return MaterialItem;
    }

    public void setMaterialItem(ITM materialItem) {
        MaterialItem = materialItem;
    }

    public NTE getNotesandComments() {
        return NotesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        NotesandComments = notesandComments;
    }

    public STZ getSterilizationParameter() {
        return SterilizationParameter;
    }

    public void setSterilizationParameter(STZ sterilizationParameter) {
        SterilizationParameter = sterilizationParameter;
    }

    public NTE getNotesandComments1() {
        return NotesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        NotesandComments1 = notesandComments1;
    }

    public VND getPurchasingVendor() {
        return PurchasingVendor;
    }

    public void setPurchasingVendor(VND purchasingVendor) {
        PurchasingVendor = purchasingVendor;
    }

    public PKG getItemPackaging() {
        return ItemPackaging;
    }

    public void setItemPackaging(PKG itemPackaging) {
        ItemPackaging = itemPackaging;
    }

    public PCE getPatientChargeCostCenterExceptions() {
        return PatientChargeCostCenterExceptions;
    }

    public void setPatientChargeCostCenterExceptions(PCE patientChargeCostCenterExceptions) {
        PatientChargeCostCenterExceptions = patientChargeCostCenterExceptions;
    }

    public IVT getMaterialLocation() {
        return MaterialLocation;
    }

    public void setMaterialLocation(IVT materialLocation) {
        MaterialLocation = materialLocation;
    }

    public ILT getMaterialLot() {
        return MaterialLot;
    }

    public void setMaterialLot(ILT materialLot) {
        MaterialLot = materialLot;
    }

    public NTE getNotesandComments2() {
        return NotesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        NotesandComments2 = notesandComments2;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

