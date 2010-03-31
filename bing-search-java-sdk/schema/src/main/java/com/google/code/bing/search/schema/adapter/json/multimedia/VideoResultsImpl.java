
package com.google.code.bing.search.schema.adapter.json.multimedia;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.VideoResult;
import com.google.code.bing.search.schema.multimedia.VideoResults;
public class VideoResultsImpl
    extends BaseAdapter implements VideoResults, Adaptable<VideoResults, JSONObject>
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
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter  , this);
		for (VideoResult o : getVideoResultList()) {
			adapter.getVideoResultList().add(((VideoResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.multimedia.VideoResult o : adaptee.getVideoResultList()) {
			VideoResultImpl result = new VideoResultImpl();
			result.adaptFrom(o);
			getVideoResultList().add(result);
		}
	}
}
