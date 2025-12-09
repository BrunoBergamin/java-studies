import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("Area do triangulo X: %.4f\n", areax);
        System.out.printf("Area do triangulo Y: %.4f\n", areay);

        if (areax > areay){
            System.out.print("Area maior: X");
        } else {
            System.out.print("Area maior: Y");
        }
        sc.close();
    }
}
