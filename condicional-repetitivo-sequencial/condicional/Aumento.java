package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double salario, nsalario, aumento, porcentagem;



        System.out.print("Digite o salario da pessoa: R$ ");
        salario = sc.nextDouble();

        if (salario <= 1000.0) {
            porcentagem = 20;
        } else if (salario <= 3000.0) {
            porcentagem = 15;
        } else if (salario <= 8000.0) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }
        aumento = salario * (porcentagem / 100);
        nsalario = salario + aumento;


        System.out.printf("Novo salario: R$ %.2f\n", nsalario);
        System.out.printf("Aumento: R$ %.2f\n", aumento);
        System.out.printf("Porcentagem: %.2f%%", porcentagem);

        sc.close();
    }
}
