package com.epam.training.student_Artur_Mirzoyan;

public class Abiturient {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int phone;
    private String estimates;

    Abiturient(String name) {
        this.name = name;
    }
    Abiturient(String name,String surname) {
        this.name = name;
        this.surname=surname;
    }
    public void setAddress(String address) {
        if (!address.isEmpty() || address !="Spitak tun"){
            this.address = address;
        }
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }
    public int getID() {
        return id;
    }
    public String toString(){
        return "name: "+ name + " surname: " + surname;
    }
}
