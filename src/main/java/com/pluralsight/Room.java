package com.pluralsight;

public class Room {
    private  int getNumberOfBeds;
    private  float getPrice;
    private  boolean isOccupied;
    private  boolean isDirty;

    public Room(int getNumberOfBeds, float getPrice) {
        this.getNumberOfBeds = getNumberOfBeds;
        this.getPrice = getPrice;
    }


    public int getGetNumberOfBeds() {
        return getNumberOfBeds;
    }

    public float getGetPrice() {
        return getPrice;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        //if the room is checked in
        //mark occupied as true and mark as dirty
        if(!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
        }
    }
    public void checkOut() {
        if (isOccupied) {
            isOccupied = false;
            isDirty = true;
        }
    }
    public void cleanRoom() {
        if (!isOccupied && isDirty) {
            isDirty = false;
        }
    }

    public boolean isDirty() {
        return isDirty;
    }



}
