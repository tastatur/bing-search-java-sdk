
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.web.DeepLink;
public class DeepLinkImpl
    implements Serializable, DeepLink, Adaptable<DeepLink, com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLink>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLink toAdaptee(
			DeepLink adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeepLink toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLink adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
