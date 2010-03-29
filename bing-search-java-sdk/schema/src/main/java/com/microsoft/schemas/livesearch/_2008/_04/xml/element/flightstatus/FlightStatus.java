
package com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}AirlineCode" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}AirlineName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}FlightNumber" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}FlightName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}FlightHistoryId" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}StatusString" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}StatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}OnTimeString" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}ScheduledDeparture" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}UpdatedDeparture" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}ScheduledArrival" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}UpdatedArrival" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}OriginAirport" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}DestinationAirport" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}DepartureGate" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}DepartureTerminal" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}ArrivalGate" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}ArrivalTerminal" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}PreviousSegment" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}NextSegment" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}DataFreshness" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airlineCode",
    "airlineName",
    "flightNumber",
    "flightName",
    "flightHistoryId",
    "statusString",
    "statusCode",
    "onTimeString",
    "scheduledDeparture",
    "updatedDeparture",
    "scheduledArrival",
    "updatedArrival",
    "originAirport",
    "destinationAirport",
    "departureGate",
    "departureTerminal",
    "arrivalGate",
    "arrivalTerminal",
    "previousSegment",
    "nextSegment",
    "dataFreshness"
})
@XmlRootElement(name = "FlightStatus")
public class FlightStatus
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "AirlineName")
    protected String airlineName;
    @XmlElement(name = "FlightNumber", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long flightNumber;
    @XmlElement(name = "FlightName")
    protected String flightName;
    @XmlElement(name = "FlightHistoryId", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long flightHistoryId;
    @XmlElement(name = "StatusString")
    protected String statusString;
    @XmlElement(name = "StatusCode", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long statusCode;
    @XmlElement(name = "OnTimeString")
    protected String onTimeString;
    @XmlElement(name = "ScheduledDeparture")
    protected String scheduledDeparture;
    @XmlElement(name = "UpdatedDeparture")
    protected String updatedDeparture;
    @XmlElement(name = "ScheduledArrival")
    protected String scheduledArrival;
    @XmlElement(name = "UpdatedArrival")
    protected String updatedArrival;
    @XmlElement(name = "OriginAirport")
    protected OriginAirport originAirport;
    @XmlElement(name = "DestinationAirport")
    protected DestinationAirport destinationAirport;
    @XmlElement(name = "DepartureGate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long departureGate;
    @XmlElement(name = "DepartureTerminal")
    protected String departureTerminal;
    @XmlElement(name = "ArrivalGate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long arrivalGate;
    @XmlElement(name = "ArrivalTerminal")
    protected String arrivalTerminal;
    @XmlElement(name = "PreviousSegment")
    protected PreviousSegment previousSegment;
    @XmlElement(name = "NextSegment")
    protected NextSegment nextSegment;
    @XmlElement(name = "DataFreshness", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long dataFreshness;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the airlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the value of the airlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineName(String value) {
        this.airlineName = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(Long value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the flightName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightName() {
        return flightName;
    }

    /**
     * Sets the value of the flightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightName(String value) {
        this.flightName = value;
    }

    /**
     * Gets the value of the flightHistoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getFlightHistoryId() {
        return flightHistoryId;
    }

    /**
     * Sets the value of the flightHistoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightHistoryId(Long value) {
        this.flightHistoryId = value;
    }

    /**
     * Gets the value of the statusString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusString() {
        return statusString;
    }

    /**
     * Sets the value of the statusString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusString(String value) {
        this.statusString = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(Long value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the onTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnTimeString() {
        return onTimeString;
    }

    /**
     * Sets the value of the onTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnTimeString(String value) {
        this.onTimeString = value;
    }

    /**
     * Gets the value of the scheduledDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDeparture() {
        return scheduledDeparture;
    }

    /**
     * Sets the value of the scheduledDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeparture(String value) {
        this.scheduledDeparture = value;
    }

    /**
     * Gets the value of the updatedDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedDeparture() {
        return updatedDeparture;
    }

    /**
     * Sets the value of the updatedDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDeparture(String value) {
        this.updatedDeparture = value;
    }

    /**
     * Gets the value of the scheduledArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledArrival() {
        return scheduledArrival;
    }

    /**
     * Sets the value of the scheduledArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledArrival(String value) {
        this.scheduledArrival = value;
    }

    /**
     * Gets the value of the updatedArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedArrival() {
        return updatedArrival;
    }

    /**
     * Sets the value of the updatedArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedArrival(String value) {
        this.updatedArrival = value;
    }

    /**
     * Gets the value of the originAirport property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAirport }
     *     
     */
    public OriginAirport getOriginAirport() {
        return originAirport;
    }

    /**
     * Sets the value of the originAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAirport }
     *     
     */
    public void setOriginAirport(OriginAirport value) {
        this.originAirport = value;
    }

    /**
     * Gets the value of the destinationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationAirport }
     *     
     */
    public DestinationAirport getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * Sets the value of the destinationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationAirport }
     *     
     */
    public void setDestinationAirport(DestinationAirport value) {
        this.destinationAirport = value;
    }

    /**
     * Gets the value of the departureGate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDepartureGate() {
        return departureGate;
    }

    /**
     * Sets the value of the departureGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureGate(Long value) {
        this.departureGate = value;
    }

    /**
     * Gets the value of the departureTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTerminal() {
        return departureTerminal;
    }

    /**
     * Sets the value of the departureTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTerminal(String value) {
        this.departureTerminal = value;
    }

    /**
     * Gets the value of the arrivalGate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getArrivalGate() {
        return arrivalGate;
    }

    /**
     * Sets the value of the arrivalGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalGate(Long value) {
        this.arrivalGate = value;
    }

    /**
     * Gets the value of the arrivalTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    /**
     * Sets the value of the arrivalTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTerminal(String value) {
        this.arrivalTerminal = value;
    }

    /**
     * Gets the value of the previousSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousSegment }
     *     
     */
    public PreviousSegment getPreviousSegment() {
        return previousSegment;
    }

    /**
     * Sets the value of the previousSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousSegment }
     *     
     */
    public void setPreviousSegment(PreviousSegment value) {
        this.previousSegment = value;
    }

    /**
     * Gets the value of the nextSegment property.
     * 
     * @return
     *     possible object is
     *     {@link NextSegment }
     *     
     */
    public NextSegment getNextSegment() {
        return nextSegment;
    }

    /**
     * Sets the value of the nextSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextSegment }
     *     
     */
    public void setNextSegment(NextSegment value) {
        this.nextSegment = value;
    }

    /**
     * Gets the value of the dataFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDataFreshness() {
        return dataFreshness;
    }

    /**
     * Sets the value of the dataFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFreshness(Long value) {
        this.dataFreshness = value;
    }

}
