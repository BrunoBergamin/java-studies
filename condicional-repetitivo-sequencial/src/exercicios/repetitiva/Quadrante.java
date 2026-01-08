package Exercicios.Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Digite o valor das coordenadas X e Y: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        while (y != 0 && x != 0) {

            if (x > 0 && y > 0) {
                System.out.print("Quadrante Q1");
            } else if (x < 0 && y > 0) {
                System.out.print("Quadrante Q2");
            } else if (x < 0 && y < 0) {
                System.out.print("Quadrante Q3");
            } else {
                System.out.print("Quadrante Q4");
            }
            System.out.print("Digite as coordenas X e Y: ");
            x = sc.nextDouble();
            y = sc.nextDouble();
        }


        sc.close();
    }
}
