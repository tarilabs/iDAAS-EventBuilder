package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TXA {
    private String TXA_1_SetIDTXA;
    private String TXA_2_DocumentType;
    private String TXA_3_DocumentContentPresentation;
    private String TXA_4_ActivityDateTime;
    private String TXA_5_PrimaryActivityProviderCodeName;
    private String TXA_6_OriginationDateTime;
    private String TXA_7_TranscriptionDateTime;
    private String TXA_8_EditDateTime;
    private String TXA_9_OriginatorCodeName;
    private String TXA_10_AssignedDocumentAuthenticator;
    private String TXA_11_TranscriptionistCodeName;
    private String TXA_12_UniqueDocumentNumber;
    private String TXA_13_ParentDocumentNumber;
    private String TXA_14_PlacerOrderNumber;
    private String TXA_15_FillerOrderNumber;
    private String TXA_16_UniqueDocumentFileName;
    private String TXA_17_DocumentCompletionStatus;
    private String TXA_18_DocumentConfidentialityStatus;
    private String TXA_19_DocumentAvailabilityStatus;
    private String TXA_20_DocumentStorageStatus;
    private String TXA_21_DocumentChangeReason;
    private String TXA_22_AuthenticationPerson;
    private String TXA_23_DistributedCopiesCodeandNameofRecipients;
    private String TXA_24_FolderAssignment;
    private String TXA_25_DocumentTitle;
    private String TXA_26_AgreedDueDateTime;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

