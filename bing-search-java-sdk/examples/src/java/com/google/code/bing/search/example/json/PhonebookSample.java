/**
 * 
 */
package com.google.code.bing.search.example.json;

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchServiceClientFactory;
import com.google.code.bing.search.client.BingSearchClient.SearchRequestBuilder;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.google.code.bing.search.schema.SearchOption;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.SourceType;
import com.google.code.bing.search.schema.phonebook.PhonebookResult;
import com.google.code.bing.search.schema.phonebook.PhonebookSortOption;

/**
 * @author nmukhtar
 *
 */
public class PhonebookSample {

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
		System.out.println("Bing API Version " + response.getVersion());
		System.out.println("Phonebook results for " + response.getQuery().getSearchTerms());
		for (PhonebookResult result : response.getPhonebook().getResults().getPhonebookResultList()) {
			System.out.println(result.getBusiness());
			System.out.println(result.getAddress());
			System.out.println(result.getCity() + ", " + result.getStateOrProvince());
			System.out.println(result.getPhoneNumber());
			System.out.println(result.getUserRating());
		}
	}

	private static SearchRequest createSearchRequest(BingSearchClient client) {
		SearchRequestBuilder builder = client.newSearchRequestBuilder();
		builder.withAppId("49EB1BB201E8950D5CEE9AC199C7ADD7CE08AA40");
		builder.withQuery("microsoft offices");
		builder.withSourceType(SourceType.PHONEBOOK);
		builder.withVersion("2.0");
		builder.withMarket("en-us");
		builder.withUILanguage("en");
		builder.withLatitude(47.603450);
		builder.withLongitude(-122.329696);
		builder.withRadius(10.0);
		builder.withSearchOption(SearchOption.ENABLE_HIGHLIGHTING);
		
		builder.withPhonebookRequestCount(10L);
		builder.withPhonebookRequestOffset(0L);
		builder.withPhonebookRequestFileType("YP");
		builder.withPhonebookRequestSortOption(PhonebookSortOption.DISTANCE);
		
		return builder.getResult();
	}
}
