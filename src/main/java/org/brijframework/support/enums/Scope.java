package org.brijframework.support.enums;

public enum Scope {

	PROTOTYPE("PROTOTYPE"), SESSION("SESSION"), GLOBEL("GLOBEL"), REQUEST("REQUEST"), SINGLETON("SINGLETON");

	String id;

	private Scope(String id) {
		this.id = id;
	}

}
