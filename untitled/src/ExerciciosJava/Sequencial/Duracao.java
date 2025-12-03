package ExercicioSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int seg, min, hora;

        System.out.print("Digite a quantidade de segundos: ");
        seg = sc.nextInt();

        hora = seg / 3600;
        min = (seg % 3600) / 60;
        seg = seg % 60;

        System.out.printf(hora + ":" + min + ":" + seg);

        sc.close();

    }
}
