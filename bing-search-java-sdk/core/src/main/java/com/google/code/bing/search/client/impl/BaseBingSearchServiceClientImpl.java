package com.google.code.bing.search.client.impl;

import com.google.code.bing.search.client.BingSearchClient;
import com.microsoft.schemas.livesearch._2008._03.search.AdultOption;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfMobileWebSearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfSearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfSourceType;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfString;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebSearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.ImageRequest;
import com.microsoft.schemas.livesearch._2008._03.search.MobileWebRequest;
import com.microsoft.schemas.livesearch._2008._03.search.MobileWebSearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.NewsRequest;
import com.microsoft.schemas.livesearch._2008._03.search.NewsSortOption;
import com.microsoft.schemas.livesearch._2008._03.search.ObjectFactory;
import com.microsoft.schemas.livesearch._2008._03.search.PhonebookRequest;
import com.microsoft.schemas.livesearch._2008._03.search.PhonebookSortOption;
import com.microsoft.schemas.livesearch._2008._03.search.SchemaElementFactory;
import com.microsoft.schemas.livesearch._2008._03.search.SearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequestParameters;
import com.microsoft.schemas.livesearch._2008._03.search.SourceType;
import com.microsoft.schemas.livesearch._2008._03.search.TranslationRequest;
import com.microsoft.schemas.livesearch._2008._03.search.VideoRequest;
import com.microsoft.schemas.livesearch._2008._03.search.VideoSortOption;
import com.microsoft.schemas.livesearch._2008._03.search.WebRequest;
import com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption;

