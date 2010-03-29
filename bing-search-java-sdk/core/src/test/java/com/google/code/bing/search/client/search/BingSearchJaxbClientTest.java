/**
 * 
 */
package com.google.code.bing.search.client.search;

import java.util.concurrent.Future;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.code.bing.search.client.enumeration.ApiProtocol;
import com.google.code.bing.search.schema.SearchResponse;

/**
 * @author nmukhtar
 *
 */
public class BingSearchJaxbClientTest extends BaseBingSearchClientTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		client = factory.createBingSearchClient(ApiProtocol.XML);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		client = null;
	}

	/**
	 * Test method for {@link com.google.code.bing.search.client.impl.BaseBingSearchApiClient#search(com.microsoft.schemas.livesearch._2008._03.search.SearchRequest)}.
	 */
	@Test
	public void testSearch() {
		SearchResponse response = client.search(createSearchRequest());
		assertNotNull("Response should never be null.", response);
	}

	/**
	 * Test method for {@link com.google.code.bing.search.client.impl.BaseBingSearchApiClient#searchAsync(com.microsoft.schemas.livesearch._2008._03.search.SearchRequest)}.
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
