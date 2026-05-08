package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites = 0;
    private int numberOfRooms = 0;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public Hotel(int numberOfSuites, int numberOfRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }


//    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
//        if(isSuite) {
//            if(numberOfSuites > 0) {
//                if (getAvailableSuites() > numberOfRooms) {
//                    bookedSuites += numberOfRooms;
//
//                    return true;
//                } else {
//                     if(getAvailableRooms() >= numberOfRooms) {
//                         bookedBasicRooms += numberOfRooms;
//                         return true;
//                     }
//                }
//            }
//            return false;
//        }
//        return
//    }


    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }
}
