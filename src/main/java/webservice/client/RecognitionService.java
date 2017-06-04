
package webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RecognitionService", targetNamespace = "http://api.webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RecognitionService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RecognizePlate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RecognizePlate", targetNamespace = "http://api.webservice/", className = "webservice.client.RecognizePlate")
    @ResponseWrapper(localName = "RecognizePlateResponse", targetNamespace = "http://api.webservice/", className = "webservice.client.RecognizePlateResponse")
    @Action(input = "http://api.webservice/RecognitionService/RecognizePlateRequest", output = "http://api.webservice/RecognitionService/RecognizePlateResponse")
    public String recognizePlate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLicensePlate", targetNamespace = "http://api.webservice/", className = "webservice.client.GetLicensePlate")
    @ResponseWrapper(localName = "getLicensePlateResponse", targetNamespace = "http://api.webservice/", className = "webservice.client.GetLicensePlateResponse")
    @Action(input = "http://api.webservice/RecognitionService/getLicensePlateRequest", output = "http://api.webservice/RecognitionService/getLicensePlateResponse")
    public String getLicensePlate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}