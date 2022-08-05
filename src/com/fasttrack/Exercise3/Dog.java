package com.fasttrack.Exercise3;

public class Dog implements Behaviour {
    @Override
    public String getName() {
        return "dog";
    }

    @Override
    public String walk() {
        return "The dog is walking";
    }

    @Override
    public String talk() {
        return "The dog is talking";
    }

    @Override
    public String eat() {
        return "The dog is eating";
    }
}
