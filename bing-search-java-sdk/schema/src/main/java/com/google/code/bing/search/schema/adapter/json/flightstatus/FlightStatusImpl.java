
package com.google.code.bing.search.schema.adapter.json.flightstatus;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.flightstatus.DestinationAirport;
import com.google.code.bing.search.schema.flightstatus.FlightStatus;
import com.google.code.bing.search.schema.flightstatus.NextSegment;
import com.google.code.bing.search.schema.flightstatus.OriginAirport;
import com.google.code.bing.search.schema.flightstatus.PreviousSegment;
public class FlightStatusImpl
    extends BaseAdapter implements FlightStatus, Adaptable<FlightStatus, com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.FlightStatus>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String airlineCode;
    protected String airlineName;
    protected Long flightNumber;
    protected String flightName;
    protected Long flightHistoryId;
    protected String statusString;
    protected Long statusCode;
    protected String onTimeString;
    protected String scheduledDeparture;
    protected String updatedDeparture;
    protected String scheduledArrival;
    protected String updatedArrival;
    protected OriginAirportImpl originAirport;
    protected DestinationAirportImpl destinationAirport;
    protected Long departureGate;
    protected String departureTerminal;
    protected Long arrivalGate;
    protected String arrivalTerminal;
    protected PreviousSegmentImpl previousSegment;
    protected NextSegmentImpl nextSegment;
    protected Long dataFreshness;

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String value) {
        this.airlineName = value;
    }

    public Long getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Long value) {
        this.flightNumber = value;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String value) {
        this.flightName = value;
    }

    public Long getFlightHistoryId() {
        return flightHistoryId;
    }

    public void setFlightHistoryId(Long value) {
        this.flightHistoryId = value;
    }

    public String getStatusString() {
        return statusString;
    }

    public void setStatusString(String value) {
        this.statusString = value;
    }

    public Long getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Long value) {
        this.statusCode = value;
    }

    public String getOnTimeString() {
        return onTimeString;
    }

    public void setOnTimeString(String value) {
        this.onTimeString = value;
    }

    public String getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(String value) {
        this.scheduledDeparture = value;
    }

    public String getUpdatedDeparture() {
        return updatedDeparture;
    }

    public void setUpdatedDeparture(String value) {
        this.updatedDeparture = value;
    }

    public String getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(String value) {
        this.scheduledArrival = value;
    }

    public String getUpdatedArrival() {
        return updatedArrival;
    }

    public void setUpdatedArrival(String value) {
        this.updatedArrival = value;
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

    public Long getDepartureGate() {
        return departureGate;
    }

    public void setDepartureGate(Long value) {
        this.departureGate = value;
    }

    public String getDepartureTerminal() {
        return departureTerminal;
    }

    public void setDepartureTerminal(String value) {
        this.departureTerminal = value;
    }

    public Long getArrivalGate() {
        return arrivalGate;
    }

    public void setArrivalGate(Long value) {
        this.arrivalGate = value;
    }

    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    public void setArrivalTerminal(String value) {
        this.arrivalTerminal = value;
    }

    public PreviousSegment getPreviousSegment() {
        return previousSegment;
    }

    public void setPreviousSegment(PreviousSegment value) {
        this.previousSegment = ((PreviousSegmentImpl) value);
    }

    public NextSegment getNextSegment() {
        return nextSegment;
    }

    public void setNextSegment(NextSegment value) {
        this.nextSegment = ((NextSegmentImpl) value);
    }

    public Long getDataFreshness() {
        return dataFreshness;
    }

    public void setDataFreshness(Long value) {
        this.dataFreshness = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.FlightStatus adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.FlightStatus adapter = new com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.FlightStatus();
		copyProperties(adapter    , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.FlightStatus adaptee) {
		copyProperties(this, adaptee);
	}
}
