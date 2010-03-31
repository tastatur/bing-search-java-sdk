
package com.google.code.bing.search.schema.adapter.soap.web;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.DeepLink;
public class DeepLinkImpl
    extends BaseAdapter implements DeepLink, Adaptable<DeepLink, com.microsoft.schemas.livesearch._2008._03.search.DeepLink>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.DeepLink adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.DeepLink adapter = new com.microsoft.schemas.livesearch._2008._03.search.DeepLink();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.DeepLink adaptee) {
		copyProperties(this, adaptee);
	}
}
