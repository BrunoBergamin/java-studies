package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char tipo;
        double c, f;

        System.out.print("Você vai digitar a temperatura em qual escala (C/F): ");
        tipo = sc.nextLine().charAt(0);


        if (tipo == 'F' || tipo == 'f') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            f = sc.nextDouble();
            c = (5.0 / 9.0) * (f - 32.0);
            System.out.printf("Temperatura equivalente em Celsius = %.2f\n", c);
        } else if (tipo == 'C' || tipo == 'c'){
            System.out.print("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();
            f = (c * 9.0 / 5.0) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit = %.2f\n", f);
        } else {
            System.out.print("Opção invalida.");
        }
        sc.close();
    }
}
