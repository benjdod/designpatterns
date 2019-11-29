package main;

public class Main {
    public static void main(String[] args) {
        Cat c = new PlainOldCat();
        FancyCat f = new FancyCat();
        SmallCat s = new SmallCat();
        
        CatBag.getCatBag().addCat(c);
        CatBag.getCatBag().addCat(f);
        CatBag.getCatBag().addCat(s);

        CatBag.getCatBag().shakeBag();
    }
}