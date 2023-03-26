package entity.insurance.concrete;

import entity.insurance.abs.Insurance;

import java.util.Date;

public class CarInsurance extends Insurance {
    public CarInsurance(double price, Date SD,Date ED){
        super("Car Insurance",price,SD,ED);
    }
    @Override
    public double calculatePrice(Insurance insurance) {
        return insurance.getPrice();
    }
}
