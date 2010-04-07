/**
 *
 */
package com.google.code.bing.search.client.impl;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

import com.google.code.bing.search.client.BingSearchException;
import com.google.code.bing.search.client.constant.BingSearchApiUrls;
import com.google.code.bing.search.client.constant.BingSearchApiUrls.BingSearchApiUrlBuilder;
import com.google.code.bing.search.schema.SchemaElementFactory;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.ads.AdRequest;
import com.google.code.bing.search.schema.ads.AdResponse;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerRequest;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResponse;
import com.google.code.bing.search.schema.mobileweb.MobileWebRequest;
import com.google.code.bing.search.schema.mobileweb.MobileWebResponse;
import com.google.code.bing.search.schema.multimedia.ImageRequest;
import com.google.code.bing.search.schema.multimedia.ImageResponse;
import com.google.code.bing.search.schema.multimedia.VideoRequest;
import com.google.code.bing.search.schema.multimedia.VideoResponse;
import com.google.code.bing.search.schema.news.NewsRequest;
import com.google.code.bing.search.schema.news.NewsResponse;
import com.google.code.bing.search.schema.phonebook.PhonebookRequest;
import com.google.code.bing.search.schema.phonebook.PhonebookResponse;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchRequest;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.spell.SpellRequest;
import com.google.code.bing.search.schema.spell.SpellResponse;
import com.google.code.bing.search.schema.translation.TranslationRequest;
import com.google.code.bing.search.schema.translation.TranslationResponse;
import com.google.code.bing.search.schema.web.WebRequest;
import com.google.code.bing.search.schema.web.WebResponse;

/**
 * @author Nabeel Mukhtar
 *
 */
public abstract class BaseBingSearchApiClient extends BaseBingSearchServiceClientImpl {

    /** Field description */
    private static final String GZIP_ENCODING = "gzip";

    /** The static logger. */
    protected final Logger LOG = Logger.getLogger(getClass().getCanonicalName());
    
    /** Field description */
    private Map<String, String> requestHeaders;
    
    /**
     * Constructs ...
     *
     *
     * @param consumerKey
     * @param consumerSecret
     */
    protected BaseBingSearchApiClient() {
        requestHeaders = new HashMap<String, String>();

        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
    }

