package Exercicios.Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja qual valor para a tabuada?: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (i * num));
        }
        sc.close();
    }
}
