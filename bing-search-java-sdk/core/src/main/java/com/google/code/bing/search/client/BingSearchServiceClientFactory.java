/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.google.code.bing.search.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.code.bing.search.client.impl.BingSearchJsonClientImpl;

/**
 * A factory for creating BingSearchServiceClient objects.
 */
public class BingSearchServiceClientFactory {

    /** The task executor. */
    private ExecutorService taskExecutor = Executors.newCachedThreadPool();
    
    /**
     * Instantiates a new bing search service client factory.
     */
    private BingSearchServiceClientFactory() {}

    /**
     * Sets the task executor.
     * 
     * @param taskExecutor the new task executor
     */
	public void setTaskExecutor(ExecutorService taskExecutor) {
        this.taskExecutor = taskExecutor;
	}

    /**
     * New instance.
     * 
     * @return the bing search service client factory
     */
    public static BingSearchServiceClientFactory newInstance() {
        return new BingSearchServiceClientFactory();
    }
    
    /**
     * Creates a new BingSearchServiceClient object.
     * 
     * @return the bing search client
     */
    public BingSearchClient createBingSearchClient() {
    	BingSearchClient client = new BingSearchJsonClientImpl();
    	((BingSearchJsonClientImpl) client).setTaskExecutor(taskExecutor);
    	return client;
    }
}
