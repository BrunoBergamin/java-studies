package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {
   public static void main(String[] args) {
        Locale.setDefault(Locale.US);

       Scanner sc = new Scanner(System.in);

       double media;

       System.out.print("Digite a média da glicose: ");
       media = sc.nextDouble();

       if (media <= 100.0){
           System.out.println("Classificação: Normal");
       } else if (media <= 140.0) {
           System.out.println("Classificação: Elevado");
       } else {
           System.out.println("Classificação: Diabetes");
       }

       sc.close();


   }
}
