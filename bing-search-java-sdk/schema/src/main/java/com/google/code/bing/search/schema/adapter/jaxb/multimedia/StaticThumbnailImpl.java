
package com.google.code.bing.search.schema.adapter.jaxb.multimedia;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.multimedia.StaticThumbnail;
public class StaticThumbnailImpl
    implements Serializable, StaticThumbnail, Adaptable<StaticThumbnail, com.microsoft.schemas.livesearch._2008._04.xml.multimedia.StaticThumbnail>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String url;
    protected String contentType;
    protected Long width;
    protected Long height;
    protected Long fileSize;
    protected Long runTime;

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String value) {
        this.contentType = value;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long value) {
        this.width = value;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long value) {
        this.height = value;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    public Long getRunTime() {
        return runTime;
    }

    public void setRunTime(Long value) {
        this.runTime = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.multimedia.StaticThumbnail toAdaptee(
			StaticThumbnail adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StaticThumbnail toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.multimedia.StaticThumbnail adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
