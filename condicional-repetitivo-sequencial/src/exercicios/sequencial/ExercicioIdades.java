package ExercicioSequencial;

import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        double idade1, idade2;

        System.out.println("Dados da primeira pessoa: ");
        System.out.printf("Nome: ");
        nome1 = sc.nextLine();
        System.out.printf("Idade: ");
        idade1 = sc.nextDouble();

        System.out.println("Dados da segunda pessoa: ");
        System.out.printf("Nome: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.printf("Idade: ");
        idade2 = sc.nextDouble();

        double media = (double) (idade1 + idade2) / 2;

        System.out.printf("A média de %s e %s é de %.1f anos", nome1, nome2, media);

        sc.close();


    }
}
