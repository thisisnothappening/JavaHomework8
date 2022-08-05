package com.fasttrack.Exercise3;

public class Mouse implements Behaviour {
    @Override
    public String getName() {
        return "mouse";
    }

    @Override
    public String walk() {
        return "The mouse is walking";
    }

    @Override
    public String talk() {
        return "The mouse is talking";
    }

    @Override
    public String eat() {
        return "The mouse is eating";
    }
}
