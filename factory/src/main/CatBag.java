package main;

import java.util.ArrayList;

public class CatBag {
    // instance variable
    private ArrayList<Cat> _catsinbag;
    // static variable to hold the single instance
    private static CatBag _thebag;

    private CatBag() {
        _catsinbag = new ArrayList<Cat>();
    }

    public static CatBag getCatBag() {
        if (_thebag == null) {
            _thebag = new CatBag();
        }
        return _thebag;
    }

    public void addCat(Cat c) {
        _catsinbag.add(c);
    }

    public void removeCat(Cat c) {
        _catsinbag.remove(c);
    }

    public void shakeBag() {
        for (Cat c : _catsinbag) {
            c.meow();
        }
    }
}