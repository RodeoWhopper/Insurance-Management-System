package service.adress_manager.concrete;

import entity.adress.abs.Address;
import entity.adress.concrete.BusinessAddress;
import entity.adress.concrete.HomeAddress;
import entity.user.User;
import entity.util.exceptions.InvalidTypeException;
import service.adress_manager.abs.AddressManagerInterface;

public class AddressManagerClass implements AddressManagerInterface {
    @Override
    public Address createAddress(String type, String country, String city, String district, String quarter, String street, String apartmentName, int floor, int doorNumber) throws InvalidTypeException {
        Address address;
        switch (type){
            case "Business Address":
                address = new BusinessAddress(country, city, district, quarter, street, apartmentName, floor, doorNumber);
                break;
            case "Home Address":
                address = new HomeAddress(country, city, district, quarter, street, apartmentName, floor, doorNumber);
                break;
            default:
                throw new InvalidTypeException();
        }
        return address;
    }

    @Override
    public User addAddress(Address address, User user) {
        user.getAdressList().add(address);
        return user;
    }

    @Override
    public User removeAddress(Address address, User user) {
        user.getAdressList().remove(address);
        return user;
    }
}
