package main;

public class PaintSample {
    public enum ColorFamily {BLUE,RED,GREEN,YELLOW,PURPLE,ORANGE,GREY,WHITE};
    private String _name;
    private ColorFamily _family;

    public PaintSample(String name, ColorFamily color_family) {
        _name = name;
        _family = color_family;
    }

    public String getName() {
        return _name;
    }

    public ColorFamily getColorFamily() {
        return _family;
    }

}