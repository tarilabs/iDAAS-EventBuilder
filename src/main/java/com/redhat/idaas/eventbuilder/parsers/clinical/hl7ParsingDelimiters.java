/**
 * 
 */
package com.redhat.idaas.eventbuilder.parsers.clinical;

import com.redhat.idaas.eventbuilder.pojos.platform.hl7MessageDelimiters;

/**
 * @author Alan Scott 
 * 
 * 	Designed for being able to support HL7 Parsing attributes 
 *
 */
public class hl7ParsingDelimiters {

	public static hl7MessageDelimiters buildDelimiters(String segmentData)
	{
		hl7MessageDelimiters hl7Delimiters = new hl7MessageDelimiters();

		return hl7Delimiters;
	}
}
