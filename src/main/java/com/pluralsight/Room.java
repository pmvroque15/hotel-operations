package com.pluralsight;

public class Room {


    private int getNumberOfBeds;
    private float getPrice;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int getNumberOfBeds, float getPrice) {
        this.getNumberOfBeds = getNumberOfBeds;
        this.getPrice = getPrice;
    }

    public Room() {

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

    public boolean checkIn() {
        //if the room is checked in
        //mark occupied as true and mark as dirty
        if (!isOccupied && !isDirty) {
            this.isOccupied = true;
            this.isDirty = true;
            return true;
        } else if (!isOccupied && isDirty) {
            this.isOccupied = false;
            return false;
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

    public void cleanRoom() {
        if (!isOccupied && isDirty) {
            isDirty = false;
        }
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
