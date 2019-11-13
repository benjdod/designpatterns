package main;

public class FancyCat implements Cat {

    // Since there are no variables provided to the constructor
    // and no instance variables, the constructor is just empty.
    // We could do without one actually and Java would just call 
    // the empty constructor automatically.
    public FancyCat() {} 

    public void meow() {
        System.out.println("miaou");
    }
}