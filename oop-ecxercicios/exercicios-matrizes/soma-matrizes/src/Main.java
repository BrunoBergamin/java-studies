public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int m, n;
    System.out.print("Quantas linhas vai ter cada matriz? ");
    m = sc.nextInt();
    System.out.print("Quantas colunas vai ter cada matriz? ");
    n = sc.nextInt();

    int[][] matOne = new int[m][n];
    int[][] matTwo = new int[m][n];
    int[][] matThree = new int[m][n];

    System.out.println("Digite os valores da matriz A: ");
    for (int i = 0; i < matOne.length; i++) {
        for (int j = 0; j < matOne[i].length; j++) {
            System.out.print("Elemento [" + i + ", " + j + "]: ");
            matOne[i][j] = sc.nextInt();
        }
    }
    System.out.println("Digite os valores da matriz B: ");
    for (int i = 0; i < matTwo.length; i++) {
        for (int j = 0; j < matTwo[i].length; j++) {
            System.out.print("Elemento [" + i + ", " + j + "]: ");
            matTwo[i][j] = sc.nextInt();
        }
    }
    System.out.println("MATRIZ SOMA: ");
    for (int i = 0; i < matThree.length; i++) {
        for (int j = 0; j < matThree[i].length; j++) {
            matThree[i][j] = matOne[i][j] + matTwo[i][j];
            System.out.printf("%d ", matThree[i][j]);
        }
        System.out.println();
    }
    sc.close();
}
