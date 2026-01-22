package application;

import entities.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Sale> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Sale(
                        Integer.parseInt(fields[0]),
                        Integer.parseInt(fields[1]),
                        fields[2],
                        Integer.parseInt(fields[3]),
                        Double.parseDouble(fields[4])));
                line = br.readLine();
            }
            System.out.println("Cinco primeiras vendas de 2016 de maior preço médio");

            list.stream()
                    .filter(s -> s.getYear().equals(2016))
                    .sorted((s1, s2) -> s2.averagePrice().compareTo(s1.averagePrice()))
                    .limit(5)
                    .forEach(System.out::println);


            double sum = list.stream()
                    .filter(s -> s.getMonth() == 1 || s.getMonth() == 2)
                    .filter(s -> s.getSeller().equals("Logan"))
                    .map(Sale::getTotal)
                    .reduce(0.0, Double::sum);

            System.out.print("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = " + String.format("%.2f", sum));


        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }

        sc.close();
    }
}