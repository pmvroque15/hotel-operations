package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
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
        //Called the instance as a field to validate for the second test
        //Act
        room.checkIn();
        boolean result = room.checkIn();
        //Assert
        Assertions.assertFalse(result);
        Assertions.assertTrue(room.isOccupied());
    }

    @Test
    //Validate the logic if the room is clean but still dirty, it will return false
    void testCheckIn_shouldReturnFalse_whenRoomIsDirty() {
        //Act
        room.setDirty(true);
        room.setOccupied(false);

        boolean result = room.checkIn();
        //Assert
        Assertions.assertFalse(result);
        Assertions.assertFalse(room.isOccupied());
        Assertions.assertTrue(room.isDirty());
    }

    @Test
    //Validate checkeOut() returns to Occupied to false when the method is being called.
    void checkOut() {
        room.checkIn();
        room.checkOut();

        Assertions.assertTrue(room.isOccupied());
    }
}