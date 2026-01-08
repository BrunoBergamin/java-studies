import entities.CurrencyConverter;

import javax.script.ScriptContext;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("Qual o valor do dólar: ");
        double value = sc.nextDouble();
        System.out.print("Quantos dólares seram comprados: ");
        double quantity = sc.nextDouble();
        double result = CurrencyConverter.resultPorcentage(value, quantity);
        System.out.printf("Valor a ser pago em reais: %.2f\n", result);


        sc.close();
    }
}
