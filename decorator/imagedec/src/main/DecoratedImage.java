package main;

public abstract class DecoratedImage implements Image {

    Image _image;

    public DecoratedImage(Image image) {
        _image = image;
    }

    public abstract int[][][] getImageArray();
    public Image getImage() {
        return _image;
    }
}