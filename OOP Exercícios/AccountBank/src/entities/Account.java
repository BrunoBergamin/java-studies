package entities;

public class Account {

        private final int number;
        private String holder;
        private double balance;

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public Account(double initialDeposit, String holder, int number) {
        deposit(initialDeposit);
        this.holder = holder;
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public int getNumber() {
        return number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
}

