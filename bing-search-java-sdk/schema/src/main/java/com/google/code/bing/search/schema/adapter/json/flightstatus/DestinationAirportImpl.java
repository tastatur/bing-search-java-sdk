
package com.google.code.bing.search.schema.adapter.json.flightstatus;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.flightstatus.DestinationAirport;
public class DestinationAirportImpl
    extends BaseAdapter implements DestinationAirport, Adaptable<DestinationAirport, com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.DestinationAirport>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.DestinationAirport adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.DestinationAirport adapter = new com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.DestinationAirport();
		copyProperties(adapter    , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.DestinationAirport adaptee) {
		copyProperties(this, adaptee);
	}
}
