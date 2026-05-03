package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private float reservationTotal;


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setPrice() {
        this.price = price;
    }

    public double getPrice(String roomType) {
        price = 0;
        if ("king".equalsIgnoreCase(roomType)) {
            return 139.00;
        } else {
            return 124.00;
        }
    }

    public void setNumberOfNights() {
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights(int numberOfNights) {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double setIsWeekend(boolean isWeekend) {
        double currentPrice = 0;
        if(isWeekend) {
            currentPrice = price * 0.10;
            currentPrice = currentPrice + price;
        }

        return currentPrice;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }
}

