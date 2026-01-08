public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int m, n;
    double somaLinha;

    System.out.print("Qual a quantidade de linhas da matriz? ");
    m = sc.nextInt();
    System.out.print("Qual a quantidade de colunas da matriz? ");
    n = sc.nextInt();

    double[][] mat = new double[m][n];
    double[] vect = new double[m];

    for (int i = 0; i < m; i++) {
        System.out.printf("Digite os elementos da %d a. linha%n", i + 1);
        for (int j = 0; j < n; j++) {
            mat[i][j] = sc.nextDouble();
        }
    }

    for (int i = 0; i < m; i++) {
        somaLinha = 0;
        for (int j = 0; j < n; j++) {
            somaLinha += mat[i][j];
        }
        vect[i] = somaLinha;
    }

    System.out.println("VETOR GERADO:");
    for (int i = 0; i < m; i++) {
        System.out.printf("%.1f%n", vect[i]);
    }

    sc.close();
}
