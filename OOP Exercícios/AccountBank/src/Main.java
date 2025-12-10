import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.println();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        Account acc;

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit= sc.nextDouble();
            acc = new Account(initialDeposit, holder, number);
        } else {
            acc = new Account(holder, number);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(acc);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        acc.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(acc);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.println(acc);

        sc.close();
    }
}
