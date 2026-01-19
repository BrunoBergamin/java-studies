package application;


import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

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

        System.out.println("Enter contract date:");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Date (dd/mm/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(date, number, totalValue);

        ContractService cs = new ContractService(new PaypalService());

        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();

        cs.processContract(contract, n);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }


        sc.close();
    }

}