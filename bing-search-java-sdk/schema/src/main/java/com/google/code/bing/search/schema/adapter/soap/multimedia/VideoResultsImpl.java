
package com.google.code.bing.search.schema.adapter.soap.multimedia;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.VideoResult;
import com.google.code.bing.search.schema.multimedia.VideoResults;
public class VideoResultsImpl
    extends BaseAdapter implements VideoResults, Adaptable<VideoResults, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfVideoResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<ImageResult> imageResultList;
    protected List<VideoResult> videoResultList;

    public List<VideoResult> getVideoResultList() {
        if (videoResultList == null) {
            videoResultList = new ArrayList<VideoResult>();
        }
        return this.videoResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfVideoResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfVideoResult adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfVideoResult();
		copyProperties(adapter  , this);
		for (VideoResult o : getVideoResultList()) {
			adapter.getVideoResult().add(((VideoResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfVideoResult adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.VideoResult o : adaptee.getVideoResult()) {
			VideoResultImpl result = new VideoResultImpl();
			result.adaptFrom(o);
			getVideoResultList().add(result);
		}
	}
}
