package main.helper;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import main.Image;

public class ImageWrite {

	String _dirpath;

	public ImageWrite(String directory) {
		_dirpath = directory;
	}

	public void writeImage(Image img, String filename) throws IOException {

		int[][][] imagearray = img.getImageArray();

		BufferedImage b = new BufferedImage(imagearray.length, imagearray[0].length, BufferedImage.TYPE_INT_RGB);
		File outfile = new File(_dirpath + "/" + filename + ".jpg");

		for (int i = 0; i < imagearray.length; i++) {
			for (int j = 0; j < imagearray[0].length; j++) {
				b.setRGB(i, j, new Color(imagearray[i][j][0],imagearray[i][j][1],imagearray[i][j][2]).getRGB());
			}
		}

		ImageIO.write(b, "jpg", outfile);
	}

}
