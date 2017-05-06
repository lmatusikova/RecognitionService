package webservice.api;

import javax.xml.ws.*;

public class SoapServer {

	public static void main(String[] args) {
	       RecognitionService service = new RecognitionService();    
	       Endpoint.publish("http://localhost:8080/recognition", service);

	}

}
