package application;

import entities.*;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // CLIENT
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(birthDate, email, name);

        // ORDER
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase());

        Order order = new Order(new Date(), status, client);

        // ITEMS
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);

            order.addItem(item);
        }

        // SUMMARY
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient().getName());

        for (OrderItem item : order.getItems()) {
            System.out.println(
                    item.getProduct().getName()
                            + ", $" + item.subTotal()
            );
        }

        System.out.printf("Total price: $%.2f%n", order.total());

        sc.close();
    }
}
