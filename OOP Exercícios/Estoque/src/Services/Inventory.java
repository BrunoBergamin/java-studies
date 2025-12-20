package Services;

import Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Product> products = new ArrayList<>();
    private final List<String> history = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        history.add("CADASTRO - " + p.getName() + " (qtd " + p.getQuantity() + ")");
    }

    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public boolean entry(int id, int amount) {
        Product p = findById(id);
        if (p == null || amount <= 0) return false;

        p.addStock(amount);
        history.add("ENTRADA " + amount + " - " + p.getName());
        return true;
    }

    public boolean exit(int id, int amount) {
        Product p = findById(id);
        if (p == null || amount <= 0) return false;

        boolean ok = p.removeStock(amount);
        if (ok) history.add("SAIDA " + amount + " - " + p.getName());
        return ok;
    }

    public void printStock() {
        if (products.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        double total = 0.0;
        System.out.println("\n=== ESTOQUE ATUAL ===");
        for (Product p : products) {
            System.out.println(p);
            total += p.totalValue();
        }
        System.out.printf("TOTAL GERAL: R$ %.2f%n", total);
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("Sem movimentacoes.");
            return;
        }

        System.out.println("\n=== HISTORICO ===");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ") " + history.get(i));
        }
    }
}
