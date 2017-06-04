
package webservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.client package. 
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

    private final static QName _RecognizePlateResponse_QNAME = new QName("http://api.webservice/", "RecognizePlateResponse");
    private final static QName _GetLicensePlate_QNAME = new QName("http://api.webservice/", "getLicensePlate");
    private final static QName _GetLicensePlateResponse_QNAME = new QName("http://api.webservice/", "getLicensePlateResponse");
    private final static QName _RecognizePlate_QNAME = new QName("http://api.webservice/", "RecognizePlate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLicensePlate }
     * 
     */
    public GetLicensePlate createGetLicensePlate() {
        return new GetLicensePlate();
    }

    /**
     * Create an instance of {@link RecognizePlateResponse }
     * 
     */
    public RecognizePlateResponse createRecognizePlateResponse() {
        return new RecognizePlateResponse();
    }

    /**
     * Create an instance of {@link GetLicensePlateResponse }
     * 
     */
    public GetLicensePlateResponse createGetLicensePlateResponse() {
        return new GetLicensePlateResponse();
    }

    /**
     * Create an instance of {@link RecognizePlate }
     * 
     */
    public RecognizePlate createRecognizePlate() {
        return new RecognizePlate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecognizePlateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice/", name = "RecognizePlateResponse")
    public JAXBElement<RecognizePlateResponse> createRecognizePlateResponse(RecognizePlateResponse value) {
        return new JAXBElement<RecognizePlateResponse>(_RecognizePlateResponse_QNAME, RecognizePlateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLicensePlate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice/", name = "getLicensePlate")
    public JAXBElement<GetLicensePlate> createGetLicensePlate(GetLicensePlate value) {
        return new JAXBElement<GetLicensePlate>(_GetLicensePlate_QNAME, GetLicensePlate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLicensePlateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice/", name = "getLicensePlateResponse")
    public JAXBElement<GetLicensePlateResponse> createGetLicensePlateResponse(GetLicensePlateResponse value) {
        return new JAXBElement<GetLicensePlateResponse>(_GetLicensePlateResponse_QNAME, GetLicensePlateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecognizePlate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.webservice/", name = "RecognizePlate")
    public JAXBElement<RecognizePlate> createRecognizePlate(RecognizePlate value) {
        return new JAXBElement<RecognizePlate>(_RecognizePlate_QNAME, RecognizePlate.class, null, value);
    }

}
