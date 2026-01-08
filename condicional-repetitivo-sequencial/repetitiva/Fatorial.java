package Exercicios.Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, fat;
        fat = 1;
        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();

        if (n > 15 || n < 0){
            System.out.printf("Impissivel, digitar outro numero: ");
        }else {
            for (int i = n; i > 0; i--){
                fat *= i;
            }
            System.out.printf("FATORIAL = %d\n", fat);
        }
        sc.close();
    }
}
