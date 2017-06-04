
package webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RecognitionServiceService", targetNamespace = "http://api.webservice/", wsdlLocation = "http://localhost:8080/recognition/?wsdl")
public class RecognitionServiceService
    extends Service
{

    private final static URL RECOGNITIONSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException RECOGNITIONSERVICESERVICE_EXCEPTION;
    private final static QName RECOGNITIONSERVICESERVICE_QNAME = new QName("http://api.webservice/", "RecognitionServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/recognition/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECOGNITIONSERVICESERVICE_WSDL_LOCATION = url;
        RECOGNITIONSERVICESERVICE_EXCEPTION = e;
    }

    public RecognitionServiceService() {
        super(__getWsdlLocation(), RECOGNITIONSERVICESERVICE_QNAME);
    }

    public RecognitionServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RECOGNITIONSERVICESERVICE_QNAME, features);
    }

    public RecognitionServiceService(URL wsdlLocation) {
        super(wsdlLocation, RECOGNITIONSERVICESERVICE_QNAME);
    }

    public RecognitionServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RECOGNITIONSERVICESERVICE_QNAME, features);
    }

    public RecognitionServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RecognitionServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RecognitionService
     */
    @WebEndpoint(name = "RecognitionServicePort")
    public RecognitionService getRecognitionServicePort() {
        return super.getPort(new QName("http://api.webservice/", "RecognitionServicePort"), RecognitionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RecognitionService
     */
    @WebEndpoint(name = "RecognitionServicePort")
    public RecognitionService getRecognitionServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.webservice/", "RecognitionServicePort"), RecognitionService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECOGNITIONSERVICESERVICE_EXCEPTION!= null) {
            throw RECOGNITIONSERVICESERVICE_EXCEPTION;
        }
        return RECOGNITIONSERVICESERVICE_WSDL_LOCATION;
    }

}
