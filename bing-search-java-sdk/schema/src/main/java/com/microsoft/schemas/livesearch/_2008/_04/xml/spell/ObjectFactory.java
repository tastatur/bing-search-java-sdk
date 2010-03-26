
package com.microsoft.schemas.livesearch._2008._04.xml.spell;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.livesearch._2008._04.xml.spell package. 
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

    private final static QName _Total_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/spell", "Total");
    private final static QName _Value_QNAME = new QName("http://schemas.microsoft.com/LiveSearch/2008/04/XML/spell", "Value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.livesearch._2008._04.xml.spell
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Spell }
     * 
     */
    public Spell createSpell() {
        return new Spell();
    }

    /**
     * Create an instance of {@link SpellResult }
     * 
     */
    public SpellResult createSpellResult() {
        return new SpellResult();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/spell", name = "Total")
    public JAXBElement<BigInteger> createTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_Total_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/spell", name = "Value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

}
