package org.brijframework.support.enums;

public enum Scope {

	prototype("prototype"),session("session"),globel("globel"),request("request"),singleton("singleton");
	
	String id;
	private Scope(String id) {
		this.id=id;
	}
	
}
