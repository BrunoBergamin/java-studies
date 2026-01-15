package application;

import exceptions.DomainException;
import exceptions.entities.Account;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(initialBalance, holder, number, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.print("New balance: " + String.format("%.2f\n", account.getBalance()));

        } catch (DomainException e) {
            System.out.print("Withdraw error: " + e.getMessage());
        }

        sc.close();

    }
}