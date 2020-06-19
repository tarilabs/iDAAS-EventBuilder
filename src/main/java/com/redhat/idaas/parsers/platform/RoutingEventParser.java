/**
 * 
 */
package com.redhat.idaas.parsers.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.redhat.idaas.pojos.platform.RoutingEvent;

/**
 * @author Alan Scott
 *
 */
public class RoutingEventParser {

	public RoutingEventParser() {

	}

	public RoutingEvent buildRoutingEvent(String body) {
		RoutingEvent routingEvent = new RoutingEvent();

		String mshDelimiterDetails;
		String[] mshSegmentDetails;
		// Variables used within Parsing
		String uMessageID = null;
		String messageDateTme = null;
		/*
		 * Parse Message and build events
		 */
		String[] messageSegments = body.split("\r");
		for (String segmentData : messageSegments) {
			if (segmentData.substring(0, 3).equals("MSH")) {
				// Parse MSH and Populating Parsing Variables
				mshDelimiterDetails = segmentData.substring(3, 4);
				// Spilt MSH Segment
				String msgSegment = segmentData;
				String[] segmentDetails = msgSegment.split("["+mshDelimiterDetails+"]",0);
				System.out.println("Segment Count"+segmentDetails.length);
				// Populate into Routing Event
				routingEvent.setSendingApp("");
				routingEvent.setFacilityId(segmentDetails[2].toString());
				routingEvent.setMessageEvent("");
				routingEvent.setMessageType("");
				routingEvent.setIndustryStd("HL7v2");
				routingEvent.setMessageDateTime(segmentDetails[6].toString());
				routingEvent.setMessageDate("");
				routingEvent.setMessageHour("");
				routingEvent.setMessageTime("");
				routingEvent.setMessageId(segmentDetails[9].toString());
				routingEvent.setUniqueMessageId("");
				routingEvent.setMessageVersion(segmentDetails[11].toString());

				routingEvent.setMessageData(body);
			}
			// end of for loop
		}

		return routingEvent;
	}

	// public String toString()
	// {
	// return ReflectionToStringBuilder.toString(this);
	// }
}
