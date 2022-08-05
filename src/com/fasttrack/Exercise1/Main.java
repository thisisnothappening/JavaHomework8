package com.fasttrack.Exercise1;

import java.util.Arrays;

// 1) A company wants to advertise its services. The advertisement may be on facebook, e-mail, print. Build the objects and interface
public class Main {
    public static void main(String[] args) {
        Company company = new Company(Arrays.asList(new Facebook(), new Email(), new Print()));

        company.sendAdvertisement("Print");
        company.sendAdvertisement("Email");
        company.sendAdvertisement("Facebook");
    }
}
