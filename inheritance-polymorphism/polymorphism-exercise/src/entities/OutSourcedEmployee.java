package entities;

public class OutSourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutSourcedEmployee (){

    }

    public OutSourcedEmployee(Integer hours, String name, Double valuePerHour, Double addItionalCharge) {
        super(hours, name, valuePerHour);
        this.addItionalCharge = addItionalCharge;
    }

    public Double getAddItionalCharge() {
        return addItionalCharge;
    }
    @Override
    public Double payment (){
        return super.payment() + addItionalCharge * 1.1;
    }

}
