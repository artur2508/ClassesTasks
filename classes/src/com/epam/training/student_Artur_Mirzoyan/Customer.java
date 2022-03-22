package com.epam.training.student_Artur_Mirzoyan;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int CreditcardNumber;
    private int accountNumber;


    Customer(String name) {
        this.name = name;
    }
    Customer(String name,String surname) {
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

    public int getCreditcardNumber() {
        return CreditcardNumber;
    }
    public int getID() {
        return id;
    }
    public String toString(){
        return "name: "+ name + " surname: " + surname;
    }
}
