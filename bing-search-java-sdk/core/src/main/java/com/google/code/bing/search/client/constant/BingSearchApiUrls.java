/**
 *
 */
package com.google.code.bing.search.client.constant;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.microsoft.schemas.livesearch._2008._03.search.ImageRequest;
import com.microsoft.schemas.livesearch._2008._03.search.MobileWebRequest;
import com.microsoft.schemas.livesearch._2008._03.search.NewsRequest;
import com.microsoft.schemas.livesearch._2008._03.search.PhonebookRequest;
import com.microsoft.schemas.livesearch._2008._03.search.SearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequest;
import com.microsoft.schemas.livesearch._2008._03.search.SearchRequestParameters;
import com.microsoft.schemas.livesearch._2008._03.search.SourceType;
import com.microsoft.schemas.livesearch._2008._03.search.TranslationRequest;
import com.microsoft.schemas.livesearch._2008._03.search.VideoRequest;
import com.microsoft.schemas.livesearch._2008._03.search.WebRequest;
import com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption;

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
		private ApiProtocol protocol;
    	
    	/** The parameters map. */
	    private Map<String, String> parametersMap = new HashMap<String, String>();
    	
    	/**
	     * Instantiates a new linked in api url builder.
	     * 
	     * @param urlFormat the url format
	     */
	    public BingSearchApiUrlBuilder(String urlFormat, ApiProtocol protocol) {
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
    	
    	/**
	     * With parameter.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the linked in api url builder
	     */
	    private BingSearchApiUrlBuilder withParameter(String name, List<String> values) {
	    	if (values != null && values.size() > 0) {
	    		StringBuilder builder = new StringBuilder();
	    		Iterator<String> iter = values.iterator();
	    		while (iter.hasNext()) {
	    			builder.append(encodeUrl(iter.next()));
	    			if (iter.hasNext()) {
	    				builder.append("+");
	    			}
	    		}
	    		parametersMap.put(name, builder.toString());
	    	}
    		
    		return this;
    	}
	    
    	/**
	     * With parameter.
	     * 
	     * @param name the name
	     * @param value the value
	     * 
	     * @return the linked in api url builder
	     */
	    private BingSearchApiUrlBuilder withParameter(String name, Object value) {
	    	if (value != null) {
	    		parametersMap.put(name, encodeUrl(value.toString()));
	    	}
    		
    		return this;
    	}
	    
	    public BingSearchApiUrlBuilder withSearchRequest(SearchRequest request) {
	    	if (request.getParameters() != null) {
	    		SearchRequestParameters parameters = request.getParameters();
	    		withParameter("Version", parameters.getVersion());
	    		withParameter("Market", parameters.getMarket());
	    		withParameter("UILanguage", parameters.getUILanguage());
	    		withParameter("Query", parameters.getQuery());
	    		if (parameters.getAdult() != null) {
		    		withParameter("Adult", parameters.getAdult().value());
	    		}
	    		withParameter("AppId", parameters.getAppId());
	    		withParameter("Latitude", parameters.getLatitude());
	    		withParameter("Longitude", parameters.getLongitude());
	    		withParameter("Radius", parameters.getRadius());
	    		if (parameters.getOptions() != null) {
	    			List<String> values = new ArrayList<String>(); 
	    			for (SearchOption option : parameters.getOptions().getSearchOption()) {
	    				values.add(option.value());
	    			}
		    		withParameter("Options", values);
	    		}
	    		if (parameters.getSources() != null) {
	    			List<String> values = new ArrayList<String>(); 
	    			for (SourceType sourceType : parameters.getSources().getSourceType()) {
	    				values.add(sourceType.value());
	    			}
	    			withParameter("Sources", values);
	    		}
	    		if (parameters.getWeb() != null) {
	    			withWebRequest("Web", parameters.getWeb());
	    		}
	    		if (parameters.getImage() != null) {
	    			withImageRequest("Image", parameters.getImage());
	    		}
	    		if (parameters.getPhonebook() != null) {
	    			withPhonebookRequest("Phonebook", parameters.getPhonebook());
	    		}
	    		if (parameters.getVideo() != null) {
	    			withVideoRequest("Video", parameters.getVideo());
	    		}
	    		if (parameters.getNews() != null) {
	    			withNewsRequest("News", parameters.getNews());
	    		}
	    		if (parameters.getMobileWeb() != null) {
	    			withMobileWebRequest("MobileWeb", parameters.getMobileWeb());
	    		}
	    		if (parameters.getTranslation() != null) {
	    			withTranslationRequest("Translation", parameters.getTranslation());
	    		}
	    	}
    		return this;
    	}
	    
	    public BingSearchApiUrlBuilder withWebRequest(String name, WebRequest request) {
	    	withParameter(name + ".Offset", request.getOffset());
	    	withParameter(name + ".Count", request.getCount());
	    	withParameter(name + ".FileType", request.getFileType());
	    	
    		if (request.getOptions() != null) {
    			List<String> values = new ArrayList<String>(); 
    			for (WebSearchOption option : request.getOptions().getWebSearchOption()) {
    				values.add(option.value());
    			}
    			withParameter(name + ".Options", values);
    		}
    		if (request.getSearchTags() != null) {
    			List<String> values = new ArrayList<String>(); 
    			for (String tag : request.getSearchTags().getString()) {
    				values.add(tag);
    			}
    			withParameter(name + ".SearchTags", values);
    		}
	    	
	    	return this;
	    }
	    
	    public BingSearchApiUrlBuilder withImageRequest(String name, ImageRequest request) {
	    	// TODO-NM Implement this method
	    	return this;
	    }
	    
	    public BingSearchApiUrlBuilder withPhonebookRequest(String name, PhonebookRequest request) {
	    	// TODO-NM Implement this method
	    	return this;
	    }
	    
	    public BingSearchApiUrlBuilder withVideoRequest(String name, VideoRequest request) {
	    	// TODO-NM Implement this method
	    	return this;
	    }
	    
	    public BingSearchApiUrlBuilder withNewsRequest(String name, NewsRequest request) {
	    	// TODO-NM Implement this method
	    	return this;
	    }
	    
	    public BingSearchApiUrlBuilder withMobileWebRequest(String name, MobileWebRequest request) {
	    	// TODO-NM Implement this method
	    	return this;
	    }
	    
	    public BingSearchApiUrlBuilder withTranslationRequest(String name, TranslationRequest request) {
	    	// TODO-NM Implement this method
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
        				urlBuilder.append(protocol.value());
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
