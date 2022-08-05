package com.fasttrack.Exercise3;

public class Duck implements Behaviour {
    @Override
    public String getName() {
        return "duck";
    }

    @Override
    public String walk() {
        return "The duck is walking";
    }

    @Override
    public String talk() {
        return "The duck is talking";
    }

    @Override
    public String eat() {
        return "The duck is eating";
    }
}
