package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class NicknamesTest {

    private Nicknames nicknames;

    @Before
    public void setUp() {
        // Initialize the Nicknames object before each test
        nicknames = new Nicknames();
    }

    @Test
    public void testGetNicknameForMatthew() {
        // Arrange
        String expectedNickname = "matt";

        // Act
        String actualNickname = nicknames.getNickname("matthew");

        // Assert
        assertEquals(expectedNickname, actualNickname);
    }

    @Test
    public void testGetNicknameForMichael() {
        // Arrange
        String expectedNickname = "mix";

        // Act
        String actualNickname = nicknames.getNickname("michael");

        // Assert
        assertEquals(expectedNickname, actualNickname);
    }

    @Test
    public void testGetNicknameForArthur() {
        // Arrange
        String expectedNickname = "artie";

        // Act
        String actualNickname = nicknames.getNickname("arthur");

        // Assert
        assertEquals(expectedNickname, actualNickname);
    }

    @Test
    public void testGetNicknameForNonExistentName() {
        // Act
        String actualNickname = nicknames.getNickname("nonexistent");

        // Assert
        assertEquals(null, actualNickname);
    }
}
