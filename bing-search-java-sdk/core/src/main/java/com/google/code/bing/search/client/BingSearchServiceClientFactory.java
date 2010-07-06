/**
 *
 */
package com.google.code.bing.search.client;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.google.code.bing.search.client.impl.BaseBingSearchServiceClientImpl;
import com.google.code.bing.search.client.impl.BingSearchJaxbClientImpl;
import com.google.code.bing.search.client.impl.BingSearchJsonClientImpl;
import com.google.code.bing.search.client.impl.BingSearchRssClientImpl;
import com.google.code.bing.search.client.impl.BingSearchSoapClientImpl;

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class BingSearchServiceClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();
    
    private static final Map<ApiProtocol, Class<? extends BingSearchClient>> clientImplementations = new EnumMap<ApiProtocol, Class<? extends BingSearchClient>>(ApiProtocol.class);
    
    static {
    	clientImplementations.put(ApiProtocol.JSON, BingSearchJsonClientImpl.class);
    	clientImplementations.put(ApiProtocol.XML, BingSearchJaxbClientImpl.class);
    	clientImplementations.put(ApiProtocol.SOAP, BingSearchSoapClientImpl.class);
    	clientImplementations.put(ApiProtocol.RSS, BingSearchRssClientImpl.class);
    }
    
    private BingSearchServiceClientFactory() {}

    /**
     * Sets the task executor to be used for asynchronous API calls. 
     * 
     * @param taskExecutor the task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @param consumerKey the consumer key
     * @param consumerSecret the consumer secret
     * 
     * @return the linked in api client factory
     */
    public static BingSearchServiceClientFactory newInstance() {
        return new BingSearchServiceClientFactory();
    }
    
    /**
     * 
     * 
     */
    public BingSearchClient createBingSearchClient(ApiProtocol protocol) {
    	BaseBingSearchServiceClientImpl client;
		try {
			client = (BaseBingSearchServiceClientImpl) clientImplementations.get(protocol).newInstance();
	    	client.setTaskExecutor(taskExecutor);
	    	return client;
		} catch (Exception e) {
			throw new BingSearchException(e);
		}
    }
}
