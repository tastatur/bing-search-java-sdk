
package com.google.code.bing.search.schema.adapter.json.flightstatus;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.flightstatus.DestinationAirport;
import com.google.code.bing.search.schema.flightstatus.NextSegment;
import com.google.code.bing.search.schema.flightstatus.OriginAirport;
public class NextSegmentImpl
    extends BaseAdapter implements NextSegment, Adaptable<NextSegment, com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.NextSegment>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.NextSegment adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.NextSegment adapter = new com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.NextSegment();
		copyProperties(adapter     , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.NextSegment adaptee) {
		copyProperties(this, adaptee);
	}
}
