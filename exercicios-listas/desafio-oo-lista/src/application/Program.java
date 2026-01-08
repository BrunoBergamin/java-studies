import entities.TaxPayer;

public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("Quantos contribuintes você vai digitar? ");
    n = sc.nextInt();


    List<TaxPayer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        System.out.println("Digite os dados do " + (i + 1) + "o contribuinte: ");
        System.out.print("Renda anual com salário: ");
        double salaryIncome = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        double serviceIncome = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double capitalIncome = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        double healthSpending = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        double educationSpending = sc.nextDouble();
        System.out.println();

        TaxPayer taxPayer = new TaxPayer(salaryIncome,serviceIncome,capitalIncome, healthSpending, educationSpending);
        list.add(taxPayer);
    }
    System.out.println("___________________________________");

    for (int i = 0; i < n; i++) {
        System.out.println("Resumo do " + (i + 1) + "o contribuinte: ");
        System.out.println(list.get(i).toString());
    }

    sc.close();
    ;
}