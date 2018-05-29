package org.brijframework.support.state;

public enum Scope {

	prototype("prototype"),session("session"),globel("globel"),request("request"),singleton("singleton");
	
	String id;
	private Scope(String id) {
		this.id=id;
	}
	
}
