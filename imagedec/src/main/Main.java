package main;

import java.io.IOException;

import helper.ImageImport;
import helper.ImageWrite;

public class Main {
    public static void main(String[] args) throws IOException {

        ImageWrite writer = new ImageWrite("img");
        
        BasicImage b = ImageImport.importImage("img/kmp.jpg");

        // the decorated images that we make from BasicImage b
        ContrastImage c = new ContrastImage(b);
        GammaImage g = new GammaImage(b);

        // setting the parameters for the decorators
        c.setContrast(2);
        g.setGamma(0.2);

        // writing the images to files in the img/ folder
        writer.writeImage(c, "contrast");
        writer.writeImage(g, "gamma");
    }
}