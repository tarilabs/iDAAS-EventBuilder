/**
 * 
 */
package com.redhat.idaas.parsers.hl7;

/**
 * @author Alan Scott 
 * 
 * 	Designed for being able to support HL7 Parsing attributes 
 *
 */
public class hl7ParsingDelimiters {

	public static com.redhat.idaas.pojos.platform.hl7MessageDelimiters  buildDelimiters(String segmentData)
	{
		com.redhat.idaas.pojos.platform.hl7MessageDelimiters hl7Delimiters = new com.redhat.idaas.pojos.platform.hl7MessageDelimiters();

		return hl7Delimiters;
	}
}
