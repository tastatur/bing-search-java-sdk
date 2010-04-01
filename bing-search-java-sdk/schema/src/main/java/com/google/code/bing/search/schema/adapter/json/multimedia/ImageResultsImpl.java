
package com.google.code.bing.search.schema.adapter.json.multimedia;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.ImageResults;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class ImageResultsImpl
    extends BaseAdapter implements ImageResults, Adaptable<ImageResults, JSONObject>
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
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter  , this);
		for (ImageResult o : getImageResultList()) {
			(getJSONArray(adapter, "ImageResult")).add(((ImageResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (Object o : getJSONArray(adaptee, "ImageResultList")) {
			ImageResultImpl result = new ImageResultImpl();
			result.adaptFrom((JSONObject) o);
			getImageResultList().add(result);
		}
	}
}
