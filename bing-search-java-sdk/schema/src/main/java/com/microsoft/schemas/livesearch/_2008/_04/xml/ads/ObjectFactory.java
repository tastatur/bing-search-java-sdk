
package com.microsoft.schemas.livesearch._2008._04.xml.ads;

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
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.ads package. 
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

    private final static QName _Total_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "Total");
    private final static QName _AdApiVersion_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "AdApiVersion");
    private final static QName _Title_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "Title");
    private final static QName _DisplayUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "DisplayUrl");
    private final static QName _AdLinkUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "AdLinkUrl");
    private final static QName _Position_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "Position");
    private final static QName _Description_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "Description");
    private final static QName _Rank_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "Rank");
    private final static QName _PageNumber_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", "PageNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.ads
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdResult }
     * 
     */
    public AdResult createAdResult() {
        return new AdResult();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link Ad }
     * 
     */
    public Ad createAd() {
        return new Ad();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "Total")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createTotal(Long value) {
        return new JAXBElement<Long>(_Total_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "AdApiVersion")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Double> createAdApiVersion(Double value) {
        return new JAXBElement<Double>(_AdApiVersion_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "DisplayUrl")
    public JAXBElement<String> createDisplayUrl(String value) {
        return new JAXBElement<String>(_DisplayUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "AdLinkUrl")
    public JAXBElement<String> createAdLinkUrl(String value) {
        return new JAXBElement<String>(_AdLinkUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "Position")
    public JAXBElement<String> createPosition(String value) {
        return new JAXBElement<String>(_Position_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "Rank")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createRank(Long value) {
        return new JAXBElement<Long>(_Rank_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads", name = "PageNumber")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createPageNumber(Long value) {
        return new JAXBElement<Long>(_PageNumber_QNAME, Long.class, null, value);
    }

}
