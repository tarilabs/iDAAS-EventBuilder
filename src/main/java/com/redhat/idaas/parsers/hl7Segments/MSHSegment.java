/**
 * 
 */
package com.redhat.idaas.parsers.hl7Segments;

// HAPI Events
import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
//import ca.uhn.hl7v2.model.v22.datatype.PN;
//import ca.uhn.hl7v2.model.v22.message.ADT_A01;
//import ca.uhn.hl7v2.model.v22.segment.MSH;
import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import ca.uhn.hl7v2.parser.Parser;

// Event Builder objects
import com.redhat.idaas.pojos.clinical.hl7v2.Hl7MessageHeader;

/**
 * @author Alan Scott
 *
 */
public class MSHSegment {

	public static com.redhat.idaas.pojos.clinical.hl7v2.Hl7MessageHeader parseMSHSegment(String msgBody)
	{
		com.redhat.idaas.pojos.clinical.hl7v2.Hl7MessageHeader mshDetails = new com.redhat.idaas.pojos.clinical.hl7v2.Hl7MessageHeader();
		
		String mshDelimiterDetails;
		String[] mshSegmentDetails;
		/*
		  * 	Parse Message and build events
		  */
		 String[] messageSegments = msgBody.split("\r"); 
		 
		 //System.out.println("Segment Count: " +messageSegments.length);
		 
		 /*
		   *   For each loop to process each segment
		   */
	        for (String segmentDetails : messageSegments) 
	        {
	        		if (segmentDetails.substring(0,3).equals("MSH"))
	        		{	
	        			//Parse MSH and Populating Parsing Variables
	        			mshDelimiterDetails = segmentDetails.substring(3,4);
	        			// Spilt MSH
	        			mshSegmentDetails = msgBody.split(mshDelimiterDetails);
	        		}		
	        //end of for loop
	        }
	        
	        //Parse mshSegmentDetails into specific object pieces
	        
	        return mshDetails;
		
	}
}
