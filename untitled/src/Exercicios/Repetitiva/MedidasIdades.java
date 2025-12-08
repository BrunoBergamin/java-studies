package Exercicios.Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class MedidasIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digitar idade: ");
        int idade = sc.nextInt();
        if (idade < 0) {
            System.out.println("Impossivel calcular");
        } else {
            int soma = 0;
            int qtd = 0;

            while (idade > 0) {
                soma += idade;
                qtd++;
                idade = sc.nextInt();
            }
            double media = (double) soma / qtd;

            System.out.printf("Media = %.2f\n", media);
        }
        sc.close();
    }
}
