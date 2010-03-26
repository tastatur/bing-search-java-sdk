
package com.microsoft.schemas.livesearch._2008._04.xml.news;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/news}NewsRelatedSearch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "newsRelatedSearch"
})
@XmlRootElement(name = "RelatedSearches")
public class RelatedSearches {

    @XmlElement(name = "NewsRelatedSearch")
    protected List<NewsRelatedSearch> newsRelatedSearch;

    /**
     * Gets the value of the newsRelatedSearch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newsRelatedSearch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewsRelatedSearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewsRelatedSearch }
     * 
     * 
     */
    public List<NewsRelatedSearch> getNewsRelatedSearch() {
        if (newsRelatedSearch == null) {
            newsRelatedSearch = new ArrayList<NewsRelatedSearch>();
        }
        return this.newsRelatedSearch;
    }

}
