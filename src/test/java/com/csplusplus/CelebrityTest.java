package com.csplusplus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for the Celebrity and LiteratureCelebrity classes without using CelebrityGame.
 */
public class CelebrityTest {

    private Celebrity celebrity;
    private LiteratureCelebrity literatureCelebrity;

    @BeforeEach
    public void setUp() {
        // Initialize sample celebrities for testing
        celebrity = new Celebrity("Marie Curie", "Pioneering research on radioactivity");
        literatureCelebrity = new LiteratureCelebrity("Shakespeare", "Famous works: Hamlet, Macbeth");
    }

    // Unit Test for Activity 1: Initial Celebrity Class Setup
    @Test
    public void testCelebrityInitialization() {
        // Check that the Celebrity object is initialized correctly
        assertNotNull(celebrity, "Celebrity object should be initialized.");
    }

    // Unit Test for Activity 2: Celebrity Class Methods
    @Test
    public void testCelebrityMethods() {
        // Test the getter methods for the Celebrity class
        assertEquals("Marie Curie", celebrity.getAnswer(), "The answer should match.");
        assertEquals("Pioneering research on radioactivity", celebrity.getClue(), "The clue should match.");
    }

    // Unit Test for Activity 3: LiteratureCelebrity Class Setup
    @Test
    public void testLiteratureCelebrityInitialization() {
        // Check that the LiteratureCelebrity object is initialized correctly
        assertNotNull(literatureCelebrity, "LiteratureCelebrity object should be initialized.");
    }

    // Unit Test for Activity 4: Inheritance and Overridden Methods
    @Test
    public void testLiteratureCelebrityMethods() {
        // Test the overridden getClue method in LiteratureCelebrity
        assertEquals("Famous works: Hamlet", literatureCelebrity.getClue(), "The clue should match.");
        assertEquals("Shakespeare", literatureCelebrity.getAnswer(), "The answer should be 'Shakespeare'.");
        assertEquals(" Macbeth", literatureCelebrity.getClue(), "The clue should match.");
        
        // Test toString method
        String expectedToString = "This is the literature celebrity: Shakespeare\nThe clues are:\nFamous works: Hamlet\n Macbeth\n";
        assertEquals(expectedToString, literatureCelebrity.toString(), "The toString method should match.");
        
    }
}
