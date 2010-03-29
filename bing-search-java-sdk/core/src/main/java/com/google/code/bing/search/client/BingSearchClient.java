/**
 *
 */
package com.google.code.bing.search.client;

import java.util.concurrent.Future;

import com.google.code.bing.search.schema.AdultOption;
import com.google.code.bing.search.schema.SearchOption;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.SourceType;
import com.google.code.bing.search.schema.mobileweb.MobileWebSearchOption;
import com.google.code.bing.search.schema.multimedia.VideoSortOption;
import com.google.code.bing.search.schema.news.NewsSortOption;
import com.google.code.bing.search.schema.phonebook.PhonebookSortOption;
import com.google.code.bing.search.schema.web.WebSearchOption;

/**
 * The Interface BingMapsWebServiesClient. 
 * 
 * @author Nabeel Mukhtar
 */
public interface BingSearchClient {
	
	public SearchRequestBuilder newSearchRequestBuilder();
	
	public SearchResponse search(SearchRequest request);
	
	public Future<SearchResponse> searchAsync(SearchRequest request);
	
	public interface SearchRequestBuilder {
		
		public SearchRequestBuilder withAppId(String applicationId);
		public SearchRequestBuilder withVersion(String version);
		public SearchRequestBuilder withMarket(String market);
		public SearchRequestBuilder withUILanguage(String uiLanguage);
		public SearchRequestBuilder withQuery(String query);
		public SearchRequestBuilder withAdultOption(AdultOption adult);
		public SearchRequestBuilder withLatitude(Double latitude);
		public SearchRequestBuilder withLongitude(Double longitude);
		public SearchRequestBuilder withRadius(Double radius);
		public SearchRequestBuilder withSearchOption(SearchOption searchOption);
		public SearchRequestBuilder withSourceType(SourceType sourceType);
		
		public SearchRequestBuilder withWebRequestOffset(Long offset);
		public SearchRequestBuilder withWebRequestCount(Long count);
		public SearchRequestBuilder withWebRequestFileType(String fileType);
		public SearchRequestBuilder withWebRequestSearchOption(WebSearchOption webSearchOption);
		public SearchRequestBuilder withWebRequestSearchTag(String searchTag);
		
		public SearchRequestBuilder withImageRequestOffset(Long offset);
		public SearchRequestBuilder withImageRequestCount(Long count);
		public SearchRequestBuilder withImageRequestFilter(String filter);
		
		public SearchRequestBuilder withPhonebookRequestOffset(Long offset);
		public SearchRequestBuilder withPhonebookRequestCount(Long count);
		public SearchRequestBuilder withPhonebookRequestFileType(String fileType);
		public SearchRequestBuilder withPhonebookRequestSortOption(PhonebookSortOption phonebookSortOption);
		public SearchRequestBuilder withPhonebookRequestLocId(String locId);
		public SearchRequestBuilder withPhonebookRequestCategory(String category);
		
		public SearchRequestBuilder withVideoRequestOffset(Long offset);
		public SearchRequestBuilder withVideoRequestCount(Long count);
		public SearchRequestBuilder withVideoRequestFilter(String filter);
		public SearchRequestBuilder withVideoRequestSortOption(VideoSortOption videoSortOption);
		
		public SearchRequestBuilder withNewsRequestOffset(Long offset);
		public SearchRequestBuilder withNewsRequestCount(Long count);
		public SearchRequestBuilder withNewsRequestLocationOverride(String locationOverride);
		public SearchRequestBuilder withNewsRequestCategory(String category);
		public SearchRequestBuilder withNewsRequestSortOption(NewsSortOption newsSortOption);
		
		public SearchRequestBuilder withMobileWebRequestOffset(Long offset);
		public SearchRequestBuilder withMobileWebRequestCount(Long count);
		public SearchRequestBuilder withMobileWebRequestSearchOption(MobileWebSearchOption mobileWebSearchOption);
		
		public SearchRequestBuilder withTranslationRequestSourceLanguage(String sourceLanguage);
		public SearchRequestBuilder withTranslationRequestTargetLanguage(String targetLanguage);
		
		public SearchRequest getResult();
		
		public void reset();
	}
}
