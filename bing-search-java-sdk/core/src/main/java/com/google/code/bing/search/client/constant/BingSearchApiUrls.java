/**
 *
 */
package com.google.code.bing.search.client.constant;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;

/**
 * The Class LinkedInApiUrls.
 */
public final class BingSearchApiUrls {

    /** The Constant API_URLS_FILE. */
    public static final String API_URLS_FILE = "BingSearchApiUrls.properties";

    /** The static logger. */
    private static final Logger LOG = Logger.getLogger(BingSearchApiUrls.class.getCanonicalName());
    
    /** The Constant linkedInApiUrls. */
    private static final Properties bingSearchApiUrls = new Properties();

    static {
        try {
            bingSearchApiUrls.load(BingSearchApiUrls.class.getResourceAsStream(API_URLS_FILE));
        } catch (IOException e) {
        	LOG.log(Level.SEVERE, "An error occurred while loading urls.", e);
        }
    }

    /** The Constant BASE_URL. */
    public static final String BASE_URL =
        bingSearchApiUrls.getProperty("com.google.code.bing.search.client.url");

    /**
     * Instantiates a new linked in api urls.
     */
    private BingSearchApiUrls() {}

    /**
     * The Class LinkedInApiUrlBuilder.
     */
    public static class BingSearchApiUrlBuilder {
        
        /** The Constant API_URLS_PLACEHOLDER_START. */
        private static final char API_URLS_PLACEHOLDER_START = '{';

        /** The Constant API_URLS_PLACEHOLDER_END. */
        private static final char API_URLS_PLACEHOLDER_END = '}';
        
        /** The Constant PROTOCOL_PLACEHOLDER. */
        private static final String PROTOCOL_PLACEHOLDER = "protocol";
    	
        /** The Constant PROTOCOL_PLACEHOLDER. */
        private static final String QUERY_PARAMETERS_PLACEHOLDER = "queryParameters";
        
    	/** The url format. */
	    private String urlFormat;
    	
	    /** The protocol. */
		private String protocol;
    	
    	/** The parameters map. */
	    private Map<String, String> parametersMap = new HashMap<String, String>();
    	
    	/**
	     * Instantiates a new linked in api url builder.
	     * 
	     * @param urlFormat the url format
	     */
	    public BingSearchApiUrlBuilder(String urlFormat, String protocol) {
    		this.urlFormat = urlFormat;
    		this.protocol = protocol;
    	}
    	
    	/**
	     * With parameter.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the linked in api url builder
	     */
	    public BingSearchApiUrlBuilder withParameter(String name, String value) {
	    	if (value != null && value.length() > 0) {
	    		parametersMap.put(name, encodeUrl(value));
	    	}
    		
    		return this;
    	}
    	
	    public BingSearchApiUrlBuilder withSearchRequest(SearchRequest request) {
	    	// TODO-NM: Implement this method..Fill parametersMap.
    		return this;
    	}
	    
    	/**
	     * Builds the url.
	     * 
	     * @return the string
	     */
		public String buildUrl() {
        	StringBuilder urlBuilder = new StringBuilder();
        	StringBuilder placeHolderBuilder = new StringBuilder();
        	boolean placeHolderFlag = false;
        	for (int i = 0; i < urlFormat.length(); i++) {
        		if (urlFormat.charAt(i) == API_URLS_PLACEHOLDER_START) {
        			placeHolderBuilder = new StringBuilder();
        			placeHolderFlag = true;
        		} else if (placeHolderFlag && urlFormat.charAt(i) == API_URLS_PLACEHOLDER_END) {
        			String placeHolder = placeHolderBuilder.toString();
        			if (PROTOCOL_PLACEHOLDER.equals(placeHolder)) {
        				urlBuilder.append(protocol);
        			} else if (QUERY_PARAMETERS_PLACEHOLDER.equals(placeHolder)) {
    			    	StringBuilder builder = new StringBuilder();
    			    	if (!parametersMap.isEmpty()) {
    			        	builder.append("?");
    			    		Iterator<String> iter = parametersMap.keySet().iterator();
    			    		while (iter.hasNext()) {
    			    			String name = iter.next();
			    				String value = parametersMap.get(name);
			    				builder.append(name);
			    				builder.append("=");
			    				builder.append(value);
    			    			if (iter.hasNext()) {
    			    				builder.append("&");
    			    			}
    			    		}
    			    	}
    			    	urlBuilder.append(builder.toString());
        			} else {
        				// we did not find a binding for the placeholder.
        				// append it as it is.
        				urlBuilder.append(API_URLS_PLACEHOLDER_START);
        				urlBuilder.append(placeHolder);
        				urlBuilder.append(API_URLS_PLACEHOLDER_END);
        			}
        			placeHolderFlag = false;
        		} else if (placeHolderFlag) {
        			placeHolderBuilder.append(urlFormat.charAt(i));
        		} else {
        			urlBuilder.append(urlFormat.charAt(i));
        		}
        	}

        	return urlBuilder.toString();
    	}
    	
        /**
         * Encode url.
         * 
         * @param original the original
         * @param encoding the encoding
         * 
         * @return the string
         */
        private static String encodeUrl(String original) {
        	try {
    			return URLEncoder.encode(original, ApplicationConstants.CONTENT_ENCODING);
    		} catch (UnsupportedEncodingException e) {
    			// should never be here..
    			return original;
    		}
        }
    }
}
