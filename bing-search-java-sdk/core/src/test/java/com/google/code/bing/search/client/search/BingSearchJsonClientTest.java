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
package com.google.code.bing.search.client.search;

import java.util.concurrent.Future;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.code.bing.search.schema.SearchResponse;

/**
 * The Class BingSearchJsonClientTest.
 */
public class BingSearchJsonClientTest extends BaseBingSearchClientTest {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		client = factory.createBingSearchClient();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		client = null;
	}

	/**
	 * Test search.
	 */
	@Test
	public void testSearch() {
		SearchResponse response = client.search(createSearchRequest());
		assertNotNull("Response should never be null.", response);
	}

	/**
	 * Test search async.
	 */
	@Test
	public void testSearchAsync() {
		Future<SearchResponse> response = client.searchAsync(createSearchRequest());
		try {
			assertNotNull("Response should never be null.", response.get());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
