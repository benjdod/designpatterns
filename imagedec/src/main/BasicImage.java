package main;

public class BasicImage implements Image {

    private int[][][] _image;

    public BasicImage(int[][][] imagearray) {
        
        if (imagearray[0][0].length != 3) {throw new IllegalArgumentException("image array can only have 3 color channels");}
        _image = imagearray;

        //#region: rudimentary clipping
        for (int i = 0; i < _image.length; i++) {
            for (int j = 0; j < _image[0].length; j++) {
                for (int m = 0; m < 3; m++) {
                    if (_image[i][j][m] > 255) {
                        _image[i][j][m] = 255;
                    }
                }
            }
        }
        //#endregion
    } 

    @Override
    public int[][][] getImageArray() {
        return _image;
    }

}