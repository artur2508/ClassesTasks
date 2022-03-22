package com.epam.training.student_Artur_Mirzoyan;

public class Book {

    private int id;
    private String name;
    private String autor;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private String typeOfBinding;

    Book(String name) {
        this.name = name;
    }
    Book(String name,int price) {
        this.name = name;
        this.price=price;
    }
    public void setPrice(int numberOfPages) {
        if (numberOfPages !=0){
            this.numberOfPages = numberOfPages;
        }
    }
    public void setyearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }


    public int getPhone() {
        return yearOfPublishing;
    }
    public int getID() {
        return id;
    }
    public String toString(){
        return "name: "+ name + " price: " + price;
    }
}
