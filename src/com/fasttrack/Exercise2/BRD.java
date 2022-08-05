package com.fasttrack.Exercise2;

public class BRD implements Transaction {

    private int money = 0;

    @Override
    public void withdraw(int withdrawMoney) {
        money -= withdrawMoney;
    }

    @Override
    public void deposit(int depositMoney) {
        money += depositMoney;
    }

    @Override
    public String getName() {
        return "BRD";
    }

    @Override
    public int getMoney() {
        return money;
    }
}
