package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyFriendIsTest {

    @Test
    public void testGenerateGreetingWithName() {
        // Arrange
        String name = "Christina";
        String expectedGreeting = "Hi Christina!";

        // Act
        String actualGreeting = MyFriendIs.generateGreeting(name);

        // Assert
        assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    public void testGenerateGreetingWithEmptyName() {
        // Arrange
        String name = "";
        String expectedGreeting = "Hi !";

        // Act
        String actualGreeting = MyFriendIs.generateGreeting(name);

        // Assert
        assertEquals(expectedGreeting, actualGreeting);
    }

    @Test
    public void testGenerateGreetingWithNullName() {
        // Arrange
        String name = null;
        String expectedGreeting = "Hi null!";

        // Act
        String actualGreeting = MyFriendIs.generateGreeting(name);

        // Assert
        assertEquals(expectedGreeting, actualGreeting);
    }
}

