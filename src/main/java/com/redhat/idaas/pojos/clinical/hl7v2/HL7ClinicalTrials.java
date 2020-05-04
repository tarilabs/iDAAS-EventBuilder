/**
 * 
 */
package com.redhat.idaas.pojos.clinical.hl7v2;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Developer
 *
 */
public class HL7ClinicalTrials {
	
	private String studyID;
	private String phaseIdentifier;
	private String studyScheduleTimePoint;
	
	
	public String getStudyID() {
		return studyID;
	}
	public void setStudyID(String studyID) {
		this.studyID = studyID;
	}
	public String getPhaseIdentifier() {
		return phaseIdentifier;
	}
	public void setPhaseIdentifier(String phaseIdentifier) {
		this.phaseIdentifier = phaseIdentifier;
	}
	public String getStudyScheduleTimePoint() {
		return studyScheduleTimePoint;
	}
	public void setStudyScheduleTimePoint(String studyScheduleTimePoint) {
		this.studyScheduleTimePoint = studyScheduleTimePoint;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}

}
