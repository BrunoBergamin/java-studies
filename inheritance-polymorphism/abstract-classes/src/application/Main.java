package application;


import com.sun.security.jgss.GSSUtil;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(500.00, "Alex", 1001, 0.01));
        list.add(new BusinessAccount(500.00, "Bruno", 1002, 10.0));
        list.add(new SavingsAccount(500.00, "Anna", 1003, 0.02));
        list.add((new BusinessAccount(1000.00, "Bruno Bergamin", 1004, 0.03)));

        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f\n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }
        for (Account acc : list){
            System.out.println(acc.getBalance());
        }



    }
}