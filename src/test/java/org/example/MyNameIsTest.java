package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyNameIsTest {

    @Test
    public void testGetNameMessage() {
        // Arrange
        String expectedMessage = "My name is Chloe.\n" +
                "My name is Chloe.\n" +
                "My name is Chloe.\n";

        // Act
        String actualMessage = MyNameIs.getNameMessage();

        // Assert
        assertEquals(expectedMessage, actualMessage);
    }
}

