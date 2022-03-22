package com.epam.training.student_Artur_Mirzoyan;

public class Train {

    private int destination;
    private int trainNumber;
    private int departureTime;
    private int numberOfSeats;
    private int price;
    private String shelfLife;
    private int quantity;


    Train(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setAddress(int trainNumber) {
        if (trainNumber!=0){
            this.trainNumber = trainNumber;
        }
    }
    public void setPhone(String shelfLife) {
        this.shelfLife = shelfLife;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public String toString(){
        return "trainNumber: "+ trainNumber;
    }
}
