package Exercicios.Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class QualCombustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        int a = 0;
        int g = 0;
        int d = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para finalizar: ");
        num = sc.nextInt();

        while (num != 4){
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para finalizar: ");
            num = sc.nextInt();

            if (num == 1){
                a++;
            } else if (num == 2) {
                g++;
            } else if (num == 3) {
                d++;
            }
        }
        System.out.println("Muito Obrigado!");
        System.out.printf("Alcool = %d\n", a);
        System.out.printf("Gasolina = %d\n", g);
        System.out.printf("Disel = %d\n", d);
        sc.close();
    }
}
