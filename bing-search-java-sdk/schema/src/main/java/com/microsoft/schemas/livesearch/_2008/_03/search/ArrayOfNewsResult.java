
package com.microsoft.schemas.livesearch._2008._03.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNewsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNewsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewsResult" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}NewsResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNewsResult", propOrder = {
    "newsResult"
})
public class ArrayOfNewsResult {

    @XmlElement(name = "NewsResult")
    protected List<NewsResult> newsResult;

    /**
     * Gets the value of the newsResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newsResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewsResult }
     * 
     * 
     */
    public List<NewsResult> getNewsResult() {
        if (newsResult == null) {
            newsResult = new ArrayList<NewsResult>();
        }
        return this.newsResult;
    }

}
