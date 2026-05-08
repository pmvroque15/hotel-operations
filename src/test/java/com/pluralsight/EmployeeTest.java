package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    // Validating the logic of punchIn()
    //Assuming this is in Military time, and basing off top of the hour
    //Validating if the punchIn() Accepts the right time input by the user
    void testPunchIn_shouldSetValidTime() {
        //Arrange
        Employee employee = new Employee();
        //Act
        employee.punchIn(10);
        //Assert
        Assertions.assertEquals(10, employee.getTimeIn());
    }

    @Test
    //Validating if the punched in number is less than 0, then it will return 0
    void testPunchIn_shouldRejectTheNegativeNumber() {
        //Array
        Employee employee = new Employee();
        //Act
        employee.punchIn(-75);
        //Assert
        Assertions.assertEquals(0, employee.getTimeIn());
    }

    @Test
        //Validating if the punched in number is greater than 24, then it will return 0
    void testPunchIn_shouldRejectTimeGreaterNumber_24() {
        //Array
        Employee employee = new Employee();
        //Act
        employee.punchIn(99);
        //Assert
        Assertions.assertEquals(0, employee.getTimeIn());
    }


    @Test
    // Validating the logic of punchOut()
        // Assuming this is in Military time, and basing off top of the hour
        //Validating if the punchOut() Accepts the right time input by the user
    void testPunchOut_shouldAcceptValidatedTime() {
        //Array
        Employee employee = new Employee();
        //Act
        employee.punchOut(17);
        //Assert
        Assertions.assertEquals(17, employee.getTimeOut());
    }

    //Validating if the punched out number is less than 0, then it will return 0
    @Test
    void testPunchOut_shouldRejectTheNegativeTime() {
        //Array
        Employee employee = new Employee();
        //Act
        employee.punchOut(-67);
        //Assert
        Assertions.assertEquals(0, employee.getTimeOut());
    }

    @Test
    void testPunchOut_shouldRejectTheTimeGreaterThan_24() {
        //Array
        Employee employee = new Employee();
        //Act
        employee.punchOut(29);
        //Assert
        Assertions.assertEquals(0, employee.getTimeOut());
    }
}