package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private Integer number;
    private Date date;
    private Double valueTotal;

    List<Installment> installments = new ArrayList<>();

    public Contract (){

    }
    public Contract(Date date, Integer number, Double valueTotal) {
        this.date = date;
        this.number = number;
        this.valueTotal = valueTotal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getValueTotal() {
        return valueTotal;
    }

    public void setValueTotal(Double valueTotal) {
        this.valueTotal = valueTotal;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
