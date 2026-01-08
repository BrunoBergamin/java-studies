public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, position;
    double max;

    System.out.print("Quantos numeros você quer digitar? ");
    n = sc.nextInt();
    double vect[] = new double[n];

    for (int i = 0; i < vect.length; i++) {
        System.out.print("Digite um número: ");
        vect[i] = sc.nextDouble();
    }
    max = vect[0];
    position = 0;
    for (int i = 0; i < vect.length; i++) {
        if (vect[i] > max) {
            max = vect[i];
            position = i;
        }
    }
    System.out.printf("Maior valor = %.2f\n", max);
    System.out.printf("Posição do maior é: %d", position);

    sc.close();
}