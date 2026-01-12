package application;


import com.sun.security.jgss.GSSUtil;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(1000.00, "Alex", 1001);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1000.00, "Maria", 1002, 0.01);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount (1000.00, "Julio", 1003, 0.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}