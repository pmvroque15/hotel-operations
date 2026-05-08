package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    public boolean isClockedIn;
    public int timeIn;
    public int timeOut;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

//    public int getClockInTime() {
//        return clockInTime;
//    }

//    public void setClockInTime(LocalTime clockInTime) {
//        if (isClockedIn) {
//            clockInTime = LocalTime.now();
//        }
//        this.clockInTime = clockInTime;
//    }

    public boolean isClockedIn() {
        return isClockedIn;
    }

    public void setClockedIn(boolean clockedIn) {
        isClockedIn = clockedIn;
    }

    public double getTotalPay() {
        return this.payRate * this.hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        }

        return 40;
    }

    public double getOvertimeHours() {

        if (this.hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public int getTimeIn() {
        return timeIn;
    }

    public int getTimeOut() {
        return timeOut;
    }

    //int time = 10 for 10:00 am
    //int time = 12 for 12:00 pm
    //int time = 14 for 2:00 pm
    public int punchIn(int timeIn) {
        if (timeIn < 0 || timeIn > 24) {
            System.out.println("Invalid Time in input");
            return 0;
        }

        return this.timeIn = timeIn;
    }

    public int punchOut(int timeOut) {
        if (timeOut < 0 || timeOut > 24) {
            System.out.println("Invalid Time");
            return 0;
        }

        return this.timeOut = timeOut;
    }
//    public void punchTimeCard(int time) {
//        if (!isClockedIn) {
//            clockInTime = time;
//            isClockedIn = true;
//        } else {
//            int hours = time - clockInTime;
//            hoursWorked += hours;
//
//            isClockedIn = false;
//        }
//    }

}