public abstract class BaseBingSearchServiceClientImpl implements
	BingSearchClient {
	
	protected final SchemaElementFactory OBJECT_FACTORY = createObjectFactory();
	
	public static class SearchRequestBuilderImpl implements SearchRequestBuilder {
		protected SearchRequest result;
		protected SchemaElementFactory factory;
		
		protected SearchRequestBuilderImpl(SchemaElementFactory factory) {
			this.factory = factory;
			this.result = factory.createSearchRequest();
		}

		@Override
		public SearchRequestBuilder withAppId(String applicationId) {
			getParameters().setAppId(applicationId);
			return this;
		}

		@Override
		public SearchRequestBuilder withAdultOption(AdultOption adult) {
			getParameters().setAdult(adult);
			return this;
		}

		@Override
		public SearchRequestBuilder withImageRequestCount(Long count) {
			getImageRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withImageRequestFilter(String filter) {
			getImageRequestFilters().getString().add(filter);
			return this;
		}

		@Override
		public SearchRequestBuilder withImageRequestOffset(Long offset) {
			getImageRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withLatitude(Double latitude) {
			getParameters().setLatitude(latitude);
			return this;
		}

		@Override
		public SearchRequestBuilder withLongitude(Double longitude) {
			getParameters().setLongitude(longitude);
			return this;
		}

		@Override
		public SearchRequestBuilder withMarket(String market) {
			getParameters().setMarket(market);
			return this;
		}

		@Override
		public SearchRequestBuilder withMobileWebRequestCount(Long count) {
			getMobileWebRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withMobileWebRequestOffset(Long offset) {
			getMobileWebRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withMobileWebRequestSearchOption(
				MobileWebSearchOption mobileWebSearchOption) {
			getMobileWebRequestOptions().getMobileWebSearchOption().add(mobileWebSearchOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestCategory(String category) {
			getNewsRequest().setCategory(category);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestCount(Long count) {
			getNewsRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestLocationOverride(
				String locationOverride) {
			getNewsRequest().setLocationOverride(locationOverride);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestOffset(Long offset) {
			getNewsRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withNewsRequestSortOption(
				NewsSortOption newsSortOption) {
			getNewsRequest().setSortBy(newsSortOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestCategory(String category) {
			getPhonebookRequest().setCategory(category);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestCount(Long count) {
			getPhonebookRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestFileType(String fileType) {
			getPhonebookRequest().setFileType(fileType);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestLocId(String locId) {
			getPhonebookRequest().setLocId(locId);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestOffset(Long offset) {
			getPhonebookRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withPhonebookRequestSortOption(
				PhonebookSortOption phonebookSortOption) {
			getPhonebookRequest().setSortBy(phonebookSortOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withQuery(String query) {
			getParameters().setQuery(query);
			return this;
		}

		@Override
		public SearchRequestBuilder withRadius(Double radius) {
			getParameters().setRadius(radius);
			return this;
		}

		@Override
		public SearchRequestBuilder withSearchOption(SearchOption searchOption) {
			getParameterOptions().getSearchOption().add(searchOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withSourceType(SourceType sourceType) {
			getParameterSources().getSourceType().add(sourceType);
			return this;
		}

		@Override
		public SearchRequestBuilder withTranslationRequestSourceLanguage(
				String sourceLanguage) {
			getTranslationRequest().setSourceLanguage(sourceLanguage);
			return this;
		}

		@Override
		public SearchRequestBuilder withTranslationRequestTargetLanguage(
				String targetLanguage) {
			getTranslationRequest().setTargetLanguage(targetLanguage);
			return this;
		}

		@Override
		public SearchRequestBuilder withUILanguage(String uiLanguage) {
			getParameters().setUILanguage(uiLanguage);
			return this;
		}

		@Override
		public SearchRequestBuilder withVersion(String version) {
			getParameters().setVersion(version);
			return this;
		}

		@Override
		public SearchRequestBuilder withVideoRequestCount(Long count) {
			getVideoRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withVideoRequestFilter(String filter) {
			getVideoRequestFilters().getString().add(filter);
			return this;
		}

		@Override
		public SearchRequestBuilder withVideoRequestOffset(Long offset) {
			getVideoRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withVideoRequestSortOption(
				VideoSortOption videoSortOption) {
			getVideoRequest().setSortBy(videoSortOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestCount(Long count) {
			getWebRequest().setCount(count);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestFileType(String fileType) {
			getWebRequest().setFileType(fileType);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestOffset(Long offset) {
			getWebRequest().setOffset(offset);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestSearchOption(
				WebSearchOption webSearchOption) {
			getWebRequestOptions().getWebSearchOption().add(webSearchOption);
			return this;
		}

		@Override
		public SearchRequestBuilder withWebRequestSearchTag(String searchTag) {
			getWebRequestSearchTags().getString().add(searchTag);
			return this;
		}

		public SearchRequest getResult() {
			return result;
		}

		@Override
		public void reset() {
			result = factory.createSearchRequest();
		}
		
		private SearchRequestParameters getParameters() {
			if (result.getParameters() == null) {
				result.setParameters(factory.createSearchRequestParameters());
			}
			return result.getParameters();
		}
		
		private ImageRequest getImageRequest() {
			if (getParameters().getImage() == null) {
				getParameters().setImage(factory.createImageRequest());
			}
			return getParameters().getImage();
		}

		private MobileWebRequest getMobileWebRequest() {
			if (getParameters().getMobileWeb() == null) {
				getParameters().setMobileWeb(factory.createMobileWebRequest());
			}
			return getParameters().getMobileWeb();
		}

		private NewsRequest getNewsRequest() {
			if (getParameters().getNews() == null) {
				getParameters().setNews(factory.createNewsRequest());
			}
			return getParameters().getNews();
		}

		private PhonebookRequest getPhonebookRequest() {
			if (getParameters().getPhonebook() == null) {
				getParameters().setPhonebook(factory.createPhonebookRequest());
			}
			return getParameters().getPhonebook();
		}

		private TranslationRequest getTranslationRequest() {
			if (getParameters().getTranslation() == null) {
				getParameters().setTranslation(factory.createTranslationRequest());
			}
			return getParameters().getTranslation();
		}
		
		private VideoRequest getVideoRequest() {
			if (getParameters().getVideo() == null) {
				getParameters().setVideo(factory.createVideoRequest());
			}
			return getParameters().getVideo();
		}
		
		private WebRequest getWebRequest() {
			if (getParameters().getWeb() == null) {
				getParameters().setWeb(factory.createWebRequest());
			}
			return getParameters().getWeb();
		}
		
		private ArrayOfString getImageRequestFilters() {
			if (getImageRequest().getFilters() == null) {
				getImageRequest().setFilters(factory.createArrayOfString());
			}
			return getImageRequest().getFilters();
		}

		private ArrayOfMobileWebSearchOption getMobileWebRequestOptions() {
			if (getMobileWebRequest().getOptions() == null) {
				getMobileWebRequest().setOptions(factory.createArrayOfMobileWebSearchOption());
			}
			return getMobileWebRequest().getOptions();
		}
		
		private ArrayOfSearchOption getParameterOptions() {
			if (getParameters().getOptions() == null) {
				getParameters().setOptions(factory.createArrayOfSearchOption());
			}
			return getParameters().getOptions();
		}

		private ArrayOfSourceType getParameterSources() {
			if (getParameters().getSources() == null) {
				getParameters().setSources(factory.createArrayOfSourceType());
			}
			return getParameters().getSources();
		}

		private ArrayOfString getVideoRequestFilters() {
			if (getVideoRequest().getFilters() == null) {
				getVideoRequest().setFilters(factory.createArrayOfString());
			}
			return getVideoRequest().getFilters();
		}
		
		private ArrayOfWebSearchOption getWebRequestOptions() {
			if (getWebRequest().getOptions() == null) {
				getWebRequest().setOptions(factory.createArrayOfWebSearchOption());
			}
			return getWebRequest().getOptions();
		}
		
		private ArrayOfString getWebRequestSearchTags() {
			if (getWebRequest().getSearchTags() == null) {
				getWebRequest().setSearchTags(factory.createArrayOfString());
			}
			return getWebRequest().getSearchTags();
		}
	}

	@Override
	public SearchRequestBuilder newSearchRequestBuilder() {
		return new SearchRequestBuilderImpl(OBJECT_FACTORY);
	}

	protected SchemaElementFactory createObjectFactory() {
		return new JaxbElementFactory();
	}
	
	private static class JaxbElementFactory extends ObjectFactory implements SchemaElementFactory {
		public JaxbElementFactory() {
			super();
		}
	}
}
