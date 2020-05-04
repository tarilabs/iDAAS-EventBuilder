/**
 * 
 */
package com.redhat.idaas.pojos.clinical.hl7v2;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/**
 * @author Developer
 *
 */
public class HL7CWETerm {

	private String IdentifierCode;
	private String TextValue;
	private String CodingSystemName;
	private String AlternativeIdentifier;
	private String CodingSystemVersionId;
	private String OriginalText;
	private String CodeLocation;
	private String CodeType;
	private String applicationName;
	private String organizationName;
	public String getIdentifierCode() {
		return IdentifierCode;
	}
	public void setIdentifierCode(String identifierCode) {
		IdentifierCode = identifierCode;
	}
	public String getTextValue() {
		return TextValue;
	}
	public void setTextValue(String textValue) {
		TextValue = textValue;
	}
	public String getCodingSystemName() {
		return CodingSystemName;
	}
	public void setCodingSystemName(String codingSystemName) {
		CodingSystemName = codingSystemName;
	}
	public String getAlternativeIdentifier() {
		return AlternativeIdentifier;
	}
	public void setAlternativeIdentifier(String alternativeIdentifier) {
		AlternativeIdentifier = alternativeIdentifier;
	}
	public String getCodingSystemVersionId() {
		return CodingSystemVersionId;
	}
	public void setCodingSystemVersionId(String codingSystemVersionId) {
		CodingSystemVersionId = codingSystemVersionId;
	}
	public String getOriginalText() {
		return OriginalText;
	}
	public void setOriginalText(String originalText) {
		OriginalText = originalText;
	}
	public String getCodeLocation() {
		return CodeLocation;
	}
	public void setCodeLocation(String codeLocation) {
		CodeLocation = codeLocation;
	}
	public String getCodeType() {
		return CodeType;
	}
	public void setCodeType(String codeType) {
		CodeType = codeType;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}

	
	
}
