package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private float reservationTotal;
    public LocalDate reservationDate;


    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, float reservationTotal, LocalDate reservationDate) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
        this.reservationDate = reservationDate;
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

