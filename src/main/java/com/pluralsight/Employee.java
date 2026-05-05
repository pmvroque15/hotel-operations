package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

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

//    public double punchIn(int time) {
//
//    }
//    public double punchOut(int time) {
////        When they punch out, we calculate how many hours they have worked and add that
////        time to their hours worked.
////        int timeWorked = time - punchInTime;
////        return this.hoursWorked += time;
//    }
}
