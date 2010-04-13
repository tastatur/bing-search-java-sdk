package com.google.code.bing.search.client.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

import javax.xml.ws.WebServiceRef;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchException;
import com.google.code.bing.search.schema.AdultOption;
import com.google.code.bing.search.schema.Error;
import com.google.code.bing.search.schema.Query;
import com.google.code.bing.search.schema.SchemaElementFactory;
import com.google.code.bing.search.schema.SchemaEntity;
import com.google.code.bing.search.schema.SearchOption;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.SourceType;
import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.AdaptableFuture;
import com.google.code.bing.search.schema.adapter.soap.ErrorImpl;
import com.google.code.bing.search.schema.adapter.soap.QueryImpl;
import com.google.code.bing.search.schema.adapter.soap.SearchRequestImpl;
import com.google.code.bing.search.schema.adapter.soap.SearchResponseImpl;
import com.google.code.bing.search.schema.adapter.soap.instantanswer.InstantAnswerImpl;
import com.google.code.bing.search.schema.adapter.soap.instantanswer.InstantAnswerResultImpl;
import com.google.code.bing.search.schema.adapter.soap.mobileweb.MobileWebImpl;
import com.google.code.bing.search.schema.adapter.soap.mobileweb.MobileWebRequestImpl;
import com.google.code.bing.search.schema.adapter.soap.mobileweb.MobileWebResultImpl;
import com.google.code.bing.search.schema.adapter.soap.multimedia.ImageImpl;
import com.google.code.bing.search.schema.adapter.soap.multimedia.ImageRequestImpl;
import com.google.code.bing.search.schema.adapter.soap.multimedia.ImageResultImpl;
import com.google.code.bing.search.schema.adapter.soap.multimedia.ThumbnailImpl;
import com.google.code.bing.search.schema.adapter.soap.multimedia.VideoImpl;
import com.google.code.bing.search.schema.adapter.soap.multimedia.VideoRequestImpl;
import com.google.code.bing.search.schema.adapter.soap.multimedia.VideoResultImpl;
import com.google.code.bing.search.schema.adapter.soap.news.NewsArticleImpl;
import com.google.code.bing.search.schema.adapter.soap.news.NewsCollectionImpl;
import com.google.code.bing.search.schema.adapter.soap.news.NewsImpl;
import com.google.code.bing.search.schema.adapter.soap.news.NewsRelatedSearchImpl;
import com.google.code.bing.search.schema.adapter.soap.news.NewsRequestImpl;
import com.google.code.bing.search.schema.adapter.soap.news.NewsResultImpl;
import com.google.code.bing.search.schema.adapter.soap.phonebook.PhonebookImpl;
import com.google.code.bing.search.schema.adapter.soap.phonebook.PhonebookRequestImpl;
import com.google.code.bing.search.schema.adapter.soap.phonebook.PhonebookResultImpl;
import com.google.code.bing.search.schema.adapter.soap.relatedsearch.RelatedSearchImpl;
import com.google.code.bing.search.schema.adapter.soap.relatedsearch.RelatedSearchResultImpl;
import com.google.code.bing.search.schema.adapter.soap.spell.SpellImpl;
import com.google.code.bing.search.schema.adapter.soap.spell.SpellResultImpl;
import com.google.code.bing.search.schema.adapter.soap.translation.TranslationImpl;
import com.google.code.bing.search.schema.adapter.soap.translation.TranslationRequestImpl;
import com.google.code.bing.search.schema.adapter.soap.translation.TranslationResultImpl;
import com.google.code.bing.search.schema.adapter.soap.web.DeepLinkImpl;
import com.google.code.bing.search.schema.adapter.soap.web.WebImpl;
import com.google.code.bing.search.schema.adapter.soap.web.WebRequestImpl;
import com.google.code.bing.search.schema.adapter.soap.web.WebResultImpl;
import com.google.code.bing.search.schema.adapter.soap.web.WebSearchTagImpl;
import com.google.code.bing.search.schema.ads.AdRequest;
import com.google.code.bing.search.schema.ads.AdResponse;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerRequest;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResponse;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResult;
import com.google.code.bing.search.schema.mobileweb.MobileWebRequest;
import com.google.code.bing.search.schema.mobileweb.MobileWebResponse;
import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
import com.google.code.bing.search.schema.mobileweb.MobileWebSearchOption;
import com.google.code.bing.search.schema.multimedia.ImageRequest;
import com.google.code.bing.search.schema.multimedia.ImageResponse;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.Thumbnail;
import com.google.code.bing.search.schema.multimedia.VideoRequest;
import com.google.code.bing.search.schema.multimedia.VideoResponse;
import com.google.code.bing.search.schema.multimedia.VideoResult;
import com.google.code.bing.search.schema.multimedia.VideoSortOption;
import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsCollection;
import com.google.code.bing.search.schema.news.NewsRelatedSearch;
import com.google.code.bing.search.schema.news.NewsRequest;
import com.google.code.bing.search.schema.news.NewsResponse;
import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.news.NewsSortOption;
import com.google.code.bing.search.schema.phonebook.PhonebookRequest;
import com.google.code.bing.search.schema.phonebook.PhonebookResponse;
import com.google.code.bing.search.schema.phonebook.PhonebookResult;
import com.google.code.bing.search.schema.phonebook.PhonebookSortOption;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchRequest;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResult;
import com.google.code.bing.search.schema.spell.SpellRequest;
import com.google.code.bing.search.schema.spell.SpellResponse;
import com.google.code.bing.search.schema.spell.SpellResult;
import com.google.code.bing.search.schema.translation.TranslationRequest;
import com.google.code.bing.search.schema.translation.TranslationResponse;
import com.google.code.bing.search.schema.translation.TranslationResult;
import com.google.code.bing.search.schema.web.DeepLink;
import com.google.code.bing.search.schema.web.WebRequest;
import com.google.code.bing.search.schema.web.WebResponse;
import com.google.code.bing.search.schema.web.WebResult;
import com.google.code.bing.search.schema.web.WebSearchOption;
import com.google.code.bing.search.schema.web.WebSearchTag;
import com.microsoft.schemas.livesearch._2008._03.search.LiveSearchPortType;
import com.microsoft.schemas.livesearch._2008._03.search.LiveSearchService;

