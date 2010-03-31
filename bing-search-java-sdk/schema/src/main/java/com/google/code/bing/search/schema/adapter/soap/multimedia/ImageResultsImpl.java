
package com.google.code.bing.search.schema.adapter.soap.multimedia;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.ImageResults;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class ImageResultsImpl
    extends BaseAdapter implements ImageResults, Adaptable<ImageResults, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfImageResult>
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
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfImageResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfImageResult adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfImageResult();
		copyProperties(adapter  , this);
		for (ImageResult o : getImageResultList()) {
			adapter.getImageResult().add(((ImageResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfImageResult adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.ImageResult o : adaptee.getImageResult()) {
			ImageResultImpl result = new ImageResultImpl();
			result.adaptFrom(o);
			getImageResultList().add(result);
		}
	}
}
