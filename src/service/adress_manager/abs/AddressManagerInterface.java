package service.adress_manager.abs;

import entity.adress.abs.Address;
import entity.user.User;
import entity.util.exceptions.InvalidTypeException;
import service.Manager;

public interface AddressManagerInterface extends Manager {
    public Address createAddress(String type,String country,String city,String district,String quarter,String street,String apartmentName,int floor,int doorNumber) throws InvalidTypeException;
    public User addAddress(Address address, User user);
    public User removeAddress(Address address, User user);
}
