
package com.google.code.bing.search.schema.adapter.soap.ads;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.ads.AdResult;

public class AdResultImpl
    extends BaseAdapter implements AdResult, Adaptable<AdResult, com.microsoft.schemas.livesearch._2008._04.xml.ads.AdResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long rank;
    protected String position;
    protected String title;
    protected String description;
    protected String displayUrl;
    protected String adLinkUrl;

    public Long getRank() {
        return rank;
    }

    public void setRank(Long value) {
        this.rank = value;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String value) {
        this.position = value;
    }

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

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    public String getAdLinkUrl() {
        return adLinkUrl;
    }

    public void setAdLinkUrl(String value) {
        this.adLinkUrl = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.ads.AdResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.ads.AdResult adapter = new com.microsoft.schemas.livesearch._2008._04.xml.ads.AdResult();
		copyProperties(adapter  , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.ads.AdResult adaptee) {
		copyProperties(this, adaptee);
	}
}