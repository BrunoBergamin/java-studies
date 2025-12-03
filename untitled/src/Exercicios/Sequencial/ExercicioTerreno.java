package ExercicioSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTerreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.println("Ditire o valor por metro quadrado: ");
        double valorM2 = sc.nextDouble();

        double area;
        double preco;

        area = largura * comprimento;
        preco = valorM2 * area;

        System.out.printf("Area do terreno = %.2f\n", area);
        System.out.printf("Preço do terreno = %.2f\n", preco);

        sc.close();
    }
}