public class BingSearchSoapClientImpl extends BaseBingSearchServiceClientImpl implements
		BingSearchClient {
	
	@WebServiceRef(wsdlLocation="http://api.search.live.net/search.wsdl")
	static LiveSearchService searchService;
	
    /** Field description */
    private static final SchemaElementFactory OBJECT_FACTORY = new SoapElementFactory();
	
    /** Field description */
	private static final Map<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>> ADAPTER_CLASSES_MAP = new HashMap<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>>();
	
	static {
		ADAPTER_CLASSES_MAP.put(SearchResponse.class, SearchResponseImpl.class);
		ADAPTER_CLASSES_MAP.put(SearchRequest.class, SearchRequestImpl.class);
		registerEnumConverters();
		// TODO-NM: If not injected.
		searchService = new LiveSearchService();
	}

	public BingSearchSoapClientImpl() {
		searchService.setExecutor(taskExecutor);
	}
	
	public static void main(String[] args) throws Exception {
		searchService = new LiveSearchService();
		BingSearchClient client = new BingSearchSoapClientImpl();
		SearchResponse response = client.search(((BingSearchSoapClientImpl) client).createSearchRequest());
		for (WebResult result : response.getWeb().getResults().getWebResultList()) {
			System.out.println(result.getTitle());
			System.out.println(result.getDescription());
			System.out.println(result.getUrl());
		}
	}

	@Override
	public SearchResponse search(SearchRequest request) {
		try {
			LiveSearchPortType proxy = searchService.getLiveSearchPort();
			com.microsoft.schemas.livesearch._2008._03.search.SearchResponse response = proxy.search(((SearchRequestImpl) request).adaptTo());
			SearchResponseImpl responseAdapter = new SearchResponseImpl();
			if (response.getParameters() != null) {
				responseAdapter.adaptFrom(response);
			}
			return responseAdapter;
		} catch (Exception e) {
			throw new BingSearchException(e); 
		}
	}

	@Override
	public Future<SearchResponse> searchAsync(SearchRequest request) {
		try {
			LiveSearchPortType proxy = searchService.getLiveSearchPort();
			SearchResponseImpl responseAdapter = new SearchResponseImpl();
			return new AdaptableFuture<SearchResponse, com.microsoft.schemas.livesearch._2008._03.search.SearchResponse>(proxy.searchAsync(((SearchRequestImpl) request).adaptTo()), responseAdapter);
		} catch (Exception e) {
			throw new BingSearchException(e); 
		}
	}
	
	@Override
	public ImageResponse search(ImageRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdResponse search(AdRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstantAnswerResponse search(InstantAnswerRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MobileWebResponse search(MobileWebRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VideoResponse search(VideoRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhonebookResponse search(PhonebookRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RelatedSearchResponse search(RelatedSearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpellResponse search(SpellRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewsResponse search(NewsRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TranslationResponse search(TranslationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebResponse search(WebRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<ImageResponse> searchAsync(ImageRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<AdResponse> searchAsync(AdRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<InstantAnswerResponse> searchAsync(
			InstantAnswerRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<MobileWebResponse> searchAsync(MobileWebRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<VideoResponse> searchAsync(VideoRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<PhonebookResponse> searchAsync(PhonebookRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<RelatedSearchResponse> searchAsync(
			RelatedSearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<SpellResponse> searchAsync(SpellRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<NewsResponse> searchAsync(NewsRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<TranslationResponse> searchAsync(TranslationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<WebResponse> searchAsync(WebRequest request) {
		// TODO Auto-generated method stub
		return null;
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
	
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	private static void registerEnumConverters() {
		BeanUtilsBean.setInstance(new com.google.code.bing.search.schema.adapter.BeanUtilsBean());
		ConvertUtils.register(new Converter() {
			@Override
			public Object convert(Class clazz, Object value) {
				if (value != null) {
					if (clazz.equals(com.microsoft.schemas.livesearch._2008._03.search.AdultOption.class)) {
						return com.microsoft.schemas.livesearch._2008._03.search.AdultOption.valueOf(((AdultOption) value).name());
					}
				}
				return null;
			}
			
		}, com.microsoft.schemas.livesearch._2008._03.search.AdultOption.class);

		ConvertUtils.register(new Converter() {
			@Override
			public Object convert(Class clazz, Object value) {
				if (value != null) {
					if (clazz.equals(com.microsoft.schemas.livesearch._2008._03.search.SearchOption.class)) {
						return com.microsoft.schemas.livesearch._2008._03.search.SearchOption.valueOf(((SearchOption) value).name());
					}
					
				}
				return null;
			}
			
		}, com.microsoft.schemas.livesearch._2008._03.search.SearchOption.class);

		ConvertUtils.register(new Converter() {
			@Override
			public Object convert(Class clazz, Object value) {
				if (value != null) {
					if (clazz.equals(com.microsoft.schemas.livesearch._2008._03.search.SourceType.class)) {
						return com.microsoft.schemas.livesearch._2008._03.search.SourceType.valueOf(((SourceType) value).name());
					}
				}
				return null;
			}
			
		}, com.microsoft.schemas.livesearch._2008._03.search.SourceType.class);
		
		ConvertUtils.register(new Converter() {
			@Override
			public Object convert(Class clazz, Object value) {
				if (value != null) {
					if (clazz.equals(com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption.class)) {
						return com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption.valueOf(((WebSearchOption) value).name());
					}
				}
				return null;
			}
			
		}, com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption.class);
		
		ConvertUtils.register(new Converter() {
			@Override
			public Object convert(Class clazz, Object value) {
				if (value != null) {
					if (clazz.equals(com.microsoft.schemas.livesearch._2008._03.search.PhonebookSortOption.class)) {
						return com.microsoft.schemas.livesearch._2008._03.search.PhonebookSortOption.valueOf(((PhonebookSortOption) value).name());
					}
				}
				return null;
			}
			
		}, com.microsoft.schemas.livesearch._2008._03.search.PhonebookSortOption.class);

		ConvertUtils.register(new Converter() {
			@Override
			public Object convert(Class clazz, Object value) {
				if (value != null) {
					if (clazz.equals(com.microsoft.schemas.livesearch._2008._03.search.VideoSortOption.class)) {
						return com.microsoft.schemas.livesearch._2008._03.search.VideoSortOption.valueOf(((VideoSortOption) value).name());
					}
				}
				return null;
			}
			
		}, com.microsoft.schemas.livesearch._2008._03.search.VideoSortOption.class);

		ConvertUtils.register(new Converter() {
			@Override
			public Object convert(Class clazz, Object value) {
				if (value != null) {
					if (clazz.equals(com.microsoft.schemas.livesearch._2008._03.search.NewsSortOption.class)) {
						return com.microsoft.schemas.livesearch._2008._03.search.NewsSortOption.valueOf(((NewsSortOption) value).name());
					}
				}
				return null;
			}
			
		}, com.microsoft.schemas.livesearch._2008._03.search.NewsSortOption.class);
		
		ConvertUtils.register(new Converter() {
			@Override
			public Object convert(Class clazz, Object value) {
				if (value != null) {
					if (clazz.equals(com.microsoft.schemas.livesearch._2008._03.search.MobileWebSearchOption.class)) {
						return com.microsoft.schemas.livesearch._2008._03.search.MobileWebSearchOption.valueOf(((MobileWebSearchOption) value).name());
					}
				}
				return null;
			}
			
		}, com.microsoft.schemas.livesearch._2008._03.search.MobileWebSearchOption.class);
	}
	
    /**
     * Method description
     *
     * @return
     */
    protected SchemaElementFactory createObjectFactory() {
    	return OBJECT_FACTORY;
    }
	
	private static class SoapElementFactory implements SchemaElementFactory {

		@Override
		public DeepLink createDeepLink() {
			return new DeepLinkImpl();
		}

		@Override
		public Error createError() {
			return new ErrorImpl();
		}

		@Override
		public ImageRequest createImageRequest() {
			return new ImageRequestImpl();
		}

		@Override
		public ImageResponse createImageResponse() {
			return new ImageImpl();
		}

		@Override
		public ImageResult createImageResult() {
			return new ImageResultImpl();
		}

		@Override
		public InstantAnswerResponse createInstantAnswerResponse() {
			return new InstantAnswerImpl();
		}

		@Override
		public InstantAnswerResult createInstantAnswerResult() {
			return new InstantAnswerResultImpl();
		}

		@Override
		public MobileWebRequest createMobileWebRequest() {
			return new MobileWebRequestImpl();
		}

		@Override
		public MobileWebResponse createMobileWebResponse() {
			return new MobileWebImpl();
		}

		@Override
		public MobileWebResult createMobileWebResult() {
			return new MobileWebResultImpl();
		}

		@Override
		public NewsArticle createNewsArticle() {
			return new NewsArticleImpl();
		}

		@Override
		public NewsCollection createNewsCollection() {
			return new NewsCollectionImpl();
		}

		@Override
		public NewsRelatedSearch createNewsRelatedSearch() {
			return new NewsRelatedSearchImpl();
		}

		@Override
		public NewsRequest createNewsRequest() {
			return new NewsRequestImpl();
		}

		@Override
		public NewsResponse createNewsResponse() {
			return new NewsImpl();
		}

		@Override
		public NewsResult createNewsResult() {
			return new NewsResultImpl();
		}

		@Override
		public PhonebookRequest createPhonebookRequest() {
			return new PhonebookRequestImpl();
		}

		@Override
		public PhonebookResponse createPhonebookResponse() {
			return new PhonebookImpl();
		}

		@Override
		public PhonebookResult createPhonebookResult() {
			return new PhonebookResultImpl();
		}

		@Override
		public Query createQuery() {
			return new QueryImpl();
		}

		@Override
		public RelatedSearchResponse createRelatedSearchResponse() {
			return new RelatedSearchImpl();
		}

		@Override
		public RelatedSearchResult createRelatedSearchResult() {
			return new RelatedSearchResultImpl();
		}

		@Override
		public SearchRequest createSearchRequest() {
			return new SearchRequestImpl();
		}

		@Override
		public SearchResponse createSearchResponse() {
			return new SearchResponseImpl();
		}

		@Override
		public SpellResponse createSpellResponse() {
			return new SpellImpl();
		}

		@Override
		public SpellResult createSpellResult() {
			return new SpellResultImpl();
		}

		@Override
		public Thumbnail createThumbnail() {
			return new ThumbnailImpl();
		}

		@Override
		public TranslationRequest createTranslationRequest() {
			return new TranslationRequestImpl();
		}

		@Override
		public TranslationResponse createTranslationResponse() {
			return new TranslationImpl();
		}

		@Override
		public TranslationResult createTranslationResult() {
			return new TranslationResultImpl();
		}

		@Override
		public VideoRequest createVideoRequest() {
			return new VideoRequestImpl();
		}

		@Override
		public VideoResponse createVideoResponse() {
			return new VideoImpl();
		}

		@Override
		public VideoResult createVideoResult() {
			return new VideoResultImpl();
		}

		@Override
		public WebRequest createWebRequest() {
			return new WebRequestImpl();
		}

		@Override
		public WebResponse createWebResponse() {
			return new WebImpl();
		}

		@Override
		public WebResult createWebResult() {
			return new WebResultImpl();
		}

		@Override
		public WebSearchTag createWebSearchTag() {
			return new WebSearchTagImpl();
		}
	}
}
