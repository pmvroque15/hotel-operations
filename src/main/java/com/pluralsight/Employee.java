package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    public boolean isClockedIn;
    public int clockInTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public int getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(int clockInTime) {
        this.clockInTime = clockInTime;
    }

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

    //int time = 10 for 10:00 am
    //int time = 12 for 12:00 pm
    //int time = 14 for 2:00 pm
//    public void punchIn(int time) {
//
//    }
//
//    public void punchOut(int time) {
////        When they punch out, we calculate how many hours they have worked and add that
////        time to their hours worked.
//
//    }
    public void punchTimeCard(int time) {
        if (!isClockedIn) {
            clockInTime = time;
            isClockedIn = true;
        } else if(isClockedIn) {
            int hours = time - clockInTime;
            hoursWorked += hours;

            isClockedIn = false;
        }

    }
}
