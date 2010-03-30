
package com.google.code.bing.search.schema.adapter.json.multimedia;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResponse;
import com.google.code.bing.search.schema.multimedia.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Image;
public class ImageImpl
    extends BaseAdapter implements ImageResponse, Adaptable<ImageResponse, Image>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected ResultsImpl results;

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

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

	@Override
	public Image adaptTo() {
		Image adapter = new Image();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(Image adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
