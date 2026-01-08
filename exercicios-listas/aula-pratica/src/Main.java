public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add("Milho");
    list.add(2, "Marco");

    System.out.println(list.size());
    for (String x : list){
        System.out.println(x);
    }

    System.out.println("_____________________________");

    list.removeIf(x -> x.charAt(0) == 'M');
    for (String x : list){
        System.out.println(x);
    }

    System.out.println("_____________________________");

    System.out.println("Idex of Bob: " + list.indexOf("Bob"));
    System.out.println("Idex of Marco: " + list.indexOf("Marco"));

    System.out.println("_____________________________");

    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    for (String x : result){
        System.out.println(x);
    }

    System.out.println("_____________________________");
    String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
    System.out.println(name);

    sc.close();
}