package com.fasttrack.Exercise1;

import java.util.Random;

public class Email implements Advertisement {
    Random random = new Random();

    private final int times = random.nextInt(100000);

    @Override
    public String getName() {
        return "Email";
    }

    @Override
    public int timesAdvertised() {
        return times;
    }
}
