import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.println("Nota 1, 2, 3: ");
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();

        System.out.print(student);

        if (student.finalGrade() >= 60) {
            System.out.print(" APROVADO");
        } else {
            System.out.println(" REPROVADO");
            System.out.printf("FALTARAM %.2f PONTOS\n", student.missingPoints());
        }

        sc.close();
    }
}