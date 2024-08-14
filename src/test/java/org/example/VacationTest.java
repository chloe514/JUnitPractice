package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VacationTest {

    @Test
    public void testGetVacationMessage() {
        // Arrange
        String expectedMessage = "I would like to visit Turkey.\n" +
                "I would like to visit Turkey.\n" +
                "I would like to visit Turkey.\n";

        // Act
        String actualMessage = Vacation.getVacationMessage();

        // Assert
        assertEquals(expectedMessage, actualMessage);
    }
}





