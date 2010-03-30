
package com.google.code.bing.search.schema.adapter.json.multimedia;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.Thumbnail;
public class ImageResultImpl
    extends BaseAdapter implements ImageResult, Adaptable<ImageResult, com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String mediaUrl;
    protected String url;
    protected String displayUrl;
    protected Long width;
    protected Long height;
    protected Long fileSize;
    protected String contentType;
    protected ThumbnailImpl thumbnail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String value) {
        this.mediaUrl = value;
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

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String value) {
        this.contentType = value;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail value) {
        this.thumbnail = ((ThumbnailImpl) value);
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResult adapter = new com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResult();
		copyProperties(adapter , this);
		if (getThumbnail() != null) {
			adapter.setThumbnail(((ThumbnailImpl) getThumbnail()).adaptTo());
		}
		
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResult adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getThumbnail() != null) {
			ThumbnailImpl thumbnail = new ThumbnailImpl();
			thumbnail.adaptFrom(adaptee.getThumbnail());
			setThumbnail(thumbnail);
		}
	}
}