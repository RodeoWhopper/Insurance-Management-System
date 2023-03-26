package entity.account.abs;

import entity.adress.abs.Address;
import entity.insurance.abs.Insurance;
import entity.user.User;
import entity.util.authentication.AuthenticationStatus;
import entity.util.exceptions.InvalidAuthenticationException;
import service.adress_manager.concrete.AddressManagerClass;

import java.util.ArrayList;

public abstract class Account implements Comparable{
    private String type;
    AuthenticationStatus status;
    private User user;
    private ArrayList<Insurance> insuranceList;
    public Account(User user,ArrayList<Insurance> insuranceList){
        this.setUser(user);
        this.setInsuranceList(insuranceList);
    }
    public void addAddress(Address address){
        (new AddressManagerClass()).addAddress(address, this.getUser());
    }
    public void removeAddress(Address address){
        (new AddressManagerClass()).removeAddress(address, this.getUser());
    }
    public void addInsurance(Insurance insurance){
        this.getInsuranceList().add(insurance);
    }
    public void removeInsurance(Insurance insurance){
        this.getInsuranceList().remove(insurance);
    }
    public void login(String email, String password) throws InvalidAuthenticationException {
        if(email == getUser().getEmail() && password == getUser().getPassword()){
            setStatusOn();
            getUser().setLastLogin();
        }else{
            setStatusOff();
            throw new InvalidAuthenticationException();
        }
    }
    public void logout(){
        setStatusOff();
    }
    public AuthenticationStatus isLogin(){
        return this.status;
    }
    public void setStatusOn(){
        this.status = AuthenticationStatus.SUCCESS;
    }
    public void setStatusOff(){
        this.status = AuthenticationStatus.FAIL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }
}
