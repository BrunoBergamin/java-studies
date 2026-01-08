public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, quantityPars;
    System.out.print("Quantos numeros você vai digitar? ");
    n = sc.nextInt();
    int vect[] = new int[n];

    for (int i = 0; i < vect.length; i++){
        System.out.print("Digite um número: ");
        vect[i] = sc.nextInt();
    }

    quantityPars = 0;
    System.out.println("Nuemros de pares: ");
    for (int i = 0; i < vect.length; i++){
        if (vect[i] % 2 ==0){
            System.out.printf(" %d ", vect[i]);
            quantityPars++;
        }
    }

    System.out.println();
    System.out.printf("Quantidade de Pares: %d", quantityPars);

    sc.close();

}

