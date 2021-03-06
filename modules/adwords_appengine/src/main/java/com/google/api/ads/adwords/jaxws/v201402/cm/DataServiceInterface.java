
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       A service to return Ads Campaign Management data matching a {@link Selector}.
 *       <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DataServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DataServiceInterface {


    /**
     * 
     *         Returns a list of bid landscapes for the ad groups specified in the selector.
     *         
     *         @param serviceSelector Selects the entities to return bid landscapes for.
     *         @return A list of bid landscapes.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "getAdGroupBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.DataServiceInterfacegetAdGroupBidLandscape")
    @ResponseWrapper(localName = "getAdGroupBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.DataServiceInterfacegetAdGroupBidLandscapeResponse")
    public AdGroupBidLandscapePage getAdGroupBidLandscape(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of bid landscapes for the criteria specified in the selector.
     *         
     *         @param serviceSelector Selects the entities to return bid landscapes for.
     *         @return A list of bid landscapes.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.CriterionBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "getCriterionBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.DataServiceInterfacegetCriterionBidLandscape")
    @ResponseWrapper(localName = "getCriterionBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.DataServiceInterfacegetCriterionBidLandscapeResponse")
    public CriterionBidLandscapePage getCriterionBidLandscape(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of bid landscapes for the ad groups that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of bid landscapes.
     *         @throws ApiException if problems occur while parsing the query or fetching bid landscapes.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.AdGroupBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "queryAdGroupBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.DataServiceInterfacequeryAdGroupBidLandscape")
    @ResponseWrapper(localName = "queryAdGroupBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.DataServiceInterfacequeryAdGroupBidLandscapeResponse")
    public AdGroupBidLandscapePage queryAdGroupBidLandscape(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        String query)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of bid landscapes for the criteria that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of bid landscapes.
     *         @throws ApiException if problems occur while parsing the query or fetching bid landscapes.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.CriterionBidLandscapePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "queryCriterionBidLandscape", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.DataServiceInterfacequeryCriterionBidLandscape")
    @ResponseWrapper(localName = "queryCriterionBidLandscapeResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.DataServiceInterfacequeryCriterionBidLandscapeResponse")
    public CriterionBidLandscapePage queryCriterionBidLandscape(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        String query)
        throws ApiException_Exception
    ;

}
