
package com.microsoft.schemas.livesearch._2008._03.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWebSearchTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWebSearchTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebSearchTag" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}WebSearchTag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWebSearchTag", propOrder = {
    "webSearchTag"
})
public class ArrayOfWebSearchTag {

    @XmlElement(name = "WebSearchTag")
    protected List<WebSearchTag> webSearchTag;

    /**
     * Gets the value of the webSearchTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webSearchTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebSearchTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebSearchTag }
     * 
     * 
     */
    public List<WebSearchTag> getWebSearchTag() {
        if (webSearchTag == null) {
            webSearchTag = new ArrayList<WebSearchTag>();
        }
        return this.webSearchTag;
    }

}
