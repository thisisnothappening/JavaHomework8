package com.fasttrack.Exercise3;

import java.util.Arrays;

//3) Create an interface that describes how an Animal behaves: walk(), talk(), eat().
// Provide implementations: Cat, Dog, Mouse, Chicken, Duck. The implementations will just return a string
//e.g.   class Cat {
//          public String walk(){
//              return "cat-walking";
//          }
//      }
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(Arrays.asList(new Cat(), new Dog(), new Mouse(), new Chicken(), new Duck()));

        animal.walk("dog");
        animal.talk("cat");
        animal.eat("chicken");
    }
}
