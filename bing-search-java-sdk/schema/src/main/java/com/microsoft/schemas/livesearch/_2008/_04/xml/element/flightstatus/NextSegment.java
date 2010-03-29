
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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}FlightHistoryId" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}OriginAirport" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}DestinationAirport" minOccurs="0"/>
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
    "flightHistoryId",
    "originAirport",
    "destinationAirport"
})
@XmlRootElement(name = "NextSegment")
public class NextSegment
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "FlightHistoryId", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long flightHistoryId;
    @XmlElement(name = "OriginAirport")
    protected OriginAirport originAirport;
    @XmlElement(name = "DestinationAirport")
    protected DestinationAirport destinationAirport;

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

}
