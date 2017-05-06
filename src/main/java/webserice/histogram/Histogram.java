package webserice.histogram;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import boofcv.alg.color.ColorHsv;
import boofcv.alg.descriptor.UtilFeature;
import boofcv.alg.feature.color.GHistogramFeatureOps;
import boofcv.io.image.ConvertBufferedImage;
import boofcv.struct.feature.TupleDesc_F64;
import boofcv.struct.image.GrayF32;
import boofcv.struct.image.Planar;

public class Histogram {

	public Histogram() {
	
	}
	
	public static List<double[]> independentHueSat(BufferedImage image) {
		List<double[]> points = new ArrayList<double[]>();

		// The number of bins is an important parameter.  Try adjusting it
		TupleDesc_F64 histogramHue = new TupleDesc_F64(30);
		TupleDesc_F64 histogramValue = new TupleDesc_F64(30);

		List<TupleDesc_F64> histogramList = new ArrayList<TupleDesc_F64>();
		histogramList.add(histogramHue); histogramList.add(histogramValue);

		Planar<GrayF32> rgb = new Planar<GrayF32>(GrayF32.class,1,1,3);
		Planar<GrayF32> hsv = new Planar<GrayF32>(GrayF32.class,1,1,3);

			if( image == null ) throw new RuntimeException("Can't load image!");

			rgb.reshape( image.getWidth(),  image.getHeight());
			hsv.reshape( image.getWidth(),  image.getHeight());
			ConvertBufferedImage.convertFrom( image, rgb, true);
			ColorHsv.rgbToHsv_F32(rgb, hsv);

			GHistogramFeatureOps.histogram(hsv.getBand(0), 0, 2*Math.PI,histogramHue);
			GHistogramFeatureOps.histogram(hsv.getBand(1), 0, 1, histogramValue);

			// need to combine them into a single descriptor for processing later on
			TupleDesc_F64 imageHist = UtilFeature.combine(histogramList,null);

			UtilFeature.normalizeL2(imageHist); // normalize so that image size doesn't matter

			points.add(imageHist.value);
		

		return points;
	}
	
	
	public int histogramValue(BufferedImage image) {
		int width = image.getWidth();
		int height = image.getHeight();

		double sr = 0, sg = 0, sb = 0;
		double R, G, B;
		int length = width * height;
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				Color c = new Color(image.getRGB(i, j));
				sr += c.getRed();
				sg += c.getGreen();
				sb += c.getBlue();
			}
		}

		sr = (sr / length) / 255.0;
		sg = (sg / length) / 255.0;
		sb = (sg / length) / 255.0;
		
		//sr <= 0.03928
		if (sr <= 0.04045) {
			R = sr / 12.92;
		} else {
			R = Math.pow((sr + 0.055) / 1.055, 2.4);
		}
		
		//sg <= 0.03928
		if (sg <= 0.04045) {
			G = sg / 12.92;
		} else {
			G = Math.pow((sg + 0.055) / 1.055, 2.4);
		}
		
		//sb <= 0.03928
		if (sb <= 0.04045) {
			B = sb / 12.92;
		} else {
			B = Math.pow((sb + 0.055) / 1.055, 2.4);
		}
		
		double y = 0.2126 * R + 0.7152 * G + 0.0722 * B;
		System.out.println("Y value is >> " + y);
		if (y < 0.07) {
			System.out.println("Night photo");
		} else {
			System.out.println("Day photo");
		}

		return 0;
	}

}
