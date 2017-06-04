package webservice.api;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.jws.WebService;
import javaanpr.imageanalysis.CarSnapshot;
import javaanpr.intelligence.Intelligence;
import webservice.daynight.DayNight;

import com.jhlabs.image.GrayscaleFilter;

@WebService
public class RecognitionService {

	private BufferedImage newImage;
	private GrayscaleFilter gray;
	public native String RecognizePlate(String path);

	public RecognitionService() {

	}

	/**
	 * Method for recognizing license plate
	 * @param path path to image file
	 * @return recognized characters
	 */
	public String getLicensePlate(String path) {
		DayNight dn = new DayNight();
		File file = new File(path);
		BufferedImage image = null;
		String characters = "";

		try {
			image = ImageIO.read(file);
		} catch (IOException ex) {
			System.out.println("Read image file > Image cannot be load.");
		}

		System.loadLibrary("Recognition");
		Intelligence intelligence = null;

		int value = dn.value(image);

		if (value == 1) { //is day
			try {
				intelligence = new Intelligence(false);
				characters = intelligence.recognize(new CarSnapshot(image));
			} catch (Exception ex) {
				System.out.println("Recognized exception.");
			}
		} else { //is night
			characters = RecognizePlate(path);
			if (characters == null || characters.equals("")) {
				characters = "UNRECOGNIZED";
			}
		}

		return characters;
	}
}
