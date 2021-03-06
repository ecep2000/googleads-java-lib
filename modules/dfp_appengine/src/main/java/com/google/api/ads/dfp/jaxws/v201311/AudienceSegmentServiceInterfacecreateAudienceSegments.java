
package com.google.api.ads.dfp.jaxws.v201311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link RuleBasedFirstPartyAudienceSegment} objects.
 *             
 *             @param segments first-party audience segments to create
 *             @return created first-party audience segments
 *           
 * 
 * <p>Java class for createAudienceSegments element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createAudienceSegments">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="segments" type="{https://www.google.com/apis/ads/publisher/v201311}FirstPartyAudienceSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "segments"
})
@XmlRootElement(name = "createAudienceSegments")
public class AudienceSegmentServiceInterfacecreateAudienceSegments {

    protected List<FirstPartyAudienceSegment> segments;

    /**
     * Gets the value of the segments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FirstPartyAudienceSegment }
     * 
     * 
     */
    public List<FirstPartyAudienceSegment> getSegments() {
        if (segments == null) {
            segments = new ArrayList<FirstPartyAudienceSegment>();
        }
        return this.segments;
    }

}
