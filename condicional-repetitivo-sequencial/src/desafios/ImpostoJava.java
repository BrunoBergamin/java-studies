package Desafios;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ImpostoJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double salario, rendaAnualSalario, rendaAnualPretacao, rendaAnualCapital, gastosMedicos, gastosEducacionais, maxDedutivel, gastosDedutiveis, impostoSalario, impostoServico, impostoCapital, impostoBruto, abatimento, impostoDevido;


        System.out.print("Renda anual com salário: R$ ");
        rendaAnualSalario = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: R$ ");
        rendaAnualPretacao = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: R$ ");
        rendaAnualCapital = sc.nextDouble();
        System.out.print("Gastos médicos: R$ ");
        gastosMedicos = sc.nextDouble();
        System.out.print("Gastos educacionais: R$ ");
        gastosEducacionais = sc.nextDouble();

        salario = rendaAnualSalario / 12;

        if (salario < 3000.0) {
            rendaAnualSalario = 0;
        } else if (salario < 5000.0) {
            rendaAnualSalario *= 0.10;
        } else {
            rendaAnualSalario *= 0.20;
        }

        impostoSalario = rendaAnualSalario;
        impostoServico = rendaAnualPretacao * 0.15;
        impostoCapital = rendaAnualCapital * 0.20;
        impostoBruto = impostoCapital + impostoSalario + impostoServico;
        maxDedutivel = impostoBruto * 0.30;
        gastosDedutiveis = gastosEducacionais + gastosMedicos;

        if (gastosDedutiveis > maxDedutivel) {
            abatimento = maxDedutivel;
        } else {
            abatimento = gastosDedutiveis;
        }

        impostoDevido = impostoBruto - abatimento;

        System.out.println();
        System.out.println("RELATÓRIO  DE IMPSOTO DE RENDA");
        System.out.println();

        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);

        System.out.println();
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", maxDedutivel);
        System.out.printf("Gastos Dedutíveis: %.2f\n", gastosDedutiveis);
        System.out.println();

        System.out.println("RESUMO");
        System.out.printf("Imposto bruto taotal: %.2f\n", impostoBruto);
        System.out.printf("Abatimento: %.2f\n", abatimento);
        System.out.printf("Imposto devido: %.2f\n", impostoDevido);

        sc.close();
    }
}
