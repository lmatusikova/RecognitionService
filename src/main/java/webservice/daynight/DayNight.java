package webservice.daynight;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class DayNight {

	public DayNight() {

	}

	/**
	 * Calculate whether it is night or day
	 * @param image
	 *            the given image
	 * @return value 0, if is night; value 1, if is day
	 */
	public int value(BufferedImage image) {
		int width = image.getWidth();
		int height = image.getHeight();

		double R, G, B;
		double r = 0;
		double g = 0;
		double b = 0;

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				Color color = new Color(image.getRGB(i, j));
				r += color.getRed();
				g += color.getGreen();
				b += color.getBlue();
			}
		}

		r = (r / (width * height)) / 255.0;
		g = (g / (width * height)) / 255.0;
		b = (g / (width * height)) / 255.0;

		if (r <= 0.03928) {
			R = r / 12.92;
		} else {
			R = Math.pow((r + 0.055) / 1.055, 2.4);
		}

		if (g <= 0.03928) {
			G = g / 12.92;
		} else {
			G = Math.pow((g + 0.055) / 1.055, 2.4);
		}

		if (b <= 0.03928) {
			B = b / 12.92;
		} else {
			B = Math.pow((b + 0.055) / 1.055, 2.4);
		}

		double y = 0.2126 * R + 0.7152 * G + 0.0722 * B;

		if (y < 0.07) {
			return 0;
		}

		return 1;
	}
}
