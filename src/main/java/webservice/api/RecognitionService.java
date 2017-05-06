package webservice.api;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;

import javaanpr.imageanalysis.CarSnapshot;
import javaanpr.intelligence.Intelligence;
import webserice.histogram.Histogram;

@WebService
public class RecognitionService {
	public RecognitionService() {

	}

	public String getLicensePlate(String path) {
		Histogram histogram = new Histogram();
		File file = new File(path);
		BufferedImage image = null;
		try {
			image = ImageIO.read(file);
			System.out.println("Nacitany obrazok");
		} catch (IOException ex) {

		}
		
		int value = histogram.histogramValue(image);
		
		String characters = "";
		Intelligence intelligence = null;
		try {
			intelligence = new Intelligence(false);
			characters = intelligence.recognize(new CarSnapshot(image));
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Recognized exception.");
		}

		if (characters == null || characters.equals("")) {
			characters = "UNRECOGNIZED";
		}

		return characters;
	}
}
