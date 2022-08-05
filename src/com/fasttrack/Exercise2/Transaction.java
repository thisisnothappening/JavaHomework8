package com.fasttrack.Exercise2;

public interface Transaction {

    String getName();

    int getMoney();

    void withdraw(int withdrawMoney);

    void deposit(int depositMoney);
}
