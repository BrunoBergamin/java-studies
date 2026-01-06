public void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n;

    System.out.printf("Quantos numeros você vai digitar? ");
    n = sc.nextInt();

    int vect[] = new int[n];

    for (int i = 0; i < vect.length; i++){
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextInt();
    }
    System.out.println("Numeros Negativos: ");

    for (int i = 0; i < vect.length; i++){
        if(vect[i] < 0){
            System.out.printf("%d\n ", vect[i]);
        }
    }


    sc.close();
}