package main;

public class Person {
    private String _first, _last;

    public Person(String first, String last) {
        _first = first;
        _last = last;
    }

    public String getName() {
        return _first + " " + _last;
    }
}