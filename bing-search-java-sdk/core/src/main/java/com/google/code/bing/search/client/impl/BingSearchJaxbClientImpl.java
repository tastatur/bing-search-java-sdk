/**
 *
 */
package com.google.code.bing.search.client.impl;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.code.bing.search.client.BingSearchClient;
import com.google.code.bing.search.client.BingSearchException;
import com.google.code.bing.search.client.constant.BingSearchApiUrls.BingSearchApiUrlBuilder;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.microsoft.schemas.livesearch._2008._03.search.AdultOption;
import com.microsoft.schemas.livesearch._2008._03.search.ObjectFactory;
import com.microsoft.schemas.livesearch._2008._03.search.SchemaElementFactory;
import com.microsoft.schemas.livesearch._2008._03.search.SearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;
import com.microsoft.schemas.livesearch._2008._03.search.SearchResponse;
import com.microsoft.schemas.livesearch._2008._03.search.SourceType;
import com.microsoft.schemas.livesearch._2008._03.search.WebResult;
import com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption;

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
    		for (com.microsoft.schemas.livesearch._2008._04.xml.web.WebResult result : response.getWeb().getResults().getWebResultList()) {
    			System.out.println(result.getTitle());
    			System.out.println(result.getDescription());
    			System.out.println(result.getUrl());
    		}
            
            return null;
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
	
	private static class JaxbElementFactory extends ObjectFactory implements SchemaElementFactory {
		public JaxbElementFactory() {
			super();
		}
	}
	
	public static void main(String[] args) throws Exception {
		BingSearchClient client = new BingSearchJaxbClientImpl();
		SearchResponse response = client.search(((BingSearchJaxbClientImpl) client).createSearchRequest());
		for (WebResult result : response.getParameters().getWeb().getResults().getWebResult()) {
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
