package Exercicios.Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, caso;
        double num1, num2, num3, media, somaPeso;

        System.out.print("Quantos caso voce vai digitar?: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite tres numeros: ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();
            somaPeso = 10;
            media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / somaPeso;

            System.out.printf("MEDIA: %.1f\n", media);
        }
        sc.close();
    }
}


