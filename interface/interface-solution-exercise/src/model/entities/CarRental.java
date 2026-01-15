package model.entities;

import java.util.Calendar;
import java.util.Date;

public class CarRental {

    private Date start;
    private Date finish;

    private Veihcle veihcle;
    private Invoice invoice;

    public CarRental (){

    }

    public CarRental(Date finish, Date start, Veihcle veihcle) {
        this.finish = finish;
        this.start = start;
        this.veihcle = veihcle;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Veihcle getVeihcle() {
        return veihcle;
    }

    public void setVeihcle(Veihcle veihcle) {
        this.veihcle = veihcle;
    }


}
