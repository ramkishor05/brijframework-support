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
	
	public static Scope valueFor(String scope) {
		for(Scope scpe:values()) {
			if(scpe.id.equalsIgnoreCase(scope)) {
				return scpe;
			}
		}
		return null;
	}

	public static Scope valueFor(String scope, Scope singleton) {
		Scope scpe=valueFor(scope);
		if(scpe!=null) {
			return scpe;
		}
		return singleton;
	}

}
