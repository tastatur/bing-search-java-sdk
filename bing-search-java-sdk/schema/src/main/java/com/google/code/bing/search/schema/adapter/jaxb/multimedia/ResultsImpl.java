
package com.google.code.bing.search.schema.adapter.jaxb.multimedia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.Results;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class ResultsImpl
    implements Serializable, Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Results>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Results toAdaptee(
			Results adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Results toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Results adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
