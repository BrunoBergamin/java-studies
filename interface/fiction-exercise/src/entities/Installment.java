package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {

    private Date dueDate;
    private Double amount;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Installment () {

    }

    public Installment(Double amount, Date dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return sdf.format(dueDate)
                + " - "
                + String.format("%.2f", amount);
    }
}
