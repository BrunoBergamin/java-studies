package Application;

import Entities.Product;
import Services.Inventory;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        int nextId = 1;

        while (true) {
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("1) Cadastrar produto");
            System.out.println("2) Entrada de estoque");
            System.out.println("3) Saida de estoque");
            System.out.println("4) Mostrar estoque");
            System.out.println("5) Mostrar historico");
            System.out.println("0) Sair");
            System.out.print("Opcao: ");

            int op = sc.nextInt();

            if (op == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (op) {
                case 1 -> {
                    sc.nextLine(); // limpar buffer
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Preco: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantidade inicial: ");
                    int qty = sc.nextInt();

                    Product p = new Product(nextId, name, price, qty);
                    inv.addProduct(p);
                    System.out.println("Cadastrado: " + p);
                    nextId++;
                }

                case 2 -> {
                    System.out.print("ID do produto: ");
                    int id = sc.nextInt();
                    System.out.print("Quantidade de entrada: ");
                    int amount = sc.nextInt();

                    boolean ok = inv.entry(id, amount);
                    System.out.println(ok ? "Entrada registrada!" : "Falha (verifique ID/quantidade).");
                }

                case 3 -> {
                    System.out.print("ID do produto: ");
                    int id = sc.nextInt();
                    System.out.print("Quantidade de saida: ");
                    int amount = sc.nextInt();

                    boolean ok = inv.exit(id, amount);
                    System.out.println(ok ? "Saida registrada!" : "Falha (ID invalido ou estoque insuficiente).");
                }

                case 4 -> inv.printStock();

                case 5 -> inv.printHistory();

                default -> System.out.println("Opcao invalida.");
            }
        }

        sc.close();
    }
}
