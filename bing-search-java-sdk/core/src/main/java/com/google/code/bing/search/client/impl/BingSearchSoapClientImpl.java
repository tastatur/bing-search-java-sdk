package com.google.code.bing.search.client.impl;

import java.util.concurrent.Future;

import javax.xml.ws.WebServiceRef;

import com.google.code.bing.search.client.BingSearchClient;
import com.microsoft.schemas.livesearch._2008._03.search.AdultOption;
import com.microsoft.schemas.livesearch._2008._03.search.LiveSearchPortType;
import com.microsoft.schemas.livesearch._2008._03.search.LiveSearchService;
import com.microsoft.schemas.livesearch._2008._03.search.SearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;
import com.microsoft.schemas.livesearch._2008._03.search.SearchResponse;
import com.microsoft.schemas.livesearch._2008._03.search.SourceType;
import com.microsoft.schemas.livesearch._2008._03.search.WebResult;
import com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption;

public class BingSearchSoapClientImpl extends BaseBingSearchServiceClientImpl implements
		BingSearchClient {
	
	@WebServiceRef(wsdlLocation="http://api.search.live.net/search.wsdl")
	static LiveSearchService searchService;
	
	public static void main(String[] args) throws Exception {
		searchService = new LiveSearchService();
		BingSearchClient client = new BingSearchSoapClientImpl();
		SearchResponse response = client.search(new BingSearchSoapClientImpl().createSearchRequest());
		for (WebResult result : response.getParameters().getWeb().getResults().getWebResult()) {
			System.out.println(result.getTitle());
			System.out.println(result.getDescription());
			System.out.println(result.getUrl());
		}
	}

	@Override
	public SearchResponse search(SearchRequest request) {
		LiveSearchPortType proxy = searchService.getLiveSearchPort();
		return proxy.search(request);
	}

	@Override
	public Future<SearchResponse> searchAsync(SearchRequest request) {
		LiveSearchPortType proxy = searchService.getLiveSearchPort();
		return proxy.searchAsync(request);
	}
	
	private SearchRequest createSearchRequest() {
		SearchRequestBuilder builder = newSearchRequestBuilder();
		builder.withAppId("49EB1BB201E8950D5CEE9AC199C7ADD7CE08AA40").withQuery("msdn blogs");
		builder.withSourceType(SourceType.WEB).withVersion("2.0").withMarket("en-us");
		builder.withAdultOption(AdultOption.MODERATE).withSearchOption(SearchOption.ENABLE_HIGHLIGHTING);
		builder.withWebRequestCount(10L).withWebRequestOffset(0L);
		builder.withWebRequestSearchOption(WebSearchOption.DISABLE_HOST_COLLAPSING).withWebRequestSearchOption(WebSearchOption.DISABLE_QUERY_ALTERATIONS);
		return builder.getResult();
	}
}
