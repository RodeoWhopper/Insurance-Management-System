package service.insurance_manager.abs;

import entity.insurance.abs.Insurance;
import service.Manager;

import java.util.ArrayList;
import java.util.Date;

public interface InsuranceManagerInterface extends Manager{
    public ArrayList<Insurance> addInsurance(ArrayList<Insurance> list,Insurance insurance);
    public ArrayList<Insurance> removeInsurance(ArrayList<Insurance> list,Insurance insurance);
    public Insurance createInsurance(String type, double price, Date SD, Date ED);
}
