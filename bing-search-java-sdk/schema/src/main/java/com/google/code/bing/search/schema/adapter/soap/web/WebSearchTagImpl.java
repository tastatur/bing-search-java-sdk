
package com.google.code.bing.search.schema.adapter.soap.web;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.WebSearchTag;
public class WebSearchTagImpl
    extends BaseAdapter implements WebSearchTag, Adaptable<WebSearchTag, com.microsoft.schemas.livesearch._2008._03.search.WebSearchTag>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String name;
    protected String value;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.WebSearchTag adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.WebSearchTag adapter = new com.microsoft.schemas.livesearch._2008._03.search.WebSearchTag();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.WebSearchTag adaptee) {
		copyProperties(this, adaptee);
	}
}
