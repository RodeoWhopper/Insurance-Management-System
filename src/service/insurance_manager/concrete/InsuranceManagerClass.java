package service.insurance_manager.concrete;

import entity.insurance.abs.Insurance;
import entity.insurance.concrete.CarInsurance;
import entity.insurance.concrete.HealthInsurance;
import entity.insurance.concrete.ResidenceInsurance;
import entity.insurance.concrete.TravelInsurance;
import service.insurance_manager.abs.InsuranceManagerInterface;

import java.util.ArrayList;
import java.util.Date;

public class InsuranceManagerClass implements InsuranceManagerInterface {

    @Override
    public ArrayList<Insurance> addInsurance(ArrayList<Insurance> list, Insurance insurance) {
        list.add(insurance);
        return list;
    }

    @Override
    public ArrayList<Insurance> removeInsurance(ArrayList<Insurance> list, Insurance insurance) {
        list.remove(insurance);
        return list;
    }

    @Override
    public Insurance createInsurance(String type, double price, Date SD, Date ED) {
        Insurance insurance = null;
        switch (type){
            case "Car":
                insurance = new CarInsurance(price, SD, ED);
                break;
            case "Health":
                insurance = new HealthInsurance(price, SD, ED);
                break;
            case "Residence":
                insurance = new ResidenceInsurance(price, SD, ED);
                break;
            case "Travel":
                insurance = new TravelInsurance(price, SD, ED);
                break;
        }
        return insurance;
    }
}
