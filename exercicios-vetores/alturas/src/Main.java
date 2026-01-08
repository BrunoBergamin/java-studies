import entities.People;

public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("Quantas pessoas serão digitadas? ");
    n = sc.nextInt();

   People[] people = new People[n];

   for (int i = 0; i < people.length; i++){
       System.out.println("Dados da " + (i + 1) +"a pessoa:");

       sc.nextLine();
       System.out.print("Nome: ");
       String name = sc.nextLine();
       System.out.print("Idade: ");
       int age = sc.nextInt();
       System.out.print("Altura: ");
       double height = sc.nextDouble();

       people[i] = new People(age, height, name);
    }

   double sum = 0;
   for ( int i = 0; i < people.length; i++){
       sum += people[i].getHeight();
   }
   double avarage = sum / n;
    System.out.printf("Altura média: %.2f\n", avarage);

    int countUnder16 = 0;

    for (int i = 0; i < people.length; i++){
        if (people[i].getAge() < 16){
            countUnder16 ++;
            double percentage = ((double) countUnder16 / people.length) * 100.0;
            System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
            System.out.println(people[i].getName());
        }
    }

   sc.close();
}
