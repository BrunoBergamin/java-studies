package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        Account account;

        if (option == 'y' || option == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }


        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
