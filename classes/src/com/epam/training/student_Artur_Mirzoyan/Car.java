package com.epam.training.student_Artur_Mirzoyan;

public class Car {

    private int id;
    private String brand;
    private String model;
    private int yearOfIssue;
    private String color;
    private int price;
    private int registrationNumber;

    Car(String brand) {
        this.brand = brand;
    }
    Car(String brand,String model) {
        this.brand = brand;
        this.model=model;
    }
    public void setbrand(String brand) {
        if (!brand.isEmpty() || brand !="Opel"){
            this.brand = brand;
        }
    }
    public void setColor(String   color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
    public int getID() {
        return id;
    }
    public String toString(){
        return "brand: "+ brand + " price: " + price;
    }
}
