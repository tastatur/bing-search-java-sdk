
package com.microsoft.schemas.livesearch._2008._04.xml.multimedia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.multimedia package. 
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

    private final static QName _DisplayUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "DisplayUrl");
    private final static QName _Url_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "Url");
    private final static QName _ClickThroughPageUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "ClickThroughPageUrl");
    private final static QName _PlayUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "PlayUrl");
    private final static QName _FileSize_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "FileSize");
    private final static QName _MediaUrl_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "MediaUrl");
    private final static QName _ContentType_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "ContentType");
    private final static QName _RunTime_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "RunTime");
    private final static QName _Title_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "Title");
    private final static QName _Total_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "Total");
    private final static QName _Offset_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "Offset");
    private final static QName _SourceTitle_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "SourceTitle");
    private final static QName _Width_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "Width");
    private final static QName _Height_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", "Height");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.multimedia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImageResult }
     * 
     */
    public ImageResult createImageResult() {
        return new ImageResult();
    }

    /**
     * Create an instance of {@link Video }
     * 
     */
    public Video createVideo() {
        return new Video();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Thumbnail }
     * 
     */
    public Thumbnail createThumbnail() {
        return new Thumbnail();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link StaticThumbnail }
     * 
     */
    public StaticThumbnail createStaticThumbnail() {
        return new StaticThumbnail();
    }

    /**
     * Create an instance of {@link VideoResult }
     * 
     */
    public VideoResult createVideoResult() {
        return new VideoResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "DisplayUrl")
    public JAXBElement<String> createDisplayUrl(String value) {
        return new JAXBElement<String>(_DisplayUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "Url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "ClickThroughPageUrl")
    public JAXBElement<String> createClickThroughPageUrl(String value) {
        return new JAXBElement<String>(_ClickThroughPageUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "PlayUrl")
    public JAXBElement<String> createPlayUrl(String value) {
        return new JAXBElement<String>(_PlayUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "FileSize")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createFileSize(Long value) {
        return new JAXBElement<Long>(_FileSize_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "MediaUrl")
    public JAXBElement<String> createMediaUrl(String value) {
        return new JAXBElement<String>(_MediaUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "ContentType")
    public JAXBElement<String> createContentType(String value) {
        return new JAXBElement<String>(_ContentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "RunTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createRunTime(Long value) {
        return new JAXBElement<Long>(_RunTime_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "Title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "Total")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createTotal(Long value) {
        return new JAXBElement<Long>(_Total_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "Offset")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createOffset(Long value) {
        return new JAXBElement<Long>(_Offset_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "SourceTitle")
    public JAXBElement<String> createSourceTitle(String value) {
        return new JAXBElement<String>(_SourceTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "Width")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createWidth(Long value) {
        return new JAXBElement<Long>(_Width_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia", name = "Height")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createHeight(Long value) {
        return new JAXBElement<Long>(_Height_QNAME, Long.class, null, value);
    }

}
