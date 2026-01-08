package Entities;

public class Person {

    private String name;
    private String cpf;
    private int age;

    public Person(String name, String cpf, int age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nCPF: " + cpf +
                "\nAge: " + age;
    }

}
