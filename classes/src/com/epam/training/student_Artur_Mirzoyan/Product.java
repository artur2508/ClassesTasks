package com.epam.training.student_Artur_Mirzoyan;

public class Product {

    private int id;
    private String name;
    private String upc;
    private String manufacturer;
    private int price;
    private int shelfLife;
    private int quantity;

    Product(String name) {
        this.name = name;
    }
    Product(String name,int  price) {
        this.name = name;
        this.price=price;
    }
    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }
    }
    public int getPrice() {
       return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getShelfLife() {
        return shelfLife;
    }
    public int getID() {
        return id;
    }
    public String toString(){
        return "name: "+ name + " price: " + price;
    }
}
