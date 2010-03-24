
package com.microsoft.schemas.livesearch._2008._03.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInstantAnswerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInstantAnswerResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstantAnswerResult" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}InstantAnswerResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInstantAnswerResult", propOrder = {
    "instantAnswerResult"
})
public class ArrayOfInstantAnswerResult {

    @XmlElement(name = "InstantAnswerResult")
    protected List<InstantAnswerResult> instantAnswerResult;

    /**
     * Gets the value of the instantAnswerResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantAnswerResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantAnswerResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstantAnswerResult }
     * 
     * 
     */
    public List<InstantAnswerResult> getInstantAnswerResult() {
        if (instantAnswerResult == null) {
            instantAnswerResult = new ArrayList<InstantAnswerResult>();
        }
        return this.instantAnswerResult;
    }

}
