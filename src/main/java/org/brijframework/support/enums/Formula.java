package org.brijframework.support.enums;

public enum Formula {

	Increment("Increment",0),
	
	Decrement("Decrement",0),
	
	Random("Random",1),
	
	Sequence("Sequence",1);
	
	String id;
	
	Number number;
	Formula(String id,Number number) {
		this.id=id;
		this.number= number;
	}
}
