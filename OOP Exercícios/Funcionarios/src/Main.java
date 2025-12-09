import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Funcionário: " + employee.name + ", " + employee.netSalary());
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double porcentage = sc.nextDouble();
        employee.increaseSalary(porcentage);

        System.out.printf("Dados autalizados: " + employee);

        sc.close();
    }
}