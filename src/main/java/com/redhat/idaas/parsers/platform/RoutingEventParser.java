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
		for (String segmentDetails : messageSegments) {
			if (segmentDetails.substring(0, 3).equals("MSH")) {
				// Parse MSH and Populating Parsing Variables
				mshDelimiterDetails = segmentDetails.substring(3, 4);
				// Spilt MSH
				mshSegmentDetails = body.split(mshDelimiterDetails);
				// Populate into Routing Event
				routingEvent.setFacilityId("");
				routingEvent.setMessageEvent("");
				routingEvent.setMessageType("");
				routingEvent.setIndustryStd("HL7v2");
				routingEvent.setMessageDateTime("");
				routingEvent.setMessageDate("");
				routingEvent.setMessageHour("");
				routingEvent.setMessageTime("");
				routingEvent.setMessageId("");
				// application + facility + messageType + MessageID
				routingEvent.setUniqueMessageId("");
				routingEvent.setMessageVersion("");
				routingEvent.setSendingApp("");
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
