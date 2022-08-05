package com.fasttrack.Exercise1;

import java.util.List;

public class Company {
    private final List<Advertisement> platforms;

    public Company(List<Advertisement> platforms) {
        this.platforms = platforms;
    }

    public void sendAdvertisement(String name) {
        for (Advertisement platform : platforms) {
            if (platform.getName().equals(name)) {
                System.out.println(platform.getName() + " has advertised your company " + platform.timesAdvertised() + " times.");
            }
        }
    }
}
