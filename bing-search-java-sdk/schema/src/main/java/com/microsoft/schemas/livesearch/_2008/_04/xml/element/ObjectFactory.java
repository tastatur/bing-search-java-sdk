
package com.microsoft.schemas.livesearch._2008._04.xml.element;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.element package. 
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

    private final static QName _AlterationOverrideQuery_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element", "AlterationOverrideQuery");
    private final static QName _AlteredQuery_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element", "AlteredQuery");
    private final static QName _SearchTerms_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/element", "SearchTerms");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.element
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element", name = "AlterationOverrideQuery")
    public JAXBElement<String> createAlterationOverrideQuery(String value) {
        return new JAXBElement<String>(_AlterationOverrideQuery_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element", name = "AlteredQuery")
    public JAXBElement<String> createAlteredQuery(String value) {
        return new JAXBElement<String>(_AlteredQuery_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element", name = "SearchTerms")
    public JAXBElement<String> createSearchTerms(String value) {
        return new JAXBElement<String>(_SearchTerms_QNAME, String.class, null, value);
    }

}
