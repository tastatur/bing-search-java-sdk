
package com.google.code.bing.search.schema.adapter.json.multimedia;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.ImageResults;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class ImageResultsImpl
    extends BaseAdapter implements ImageResults, Adaptable<ImageResults, com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResults>
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

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResults adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResults adapter = new com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResults();
		copyProperties(adapter  , this);
		for (ImageResult o : getImageResultList()) {
			adapter.getImageResultList().add(((ImageResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResults adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.multimedia.ImageResult o : adaptee.getImageResultList()) {
			ImageResultImpl result = new ImageResultImpl();
			result.adaptFrom(o);
			getImageResultList().add(result);
		}
	}
}
