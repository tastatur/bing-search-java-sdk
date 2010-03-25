/**
 * 
 */
package com.google.code.bing.search.client.search;

import junit.framework.TestCase;

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchServiceClientFactory;
import com.google.code.bing.search.client.BingSearchClient.SearchRequestBuilder;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;

/**
 * @author nmukhtar
 *
 */
public class BaseBingSearchClientTest extends TestCase {
    /** Field description */
	protected BingSearchServiceClientFactory factory;
	
    /** Field description */
	protected BingSearchClient client;

	/**
	 * 
	 */
	protected SearchRequest createSearchRequest() {
		SearchRequestBuilder requestBuilder = client.newSearchRequestBuilder();
		// TODO-NM: Populate request with test data.
		return requestBuilder.getResult();
	}
	
	/**
	 * 
	 */
	protected static void assertNotNullOrEmpty(String message, String value) {
		assertNotNull(message, value);
		assertFalse(message, "".equals(value));
	}
}
