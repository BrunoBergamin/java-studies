package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double precoUni, valorRec, troco;
        int qtd;

        System.out.print("Preço unitário do produto: ");
        precoUni = sc.nextDouble();
        System.out.print("Qantidade comprada: ");
        qtd = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        valorRec = sc.nextDouble();


        if (valorRec < (precoUni * qtd)){
            troco =  valorRec - precoUni * qtd ;
            System.out.printf("Dinheiro insuficiente. Faltam %.2f reais.", troco);
            return;
        } else {
            troco = valorRec - precoUni * qtd ;
            System.out.printf("Troco = %.2f ", troco);
        }


        sc.close();


    }
}
