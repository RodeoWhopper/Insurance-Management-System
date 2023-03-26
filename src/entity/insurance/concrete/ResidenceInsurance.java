package entity.insurance.concrete;

import entity.insurance.abs.Insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(double price, Date SD,Date ED){
        super("Residence Insurance",price,SD,ED);
    }
    @Override
    public double calculatePrice(Insurance insurance) {
        return insurance.getPrice();
    }
}
