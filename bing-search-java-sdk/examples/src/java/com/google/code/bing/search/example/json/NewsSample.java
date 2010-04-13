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
import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.news.NewsSortOption;

/**
 * @author nmukhtar
 *
 */
public class NewsSample {

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
		System.out.println("News results for " + response.getQuery().getSearchTerms());
		
		for (NewsResult result : response.getNews().getResults().getNewsResultList()) {
			System.out.println(result.getTitle());
			System.out.println(result.getUrl());
			System.out.println(result.getSource());
			System.out.println(result.getDate());
			System.out.println(result.getSnippet());
			System.out.println();
		}
	}

	private static SearchRequest createSearchRequest(BingSearchClient client) {
		SearchRequestBuilder builder = client.newSearchRequestBuilder();
		builder.withAppId("49EB1BB201E8950D5CEE9AC199C7ADD7CE08AA40");
		builder.withQuery("msn moneycentral");
		builder.withSourceType(SourceType.NEWS);
		builder.withVersion("2.0");
		builder.withMarket("en-us");
		builder.withSearchOption(SearchOption.ENABLE_HIGHLIGHTING);
		
		builder.withNewsRequestOffset(0L);
		builder.withNewsRequestCategory("rt_Political");
		builder.withNewsRequestSortOption(NewsSortOption.RELEVANCE);
		return builder.getResult();
	}
}