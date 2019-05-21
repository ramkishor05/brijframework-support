package org.brijframework.support.enums;

public enum Scope {

	PROTOTYPE("PROTOTYPE"), 
	SINGLETON("SINGLETON"),
	SESSION("SESSION"),
	REQUEST("REQUEST"),
	GLOBEL("GLOBEL"),
	GROUP("GROUP"),
	CUSTOM("CUSTOM");

	String id;

	private Scope(String id) {
		this.id = id;
	}

}
