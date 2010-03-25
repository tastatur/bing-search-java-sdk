/**
 *
 */
package com.google.code.bing.search.client.impl;
import java.io.InputStream;
import java.io.StringWriter;

import com.google.code.bing.search.client.BingSearchException;
import com.google.code.bing.search.client.constant.BingSearchApiUrls.BingSearchApiUrlBuilder;
import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.microsoft.schemas.livesearch._2008._03.search.ObjectFactory;
import com.microsoft.schemas.livesearch._2008._03.search.SchemaElementFactory;

/**
 * @author Nabeel Mukhtar
 *
 */
public class BingSearchJsonClientImpl extends BaseBingSearchApiClient {

    /** Field description */
    private static final SchemaElementFactory OBJECT_FACTORY = new JsonElementFactory();
    
    /** Field description */
    private static final ApiProtocol SUPPORTED_PROTOCOL = ApiProtocol.JSON;
    
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
        	// TODO-NM: Implement this method
            return (T) null;
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
    
	private static class JsonElementFactory extends ObjectFactory implements SchemaElementFactory {
		public JsonElementFactory() {
			super();
		}
	}
}
