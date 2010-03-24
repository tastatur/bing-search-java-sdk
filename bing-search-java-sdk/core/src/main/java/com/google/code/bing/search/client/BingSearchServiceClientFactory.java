/**
 *
 */
package com.google.code.bing.search.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * A factory for creating LinkedInApiClient objects.
 * 
 * @author Nabeel Mukhtar
 */
public class BingSearchServiceClientFactory {

    /** The Constant factoriesMap. */
//    private static final Map<LinkedInApiConsumer, BingMapsWebServicesClientFactory> factoriesMap =
//        new ConcurrentHashMap<LinkedInApiConsumer, BingMapsWebServicesClientFactory>();
    
    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();

//    /**
//     * Instantiates a new linked in api client factory.
//     * 
//     * @param apiConsumer the api consumer
//     */
//	private BingMapsWebServicesClientFactory(LinkedInApiConsumer apiConsumer) {
//        this.apiConsumer = apiConsumer;
//    }
	
    /**
     * Sets the task executor to be used for asynchronous API calls. 
     * 
     * @param taskExecutor the task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

//    /**
//     * New instance.
//     * 
//     * @param consumerKey the consumer key
//     * @param consumerSecret the consumer secret
//     * 
//     * @return the linked in api client factory
//     */
//    public static BingMapsWebServicesClientFactory newInstance(String consumerKey, String consumerSecret) {
//        return newInstance(new LinkedInApiConsumer(consumerKey, consumerSecret));
//    }
//
//    /**
//     * New instance.
//     * 
//     * @param apiConsumer the api consumer
//     * 
//     * @return the linked in api client factory
//     */
//    public static synchronized BingMapsWebServicesClientFactory newInstance(LinkedInApiConsumer apiConsumer) {
//    	validateConsumerKey(apiConsumer);
//    	
//        LinkedInApiClientFactory factory = factoriesMap.get(apiConsumer);
//
//        if (factory == null) {
//            factory = new LinkedInApiClientFactory(apiConsumer);
//            factoriesMap.put(apiConsumer, factory);
//        }
//
//        return factory;
//    }
//
//    /**
//     * Creates a new LinkedInApiClient object.
//     * 
//     * @param accessToken the access token
//     * 
//     * @return the linked in api client
//     */
//    @SuppressWarnings("unchecked")
//	public LinkedInApiClient createLinkedInApiClient(LinkedInAccessToken accessToken) {
//    	validateAccessToken(accessToken);
//    	try {
//    		if (defaultClientImpl == null) {
//        		Class<? extends LinkedInApiClient> clazz = (Class<? extends LinkedInApiClient>) Class.forName(ApplicationConstants.CLIENT_DEFAULT_IMPL);
//        		
//        		defaultClientImpl = clazz.getConstructor(String.class, String.class);
//    		}
//			
//			final LinkedInApiClient client = defaultClientImpl.newInstance(apiConsumer.getConsumerKey(), apiConsumer.getConsumerSecret());
//
//			client.setAccessToken(accessToken);
//
//	        return client;
//		} catch (Exception e) {
//			throw new LinkedInApiClientException(e);
//		}
//    }
//
//    /**
//     * Creates a new LinkedInApiClient object.
//     * 
//     * @param accessToken the access token
//     * 
//     * @return the async linked in api client
//     */
//    public AsyncLinkedInApiClient createAsyncLinkedInApiClient(LinkedInAccessToken accessToken) {
//    	validateAccessToken(accessToken);
//        final LinkedInApiClient client = createLinkedInApiClient(accessToken);
//
//        return new AsyncLinkedInApiClientAdapter(client, taskExecutor);
//    }    
}
