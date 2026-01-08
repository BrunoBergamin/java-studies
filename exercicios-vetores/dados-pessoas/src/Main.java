public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, menNumbers, womanNumbers;
    double smallHeight, maxHeight, avgHeightWoman, sumWoman;
    System.out.print("Quantas pessoas serão digitadas? ");
    n = sc.nextInt();

    double height[] = new double[n];
    char gender[] = new char[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Altura da " + (i + 1) + "a pessoa: ");
        height[i] = sc.nextDouble();
        System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
        gender[i] = sc.next().charAt(0);
    }

    smallHeight = height[0];
    maxHeight = height[0];
    menNumbers = 0;
    womanNumbers = 0;
    sumWoman = 0;
    avgHeightWoman = 0;

    for (int i = 0; i < n; i++) {
        if (height[i] < smallHeight) {
            smallHeight = height[i];
        }
        if (height[i] > maxHeight) {
            maxHeight = height[i];
        }
        if (gender[i] == 'F') {
            sumWoman += height[i];
            womanNumbers++;
        }
        if (gender[i] == 'M') {
            menNumbers++;
        }
    }
    avgHeightWoman = sumWoman / womanNumbers;

    System.out.printf("Menor altura = %.2f\n", smallHeight);
    System.out.printf("Maior altura = %.2f\n", maxHeight);
    System.out.printf("Média das alturas das mulheres: %.2f\n", avgHeightWoman);
    System.out.printf("Numero de homens: %d", menNumbers);
    sc.close();

}