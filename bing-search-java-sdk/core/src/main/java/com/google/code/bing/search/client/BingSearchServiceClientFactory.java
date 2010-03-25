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

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class BingSearchServiceClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();
    
    private Map<ApiProtocol, ? extends BaseBingSearchServiceClientImpl> clientImplementations = new EnumMap<ApiProtocol, BaseBingSearchServiceClientImpl>(ApiProtocol.class);
    
    private BingSearchServiceClientFactory() {
    	// TODO-NM: populate map from properties file.
    }

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
    	BaseBingSearchServiceClientImpl client = clientImplementations.get(protocol);
    	client.setTaskExecutor(taskExecutor);
    	return client;
    }
}
