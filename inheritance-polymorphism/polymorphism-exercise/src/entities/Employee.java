package entities;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee (){

    }
    public Employee(Integer hours, String name, Double valuePerHour) {
        this.hours = hours;
        this.name = name;
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Double payment (){
        return hours * valuePerHour;
    }
}
