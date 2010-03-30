
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.SearchTags;
import com.google.code.bing.search.schema.web.WebSearchTag;
public class SearchTagsImpl
    extends BaseAdapter implements SearchTags, Adaptable<SearchTags, com.microsoft.schemas.livesearch._2008._04.xml.web.SearchTags>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<WebSearchTag> webSearchTagList;

    public List<WebSearchTag> getWebSearchTagList() {
        if (webSearchTagList == null) {
            webSearchTagList = new ArrayList<WebSearchTag>();
        }
        return this.webSearchTagList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.web.SearchTags adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.web.SearchTags adapter = new com.microsoft.schemas.livesearch._2008._04.xml.web.SearchTags();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.web.SearchTags adaptee) {
		copyProperties(this, adaptee);
	}
}
