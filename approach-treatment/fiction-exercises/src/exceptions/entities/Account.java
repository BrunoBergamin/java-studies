package exceptions.entities;

import exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        } else if (amount > balance) {
            throw new DomainException(" Not enough balance");
        }else {
            balance -= amount;
        }
    }
}
