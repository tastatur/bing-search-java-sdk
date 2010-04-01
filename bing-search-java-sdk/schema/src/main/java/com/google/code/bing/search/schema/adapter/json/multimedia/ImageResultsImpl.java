
package com.google.code.bing.search.schema.adapter.json.multimedia;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.ImageResults;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class ImageResultsImpl
    extends BaseAdapter implements ImageResults, Adaptable<ImageResults, JSONArray>
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

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (ImageResult o : getImageResultList()) {
			adapter.add(((ImageResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			ImageResultImpl result = new ImageResultImpl();
			result.adaptFrom((JSONObject) o);
			getImageResultList().add(result);
		}
	}
}
