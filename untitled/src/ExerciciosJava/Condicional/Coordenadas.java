package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Valor de x: ");
        x = sc.nextDouble();
        System.out.print("Valor de y: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.print("Origem");
        } else if (y == 0.0) {
            System.out.print("Eixo X");
        } else if (x == 0.0) {
            System.out.print("Eixo Y");
        } else if (x > 0.0 && y > 0.0) {
            System.out.print("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.print("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.print("Q3");
        } else {
            System.out.print("Q4");
        }
        sc.close();
    }
}
