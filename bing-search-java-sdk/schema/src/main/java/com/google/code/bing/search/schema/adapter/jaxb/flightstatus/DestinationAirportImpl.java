
package com.google.code.bing.search.schema.adapter.jaxb.flightstatus;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.flightstatus.DestinationAirport;
public class DestinationAirportImpl
    implements Serializable, DestinationAirport, Adaptable<DestinationAirport, com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.DestinationAirport>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.DestinationAirport toAdaptee(
			DestinationAirport adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DestinationAirport toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.DestinationAirport adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
