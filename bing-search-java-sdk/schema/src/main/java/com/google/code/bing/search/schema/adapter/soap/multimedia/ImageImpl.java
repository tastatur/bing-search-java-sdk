
package com.google.code.bing.search.schema.adapter.soap.multimedia;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResponse;
import com.google.code.bing.search.schema.multimedia.ImageResults;
public class ImageImpl
    extends BaseAdapter implements ImageResponse, Adaptable<ImageResponse, com.microsoft.schemas.livesearch._2008._03.search.ImageResponse>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected ImageResultsImpl results;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long value) {
        this.offset = value;
    }

    public ImageResults getResults() {
        return results;
    }

    public void setResults(ImageResults value) {
        this.results = ((ImageResultsImpl) value);
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.ImageResponse adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ImageResponse adapter = new com.microsoft.schemas.livesearch._2008._03.search.ImageResponse();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.setResults(((ImageResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(com.microsoft.schemas.livesearch._2008._03.search.ImageResponse adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ImageResultsImpl results = new ImageResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
