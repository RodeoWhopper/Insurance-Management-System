package entity.user;

import entity.adress.abs.Address;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Address> adressList;
    private Date createDate;
    private Date lastLogin;
    public User(String name,String surname,String email,String password,String job,int age){
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
        this.setPassword(password);
        this.setJob(job);
        this.setAge(age);
        this.setAdressList(new ArrayList<Address>());
        setCreateDate(Date.from(Instant.now()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAdressList() {
        return adressList;
    }

    public void setAdressList(ArrayList<Address> adressList) {
        this.adressList = adressList;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin() {
        this.lastLogin = Date.from(Instant.now());
    }
}
