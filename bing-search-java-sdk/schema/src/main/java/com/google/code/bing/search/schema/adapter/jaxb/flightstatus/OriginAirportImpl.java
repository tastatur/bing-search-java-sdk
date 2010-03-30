
package com.google.code.bing.search.schema.adapter.jaxb.flightstatus;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.flightstatus.OriginAirport;
public class OriginAirportImpl
    extends BaseAdapter implements OriginAirport, Adaptable<OriginAirport, com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.OriginAirport>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String code;
    protected String name;
    protected Long timeZoneOffset;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Long getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(Long value) {
        this.timeZoneOffset = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.OriginAirport adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.OriginAirport adapter = new com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.OriginAirport();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.OriginAirport adaptee) {
		copyProperties(this, adaptee);
	}
}
