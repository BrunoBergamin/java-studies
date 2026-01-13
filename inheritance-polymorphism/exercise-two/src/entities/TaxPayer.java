package entities;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer (){

    }

    public TaxPayer(Double anualIncome, String name) {
        this.anualIncome = anualIncome;
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public String getName() {
        return name;
    }

    public abstract Double tax();
}
