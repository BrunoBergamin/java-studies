package Exercicios.Repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.print("Tente novamente, senha inválida: ");
            senha = sc.nextInt();
        }
        System.out.print("Acesso Permitido.");

        sc.close();
    }
}
