/**
 *
 */
package com.google.code.bing.search.client.impl;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.code.bing.search.client.BingSearchException;
import com.google.code.bing.search.client.constant.BingSearchApiUrls.BingSearchApiUrlBuilder;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.google.code.bing.search.schema.Error;
import com.google.code.bing.search.schema.Query;
import com.google.code.bing.search.schema.SchemaElementFactory;
import com.google.code.bing.search.schema.SchemaEntity;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.json.ErrorImpl;
import com.google.code.bing.search.schema.adapter.json.QueryImpl;
import com.google.code.bing.search.schema.adapter.json.SearchRequestImpl;
import com.google.code.bing.search.schema.adapter.json.SearchResponseImpl;
import com.google.code.bing.search.schema.adapter.json.instantanswer.InstantAnswerImpl;
import com.google.code.bing.search.schema.adapter.json.instantanswer.InstantAnswerResultImpl;
import com.google.code.bing.search.schema.adapter.json.mobileweb.MobileWebImpl;
import com.google.code.bing.search.schema.adapter.json.mobileweb.MobileWebRequestImpl;
import com.google.code.bing.search.schema.adapter.json.mobileweb.MobileWebResultImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.ImageImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.ImageRequestImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.ImageResultImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.ThumbnailImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.VideoImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.VideoRequestImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.VideoResultImpl;
import com.google.code.bing.search.schema.adapter.json.news.NewsArticleImpl;
import com.google.code.bing.search.schema.adapter.json.news.NewsCollectionImpl;
import com.google.code.bing.search.schema.adapter.json.news.NewsImpl;
import com.google.code.bing.search.schema.adapter.json.news.NewsRelatedSearchImpl;
import com.google.code.bing.search.schema.adapter.json.news.NewsRequestImpl;
import com.google.code.bing.search.schema.adapter.json.news.NewsResultImpl;
import com.google.code.bing.search.schema.adapter.json.phonebook.PhonebookImpl;
import com.google.code.bing.search.schema.adapter.json.phonebook.PhonebookRequestImpl;
import com.google.code.bing.search.schema.adapter.json.phonebook.PhonebookResultImpl;
import com.google.code.bing.search.schema.adapter.json.relatedsearch.RelatedSearchImpl;
import com.google.code.bing.search.schema.adapter.json.relatedsearch.RelatedSearchResultImpl;
import com.google.code.bing.search.schema.adapter.json.spell.SpellImpl;
import com.google.code.bing.search.schema.adapter.json.spell.SpellResultImpl;
import com.google.code.bing.search.schema.adapter.json.translation.TranslationImpl;
import com.google.code.bing.search.schema.adapter.json.translation.TranslationRequestImpl;
import com.google.code.bing.search.schema.adapter.json.translation.TranslationResultImpl;
import com.google.code.bing.search.schema.adapter.json.web.DeepLinkImpl;
import com.google.code.bing.search.schema.adapter.json.web.WebImpl;
import com.google.code.bing.search.schema.adapter.json.web.WebRequestImpl;
import com.google.code.bing.search.schema.adapter.json.web.WebResultImpl;
import com.google.code.bing.search.schema.adapter.json.web.WebSearchTagImpl;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResponse;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResult;
import com.google.code.bing.search.schema.mobileweb.MobileWebRequest;
import com.google.code.bing.search.schema.mobileweb.MobileWebResponse;
import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
import com.google.code.bing.search.schema.multimedia.ImageRequest;
import com.google.code.bing.search.schema.multimedia.ImageResponse;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.Thumbnail;
import com.google.code.bing.search.schema.multimedia.VideoRequest;
import com.google.code.bing.search.schema.multimedia.VideoResponse;
import com.google.code.bing.search.schema.multimedia.VideoResult;
import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsCollection;
import com.google.code.bing.search.schema.news.NewsRelatedSearch;
import com.google.code.bing.search.schema.news.NewsRequest;
import com.google.code.bing.search.schema.news.NewsResponse;
import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.phonebook.PhonebookRequest;
import com.google.code.bing.search.schema.phonebook.PhonebookResponse;
import com.google.code.bing.search.schema.phonebook.PhonebookResult;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResult;
import com.google.code.bing.search.schema.spell.SpellResponse;
import com.google.code.bing.search.schema.spell.SpellResult;
import com.google.code.bing.search.schema.translation.TranslationRequest;
import com.google.code.bing.search.schema.translation.TranslationResponse;
import com.google.code.bing.search.schema.translation.TranslationResult;
import com.google.code.bing.search.schema.web.DeepLink;
import com.google.code.bing.search.schema.web.WebRequest;
import com.google.code.bing.search.schema.web.WebResponse;
import com.google.code.bing.search.schema.web.WebResult;
import com.google.code.bing.search.schema.web.WebSearchTag;

/**
 * @author Nabeel Mukhtar
 *
 */
public class BingSearchJsonClientImpl extends BaseBingSearchApiClient {

    /** Field description */
    private static final SchemaElementFactory OBJECT_FACTORY = new JsonElementFactory();
    
    /** Field description */
    private static final ApiProtocol SUPPORTED_PROTOCOL = ApiProtocol.JSON;
    
    private final JSONParser parser = new JSONParser();
    
    /** Field description */
	private static final Map<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>> ADAPTER_CLASSES_MAP = new HashMap<Class<? extends SchemaEntity>, Class<? extends Adaptable<?, ?>>>();
	
	static {
		ADAPTER_CLASSES_MAP.put(SearchResponse.class, SearchResponseImpl.class);
	}
    
    /**
     * Method description
     *
     *
     * @param xmlContent
     * @param <T>
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    protected <T> T unmarshallObject(Class<T> clazz, InputStream jsonContent) {
        try {
        	Object response = parser.parse(new InputStreamReader(jsonContent));
        	if (response instanceof JSONObject) {
        		Adaptable<?, JSONObject> adaptable = (Adaptable<?, JSONObject>) ADAPTER_CLASSES_MAP.get(clazz).newInstance();
        		adaptable.adaptFrom((JSONObject) response);
        		return (T) adaptable;
        	}
        	throw new BingSearchException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new BingSearchException(e);
        }
    }

    /**
     * Method description
     *
     *
     * @param element
     *
     * @return
     */
    protected String marshallObject(Object element) {
        try {
            StringWriter writer = new StringWriter();
            
            // TODO-NM: Implement this method.
            return writer.toString();
        } catch (Exception e) {
            throw new BingSearchException(e);
        }
    }

    /**
     * Method description
     *
     * @return
     */
    protected SchemaElementFactory createObjectFactory() {
    	return OBJECT_FACTORY;
    }
    
    /**
     * Method description
     *
     *
     * @param urlFormat
     *
     * @return
     */
    protected BingSearchApiUrlBuilder createBingSearchApiUrlBuilder(String urlFormat) {
        return new BingSearchApiUrlBuilder(urlFormat, SUPPORTED_PROTOCOL);
    }
    
	private static class JsonElementFactory implements SchemaElementFactory {
		public JsonElementFactory() {
			super();
		}

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
