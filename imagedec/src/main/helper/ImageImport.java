package main.helper;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import main.BasicImage;

import java.io.File;
import java.io.IOException;

public class ImageImport {
    public static BasicImage importImage(String filepath) {
        BufferedImage intm = null;
        try {
            intm = ImageIO.read(new File(filepath));
        } catch (IOException e) {
        }
        if (intm == null) {throw new IllegalArgumentException("invald filepath");}

        BufferedImage out = new BufferedImage(intm.getWidth(),intm.getHeight(),BufferedImage.TYPE_INT_RGB);
        out.getGraphics().drawImage(intm,0,0,null);

        int[][][] array = new int[out.getWidth()][out.getHeight()][3];

        for (int i = 0; i < out.getWidth(); i++) {
            for (int j = 0; j < out.getHeight(); j++) {
                Color c = new Color(out.getRGB(i, j));
                array[i][j][0] = c.getRed();
                array[i][j][1] = c.getGreen();
                array[i][j][2] = c.getBlue();
            }
        }

        return new BasicImage(array);
    }
}