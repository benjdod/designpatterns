# Bag of Cats 
### The Factory Design Pattern

You've heard of letting the cat out of the bag, but we're gonna put them into the bag. Ha... ha...<br> In this example, let's assume, for the sake of argument, that we have a single bag of cats, to which we can add cats, remove cats, and shake the bag.

## Overview

### `Cat` (interface):
The cat interface specifies a single void method `meow()`. In each implementation, this method should print the cat's meow to the console.

### `BoringCat`, `FancyCat`, `SmallCat` (classes):
These classes all implement the `Cat` interface, and all have cool, unique meows. Easy.

### `CatBag` (singleton class):
The `CatBag` is our bag. In this class, we have a private `ArrayList<Cat> _catsinbag`, which is the instance variable that holds the cats we put in the bag. We also have a private, ***static*** CatBag variable called `_thebag`, which is the single instance of `CatBag` which holds all the cats. Below is a list of the class's dynamic methods:<br> 
    <li>`addCat(Cat c)`: adds the specified `Cat` to the bag</li>
    <li>`removeCat(Cat c)`: removes the specified `Cat` from the bag</li>
    <li>`shakeBag()`: calls the `meow()` method of each `Cat` in the bag</li>
<br>

## Making the Bag:

One of the most important features of this class is the fact that the constructor is private. Since it's not public, we can control exactly how we make `CatBags` and how many we make. If the class had a public constructor, there's no guarantee that there wouldn't be multiple `CatBags` floating around, but if we let the class retain sole control over the construction of instances of itself, we can keep the number of `CatBags` down to however we want.<br>

Building off this idea, you might notice that there is a single, **static** CatBag variable, `_theBag`. It's via this variable, in combination with the private constructor, that the class provides a way for only *one* instance of the CatBag object to ever exist. That variable can only be accessed by the **static** `getCatBag` method, which first checks to see if the CatBag exists, creates one using the ***private*** *constructor* if it doesn't, and returns the bag. All the nonstatic instance methods (`addCat`, `removeCat`, and `shakeBag`) can only be accessed through the static method `CatBag.getCatBag()`, so by using any of these methods, we are guaranteed that the single instance of `CatBag` exists.

## Multitions:

The idea of a multiton is a more generalized version of a singleton. By using a *private* constructor in combination with a [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html) of instances of the class, we can generate and access multiple instances of a class in a controlled way, much like in a singleton class. 
