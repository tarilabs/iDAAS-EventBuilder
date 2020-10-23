package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PTH {
private String PTH_1_ActionCode;
private String PTH_2_PathwayID;
private String PTH_3_PathwayInstanceID;
private String PTH_4_PathwayEstablishedDateTime;
private String PTH_5_PathwayLifeCycleStatus;
private String PTH_6_ChangePathwayLifeCycleStatusDateTime;
private String PTH_7_MoodCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

