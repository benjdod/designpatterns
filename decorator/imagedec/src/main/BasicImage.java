package main;

public class BasicImage implements Image {

    private int[][][] _imagearray;

    public BasicImage(int[][][] imagearray) {
        
        if (imagearray[0][0].length != 3) {throw new IllegalArgumentException("image array can only have 3 color channels");}
        _imagearray = imagearray;

        //#region: clipping to 0-255
        for (int i = 0; i < _imagearray.length; i++) {
            for (int j = 0; j < _imagearray[0].length; j++) {
                for (int m = 0; m < 3; m++) {
                    if (_imagearray[i][j][m] > 255) {
                        _imagearray[i][j][m] = 255;
                    }
                }
            }
        }
        //#endregion
    } 

    @Override
    public int[][][] getImageArray() {
        return _imagearray;
    }

}