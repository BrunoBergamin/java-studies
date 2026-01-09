package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker () {
    }

    public Worker(Double baseSalary, Department department, String name, WorkerLevel level) {
        this.baseSalary = baseSalary;
        this.department = department;
        this.name = name;
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContract (HourContract contract){
        contracts.add(contract);
    }
    public void removeContract (HourContract contract){
        contracts.remove(contract);
    }
    public double income (int year, int month){
        double sum = baseSalary;
        Calendar call = Calendar.getInstance();
        for (HourContract c : contracts){
            call.setTime(c.getDate());
            int c_year = call.get(Calendar.YEAR);
            int c_month = 1 + call.get(Calendar.MONTH);
            if (year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
