
package com.google.code.bing.search.schema.adapter.soap.mobileweb;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
public class MobileWebResultImpl
    extends BaseAdapter implements MobileWebResult, Adaptable<MobileWebResult, com.microsoft.schemas.livesearch._2008._03.search.MobileWebResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String description;
    protected String url;
    protected String displayUrl;
    protected String dateTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String value) {
        this.dateTime = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.MobileWebResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.MobileWebResult adapter = new com.microsoft.schemas.livesearch._2008._03.search.MobileWebResult();
		copyProperties(adapter , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.MobileWebResult adaptee) {
		copyProperties(this, adaptee);
	}
}
