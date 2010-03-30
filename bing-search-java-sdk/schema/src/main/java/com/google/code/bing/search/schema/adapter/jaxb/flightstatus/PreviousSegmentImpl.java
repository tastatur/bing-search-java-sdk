
package com.google.code.bing.search.schema.adapter.jaxb.flightstatus;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.flightstatus.DestinationAirport;
import com.google.code.bing.search.schema.flightstatus.OriginAirport;
import com.google.code.bing.search.schema.flightstatus.PreviousSegment;
public class PreviousSegmentImpl
    extends BaseAdapter implements PreviousSegment, Adaptable<PreviousSegment, com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.PreviousSegment>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long flightHistoryId;
    protected OriginAirportImpl originAirport;
    protected DestinationAirportImpl destinationAirport;

    public Long getFlightHistoryId() {
        return flightHistoryId;
    }

    public void setFlightHistoryId(Long value) {
        this.flightHistoryId = value;
    }

    public OriginAirport getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(OriginAirport value) {
        this.originAirport = ((OriginAirportImpl) value);
    }

    public DestinationAirport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(DestinationAirport value) {
        this.destinationAirport = ((DestinationAirportImpl) value);
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.PreviousSegment adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.PreviousSegment adapter = new com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.PreviousSegment();
		copyProperties(adapter , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.PreviousSegment adaptee) {
		copyProperties(this, adaptee);
	}
}
