package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AIP {
private String AIP_1_SetIDAIP;
private String AIP_2_SegmentActionCode;
private String AIP_3_PersonnelResourceID;
private String AIP_4_ResourceType;
private String AIP_5_ResourceGroup;
private String AIP_6_StartDateTime;
private String AIP_7_StartDateTimeOffset;
private String AIP_8_StartDateTimeOffsetUnits;
private String AIP_9_Duration;
private String AIP_10_DurationUnits;
private String AIP_11_AllowSubstitutionCode;
private String AIP_12_FillerStatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

