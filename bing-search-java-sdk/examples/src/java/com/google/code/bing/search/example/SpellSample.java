/**
 * 
 */
package com.google.code.bing.search.example;

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchServiceClientFactory;
import com.google.code.bing.search.client.BingSearchClient.SearchRequestBuilder;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.google.code.bing.search.schema.SearchOption;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.SourceType;
import com.google.code.bing.search.schema.spell.SpellResult;

/**
 * @author nmukhtar
 *
 */
public class SpellSample {

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
		System.out.println("Spell results for " + response.getQuery().getSearchTerms());
		for (SpellResult result : response.getSpell().getResults().getSpellResultList()) {
			System.out.println(result.getValue());
		}
	}

	private static SearchRequest createSearchRequest(BingSearchClient client) {
		SearchRequestBuilder builder = client.newSearchRequestBuilder();
		builder.withAppId("49EB1BB201E8950D5CEE9AC199C7ADD7CE08AA40");
		builder.withQuery("Mispeling words is a common ocurrence.");
		builder.withSourceType(SourceType.SPELL);
		builder.withVersion("2.0");
		builder.withMarket("en-us");
		builder.withSearchOption(SearchOption.ENABLE_HIGHLIGHTING);
		return builder.getResult();
	}
}
