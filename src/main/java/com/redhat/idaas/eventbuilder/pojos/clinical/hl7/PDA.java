package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDA {
private String PDA_1_DeathCauseCode;
private String PDA_2_DeathLocation;
private String PDA_3_DeathCertifiedIndicator;
private String PDA_4_DeathCertificateSignedDateTime;
private String PDA_5_DeathCertifiedBy;
private String PDA_6_AutopsyIndicator;
private String PDA_7_AutopsyStartandEndDateTime;
private String PDA_8_AutopsyPerformedBy;
private String PDA_9_CoronerIndicator;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

