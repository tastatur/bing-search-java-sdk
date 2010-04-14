/**
 *
 */
package com.google.code.bing.search.client.impl;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

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
import com.google.code.bing.search.schema.adapter.jaxb.ErrorImpl;
import com.google.code.bing.search.schema.adapter.jaxb.QueryImpl;
import com.google.code.bing.search.schema.adapter.jaxb.SearchRequestImpl;
import com.google.code.bing.search.schema.adapter.jaxb.SearchResponseImpl;
import com.google.code.bing.search.schema.adapter.jaxb.instantanswer.InstantAnswerImpl;
import com.google.code.bing.search.schema.adapter.jaxb.instantanswer.InstantAnswerResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.mobileweb.MobileWebImpl;
import com.google.code.bing.search.schema.adapter.jaxb.mobileweb.MobileWebRequestImpl;
import com.google.code.bing.search.schema.adapter.jaxb.mobileweb.MobileWebResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.ImageImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.ImageRequestImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.ImageResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.ThumbnailImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.VideoImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.VideoRequestImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.VideoResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.news.NewsArticleImpl;
import com.google.code.bing.search.schema.adapter.jaxb.news.NewsCollectionImpl;
import com.google.code.bing.search.schema.adapter.jaxb.news.NewsImpl;
import com.google.code.bing.search.schema.adapter.jaxb.news.NewsRelatedSearchImpl;
import com.google.code.bing.search.schema.adapter.jaxb.news.NewsRequestImpl;
import com.google.code.bing.search.schema.adapter.jaxb.news.NewsResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.phonebook.PhonebookImpl;
import com.google.code.bing.search.schema.adapter.jaxb.phonebook.PhonebookRequestImpl;
import com.google.code.bing.search.schema.adapter.jaxb.phonebook.PhonebookResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.relatedsearch.RelatedSearchImpl;
import com.google.code.bing.search.schema.adapter.jaxb.relatedsearch.RelatedSearchResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.spell.SpellImpl;
import com.google.code.bing.search.schema.adapter.jaxb.spell.SpellResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.translation.TranslationImpl;
import com.google.code.bing.search.schema.adapter.jaxb.translation.TranslationRequestImpl;
import com.google.code.bing.search.schema.adapter.jaxb.translation.TranslationResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.web.DeepLinkImpl;
import com.google.code.bing.search.schema.adapter.jaxb.web.WebImpl;
import com.google.code.bing.search.schema.adapter.jaxb.web.WebRequestImpl;
import com.google.code.bing.search.schema.adapter.jaxb.web.WebResultImpl;
import com.google.code.bing.search.schema.adapter.jaxb.web.WebSearchTagImpl;
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
public class BingSearchJaxbClientImpl extends BaseBingSearchApiClient {

    /** Field description */
    private static final String JAXB_PACKAGE_NAME = "com.microsoft.schemas.livesearch._2008._04.xml.element";
    
    /** Field description */
    private static final ApiProtocol SUPPORTED_PROTOCOL = ApiProtocol.XML;
    
    /** Field description */
    private static final SchemaElementFactory OBJECT_FACTORY = new JaxbElementFactory();
    
    /** Do not access directly. It may be null!!!. Use {@link #getJaxbContext()} */
    private static JAXBContext JAXB_CONTEXT;
    
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
    protected <T> T unmarshallObject(Class<T> clazz, InputStream xmlContent) {
        try {
            Unmarshaller u  = getJaxbContext().createUnmarshaller();
            
            com.microsoft.schemas.livesearch._2008._04.xml.element.SearchResponse response = (com.microsoft.schemas.livesearch._2008._04.xml.element.SearchResponse) u.unmarshal(xmlContent);
            Adaptable<?, com.microsoft.schemas.livesearch._2008._04.xml.element.SearchResponse> adaptable = (Adaptable<?, com.microsoft.schemas.livesearch._2008._04.xml.element.SearchResponse>) ADAPTER_CLASSES_MAP.get(clazz).newInstance();
            
            adaptable.adaptFrom(response);
            return (T) adaptable;
        } catch (JAXBException e) {
            throw new BingSearchException(e);
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
            Marshaller   m = getJaxbContext().createMarshaller();

            m.marshal(element, writer);

            return writer.toString();
        } catch (JAXBException e) {
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

    /**
     * Method description
     *
     */
	protected JAXBContext getJaxbContext() throws JAXBException {
		if (JAXB_CONTEXT == null ) {
			JAXB_CONTEXT = JAXBContext.newInstance(JAXB_PACKAGE_NAME);
		}
		return JAXB_CONTEXT;
	}

    /**
     * Method description
     *
     */
	protected void setJaxbContext(JAXBContext context) {
		JAXB_CONTEXT = context;
	}
	
	private static class JaxbElementFactory implements SchemaElementFactory {

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
