package application;

import services.PrintService;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.printf("First: " + ps.first());

        sc.close();
        ;

    }
}