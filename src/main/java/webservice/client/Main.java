package webservice.client;

public class Main {

	public static void main(String[] args) {
		RecognitionServiceService rss = new RecognitionServiceService();
		RecognitionService service = rss.getRecognitionServicePort();
		
		System.out.println(service.getLicensePlate("C:/Users/Freya/Desktop/Bakalarka/DVD/Licence Plates/SK/deň - priame slnko/test_5.jpg"));
		
	}

}
