package oop.ex;

public class Account {
    int balance;

    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("잔액이 부족합니다.");
            return balance;
        }
    }

}