public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, max;
    System.out.print("Qual a ordem da matriz? ");
    n = sc.nextInt();

    int [][] mat = new int[n][n];

    for (int i = 0; i < mat.length; i++){
        for (int j = 0; j < mat[i].length; j++) {
            System.out.print("Elemento [" + i + ", " + j + "]: ");
            mat[i][j] = sc.nextInt();
        }
    }

    System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");

    for (int i = 0; i < mat.length; i++){
        max = mat[i][0];
        for (int j = 0; j < mat[i].length; j++){
            if (max < mat[i][j]){
                max = mat[i][j];
            }
        }
        System.out.println(max);
    }
    sc.close();
}