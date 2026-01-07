public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, lowProfit, midProfit, highProfit;
    double porcentageProfit, valueTotalBuy, valueTotalSell, total;
    System.out.print("Serão digitados dados de quantos produtos? ");
    n = sc.nextInt();
    sc.nextLine();

    String name[] = new String[n];
    double buy[] = new double[n];
    double sell[] = new double[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Produto " + (i + 1));

        System.out.print("Nome: ");
        name[i] = sc.nextLine();

        System.out.print("Preço de Compra: ");
        buy[i] = sc.nextDouble();

        System.out.printf("Preço de venda: ");
        sell[i] = sc.nextDouble();
        sc.nextLine();
    }

    lowProfit = 0;
    midProfit = 0;
    highProfit = 0;
    porcentageProfit = 0;
    valueTotalBuy = 0;
    valueTotalSell = 0;

    for (int i = 0; i < n; i++) {
        porcentageProfit = ((sell[i] - buy[i]) / buy[i]) * 100;
        if (porcentageProfit < 10) {
            lowProfit++;
        }
        else if (porcentageProfit < 20) {
            midProfit++;
        } else  {
            highProfit++;
        }
        valueTotalBuy += buy[i];
        valueTotalSell += sell[i];
    }

    total = valueTotalSell - valueTotalBuy;

    System.out.println("RELATORIO:");
    System.out.printf("Lucro abaixo de 10%%: %d\n", lowProfit);
    System.out.printf("Lucro entre 10%% e 20%%: %d\n", midProfit);
    System.out.printf("Lucro acima de 20%%: %d\n", highProfit);
    System.out.printf("Valor total da compra: %.2f\n", valueTotalBuy);
    System.out.printf("Valor total da venda: %.2f\n", valueTotalSell);
    System.out.printf("Lucro total: %.2f\n", total);

    sc.close();
}