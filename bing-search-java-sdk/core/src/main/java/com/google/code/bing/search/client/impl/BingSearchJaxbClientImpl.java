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

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchException;
import com.google.code.bing.search.client.constant.BingSearchApiUrls.BingSearchApiUrlBuilder;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
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
import com.google.code.bing.search.schema.adapter.jaxb.SearchResponseImpl;
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
import com.google.code.bing.search.schema.web.WebSearchOption;
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
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Error createError() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ImageRequest createImageRequest() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ImageResponse createImageResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ImageResult createImageResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InstantAnswerResponse createInstantAnswerResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public InstantAnswerResult createInstantAnswerResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MobileWebRequest createMobileWebRequest() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MobileWebResponse createMobileWebResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MobileWebResult createMobileWebResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NewsArticle createNewsArticle() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NewsCollection createNewsCollection() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NewsRelatedSearch createNewsRelatedSearch() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NewsRequest createNewsRequest() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NewsResponse createNewsResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NewsResult createNewsResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public PhonebookRequest createPhonebookRequest() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public PhonebookResponse createPhonebookResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public PhonebookResult createPhonebookResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Query createQuery() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RelatedSearchResponse createRelatedSearchResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RelatedSearchResult createRelatedSearchResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SearchRequest createSearchRequest() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SearchResponse createSearchResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SpellResponse createSpellResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public SpellResult createSpellResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Thumbnail createThumbnail() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TranslationRequest createTranslationRequest() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TranslationResponse createTranslationResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TranslationResult createTranslationResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public VideoRequest createVideoRequest() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public VideoResponse createVideoResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public VideoResult createVideoResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebRequest createWebRequest() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebResponse createWebResponse() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebResult createWebResult() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebSearchTag createWebSearchTag() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BingSearchClient client = new BingSearchJaxbClientImpl();
		SearchResponse response = client.search(((BingSearchJaxbClientImpl) client).createSearchRequest());
		for (WebResult result : response.getWeb().getResults().getWebResultList()) {
			System.out.println(result.getTitle());
			System.out.println(result.getDescription());
			System.out.println(result.getUrl());
		}
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
