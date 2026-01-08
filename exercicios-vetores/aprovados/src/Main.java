import java.sql.SQLOutput;

public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n;
    double media;
    System.out.print("Quantos aluno serão digitados? ");
    n = sc.nextInt();
    sc.nextLine();

    String name[] = new String[n];
    double scoreOne[] = new double[n];
    double scoreTwo[] = new double[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Digite nome, primeira e segunda nota do aluno: ");
        name[i] = sc.nextLine();
        scoreOne[i] = sc.nextDouble();
        scoreTwo[i] = sc.nextDouble();
        sc.nextLine();
    }

    System.out.println("Alunos Aprovados: ");
    for (int i = 0; i < n; i++) {
        media = scoreOne[i] + scoreTwo[i] / 2;
        if (media >= 6.0) {
            System.out.println(name[i]);
        }
    }

    sc.close();
}
