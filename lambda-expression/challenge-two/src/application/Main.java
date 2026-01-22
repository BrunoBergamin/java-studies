package application;

import entities.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Sale> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Sale(
                        Integer.parseInt(fields[0]),
                        Integer.parseInt(fields[1]),
                        fields[2],
                        Integer.parseInt(fields[3]),
                        Double.parseDouble(fields[4])
                ));
                line = br.readLine();
            }

            Set<String> sellers = list.stream()
                    .map(Sale::getSeller)
                    .collect(Collectors.toSet());

            System.out.println("Total de vendas por vendedor: ");

            for (String seller : sellers){
                Double sum = list.stream()
                        .filter(s -> s.getSeller().equals(seller))
                        .map(Sale::getTotal)
                        .reduce(0.0, Double::sum);
                System.out.println(seller + " - R$ " + String.format("%.2f", sum));
            }

        } catch (IOException e) {
            System.out.printf("Error: " + e.getMessage());
        }
        sc.close();
    }
}