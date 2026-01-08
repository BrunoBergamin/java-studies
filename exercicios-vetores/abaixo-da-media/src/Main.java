public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n;
    double average, sum;

    System.out.print("Quantos elementos vai ter o vetor? ");
    n = sc.nextInt();
    double vect[] = new double[n];

    for (int i = 0; i < vect.length; i++) {
        System.out.print("Digite um número: ");
        vect[i] = sc.nextDouble();
    }

    sum = 0.0;
    for (int i = 0; i < vect.length; i++) {
        sum += vect[i];
    }
    average = sum / n;
    System.out.printf("Média do vetor = %.3f\n", average);

    System.out.println("Elementos abaixo da média: ");
    for (int i = 0; i < vect.length; i++) {
        if (vect[i] < average) {
            System.out.println(vect[i]);
        }
    }


    sc.close();
}