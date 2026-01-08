import Entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.print("How many people do you want to register? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nPerson #" + i);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            people.add(new Person(name, cpf, age));
        }

        System.out.print("\nEnter CPF to search: ");
        String searchCpf = sc.nextLine();

        Person found = null;
        for (Person p : people) {
            if (p.getCpf().equals(searchCpf)) {
                found = p;
                break;
            }
        }

        System.out.println();
        if (found != null) {
            System.out.println("Person found:");
            System.out.println(found);
        } else {
            System.out.println("CPF not found.");
        }

        sc.close();
    }
}
