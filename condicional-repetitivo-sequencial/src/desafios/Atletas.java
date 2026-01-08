package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Atletas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdHomens = 0, qtdMulheres = 0;
        double altura, peso, somaPesos = 0.0, somaAlturaMulheres = 0.0, maiorAltura = 0.0;
        String nome, nomeMaisAlto = "";
        char sexo;

        System.out.print("Qual a quantidade de atletas? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("\nDigite os dados do atleta numero " + (i + 1) + ":");

            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Sexo (F/M): ");
            sexo = sc.next().charAt(0);
            while (sexo != 'F' && sexo != 'M' && sexo != 'f' && sexo != 'm') {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next().charAt(0);
            }

            System.out.print("Altura: ");
            altura = sc.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }

            System.out.print("Peso: ");
            peso = sc.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }


            somaPesos += peso;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaisAlto = nome;
            }

            if (sexo == 'M' || sexo == 'm') {
                qtdHomens++;
            } else {
                qtdMulheres++;
                somaAlturaMulheres += altura;
            }
        }


        double pesoMedio = somaPesos / n;
        double porcentHomens = (double) qtdHomens / n * 100.0;

        //  Impressão do relatório
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.println("Atleta mais alto: " + nomeMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%%n", porcentHomens);

        if (qtdMulheres > 0) {
            double mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;
            System.out.printf("Altura média das mulheres: %.2f%n", mediaAlturaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();
    }
}

