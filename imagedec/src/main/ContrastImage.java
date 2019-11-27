package main;

public class ContrastImage extends DecoratedImage {

    private double _contrast;

    public ContrastImage(Image image) {
        super(image);
        _contrast = 1;
    }

    public void setContrast(double contrast) {
        _contrast = 1 + contrast;
    }

    public double getContrast() {
        return _contrast - 1;
    }

    @Override
    public int[][][] getImageArray() {
        int x = _image.getImageArray().length;
        int y = _image.getImageArray()[0].length;
        int[][][] temparray = new int[x][y][3];

        for (int i = 0; i < temparray.length; i++) {
            for (int j = 0; j < temparray[0].length; j++) {
                for (int m = 0; m < 3; m++) {
                    temparray[i][j][m] = _image.getImageArray()[i][j][m];
                }
            }
        }

        for (int i = 0; i < temparray.length; i++) {
            for (int j = 0; j < temparray[0].length; j++) {
                for (int m = 0; m < 3; m++) {
                    temparray[i][j][m] -= 128;
                    temparray[i][j][m] *= _contrast;
                    temparray[i][j][m] += 128;
                    if (temparray[i][j][m] > 255) {
                        temparray[i][j][m] = 255;
                    }
                    if (temparray[i][j][m] < 0) {
                        temparray[i][j][m] = 0;
                    }
                }
            }
            System.out.println("rendered line "+ i);
        }
        return temparray;
    }
}