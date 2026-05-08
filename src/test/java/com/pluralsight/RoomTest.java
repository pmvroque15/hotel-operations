package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    //Made it as a field since we are using it for all tests.
    //Arrange
    Room room = new Room();
    @Test
    //Validate is true once the room is checked in
    void testCheckIn_shouldMarkRoomAsOccupied_whenRoomIsAvailable() {
        //Act
        room.checkIn();

        //Assert
        Assertions.assertTrue(room.isOccupied());
    }
    @Test
    //Validate the logic if I checked in, and I checked in again on the same room, should return false
    void testCheckIn_shouldReturnFalse_afterTryingToCheckInSameRoom() {

        //Act
        room.checkIn();
        boolean secondAttemptCheckIn = room.checkIn();
        boolean isOccupied = room.isOccupied();

        //Assert
        Assertions.assertFalse(secondAttemptCheckIn);
        Assertions.assertTrue(isOccupied);
    }

    @Test
    //Validate the logic if the room is clean but still dirty, it will return false
    void testCheckIn_shouldReturnFalse_whenRoomIsDirty() {
        //Act
        room.setDirty(true);
        room.setOccupied(false);

        boolean wasCheckedIn = room.checkIn();
        boolean isOccupied = room.isOccupied();
        boolean isDirty = room.isDirty();

        //Assert
        Assertions.assertFalse(wasCheckedIn);
        Assertions.assertFalse(isOccupied);
        Assertions.assertTrue(isDirty);
    }

    @Test
    //Validate checkeOut() returns to Occupied to false when the method is being called.
    void testCheckOut_shouldMarkCheckOut() {
        //Act
        room.checkIn();
        boolean result = room.checkOut();
        boolean isOccupied = room.isOccupied();

        //Assert
        Assertions.assertFalse(isOccupied);
        Assertions.assertTrue(result);
    }


    @Test
    //Validate checkOut() returns to false when the room was not even checked in prior calling checkOut()
    void testCheckOut_shouldReturnFalse_whenItWasNotCheckedIn() {
        //Act
        boolean cannotCheckOut = room.checkOut();

        //Assert
        Assertions.assertFalse(cannotCheckOut);
    }

    @Test
    //Validate cleanRoom() returns true when room was checked out
    void testCleanRoom_shouldMarkedAsCleaned() {
        //Act
        room.checkIn();
        room.checkOut();

        String actualValue = room.cleanRoom();
        String expectedValue = "All Clean!";
        //Assert
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    //Validate cleanRoom() when it's not even dirty in the first place.
    void testCleanRoom_shouldMarkItHasBeenCleaned() {
        //Act
        String actualValue = room.cleanRoom();
        String expectedValue = "What do you mean? Room is squeaky clean!";

        //Assert
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    //Validate cleanRoom() to throw a message when it's occupied and it's dirty.
    void testCleanRoom_shouldNotBeCleaned_whenTheRoomIsOccupied() {
        //Act
        room.setDirty(true);
        room.setOccupied(true);

        String actualValue = room.cleanRoom();
        String expectedValue = "Cannot be cleaned, occupied room.";

        //Assert
        Assertions.assertEquals(expectedValue, actualValue);
    }
}