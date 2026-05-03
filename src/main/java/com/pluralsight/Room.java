package com.pluralsight;

public class Room {
    private  int getNumberOfBeds;
    private  float getPrice;
    private  boolean isOccupied;
    private  boolean isAvailable;

    public int getGetNumberOfBeds() {
        return getNumberOfBeds;
    }

    public void setGetNumberOfBeds(int getNumberOfBeds) {
        this.getNumberOfBeds = getNumberOfBeds;
    }

    public float getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(float getPrice) {
        this.getPrice = getPrice;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }




}
