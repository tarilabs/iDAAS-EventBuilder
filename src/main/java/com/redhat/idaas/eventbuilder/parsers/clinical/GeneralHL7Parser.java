	/**
 * 
 */
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
	
		/*
		 * 	Object Reference To Populate
		 */
		HL7MessageDelimiters mshDelimiterDetails = new HL7MessageDelimiters();
		 /*
		  * 	Variables for Message Parsing
		 
		 String msgSegmentDelimiter = null;
		 String msgComponentDelimiter = null;
		 String msgFieldRepeaterDelimiter = null;
		 String msgSubComponentDelimiter = null;
		  */
		
		 /*
		  * 	Parse Message and build events
		  */
		 String[] messageSegments = msgBody.split("\r"); 
		 System.out.println("Segment Count: " +messageSegments.length);
		 
		 /*
		   *   For each loop to process each segment
		   *   
		   */
	        for (String segmentDetails : messageSegments) 
	        {
	        		if (segmentDetails.substring(0,3).equals("MSH"))
	        		{	
        			//Parse MSH and Populating Parsing Variables
	        			mshDelimiterDetails.setMsgSegmentDelimiter(segmentDetails.substring(3,4));
	        			mshDelimiterDetails.setMsgComponentDelimiter(segmentDetails.substring(4,5));
	        			mshDelimiterDetails.setMsgFieldRepeaterDelimiter(segmentDetails.substring(6,7));
	        			mshDelimiterDetails.setMsgSubComponentDelimiter(segmentDetails.substring(8,9));
	        		}
	        		
	        }
	        
	        return mshDelimiterDetails;
	}

}
