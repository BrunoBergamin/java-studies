package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal;

        System.out.print("Hora icicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal){
            System.out.printf("O jogo durou %d horas(s)\n", horaFinal - horaInicial);
        } else {
            System.out.printf("O jogo durou %d hora(s)\n", 24 - (horaInicial - horaFinal));
        }
        sc.close();
    }
}
