package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    // Validating the logic of punchIn()
    void testPunchIn_shouldSetValidTime() {
        //Arrange
        Employee employee = new Employee();
        //Act
        employee.punchIn(10);
        //Assert
        Assertions.assertEquals(10, employee.getTimeIn());
    }

    @Test
    void testPunchIn_shouldRejectTheNegativeNumber() {
        //Array
        Employee employee = new Employee();
        //Act
        employee.punchIn(-75);
        //Assert
        Assertions.assertEquals(0, employee.getTimeIn());
    }

    @Test
    void testPunchIn_shouldRejectGreaterNumber() {
        //Array
        Employee employee = new Employee();
        //Act
        employee.punchIn(99);
        //Assert
        Assertions.assertEquals(0, employee.getTimeIn());
    }


    @Test
    // Validating the logic of punchOut()
    void punchOut() {

    }

}