package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class AbbreviationsTest {

    private Abbreviations abbreviations;

    @Before
    public void setUp() {
        // Initialize the Abbreviations object before each test
        abbreviations = new Abbreviations();
    }

    @Test
    public void testAddAbbreviation() {
        // Arrange
        String abbreviation = "LOL";
        String explanation = "Laugh Out Loud";

        // Act
        abbreviations.addAbbreviation(abbreviation, explanation);

        // Assert
        assertTrue(abbreviations.hasAbbreviation(abbreviation));
        assertEquals(explanation, abbreviations.findExplanationFor(abbreviation));
    }

    @Test
    public void testHasAbbreviation() {
        // Arrange
        String abbreviation = "BRB";

        // Act
        abbreviations.addAbbreviation(abbreviation, "Be Right Back");

        // Assert
        assertTrue(abbreviations.hasAbbreviation(abbreviation));
        assertFalse(abbreviations.hasAbbreviation("GTG"));
    }

    @Test
    public void testFindExplanationFor() {
        // Arrange
        String abbreviation = "GTG";
        String explanation = "Got To Go";
        abbreviations.addAbbreviation(abbreviation, explanation);

        // Act and Assert
        assertEquals(explanation, abbreviations.findExplanationFor(abbreviation));
        assertEquals(null, abbreviations.findExplanationFor("IDK"));
    }

    @Test
    public void testFindExplanationForNonExistentAbbreviation() {
        // Act and Assert
        assertEquals(null, abbreviations.findExplanationFor("NONEXISTENT"));
    }
}

