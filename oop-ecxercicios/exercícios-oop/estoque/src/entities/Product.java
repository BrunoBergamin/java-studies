package Entities;

public class Product {
    private final int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void addStock(int amount) {
        if (amount > 0) quantity += amount;
    }

    public boolean removeStock(int amount) {
        if (amount <= 0) return false;
        if (amount > quantity) return false;
        quantity -= amount;
        return true;
    }

    public double totalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format(
                "#%d - %s | R$ %.2f | Qtd: %d | Total: R$ %.2f",
                id, name, price, quantity, totalValue()
        );
    }
}
