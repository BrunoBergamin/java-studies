package ExercicioSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String nome;
        double valorHora, salario;
        int horasTrabalhadas;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Valor por hora: ");
        valorHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        salario = valorHora * horasTrabalhadas;

        System.out.printf("O pagamento para %s deve ser R$ %.2f\n", nome, salario);

        sc.close();

    }
}
