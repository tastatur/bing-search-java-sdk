/**
 *
 */
package com.google.code.bing.search.client.impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderFactory;

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
//            NamespaceFilter filter = new NamespaceFilter("http://schemas.microsoft.com/LiveSearch/2008/03/Search", true);
//
//          //Create an XMLReader to use with our filter
//            XMLReader reader = XMLReaderFactory.createXMLReader();
//
//            filter.setParent(reader);
//
//            //Prepare the input, in this case a java.io.File (output)
//            InputSource is = new InputSource(xmlContent);
//
//            //Create a SAXSource specifying the filter
//            SAXSource source = new SAXSource(filter, is);
            
            return (T) u.unmarshal(xmlContent);
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
	
	private static class NamespaceFilter extends XMLFilterImpl {

	    private String usedNamespaceUri;
	    private boolean addNamespace;

	    //State variable
	    private boolean addedNamespace = false;

	    public NamespaceFilter(String namespaceUri,
	            boolean addNamespace) {
	        super();

	        if (addNamespace)
	            this.usedNamespaceUri = namespaceUri;
	        else 
	            this.usedNamespaceUri = "";
	        this.addNamespace = addNamespace;
	    }



	    @Override
	    public void startDocument() throws SAXException {
	        super.startDocument();
	        if (addNamespace) {
	            startControlledPrefixMapping();
	        }
	    }



	    @Override
	    public void startElement(String arg0, String arg1, String arg2,
	            Attributes arg3) throws SAXException {

	        super.startElement(this.usedNamespaceUri, arg1, arg2, arg3);
	    }

	    @Override
	    public void endElement(String arg0, String arg1, String arg2)
	            throws SAXException {

	        super.endElement(this.usedNamespaceUri, arg1, arg2);
	    }

	    @Override
	    public void startPrefixMapping(String prefix, String url)
	            throws SAXException {


	        if (addNamespace) {
	            this.startControlledPrefixMapping();
	        } else {
	            //Remove the namespace, i.e. don´t call startPrefixMapping for parent!
	        }

	    }

	    private void startControlledPrefixMapping() throws SAXException {

	        if (this.addNamespace && !this.addedNamespace) {
	            //We should add namespace since it is set and has not yet been done.
	            super.startPrefixMapping("", this.usedNamespaceUri);

	            //Make sure we dont do it twice
	            this.addedNamespace = true;
	        }
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
	
	/**
	 * Stolen liberally from http://www.kodejava.org/examples/266.html
	 */
	protected static String convertStreamToString(InputStream is) {
        /*
         * To convert the InputStream to String we use the BufferedReader.readLine()
         * method. We iterate until the BufferedReader return null which means
         * there's no more data to read. Each line will appended to a StringBuilder
         * and returned as String.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
 
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
        return sb.toString();
    }
}
