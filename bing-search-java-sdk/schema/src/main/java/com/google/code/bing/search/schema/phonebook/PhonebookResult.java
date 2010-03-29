
package com.google.code.bing.search.schema.phonebook;

import com.google.code.bing.search.schema.SchemaEntity;


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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}Title"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}Url"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}Business"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}PhoneNumber"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}Address"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}City"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}StateOrProvince"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}CountryOrRegion"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}PostalCode"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}Latitude"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}Longitude"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}UniqueId"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}BusinessUrl"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}UserRating"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}ReviewCount"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}DisplayUrl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface PhonebookResult
    extends SchemaEntity
{


    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitle(String value);

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUrl();

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUrl(String value);

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBusiness();

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBusiness(String value);

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPhoneNumber();

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPhoneNumber(String value);

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAddress();

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAddress(String value);

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCity();

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCity(String value);

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getStateOrProvince();

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setStateOrProvince(String value);

    /**
     * Gets the value of the countryOrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCountryOrRegion();

    /**
     * Sets the value of the countryOrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCountryOrRegion(String value);

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPostalCode();

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPostalCode(String value);

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Double getLatitude();

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLatitude(Double value);

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Double getLongitude();

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLongitude(Double value);

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUniqueId();

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUniqueId(String value);

    /**
     * Gets the value of the businessUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBusinessUrl();

    /**
     * Sets the value of the businessUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBusinessUrl(String value);

    /**
     * Gets the value of the userRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Double getUserRating();

    /**
     * Sets the value of the userRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUserRating(Double value);

    /**
     * Gets the value of the reviewCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getReviewCount();

    /**
     * Sets the value of the reviewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setReviewCount(Long value);

    /**
     * Gets the value of the displayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDisplayUrl();

    /**
     * Sets the value of the displayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDisplayUrl(String value);

}
