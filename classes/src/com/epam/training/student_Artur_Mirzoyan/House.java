package com.epam.training.student_Artur_Mirzoyan;

public class House {

    private int id;
    private int apartmentNumber;
    private int area;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String buildingType;
    private String lifeTime;

    House(int name) {
        this.apartmentNumber = apartmentNumber;
    }

    House(int apartmentNumber, String street) {
        this.apartmentNumber = apartmentNumber;
        this.street = street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getstreet() {
        return street;
    }

    public int getID() {
        return id;
    }

    public String toString() {
        return "apartmentNumber: " + apartmentNumber + " street: " + street;
    }
}
