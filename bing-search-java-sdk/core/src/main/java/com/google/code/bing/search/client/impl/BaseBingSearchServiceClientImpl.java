package com.google.code.bing.search.client.impl;

import com.google.code.bing.search.client.BingSearchClient;
import com.microsoft.schemas.livesearch._2008._03.search.ObjectFactory;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;

public class BaseBingSearchServiceClientImpl implements
	BingSearchClient {
	
	protected static final ObjectFactory COMMON_FACTORY = new ObjectFactory();
	
	public static class SearchRequestBuilderImpl implements SearchRequestBuilder {
		protected SearchRequest result;
		
		protected SearchRequestBuilderImpl(SearchRequest result) {
			this.result = result;
		}

		@Override
		public SearchRequestBuilder withCredentials(String applicationId,
				String token) {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public SearchRequestBuilder withCulture(String culture) {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		public SearchRequestBuilder withExecutionOptions(boolean suppressFaults) {
			// TODO Auto-generated method stub
			return this;
		}
		
		public SearchRequest getResult() {
			return result;
		}
	}
}
