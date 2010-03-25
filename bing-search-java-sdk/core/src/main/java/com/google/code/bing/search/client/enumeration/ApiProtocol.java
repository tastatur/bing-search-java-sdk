/**
 * 
 */
package com.google.code.bing.search.client.enumeration;

/**
 * @author nmukhtar
 *
 */
public enum ApiProtocol implements ValueEnum {
	XML("xml"),
	JSON("json"),
	SOAP("soap"),
	RSS("rss");
	
    /** Field description */
    private final String value;
	
	ApiProtocol(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}
}
