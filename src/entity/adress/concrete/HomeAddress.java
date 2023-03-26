package entity.adress.concrete;

import entity.adress.abs.Address;
import entity.util.type.AddressType;

public class HomeAddress extends Address {
    public HomeAddress(String country,String city,String district,String quarter,String street,String apartmentName,int floor,int doorNumber){
        super(country, city, district, quarter, street, apartmentName, floor, doorNumber);
        super.setType(AddressType.HOME_ADDRESS);
    }
}
