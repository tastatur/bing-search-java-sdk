
package com.microsoft.schemas.livesearch._2008._04.xml.instantanswer;

import java.io.Serializable;
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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}InstantAnswerResult" maxOccurs="unbounded"/>
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
    "instantAnswerResultList"
})
@XmlRootElement(name = "Results")
public class Results
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "InstantAnswerResult", required = true)
    protected List<InstantAnswerResult> instantAnswerResultList;

    /**
     * Gets the value of the instantAnswerResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantAnswerResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantAnswerResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstantAnswerResult }
     * 
     * 
     */
    public List<InstantAnswerResult> getInstantAnswerResultList() {
        if (instantAnswerResultList == null) {
            instantAnswerResultList = new ArrayList<InstantAnswerResult>();
        }
        return this.instantAnswerResultList;
    }

}
