package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        return 20.00;
    }

    public double getOvertimeHours() {
        double overtimeRate = payRate * 1.5;
        double overtimeHours;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        } else {
            overtimeHours = 0;
        }

        return overtimeRate * overtimeHours;
    }
}
