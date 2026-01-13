package entities;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company() {

    }

    public Company(Double anualIncome, String name, int numberOfEmployees) {
        super(anualIncome, name);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees >= 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
}
