
package com.google.code.bing.search.schema.adapter.jaxb.flightstatus;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.flightstatus.OriginAirport;
public class OriginAirportImpl
    implements Serializable, OriginAirport, Adaptable<OriginAirport, com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.OriginAirport>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.OriginAirport toAdaptee(
			OriginAirport adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OriginAirport toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.OriginAirport adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
