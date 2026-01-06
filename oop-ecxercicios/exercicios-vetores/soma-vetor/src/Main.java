import static java.lang.System.*;

public void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(in);

    int n;

    out.print("Quantos numeros você vai digitar? ");
    n = sc.nextInt();

    double vect[] = new double[n];

    for (int i = 0; i < vect.length; i++){
        out.print("Digite um numero: ");
        vect[i] = sc.nextDouble();
    }
    out.print("VALORES: ");

    for (int i = 0; i < vect.length; i++){
        out.printf("%.2f ",  vect[i]);
    }
    out.println();
    double sum = 0;

    for(int i = 0; i < vect.length; i++){
        sum += vect[i];
    }

    out.printf("SOMA: %.2f\n", sum);


    double avarage = sum / n;

    out.printf("Media: %.2f\n", avarage);

    sc.close();
}