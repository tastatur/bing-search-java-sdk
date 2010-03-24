package com.google.code.bing.search.client.impl;

import javax.xml.ws.WebServiceRef;

import com.google.code.bing.search.client.BingSearchClient;
import com.microsoft.schemas.livesearch._2008._03.search.LiveSearchPortType;
import com.microsoft.schemas.livesearch._2008._03.search.LiveSearchService;

public class BingSearchSoapClientImpl extends BaseBingSearchServiceClientImpl implements
		BingSearchClient {
	
	@WebServiceRef(wsdlLocation="http://api.search.live.net/search.wsdl")
	static LiveSearchService searchService;
	
	public static void main(String[] args) throws Exception {
		searchService = new LiveSearchService();
		LiveSearchPortType proxy = searchService.getLiveSearchPort();
		proxy.search(null);
	}
}
