package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int min;
        double valorPagar;

        System.out.print("Digite a quantidade de minutos: ");
        min = sc.nextInt();

        valorPagar = 50.0;

        if (min  > 100){
            valorPagar += (min - 100) * 2;
        }
        System.out.printf("Valor a pagar : %.2f\n", valorPagar);
    }
}
