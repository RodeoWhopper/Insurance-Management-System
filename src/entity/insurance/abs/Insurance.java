package entity.insurance.abs;

import java.util.Date;

public abstract class Insurance {
    private String type;
    private String name;
    private double price;
    private Date startingDate;
    private Date endingDate;
    public Insurance(String name,double price,Date SD,Date ED){
        this.setName(name);
        this.setPrice(price);
        this.setStartingDate(SD);
        this.setEndingDate(ED);
    }
    public abstract double calculatePrice(Insurance insurance);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }
}
