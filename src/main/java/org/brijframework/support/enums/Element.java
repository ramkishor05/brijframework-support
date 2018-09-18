package org.brijframework.support.enums;

public enum Element {
	
	REFERANCE("Referance"),
	BOOLEAN("Boolean"),
	NUMBER("Number"),
	STRING("String"),
	LIST("List"),
	TIME("Time"),
	DATE("Date");
	
	String id;
	Element(String id){
		this.id=id;
	}
}
