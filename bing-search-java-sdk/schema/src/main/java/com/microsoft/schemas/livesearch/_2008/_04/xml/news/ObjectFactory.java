
package com.microsoft.schemas.livesearch._2008._04.xml.news;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.news package. 
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

    private final static QName _Name_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "Name");
    private final static QName _Source_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "Source");
    private final static QName _Offset_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "Offset");
    private final static QName _Total_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "Total");
    private final static QName _Title_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "Title");
    private final static QName _BreakingNews_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "BreakingNews");
    private final static QName _Snippet_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "Snippet");
    private final static QName _Date_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "Date");
    private final static QName _Url_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", "Url");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.news
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewsResult }
     * 
     */
    public NewsResult createNewsResult() {
        return new NewsResult();
    }

    /**
     * Create an instance of {@link NewsCollections }
     * 
     */
    public NewsCollections createNewsCollections() {
        return new NewsCollections();
    }

    /**
     * Create an instance of {@link RelatedSearches }
     * 
     */
    public RelatedSearches createRelatedSearches() {
        return new RelatedSearches();
    }

    /**
     * Create an instance of {@link NewsArticles }
     * 
     */
    public NewsArticles createNewsArticles() {
        return new NewsArticles();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link News }
     * 
     */
    public News createNews() {
        return new News();
    }

    /**
     * Create an instance of {@link NewsRelatedSearch }
     * 
     */
    public NewsRelatedSearch createNewsRelatedSearch() {
        return new NewsRelatedSearch();
    }

    /**
     * Create an instance of {@link NewsCollection }
     * 
     */
    public NewsCollection createNewsCollection() {
        return new NewsCollection();
    }

    /**
     * Create an instance of {@link NewsArticle }
     * 
     */
    public NewsArticle createNewsArticle() {
        return new NewsArticle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "Source")
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "Offset")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createOffset(Long value) {
        return new JAXBElement<Long>(_Offset_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "Total")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createTotal(Long value) {
        return new JAXBElement<Long>(_Total_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "BreakingNews")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createBreakingNews(Long value) {
        return new JAXBElement<Long>(_BreakingNews_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "Snippet")
    public JAXBElement<String> createSnippet(String value) {
        return new JAXBElement<String>(_Snippet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "Date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news", name = "Url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

}
