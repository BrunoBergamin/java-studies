package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {

    }

    public Individual(Double anualIncome, String name, Double healthExpenditures) {
        super(anualIncome, name);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.00) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.50;
        } else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.50;
        }
    }
}
