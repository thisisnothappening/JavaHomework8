package com.fasttrack.Exercise1;

import java.util.Random;

public class Facebook implements Advertisement {
    Random random = new Random();

    private final int times = random.nextInt(100000);

    @Override
    public String getName() {
        return "Facebook";
    }

    @Override
    public int timesAdvertised() {
        return times;
    }
}
