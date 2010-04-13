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
import com.google.code.bing.search.schema.flightstatus.FlightStatus;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResult;

/**
 * @author nmukhtar
 *
 */
public class InstantAnswerFlightStatusSample {

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
		System.out.println("InstantAnswer results for " + response.getQuery().getSearchTerms());
		for (InstantAnswerResult result : response.getInstantAnswer().getResults().getInstantAnswerResultList()) {
			System.out.println(result.getTitle());
			System.out.println(result.getClickThroughUrl());			
			System.out.println(result.getUrl());
			FlightStatus flightStatus = result.getInstantAnswerSpecificData().getFlightStatus();
			System.out.println(flightStatus.getFlightName());
			System.out.println(flightStatus.getStatusString());
			System.out.println(flightStatus.getOriginAirport().getName());
			System.out.println(flightStatus.getDestinationAirport().getName());
			System.out.println(flightStatus.getScheduledDeparture());
			System.out.println(flightStatus.getScheduledArrival());
			System.out.println(flightStatus.getAirlineCode());
		}
	}

	private static SearchRequest createSearchRequest(BingSearchClient client) {
		SearchRequestBuilder builder = client.newSearchRequestBuilder();
		builder.withAppId("49EB1BB201E8950D5CEE9AC199C7ADD7CE08AA40");
		builder.withQuery("CO234");
		builder.withSourceType(SourceType.INSTANT_ANSWER);
		builder.withVersion("2.0");
		builder.withMarket("en-us");
		return builder.getResult();
	}
}
