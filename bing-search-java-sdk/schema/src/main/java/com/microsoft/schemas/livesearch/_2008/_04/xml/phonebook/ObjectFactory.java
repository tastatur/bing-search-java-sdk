
package com.microsoft.schemas.livesearch._2008._04.xml.phonebook;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.phonebook package. 
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

    private final static QName _UniqueId_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "UniqueId");
    private final static QName _UserRating_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "UserRating");
    private final static QName _PostalCode_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "PostalCode");
    private final static QName _Offset_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "Offset");
    private final static QName _Business_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "Business");
    private final static QName _ReviewCount_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "ReviewCount");
    private final static QName _Longitude_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "Longitude");
    private final static QName _LocalSerpUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "LocalSerpUrl");
    private final static QName _Latitude_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "Latitude");
    private final static QName _Title_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "Title");
    private final static QName _City_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "City");
    private final static QName _Total_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "Total");
    private final static QName _Address_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "Address");
    private final static QName _DisplayUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "DisplayUrl");
    private final static QName _StateOrProvince_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "StateOrProvince");
    private final static QName _Url_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "Url");
    private final static QName _BusinessUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "BusinessUrl");
    private final static QName _PhoneNumber_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "PhoneNumber");
    private final static QName _CountryOrRegion_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", "CountryOrRegion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.phonebook
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link PhonebookResult }
     * 
     */
    public PhonebookResult createPhonebookResult() {
        return new PhonebookResult();
    }

    /**
     * Create an instance of {@link Phonebook }
     * 
     */
    public Phonebook createPhonebook() {
        return new Phonebook();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "UniqueId")
    public JAXBElement<String> createUniqueId(String value) {
        return new JAXBElement<String>(_UniqueId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "UserRating")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Double> createUserRating(Double value) {
        return new JAXBElement<Double>(_UserRating_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "PostalCode")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "Offset")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createOffset(Long value) {
        return new JAXBElement<Long>(_Offset_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "Business")
    public JAXBElement<String> createBusiness(String value) {
        return new JAXBElement<String>(_Business_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "ReviewCount")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createReviewCount(Long value) {
        return new JAXBElement<Long>(_ReviewCount_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "Longitude")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Double> createLongitude(Double value) {
        return new JAXBElement<Double>(_Longitude_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "LocalSerpUrl")
    public JAXBElement<String> createLocalSerpUrl(String value) {
        return new JAXBElement<String>(_LocalSerpUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "Latitude")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Double> createLatitude(Double value) {
        return new JAXBElement<Double>(_Latitude_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "Total")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createTotal(Long value) {
        return new JAXBElement<Long>(_Total_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "Address")
    public JAXBElement<String> createAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "DisplayUrl")
    public JAXBElement<String> createDisplayUrl(String value) {
        return new JAXBElement<String>(_DisplayUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "StateOrProvince")
    public JAXBElement<String> createStateOrProvince(String value) {
        return new JAXBElement<String>(_StateOrProvince_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "Url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "BusinessUrl")
    public JAXBElement<String> createBusinessUrl(String value) {
        return new JAXBElement<String>(_BusinessUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "PhoneNumber")
    public JAXBElement<String> createPhoneNumber(String value) {
        return new JAXBElement<String>(_PhoneNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook", name = "CountryOrRegion")
    public JAXBElement<String> createCountryOrRegion(String value) {
        return new JAXBElement<String>(_CountryOrRegion_QNAME, String.class, null, value);
    }

}
