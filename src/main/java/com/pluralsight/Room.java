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

    public boolean checkIn(Guest guest) {
        //if the room is checked in
        //mark occupied as true and mark as dirty
        if(!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
            return true;
        }

        return false;
    }
    public boolean checkOut() {
        if (isOccupied) {
            isOccupied = false;
            isDirty = true;
            return true;
        }

        return false;
    }
    public boolean cleanRoom() {
        if (!isOccupied && isDirty) {
            isDirty = false;
            return true;
        }

        return false;
    }

    public boolean isDirty() {
        return isOccupied;
    }



}
