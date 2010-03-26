
package com.microsoft.schemas.livesearch._2008._04.xml.instantanswer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.instantanswer package. 
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

    private final static QName _Url_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", "Url");
    private final static QName _Attribution_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", "Attribution");
    private final static QName _ContentType_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", "ContentType");
    private final static QName _Title_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", "Title");
    private final static QName _ClickThroughUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", "ClickThroughUrl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.instantanswer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InstantAnswerResult }
     * 
     */
    public InstantAnswerResult createInstantAnswerResult() {
        return new InstantAnswerResult();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link InstantAnswer }
     * 
     */
    public InstantAnswer createInstantAnswer() {
        return new InstantAnswer();
    }

    /**
     * Create an instance of {@link InstantAnswerSpecificData }
     * 
     */
    public InstantAnswerSpecificData createInstantAnswerSpecificData() {
        return new InstantAnswerSpecificData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", name = "Url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", name = "Attribution")
    public JAXBElement<String> createAttribution(String value) {
        return new JAXBElement<String>(_Attribution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", name = "ContentType")
    public JAXBElement<String> createContentType(String value) {
        return new JAXBElement<String>(_ContentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer", name = "ClickThroughUrl")
    public JAXBElement<String> createClickThroughUrl(String value) {
        return new JAXBElement<String>(_ClickThroughUrl_QNAME, String.class, null, value);
    }

}
