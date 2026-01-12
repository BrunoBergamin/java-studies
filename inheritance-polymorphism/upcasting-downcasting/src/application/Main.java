package application;


import com.sun.security.jgss.GSSUtil;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(0.0, "Alex", 1001);
        BusinessAccount bacc = new BusinessAccount(0.0, "Maria", 1002, 500.00);

        // Upcasting

        Account acc1 = bacc;
        acc1.getBalance();
        Account acc2 = new BusinessAccount(0.0, "Joao", 1003, 200.0);
        Account acc3 = new SavingsAccount(0.0, "Pedro", 1004, 0.01);

        //Downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.print("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updated");
        }

    }

}