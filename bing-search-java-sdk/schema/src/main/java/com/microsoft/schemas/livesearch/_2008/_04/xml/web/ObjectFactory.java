
package com.microsoft.schemas.livesearch._2008._04.xml.web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.web package. 
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

    private final static QName _Value_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "Value");
    private final static QName _Offset_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "Offset");
    private final static QName _Description_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "Description");
    private final static QName _Name_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "Name");
    private final static QName _DisplayUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "DisplayUrl");
    private final static QName _Url_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "Url");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "DateTime");
    private final static QName _Title_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "Title");
    private final static QName _Total_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "Total");
    private final static QName _CacheUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", "CacheUrl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.web
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
     * Create an instance of {@link WebResult }
     * 
     */
    public WebResult createWebResult() {
        return new WebResult();
    }

    /**
     * Create an instance of {@link SearchTags }
     * 
     */
    public SearchTags createSearchTags() {
        return new SearchTags();
    }

    /**
     * Create an instance of {@link DeepLinks }
     * 
     */
    public DeepLinks createDeepLinks() {
        return new DeepLinks();
    }

    /**
     * Create an instance of {@link Web }
     * 
     */
    public Web createWeb() {
        return new Web();
    }

    /**
     * Create an instance of {@link DeepLink }
     * 
     */
    public DeepLink createDeepLink() {
        return new DeepLink();
    }

    /**
     * Create an instance of {@link WebSearchTag }
     * 
     */
    public WebSearchTag createWebSearchTag() {
        return new WebSearchTag();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "Value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "Offset")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createOffset(Long value) {
        return new JAXBElement<Long>(_Offset_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "DisplayUrl")
    public JAXBElement<String> createDisplayUrl(String value) {
        return new JAXBElement<String>(_DisplayUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "Url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "DateTime")
    public JAXBElement<String> createDateTime(String value) {
        return new JAXBElement<String>(_DateTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "Total")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createTotal(Long value) {
        return new JAXBElement<Long>(_Total_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web", name = "CacheUrl")
    public JAXBElement<String> createCacheUrl(String value) {
        return new JAXBElement<String>(_CacheUrl_QNAME, String.class, null, value);
    }

}
