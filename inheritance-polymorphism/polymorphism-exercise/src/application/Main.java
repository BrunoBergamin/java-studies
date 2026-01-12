package application;


import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y' || ch == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutSourcedEmployee(hours, name, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(hours, name, valuePerHour);
                list.add(emp);
            }

            System.out.println();
            System.out.println("PAYMENTS:");
            for (Employee emp : list){
                System.out.println(emp.getName() + " - " + String.format("%.2f",emp.payment()));
            }


        }

        sc.close();

    }
}