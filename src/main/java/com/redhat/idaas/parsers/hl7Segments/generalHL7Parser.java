	/**
 * 
 */
package com.redhat.idaas.parsers.hl7Segments;

/**
 * @author alscott
 *
 */
public class generalHL7Parser {

	/**
	 * @param args
	 */
	public static com.redhat.idaas.pojos.platform.hl7MessageDelimiters generalMessageProcessing(String msgBody) {
	
		/*
		 * 	Object Reference To Populate
		 */
		com.redhat.idaas.pojos.platform.hl7MessageDelimiters mshDelimiterDetails = new com.redhat.idaas.pojos.platform.hl7MessageDelimiters();
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
