
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.web.SearchTags;
import com.google.code.bing.search.schema.web.WebSearchTag;
public class SearchTagsImpl
    implements Serializable, SearchTags, Adaptable<SearchTags, com.microsoft.schemas.livesearch._2008._04.xml.web.SearchTags>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.web.SearchTags toAdaptee(
			SearchTags adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchTags toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.web.SearchTags adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
