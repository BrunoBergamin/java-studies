public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, quantityPars = 0;
    double average = 0, sum = 0;

    System.out.print("Quantos elemnetos vai ter o vetor? ");
    n = sc.nextInt();
    int vect[] = new int[n];

    for (int i = 0; i < vect.length; i++) {
        System.out.print("Digite um número: ");
        vect[i] = sc.nextInt();
    }

    for (int i = 0; i < vect.length; i++) {
        if (vect[i] % 2 == 0) {
            sum += vect[i];
            quantityPars++;
        }
    }
    if (quantityPars == 0) {
        System.out.print("NENHUM VETOR.");
    } else {
        average = (double) sum / quantityPars;
        System.out.printf("MEDIA DOS PARES = %.1f\n", average);
    }

    sc.close();
}



