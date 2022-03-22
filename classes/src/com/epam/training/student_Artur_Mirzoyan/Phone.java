package com.epam.training.student_Artur_Mirzoyan;

public class Phone {

    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int creditCardNumber;
    private int debit;
    private int Credit;
    private int distanceCallsTime;

    Phone(String name) {
        this.name = name;
    }
    Phone(String name,String surname) {
        this.name = name;
        this.surname=surname;
    }
    public void setAddress(String address) {
        if (!address.isEmpty() || address !="Spitak tun"){
            this.address = address;
        }
    }

    public String getAddress() {
        return address;
    }

    public int getCredit() {
        return Credit;
    }
    public int getID() {
        return id;
    }
    public String toString(){
        return "name: "+ name + " surname: " + surname;
    }
}
