package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ERR {
    private String ERR_1_ErrorCodeandLocation;
    private String ERR_2_ErrorLocation;
    private String ERR_3_HL7ErrorCode;
    private String ERR_4_Severity;
    private String ERR_5_ApplicationErrorCode;
    private String ERR_6_ApplicationErrorParameter;
    private String ERR_7_DiagnosticInformation;
    private String ERR_8_UserMessage;
    private String ERR_9_InformPersonIndicator;
    private String ERR_10_OverrideType;
    private String ERR_11_OverrideReasonCode;
    private String ERR_12_HelpDeskContactPoint;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

