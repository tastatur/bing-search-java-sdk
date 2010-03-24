/**
 *
 */
package com.google.code.bing.search.client;

import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingSearchClient {
	public enum ClientProtocol {
		XML,
		JSON,
		SOAP,
		RSS;
	}
	
	public interface SearchRequestBuilder {
		
		public SearchRequestBuilder withCredentials(String applicationId, String token);
		
		public SearchRequestBuilder withCulture(String culture);
		
		public SearchRequestBuilder withExecutionOptions(boolean suppressFaults);
		
		public SearchRequest getResult();
	}
}
