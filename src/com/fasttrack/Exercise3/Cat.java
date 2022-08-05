package com.fasttrack.Exercise3;

public class Cat implements Behaviour {
    @Override
    public String getName() {
        return "cat";
    }

    @Override
    public String walk() {
        return "The cat is walking.";
    }

    @Override
    public String talk() {
        return "The cat is talking.";
    }

    @Override
    public String eat() {
        return "The cat is eating";
    }
}
