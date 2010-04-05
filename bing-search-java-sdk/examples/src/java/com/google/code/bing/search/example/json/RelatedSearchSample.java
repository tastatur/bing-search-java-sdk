/**
 * 
 */
package com.google.code.bing.search.example.json;

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchServiceClientFactory;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;

/**
 * @author nmukhtar
 *
 */
public class RelatedSearchSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BingSearchServiceClientFactory factory = BingSearchServiceClientFactory.newInstance();
		BingSearchClient client = factory.createBingSearchClient(ApiProtocol.JSON);
		SearchResponse response = client.search(createSearchRequest(client));
		printResponse(response);
	}

	private static void printResponse(SearchResponse response) {
		// TODO Auto-generated method stub
		
	}

	private static SearchRequest createSearchRequest(BingSearchClient client) {
		// TODO Auto-generated method stub
		return null;
	}
}
