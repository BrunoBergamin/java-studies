public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, max, positionName = 0;
    System.out.print("Quantas pessoas você vai digitar? ");
    n = sc.nextInt();
    sc.nextLine();

    String vectName[] = new String[n];
    int vectAge[] = new int[n];

    for (int i = 0; i < n; i++){
        System.out.println("Dados da " + (i + 1) + "a pessoa: ");

        System.out.print("Nome: ");
        vectName[i] = sc.nextLine();

        System.out.print("Idade: ");
        vectAge[i] = sc.nextInt();
        sc.nextLine();
    }

    max = vectAge[0];

    for (int i = 0; i < n; i++){
        if (vectAge[i] > max){
            max = vectAge[i];
            positionName = i;
        }
    }
    System.out.printf("PESSOA MAIS VELHA: %s", vectName[positionName]);

    sc.close();

}
