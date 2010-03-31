
package com.google.code.bing.search.schema.adapter.soap.web;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.SearchTags;
import com.google.code.bing.search.schema.web.WebSearchTag;
public class SearchTagsImpl
    extends BaseAdapter implements SearchTags, Adaptable<SearchTags, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebSearchTag>
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
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebSearchTag adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebSearchTag adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebSearchTag();
		copyProperties(adapter, this);
		for (WebSearchTag o : getWebSearchTagList()) {
			adapter.getWebSearchTag().add(((WebSearchTagImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebSearchTag adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.WebSearchTag o : adaptee.getWebSearchTag()) {
			WebSearchTagImpl result = new WebSearchTagImpl();
			result.adaptFrom(o);
			getWebSearchTagList().add(result);
		}
	}
}
