package com.redhat.idaas.eventbuilder.pojos.clinical;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the patient context
 *
 *
 */
public class Patient {
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}

}
