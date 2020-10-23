package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PMT {
private String PMT_1_PaymentRemittanceAdviceNumber;
private String PMT_2_PaymentRemittanceEffectiveDateTime;
private String PMT_3_PaymentRemittanceExpirationDateTime;
private String PMT_4_PaymentMethod;
private String PMT_5_PaymentRemittanceDateTime;
private String PMT_6_PaymentRemittanceAmount;
private String PMT_7_CheckNumber;
private String PMT_8_PayeeBankIdentification;
private String PMT_9_PayeeTransitNumber;
private String PMT_10_PayeeBankAccountID;
private String PMT_11_PaymentOrganization;
private String PMT_12_ESRCodeLine;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

