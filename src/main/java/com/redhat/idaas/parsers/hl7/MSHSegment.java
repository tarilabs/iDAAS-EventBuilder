/**
 * 
 */
package com.redhat.idaas.parsers.hl7;

// HAPI Events
//import ca.uhn.hl7v2.DefaultHapiContext;
//import ca.uhn.hl7v2.HL7Exception;
//import ca.uhn.hl7v2.HapiContext;
//import ca.uhn.hl7v2.model.Message;
//import ca.uhn.hl7v2.model.v22.datatype.PN;
//import ca.uhn.hl7v2.model.v22.message.ADT_A01;
//import ca.uhn.hl7v2.model.v22.segment.MSH;
//import ca.uhn.hl7v2.parser.EncodingNotSupportedException;
//import ca.uhn.hl7v2.parser.Parser;

// Event Builder objects
import com.redhat.idaas.pojos.clinical.Hl7MessageHeader;

/**
 * @author Alan Scott
 *
 */
public class MSHSegment {

	public static Hl7MessageHeader parseMSHSegment(String msgBody)
	{
		Hl7MessageHeader mshDetails = new Hl7MessageHeader();

		// Delimiters
		String fieldDelimiter;
		String componentDelimiter;
		String subComponentsDelimiter;
		String fieldRepeaterDelimiter;
		String escapeDelimiter;
		// MSH Segment Details
		String[] mshSegmentDetails;
		// Variables used within Parsing
		String uMessageID = null;
		String messageDateTme = null;
		/*
		 * Parse Message and build events
		 */
		String[] messageSegments = msgBody.split("\r");
		for (String segmentData : messageSegments) {
			if (segmentData.substring(0, 3).equals("MSH")) {
				// Parse MSH and Populating Parsing Variables
				fieldDelimiter = segmentData.substring(3, 4);
				componentDelimiter = segmentData.substring(4, 5);
				fieldRepeaterDelimiter = segmentData.substring(6,7);
				escapeDelimiter = segmentData.substring(7,8);
				// Spilt MSH Segment
				String msgSegment = segmentData;
				String[] segmentDetails = segmentData.split("["+fieldDelimiter+"]",0);
				//System.out.println("Segment Count"+segmentDetails.length);
				// Splitting Routing Data
				String messageTypeData = segmentDetails[8].toString();
				//String[] messageTypeDetails = messageTypeData.split("["+componentDelimiter+"]");
				// Splitting MessageTime
				String messageDateTime = segmentDetails[6].toString();
				String messageSendingDate = messageDateTime.substring(0,8);
				String messageSendingHour = messageDateTime.toString().substring(8,10);
				String messageSendingTime = messageDateTime.toString().substring(8,messageDateTime.length());
				// Create UMID ID
				String messageUMID = segmentDetails[3].toString()+"_"+segmentDetails[2].toString()+"_"+
						messageTypeData.substring(0,3)+"_"+ segmentDetails[9].toString();
				// Populate into MSH
				mshDetails.setSendingApp(segmentDetails[2].toString());
				mshDetails.setFacilityId(segmentDetails[3].toString());
				mshDetails.setMessageDateTime(segmentDetails[6].toString());
				mshDetails.setMessageDate(messageSendingDate);
				mshDetails.setMessageHour(messageSendingHour);
				mshDetails.setMessageTime(messageSendingTime);
				mshDetails.setMessageType(messageTypeData.substring(0,3));
				mshDetails.setMessageEvent(messageTypeData.substring(4,7));
				mshDetails.setMessageId(segmentDetails[9].toString());
				mshDetails.setUniqueMessageId(messageUMID);
				mshDetails.setMessageVersion(segmentDetails[11].toString());

			}
			// end of for loop
		}
		return mshDetails;
		
	}
}
