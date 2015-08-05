# This project is open for adoption. #
**I am no longer available to maintain it and am looking for developers who can take on the responsibility. Please send me an email at nabeelmukhtar@gmail.com with links to your Github or Google Code accounts. Thanks.**

The Bing Application Programming Interface (API), Version 2, enables developers to programmatically submit queries to and retrieve results from the Bing Engine.

For more information about Bing API 2.0 see http://msdn.microsoft.com/en-us/library/dd251056.aspx.

This project provides a Java wrapper to the Bing API 2.0. It uses JSON as the data protocol.

**Starting with Build 2.0.176, the library is compatible with Android and Google App Engine as well.**

A typical usage of the API is given below:

```
BingSearchServiceClientFactory factory = BingSearchServiceClientFactory.newInstance();
BingSearchClient client = factory.createBingSearchClient();

SearchRequestBuilder builder = client.newSearchRequestBuilder();
builder.withAppId(applicationId);
builder.withQuery("msdn blogs");
builder.withSourceType(SourceType.WEB);
builder.withVersion("2.0");
builder.withMarket("en-us");
builder.withAdultOption(AdultOption.MODERATE);
builder.withSearchOption(SearchOption.ENABLE_HIGHLIGHTING);

builder.withWebRequestCount(10L);
builder.withWebRequestOffset(0L);
builder.withWebRequestSearchOption(WebSearchOption.DISABLE_HOST_COLLAPSING);
builder.withWebRequestSearchOption(WebSearchOption.DISABLE_QUERY_ALTERATIONS);

SearchResponse response = client.search(builder.getResult());

for (WebResult result : response.getWeb().getResults()) {
	System.out.println(result.getTitle());
	System.out.println(result.getDescription());
	System.out.println(result.getUrl());
	System.out.println(result.getDateTime());
}
```

Before you can use the Bing API you will have to create an AppID from here (http://www.bing.com/developers/createapp.aspx).

For additional examples see the examples source code here (http://code.google.com/p/bing-search-java-sdk/source/browse/#svn/trunk/bing-search-java-sdk/examples).