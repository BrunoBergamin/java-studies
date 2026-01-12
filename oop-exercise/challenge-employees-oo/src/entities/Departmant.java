package entities;

import java.util.ArrayList;
import java.util.List;

public class Departmant {

    private String name;
    private int payDay;

    private List<Employee> list = new ArrayList<>();

    public Departmant(String name, int payDay) {
        this.name = name;
        this.payDay = payDay;
    }

    public List<Employee> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void removeEmployee(Employee employee) {
        list.remove(employee);
    }

    public double payRoll() {
        double sum = 0.0;
        for (Employee emp : list) {
            sum += emp.getSalary();
        }
        return sum;
    }
}

