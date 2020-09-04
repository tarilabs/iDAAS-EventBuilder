package com.redhat.idaas.eventbuilder.parsers.clinical;

import com.redhat.idaas.eventbuilder.pojos.platform.HL7MessageDelimiters;

/**
 * @author alscott
 *
 */
public class GeneralHL7Parser {

	/**
	 * @param msgBody - message body to process
	 * @return HL7MessageDelimiters - data that was processed
	 */
	public static HL7MessageDelimiters generalMessageProcessing(String msgBody) {
	
		// Object Reference To Populate
		HL7MessageDelimiters mshDelimiterDetails = new HL7MessageDelimiters();
		
		//Parse Message and build events
		String[] messageSegments = msgBody.split(SegmentConstants.DEFAULT_SEGMENT_DELIMITER); 
		// System.out.println("Segment Count: " +messageSegments.length);
		 
		for (String segmentDetails : messageSegments) 
		{
			if (segmentDetails.substring(0,3).equals(SegmentConstants.SEGMENT_TYPE_MSH))
			{	
				//Parse MSH and Populating Parsing Variables
				mshDelimiterDetails.setMsgSegmentDelimiter(SegmentConstants.DEFAULT_SEGMENT_DELIMITER);
				mshDelimiterDetails.setMsgFieldDelimiter(segmentDetails.substring(3,4));
				mshDelimiterDetails.setMsgComponentDelimiter(segmentDetails.substring(4,5));
				mshDelimiterDetails.setMsgFieldRepeaterDelimiter(segmentDetails.substring(7,8));
			}
		}
		
		return mshDelimiterDetails;
	}

}
