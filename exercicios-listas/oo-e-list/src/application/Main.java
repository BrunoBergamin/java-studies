import entities.Employee;

public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> list = new ArrayList<>();

    System.out.print("How many employees will be registered? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.println("Employee #" + (i + 1) + ":");

        System.out.print("Id: ");
        Integer id = sc.nextInt();
        while (hasId(list, id)) {
            System.out.print("Id already taken. Try again: ");
            id = sc.nextInt();
            ;
        }
        sc.nextLine();

        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(id, name, salary);

        list.add(employee);
    }

    System.out.print("Enter the employee id that will have salary increase :");
    int idSalary = sc.nextInt();
    Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
    if (emp == null) {
        System.out.print("This id does not exist!");
    } else {
        System.out.print("Enterthe percentage: ");
        double porcentage = sc.nextDouble();
        emp.increaseSalary(porcentage);
    }

    System.out.println("List of employees:");
    for (Employee obj : list) {
        System.out.println(obj);
    }


    sc.close();
}

public static boolean hasId(List<Employee> list, int id) {
    Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    return emp != null;
}