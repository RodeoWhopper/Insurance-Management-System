package entity.adress.abs;

import entity.util.type.AddressType;

public abstract class Address {
    AddressType type;
    private String country;
    private String city;
    private String district;
    private String quarter;
    private String street;
    private String apartmentName;
    private int floor;
    private int doorNumber;

    public Address(String country,String city,String district,String quarter,String street,String apartmentName,int floor,int doorNumber){
        this.country = country;
        this.city = city;
        this.district = district;
        this.quarter = quarter;
        this.street = street;
        this.apartmentName = apartmentName;
        this.floor = floor;
        this.doorNumber = doorNumber;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }
}
