package application;

import entities.Address;
import entities.Departmant;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String name = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        Departmant departmant = new Departmant(name, payDay);
        Address address = new Address(email, phone);


        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Dados do funcionário " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nameEmployee = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            Employee employee = new Employee(nameEmployee, salary);
            departmant.addEmployee(employee);
        }

        System.out.println("FOLHA DE PAGAMENTO: ");
        System.out.printf("Departamento Vendas = R$ " + departmant.payRoll() + "\n");
        System.out.printf("Pagamento realizado no dia " + payDay + "\n");
        System.out.println("Funcionários: ");
        for (Employee emp : departmant.getList()) {
            System.out.printf(emp.getName() + "\n");
        }
        System.out.print("Para dúvidas favor entrar em contato: vendas@lojatop.com");

        sc.close();
    }
}