
package com.mitchell.claim.business.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mitchell.claim.business.wsdl package. 
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

    private final static QName _MitchellClaim_QNAME = new QName("http://www.mitchell.com/examples/claim", "MitchellClaim");
    private final static QName _GetClaimsListByLossDateRanageRequest_QNAME = new QName("http://www.mitchell.com/examples/claim", "GetClaimsListByLossDateRanageRequest");
    private final static QName _GetClaimsListByLossDateRangeResponse_QNAME = new QName("http://www.mitchell.com/examples/claim", "GetClaimsListByLossDateRangeResponse");
    private final static QName _UpDateClaimRequest_QNAME = new QName("http://www.mitchell.com/examples/claim", "UpDateClaimRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mitchell.claim.business.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MitchellClaimType }
     * 
     */
    public MitchellClaimType createMitchellClaimType() {
        return new MitchellClaimType();
    }

    /**
     * Create an instance of {@link GetClaimsListByLossDateRanageRequest }
     * 
     */
    public GetClaimsListByLossDateRanageRequest createGetClaimsListByLossDateRanageRequest() {
        return new GetClaimsListByLossDateRanageRequest();
    }

    /**
     * Create an instance of {@link GetClaimsListByLossDateRangeResponse }
     * 
     */
    public GetClaimsListByLossDateRangeResponse createGetClaimsListByLossDateRangeResponse() {
        return new GetClaimsListByLossDateRangeResponse();
    }

    /**
     * Create an instance of {@link GetClaimByClaimIdRequest }
     * 
     */
    public GetClaimByClaimIdRequest createGetClaimByClaimIdRequest() {
        return new GetClaimByClaimIdRequest();
    }

    /**
     * Create an instance of {@link GetClaimByClaimIdResponse }
     * 
     */
    public GetClaimByClaimIdResponse createGetClaimByClaimIdResponse() {
        return new GetClaimByClaimIdResponse();
    }

    /**
     * Create an instance of {@link CreateClaimResponse }
     * 
     */
    public CreateClaimResponse createCreateClaimResponse() {
        return new CreateClaimResponse();
    }

    /**
     * Create an instance of {@link UpDateClaimResponse }
     * 
     */
    public UpDateClaimResponse createUpDateClaimResponse() {
        return new UpDateClaimResponse();
    }

    /**
     * Create an instance of {@link MitchellClaimUpdateType }
     * 
     */
    public MitchellClaimUpdateType createMitchellClaimUpdateType() {
        return new MitchellClaimUpdateType();
    }

    /**
     * Create an instance of {@link LossInfoType }
     * 
     */
    public LossInfoType createLossInfoType() {
        return new LossInfoType();
    }

    /**
     * Create an instance of {@link VehicleListType }
     * 
     */
    public VehicleListType createVehicleListType() {
        return new VehicleListType();
    }

    /**
     * Create an instance of {@link VehicleInfoType }
     * 
     */
    public VehicleInfoType createVehicleInfoType() {
        return new VehicleInfoType();
    }

    /**
     * Create an instance of {@link VehicleListUpdateType }
     * 
     */
    public VehicleListUpdateType createVehicleListUpdateType() {
        return new VehicleListUpdateType();
    }

    /**
     * Create an instance of {@link VehicleUpdateInfoType }
     * 
     */
    public VehicleUpdateInfoType createVehicleUpdateInfoType() {
        return new VehicleUpdateInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitchellClaimType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mitchell.com/examples/claim", name = "MitchellClaim")
    public JAXBElement<MitchellClaimType> createMitchellClaim(MitchellClaimType value) {
        return new JAXBElement<MitchellClaimType>(_MitchellClaim_QNAME, MitchellClaimType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimsListByLossDateRanageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mitchell.com/examples/claim", name = "GetClaimsListByLossDateRanageRequest")
    public JAXBElement<GetClaimsListByLossDateRanageRequest> createGetClaimsListByLossDateRanageRequest(GetClaimsListByLossDateRanageRequest value) {
        return new JAXBElement<GetClaimsListByLossDateRanageRequest>(_GetClaimsListByLossDateRanageRequest_QNAME, GetClaimsListByLossDateRanageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimsListByLossDateRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mitchell.com/examples/claim", name = "GetClaimsListByLossDateRangeResponse")
    public JAXBElement<GetClaimsListByLossDateRangeResponse> createGetClaimsListByLossDateRangeResponse(GetClaimsListByLossDateRangeResponse value) {
        return new JAXBElement<GetClaimsListByLossDateRangeResponse>(_GetClaimsListByLossDateRangeResponse_QNAME, GetClaimsListByLossDateRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitchellClaimUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mitchell.com/examples/claim", name = "UpDateClaimRequest")
    public JAXBElement<MitchellClaimUpdateType> createUpDateClaimRequest(MitchellClaimUpdateType value) {
        return new JAXBElement<MitchellClaimUpdateType>(_UpDateClaimRequest_QNAME, MitchellClaimUpdateType.class, null, value);
    }

}
