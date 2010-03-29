
package com.google.code.bing.search.schema.flightstatus.impl;

import java.io.Serializable;
import com.google.code.bing.search.schema.flightstatus.DestinationAirport;
import com.google.code.bing.search.schema.flightstatus.NextSegment;
import com.google.code.bing.search.schema.flightstatus.OriginAirport;
public class NextSegmentImpl
    implements Serializable, NextSegment
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

}
