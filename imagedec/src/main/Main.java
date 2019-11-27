package main;

import java.io.IOException;

import main.helper.ImageImport;
import main.helper.ImageWrite;

public class Main {
    public static void main(String[] args) throws IOException {
        ImageWrite writer = new ImageWrite("img/outimg.png");
        int[][][] img = new int[256][256][3];
        
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                img[i][j][0] = 220;
                img[i][j][1] = 127;
                img[i][j][2] = 127;
            }
        }

        BasicImage r = ImageImport.importImage("img/kmp.jpg");
        ContrastImage c = new ContrastImage(r);
        GammaImage g = new GammaImage(c);
        c.setContrast(0);
        writer.writeImage(c);
    }
}