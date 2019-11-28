package main;

import java.util.ArrayList;
import java.util.Iterator;

import main.PaintSample.ColorFamily;

public class Main {
    public static void main(String[] args) {
        ArrayList<PaintSample> sample_list = new ArrayList<PaintSample>();

        sample_list.add(new PaintSample("Carolina Blue",ColorFamily.BLUE));
        sample_list.add(new PaintSample("Liberty",ColorFamily.BLUE));
        sample_list.add(new PaintSample("Plain Ol' Red",ColorFamily.RED));
        sample_list.add(new PaintSample("Alabaster",ColorFamily.WHITE));
        sample_list.add(new PaintSample("Amaranth",ColorFamily.RED));
        sample_list.add(new PaintSample("Antique Ruby",ColorFamily.RED));
        sample_list.add(new PaintSample("Apple Green",ColorFamily.GREEN));
        sample_list.add(new PaintSample("Arctic Lime",ColorFamily.GREEN));
        sample_list.add(new PaintSample("Asparagus",ColorFamily.GREEN));
        sample_list.add(new PaintSample("Avocado",ColorFamily.GREEN));
        sample_list.add(new PaintSample("Beau Blue",ColorFamily.BLUE));
        sample_list.add(new PaintSample("Baby Blue",ColorFamily.BLUE));
        sample_list.add(new PaintSample("Capri",ColorFamily.BLUE));
        sample_list.add(new PaintSample("Fulvous",ColorFamily.ORANGE));
        sample_list.add(new PaintSample("Amaranth",ColorFamily.RED));
        sample_list.add(new PaintSample("Erin",ColorFamily.GREEN));
        sample_list.add(new PaintSample("Golden Poppy",ColorFamily.YELLOW));
        sample_list.add(new PaintSample("Mandarin",ColorFamily.ORANGE));

        // constructing a new iterator which only iterates over the blue paint samples
        Iterator<PaintSample> blueiter = new ColorFamilyIterator(sample_list, ColorFamily.BLUE);
        
        while (blueiter.hasNext()) {
            System.out.println(blueiter.next().getName());
        }

    }
}