/**
 * 
 */
package com.google.code.bing.search.example;

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchServiceClientFactory;
import com.google.code.bing.search.client.BingSearchClient.SearchRequestBuilder;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.SourceType;
import com.google.code.bing.search.schema.translation.TranslationResult;

/**
 * @author nmukhtar
 *
 */
public class TranslationSample {

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
		System.out.println("Translation results for " + response.getQuery().getSearchTerms());
		for (TranslationResult result : response.getTranslation().getResults().getTranslationResultList()) {
			System.out.println(result.getTranslatedTerm());
		}
	}

	private static SearchRequest createSearchRequest(BingSearchClient client) {
		SearchRequestBuilder builder = client.newSearchRequestBuilder();
		builder.withAppId("49EB1BB201E8950D5CEE9AC199C7ADD7CE08AA40");
		builder.withQuery("Espero");
		builder.withSourceType(SourceType.TRANSLATION);
		builder.withTranslationRequestSourceLanguage("es");
		builder.withTranslationRequestTargetLanguage("en");
		builder.withVersion("2.2");
		
		return builder.getResult();
	}
}
