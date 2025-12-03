package ExercicioSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double precoUni, dinheiroRec, troco;
        int qtd;

        System.out.print("Preço unitário do produto: ");
        precoUni = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtd = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiroRec = sc.nextDouble();

        troco = dinheiroRec - (precoUni * qtd);
        System.out.printf("TROCO = %.2f\n", troco);

        sc.close();

    }

}
