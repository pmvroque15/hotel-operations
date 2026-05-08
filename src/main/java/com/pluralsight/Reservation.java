package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setReservationTotal(float reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    private float reservationTotal;
    public LocalDate reservationDate;


    public Reservation() {
    }

    public String getRoomType() {
        return roomType;
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }


    public double getPrice(String roomType) {
        double basePrice = 124.00;

        if ("king".equalsIgnoreCase(this.roomType)) {
            basePrice = 139.00;
        }

        if (isWeekend()) {
            basePrice *= 1.10;
        }

        return basePrice;
    }

    public boolean isWeekend() {
        DayOfWeek reservationDay = reservationDate.getDayOfWeek();

        return reservationDay == DayOfWeek.SATURDAY || reservationDay == DayOfWeek.SUNDAY;
    }

    public double getReservationTotal() {
        return getPrice(this.roomType) * this.numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

//    public double calculatePrice (String roomType) {
//
//
//    }

}

