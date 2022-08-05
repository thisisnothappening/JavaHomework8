package com.fasttrack.Exercise3;

import java.util.List;

public class Animal {
    private List<Behaviour> behaviours;

    public Animal(List<Behaviour> behaviours) {
        this.behaviours = behaviours;
    }

    public void walk(String name) {
        for (Behaviour behaviour : behaviours) {
            if (behaviour.getName().equals(name)) {
                System.out.println(behaviour.walk());
            }
        }
    }

    public void talk(String name) {
        for (Behaviour behaviour : behaviours) {
            if (behaviour.getName().equals(name)) {
                System.out.println(behaviour.talk());
            }
        }
    }

    public void eat(String name) {
        for (Behaviour behaviour : behaviours) {
            if (behaviour.getName().equals(name)) {
                System.out.println(behaviour.eat());
            }
        }
    }
}
