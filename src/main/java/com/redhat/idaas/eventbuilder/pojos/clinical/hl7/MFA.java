package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFA {
    private String MFA_1_RecordLevelEventCode;
    private String MFA_2_MFNControlID;
    private String MFA_3_EventCompletionDateTime;
    private String MFA_4_MFNRecordLevelErrorReturn;
    private String MFA_5_PrimaryKeyValueMFA;
    private String MFA_6_PrimaryKeyValueTypeMFA;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

