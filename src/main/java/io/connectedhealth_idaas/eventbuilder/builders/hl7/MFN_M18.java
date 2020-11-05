package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M18 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public MFI MasterFileIdentification;
public MFE MasterFileEntry;
public PM1 PayerMasterFile;
public MCP MasterFileCoverage;
public DPS DiagnosisandProcedureCode;

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

    public PM1 getPayerMasterFile() {
        return PayerMasterFile;
    }

    public void setPayerMasterFile(PM1 payerMasterFile) {
        PayerMasterFile = payerMasterFile;
    }

    public MCP getMasterFileCoverage() {
        return MasterFileCoverage;
    }

    public void setMasterFileCoverage(MCP masterFileCoverage) {
        MasterFileCoverage = masterFileCoverage;
    }

    public DPS getDiagnosisandProcedureCode() {
        return DiagnosisandProcedureCode;
    }

    public void setDiagnosisandProcedureCode(DPS diagnosisandProcedureCode) {
        DiagnosisandProcedureCode = diagnosisandProcedureCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

