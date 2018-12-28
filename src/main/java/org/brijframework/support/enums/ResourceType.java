package org.brijframework.support.enums;

public enum ResourceType {
    JSON("json"),XML("xml"),PDF("pdf"),XSL("xsl"),DOC("doc"),HASH("hash");
	private String id;
	private ResourceType(String id) {
		this.id=id;
	}
	
	@Override
	public String toString() {
		return id;
	}
}
