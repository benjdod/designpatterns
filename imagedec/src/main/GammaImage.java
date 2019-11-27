package main;

public class GammaImage implements DecoratedImage {
    private Image _image;
    private double _gamma;

    public GammaImage(Image image) {
        _image = image;
        _gamma = 1;
    }

    public void setGamma(double gamma) {
        _gamma = gamma;
    }

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

        // FIXME: this doesn't work 
        for (int i = 0; i < temparray.length; i++) {
            for (int j = 0; j < temparray[0].length; j++) {
                for (int m = 0; m < 3; m++) {
                    temparray[i][j][m] = (int)Math.round(Math.pow(((double)temparray[i][j][m])/256, _gamma)*256);
                    // System.out.println(temparray[i][j][m]);
                    // clipping values that are out of range (0-255)
                    if (temparray[i][j][m] > 255) {
                        temparray[i][j][m] = 255;
                    }
                    if (temparray[i][j][m] < 0) {
                        temparray[i][j][m] = 0;
                    }
                }
            }
        }

        return temparray;
    }
}