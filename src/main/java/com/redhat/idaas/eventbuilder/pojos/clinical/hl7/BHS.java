package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BHS {
private String BHS_1_BatchFieldSeparator;
private String BHS_2_BatchEncodingCharacters;
private String BHS_3_BatchSendingApplication;
private String BHS_4_BatchSendingFacility;
private String BHS_5_BatchReceivingApplication;
private String BHS_6_BatchReceivingFacility;
private String BHS_7_BatchCreationDateTime;
private String BHS_8_BatchSecurity;
private String BHS_9_BatchNameIDType;
private String BHS_10_BatchComment;
private String BHS_11_BatchControlID;
private String BHS_12_ReferenceBatchControlID;
private String BHS_13_BatchSendingNetworkAddress;
private String BHS_14_BatchReceivingNetworkAddress;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

