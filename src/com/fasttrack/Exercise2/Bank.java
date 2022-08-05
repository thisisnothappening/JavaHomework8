package com.fasttrack.Exercise2;

import java.util.List;

public class Bank {
    private final List<Transaction> banks;

    public Bank(List<Transaction> banks) {
        this.banks = banks;
    }

    public void getMoney(String name) {
        for (Transaction bank : banks) {
            if (bank.getName().equals(name)) {
                System.out.println("You have in " + bank.getName() + ": " + bank.getMoney() + " lei.");
            }
        }
    }

    public void deposit(String name, int money) {
        for (Transaction bank : banks) {
            if (bank.getName().equals(name)) {
                System.out.println("You have deposited "  + money + " lei.");
                bank.deposit(money);
            }
        }
    }

    public void withdraw(String name, int money) {
        for (Transaction bank : banks) {
            if (bank.getName().equals(name)) {
                if (money <= bank.getMoney()) {
                    System.out.println("You have withdrawn "  + money + " lei.");
                    bank.withdraw(money);
                } else {
                    System.out.println("Sorry, you don't have " + money + " lei.");
                }
            }
        }
    }
}
