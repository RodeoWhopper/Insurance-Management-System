package entity.insurance.concrete;

import entity.insurance.abs.Insurance;

import java.util.Date;

public class TravelInsurance extends Insurance {
    public TravelInsurance(double price, Date SD,Date ED){
        super("Travel Insurance",price,SD,ED);
    }
    @Override
    public double calculatePrice(Insurance insurance) {
        return insurance.getPrice();
    }
}
