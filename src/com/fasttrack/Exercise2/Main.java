package com.fasttrack.Exercise2;

import java.util.Arrays;

// 2) A person needs a banking account. There are several banks that provide this service: ING, BT, BRD.
//      The bank needs to provide the possibility to withdraw and deposit money.
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(Arrays.asList(new ING(), new BRD(), new BT()));

        // test:
        System.out.println();
        bank.getMoney("ING");
        bank.deposit("ING", 256);
        bank.getMoney("ING");
        bank.withdraw("ING", 112);
        bank.getMoney("ING");
        bank.withdraw("ING", 642);
        bank.getMoney("ING");

        System.out.println();
        bank.getMoney("BRD");
        bank.deposit("BRD", 256);
        bank.getMoney("BRD");
        bank.withdraw("BRD", 112);
        bank.getMoney("BRD");
        bank.withdraw("BRD", 642);
        bank.getMoney("BRD");

        System.out.println();
        bank.getMoney("BT");
        bank.deposit("BT", 256);
        bank.getMoney("BT");
        bank.withdraw("BT", 112);
        bank.getMoney("BT");
        bank.withdraw("BT", 642);
        bank.getMoney("BT");
    }
}
