package main;

// this example uses two of the design covered in class:
// Factory (Lec 13) and decorator (Lec 14). 
// The Cat interface provides a single void method, meow()
// which in all implementations prints the cat's meow to the console

public class Main {
    public static void main(String[] args) {
        Cat c = new PlainOldCat();
        FancyCat f = new FancyCat();
        SmallCat s = new SmallCat();
        
        CatBag.getCatBag().addCat(c);
        CatBag.getCatBag().addCat(f);
        CatBag.getCatBag().addCat(s);

        CatBag.getCatBag().shakeBag();
        return;
    }
}