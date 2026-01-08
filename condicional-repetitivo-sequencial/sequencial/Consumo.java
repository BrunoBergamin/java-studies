package ExercicioSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int distancia;
        double combustivelGasto, media;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextInt();
        System.out.print("Combustível gasto: ");
        combustivelGasto = sc.nextDouble();

        media = distancia / combustivelGasto;

        System.out.printf("Consumo médio = %.3f\n", media);

        sc.close();


    }
}
