package entity.insurance.concrete;

import entity.insurance.abs.Insurance;

import java.util.Date;

public class HealthInsurance extends Insurance {
    public HealthInsurance(double price,Date SD, Date ED){
        super("Health Insurance", price, SD, ED);
    }
    @Override
    public double calculatePrice(Insurance insurance) {
        return insurance.getPrice();
    }
}
