package main;

import java.util.Random;

public class PersonImpl implements Person {
    private String _first, _last;
    private int _id;

    private static Random _random = new Random();

    public PersonImpl(String first, String last) {
        _first = first;
        _last = last;
        _id = _random.nextInt(10000);
    }

    public String toString() {
        return _first + " " + _last + ", " + _id;
    }

    public String getName() {
        return _first + " " + _last;
    }

    public int getID() {
        return _id;
    }
}