    /**
     * {@inheritDoc}
     */
    public void setRequestHeaders(Map<String, String> requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    /**
     * {@inheritDoc}
     */
    public Map<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * {@inheritDoc}
     */
    public void addRequestHeader(String headerName, String headerValue) {
        requestHeaders.put(headerName, headerValue);
    }

    /**
     * {@inheritDoc}
     */
    public void removeRequestHeader(String headerName) {
        requestHeaders.remove(headerName);
    }

    /**
     * Method description
     *
     *
     * @param task
     *
     * @return
     */
    @SuppressWarnings("unchecked")
	protected Future execute(Runnable task) {
        return taskExecutor.submit(task);
    }

    /**
     * Method description
     *
     *
     * @param task
     * @param <T>
     *
     * @return
     */
    protected <T> Future<T> execute(Callable<T> task) {
        return taskExecutor.submit(task);
    }
    
    /**
     * {@inheritDoc}
     */
	@Override
	public SearchResponse search(SearchRequest request) {
        assertNotNull("search request", request);

        BingSearchApiUrlBuilder builder = createBingSearchApiUrlBuilder(BingSearchApiUrls.BASE_URL);
        String                apiUrl  =
            builder.withSearchRequest(request).buildUrl();

        return readResponse(SearchResponse.class, callApiMethod(apiUrl));
	}

    /**
     * {@inheritDoc}
     */
	@Override
	public Future<SearchResponse> searchAsync(final SearchRequest request) {
		return execute(new Callable<SearchResponse>() {
            @Override
            public SearchResponse call() throws Exception {
                return search(request);
            }
        });	
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
    
    /**
     * Method description
     *
     *
     *
     *
     * @param clazz
     * @param is
     * @param <T>
     *
     * @return
     */
    protected <T> T readResponse(Class<T> clazz, InputStream is) {
        try {
            return unmarshallObject(clazz, is);
        } finally {
            closeStream(is);
        }
    }

    /**
     *
     *
     * @param apiUrl
     * @param httpHeaders
     *
     * @return
     */
    protected InputStream callApiMethod(String apiUrl) {
        return callApiMethod(apiUrl, HttpURLConnection.HTTP_OK);
    }

    /**
     *
     *
     * @param apiUrl
     * @param expected
     * @param httpHeaders
     *
     * @return
     */
    protected InputStream callApiMethod(String apiUrl, int expected) {
        try {
            URL               url     = new URL(apiUrl);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();

            for (String headerName : requestHeaders.keySet()) {
                request.setRequestProperty(headerName, requestHeaders.get(headerName));
            }
            
            request.connect();

            if (request.getResponseCode() != expected) {
                Error error = readResponse(Error.class,
                                           getWrappedInputStream(request.getErrorStream(),
                                               GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding())));

                throw createBingSearchApiClientException(error);
            } else {
                return getWrappedInputStream(request.getInputStream(),
                                             GZIP_ENCODING.equalsIgnoreCase(request.getContentEncoding()));
            }
        } catch (IOException e) {
            throw new BingSearchException(e);
        }
    }

    /**
     * Method description
     *
     *
     * @param is
     *
     */
    protected void closeStream(InputStream is) {
        try {
            is.close();
        } catch (IOException e) {
        	LOG.log(Level.SEVERE, "An error occurred while closing stream.", e);	
        }
    }

    /**
     * Method description
     *
     *
     * @param connection
     *
     */
    protected void closeConnection(HttpURLConnection connection) {
        try {
        	if (connection != null) {
        		connection.disconnect();
        	}
        } catch (Exception e) {
        	LOG.log(Level.SEVERE, "An error occurred while disconnecting connection.", e);	
        }
    }
    
    /**
     * Method description
     *
     *
     * @param error
     * @return
     */
    protected BingSearchException createBingSearchApiClientException(Error error) {
        return new BingSearchException();
    }

    /**
     * Method description
     *
     *
     * @param is
     * @param gzip
     * @return
     * @throws IOException
     */
    protected InputStream getWrappedInputStream(InputStream is, boolean gzip) throws IOException {
        if (gzip) {
            return new BufferedInputStream(new GZIPInputStream(is));
        } else {
            return new BufferedInputStream(is);
        }
    }

    /**
     * Get property as long.
     *
     * @param s
     *
     * @return
     */
    protected boolean isNullOrEmpty(String s) {
        return ((s == null) || (s.length() == 0));
    }

    /**
     *
     *
     * @param name
     * @param value
     */
    protected void assertNotNullOrEmpty(String name, String value) {
        if (isNullOrEmpty(value)) {
            throw new IllegalArgumentException(name + " cannot be null or empty.");
        }
    }

    /**
     *
     *
     * @param name
     * @param value
     */
    protected void assertNotNullOrEmpty(String name, Collection<?> value) {
        if ((value == null) || value.isEmpty()) {
            throw new IllegalArgumentException(name + " cannot be null or empty.");
        }
    }

    /**
     *
     *
     * @param name
     * @param value
     */
    protected void assertPositiveNumber(String name, int value) {
        if (value < 0) {
            throw new IllegalArgumentException(name + " cannot be less than zero.");
        }
    }

    /**
     *
     *
     * @param name
     * @param value
     */
    protected void assertNotNull(String name, Object value) {
        if (value == null) {
            throw new IllegalArgumentException(name + " cannot be null.");
        }
    }

    /**
     * Method description
     *
     *
     *
     * @param clazz
     * @param xmlContent
     * @param <T>
     *
     * @return
     */
    protected abstract <T> T unmarshallObject(Class<T> clazz, InputStream xmlContent);

    /**
     * Method description
     *
     *
     * @param element
     *
     * @return
     */
    protected abstract String marshallObject(Object element);

    /**
     * Method description
     *
     *
     * @param urlFormat
     *
     * @return
     */
    protected abstract BingSearchApiUrlBuilder createBingSearchApiUrlBuilder(String urlFormat);

    /**
     * Method description
     *
     * @return
     */
    protected abstract SchemaElementFactory createObjectFactory();
}
