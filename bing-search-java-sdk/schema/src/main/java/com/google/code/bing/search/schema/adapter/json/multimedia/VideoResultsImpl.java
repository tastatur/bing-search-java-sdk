
package com.google.code.bing.search.schema.adapter.json.multimedia;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.VideoResult;
import com.google.code.bing.search.schema.multimedia.VideoResults;
public class VideoResultsImpl
    extends BaseAdapter implements VideoResults, Adaptable<VideoResults, JSONArray>
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

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (VideoResult o : getVideoResultList()) {
			adapter.add(((VideoResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			VideoResultImpl result = new VideoResultImpl();
			result.adaptFrom((JSONObject) o);
			getVideoResultList().add(result);
		}
	}
}
