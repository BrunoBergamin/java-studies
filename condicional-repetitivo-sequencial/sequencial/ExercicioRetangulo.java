package ExercicioSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retangulo: ");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double area;
        double perimetro;
        double diagonal;

        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.printf("Area = %.4f\n", area);
        System.out.printf("Perimetro = %.4f\n", perimetro);
        System.out.printf("Diagonal = %.4f\n", diagonal);

        sc.close();
    }
}
