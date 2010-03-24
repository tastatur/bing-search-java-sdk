package com.google.code.bing.search.client.impl;

import java.util.concurrent.Future;

import javax.xml.ws.WebServiceRef;

import com.google.code.bing.search.client.BingSearchClient;
import com.microsoft.schemas.livesearch._2008._03.search.LiveSearchPortType;
import com.microsoft.schemas.livesearch._2008._03.search.LiveSearchService;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;
import com.microsoft.schemas.livesearch._2008._03.search.SearchResponse;

public class BingSearchSoapClientImpl extends BaseBingSearchServiceClientImpl implements
		BingSearchClient {
	
	@WebServiceRef(wsdlLocation="http://api.search.live.net/search.wsdl")
	static LiveSearchService searchService;
	
	public static void main(String[] args) throws Exception {
		searchService = new LiveSearchService();
		LiveSearchPortType proxy = searchService.getLiveSearchPort();
		proxy.search(null);
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
}
