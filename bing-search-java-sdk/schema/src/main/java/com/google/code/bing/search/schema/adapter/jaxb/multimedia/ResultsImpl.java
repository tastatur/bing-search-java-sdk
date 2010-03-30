
package com.google.code.bing.search.schema.adapter.jaxb.multimedia;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.Results;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Results>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<ImageResult> imageResultList;
    protected List<VideoResult> videoResultList;

    public List<ImageResult> getImageResultList() {
        if (imageResultList == null) {
            imageResultList = new ArrayList<ImageResult>();
        }
        return this.imageResultList;
    }

    public List<VideoResult> getVideoResultList() {
        if (videoResultList == null) {
            videoResultList = new ArrayList<VideoResult>();
        }
        return this.videoResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Results adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Results adapter = new com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Results();
		copyProperties(adapter  , this);
		for (ImageResult o : getImageResultList()) {
			adapter.getImageResultList().add(((ImageResultImpl) o).adaptTo());
		}
		for (VideoResult o : getVideoResultList()) {
			adapter.getVideoResultList().add(((VideoResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Results adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResult o : adaptee.getImageResultList()) {
			ImageResultImpl result = new ImageResultImpl();
			result.adaptFrom(o);
			getImageResultList().add(result);
		}
		for (com.microsoft.schemas.livesearch._2008._04.xml.multimedia.VideoResult o : adaptee.getVideoResultList()) {
			VideoResultImpl result = new VideoResultImpl();
			result.adaptFrom(o);
			getVideoResultList().add(result);
		}
	}
}
