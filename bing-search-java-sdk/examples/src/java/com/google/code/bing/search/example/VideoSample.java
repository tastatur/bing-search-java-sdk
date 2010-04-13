/**
 * 
 */
package com.google.code.bing.search.example;

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchServiceClientFactory;
import com.google.code.bing.search.client.BingSearchClient.SearchRequestBuilder;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.google.code.bing.search.schema.AdultOption;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.SourceType;
import com.google.code.bing.search.schema.multimedia.VideoResult;

/**
 * @author nmukhtar
 *
 */
public class VideoSample {

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
		System.out.println("Video results for " + response.getQuery().getSearchTerms());
		for (VideoResult result : response.getVideo().getResults().getVideoResultList()) {
			System.out.println("Page Title: " + result.getTitle());
			System.out.println("SourceTitle: " + result.getSourceTitle());
			System.out.println("PlayUrl: " + result.getPlayUrl());
			System.out.println("ClickThroughPageUrl: " + result.getClickThroughPageUrl());
			System.out.println("Runtime: " + result.getRunTime());
			System.out.println("Static Thumbnail:");
			System.out.println("\tUrl: " + result.getStaticThumbnail().getUrl());
			System.out.println("\tContent Type: " + result.getStaticThumbnail().getContentType());
			System.out.println("\tWidth: " + result.getStaticThumbnail().getWidth());
			System.out.println("\tHeight: " + result.getStaticThumbnail().getHeight());
			System.out.println("\tFile Size: " + result.getStaticThumbnail().getFileSize());
		}
		
	}

	private static SearchRequest createSearchRequest(BingSearchClient client) {
		SearchRequestBuilder builder = client.newSearchRequestBuilder();
		builder.withAppId("49EB1BB201E8950D5CEE9AC199C7ADD7CE08AA40");
		builder.withQuery("xbox site:microsoft.com");
		builder.withSourceType(SourceType.VIDEO);
		builder.withVersion("2.1");
		builder.withMarket("en-us");
		builder.withAdultOption(AdultOption.MODERATE);
		
		builder.withVideoRequestCount(2L);
		builder.withVideoRequestOffset(0L);
		return builder.getResult();
	}
}
