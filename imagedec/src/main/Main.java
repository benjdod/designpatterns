package main;

import java.io.IOException;

import main.helper.ImageImport;
import main.helper.ImageWrite;

public class Main {
    public static void main(String[] args) throws IOException {
        ImageWrite writer = new ImageWrite("img");
        int[][][] img = new int[256][256][3];
        
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                img[i][j][0] = 220;
                img[i][j][1] = 127;
                img[i][j][2] = 127;
            }
        }

        BasicImage b = ImageImport.importImage("img/kmp.jpg");
        ContrastImage c = new ContrastImage(b);
        GammaImage g = new GammaImage(b);
        c.setContrast(0);
        g.setGamma(0.2);
        // writer.writeImage(c, "contrast");
        writer.writeImage(g, "gamma");
    }
}