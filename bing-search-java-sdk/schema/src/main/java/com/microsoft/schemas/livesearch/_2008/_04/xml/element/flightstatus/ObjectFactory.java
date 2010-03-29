
package com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ScheduledArrival_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "ScheduledArrival");
    private final static QName _FlightName_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "FlightName");
    private final static QName _AirlineName_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "AirlineName");
    private final static QName _UpdatedDeparture_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "UpdatedDeparture");
    private final static QName _StatusCode_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "StatusCode");
    private final static QName _AirlineCode_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "AirlineCode");
    private final static QName _Name_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "Name");
    private final static QName _FlightNumber_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "FlightNumber");
    private final static QName _DepartureGate_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "DepartureGate");
    private final static QName _UpdatedArrival_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "UpdatedArrival");
    private final static QName _ScheduledDeparture_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "ScheduledDeparture");
    private final static QName _ArrivalGate_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "ArrivalGate");
    private final static QName _DataFreshness_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "DataFreshness");
    private final static QName _ArrivalTerminal_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "ArrivalTerminal");
    private final static QName _FlightHistoryId_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "FlightHistoryId");
    private final static QName _StatusString_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "StatusString");
    private final static QName _OnTimeString_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "OnTimeString");
    private final static QName _DepartureTerminal_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "DepartureTerminal");
    private final static QName _TimeZoneOffset_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "TimeZoneOffset");
    private final static QName _Code_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", "Code");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DestinationAirport }
     * 
     */
    public DestinationAirport createDestinationAirport() {
        return new DestinationAirport();
    }

    /**
     * Create an instance of {@link NextSegment }
     * 
     */
    public NextSegment createNextSegment() {
        return new NextSegment();
    }

    /**
     * Create an instance of {@link PreviousSegment }
     * 
     */
    public PreviousSegment createPreviousSegment() {
        return new PreviousSegment();
    }

    /**
     * Create an instance of {@link OriginAirport }
     * 
     */
    public OriginAirport createOriginAirport() {
        return new OriginAirport();
    }

    /**
     * Create an instance of {@link FlightStatus }
     * 
     */
    public FlightStatus createFlightStatus() {
        return new FlightStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "ScheduledArrival")
    public JAXBElement<String> createScheduledArrival(String value) {
        return new JAXBElement<String>(_ScheduledArrival_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "FlightName")
    public JAXBElement<String> createFlightName(String value) {
        return new JAXBElement<String>(_FlightName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "AirlineName")
    public JAXBElement<String> createAirlineName(String value) {
        return new JAXBElement<String>(_AirlineName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "UpdatedDeparture")
    public JAXBElement<String> createUpdatedDeparture(String value) {
        return new JAXBElement<String>(_UpdatedDeparture_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "StatusCode")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createStatusCode(Long value) {
        return new JAXBElement<Long>(_StatusCode_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "AirlineCode")
    public JAXBElement<String> createAirlineCode(String value) {
        return new JAXBElement<String>(_AirlineCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "FlightNumber")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createFlightNumber(Long value) {
        return new JAXBElement<Long>(_FlightNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "DepartureGate")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createDepartureGate(Long value) {
        return new JAXBElement<Long>(_DepartureGate_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "UpdatedArrival")
    public JAXBElement<String> createUpdatedArrival(String value) {
        return new JAXBElement<String>(_UpdatedArrival_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "ScheduledDeparture")
    public JAXBElement<String> createScheduledDeparture(String value) {
        return new JAXBElement<String>(_ScheduledDeparture_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "ArrivalGate")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createArrivalGate(Long value) {
        return new JAXBElement<Long>(_ArrivalGate_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "DataFreshness")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createDataFreshness(Long value) {
        return new JAXBElement<Long>(_DataFreshness_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "ArrivalTerminal")
    public JAXBElement<String> createArrivalTerminal(String value) {
        return new JAXBElement<String>(_ArrivalTerminal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "FlightHistoryId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createFlightHistoryId(Long value) {
        return new JAXBElement<Long>(_FlightHistoryId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "StatusString")
    public JAXBElement<String> createStatusString(String value) {
        return new JAXBElement<String>(_StatusString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "OnTimeString")
    public JAXBElement<String> createOnTimeString(String value) {
        return new JAXBElement<String>(_OnTimeString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "DepartureTerminal")
    public JAXBElement<String> createDepartureTerminal(String value) {
        return new JAXBElement<String>(_DepartureTerminal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "TimeZoneOffset")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createTimeZoneOffset(Long value) {
        return new JAXBElement<Long>(_TimeZoneOffset_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus", name = "Code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

}
