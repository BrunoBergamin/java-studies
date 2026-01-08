package entities;

public class TaxPayer {

    private double salaryIncome;
    private double serviceIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome,
                    double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.serviceIncome = serviceIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double salaryTax() {
        double monthlySalary = salaryIncome / 12.0;
        if (monthlySalary < 3000.0) {
            return 0.0;
        } else if (monthlySalary < 5000.0) {
            return salaryIncome * 0.10;
        } else {
            return salaryIncome * 0.20;
        }
    }

    public double servicesTax() {
        return serviceIncome * 0.15;
    }

    public double capitalTax() {
        return capitalIncome * 0.20;
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate() {
        return healthSpending + educationSpending;
    }

    public double netTax() {
        double maxRebate = grossTax() * 0.30;
        double rebate = Math.min(taxRebate(), maxRebate);
        return grossTax() - rebate;
    }

    @Override
    public String toString() {
        return "Imposto bruto total: "
                + String.format("%.2f%n", grossTax())
                + "Abatimento: "
                + String.format("%.2f%n", Math.min(taxRebate(), grossTax() * 0.30))
                + "Imposto devido: "
                + String.format("%.2f%n", netTax());
    }
}

