package com.fasttrack.Exercise3;

public class Chicken implements Behaviour {
    @Override
    public String getName() {
        return "chicken";
    }

    @Override
    public String walk() {
        return "The chicken is walking";
    }

    @Override
    public String talk() {
        return "The chicken is talking";
    }

    @Override
    public String eat() {
        return "The chicken is eating";
    }
}
