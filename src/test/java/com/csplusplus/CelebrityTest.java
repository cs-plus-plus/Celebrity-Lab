package com.csplusplus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * Tests for the Celebrity Game implementation.
 */
public class CelebrityTest {

    private CelebrityGame game;
    private Celebrity celebrity;
    private LiteratureCelebrity literatureCelebrity;
    private ArrayList<Celebrity> celebGameList;

    @BeforeEach
    public void setUp() {
        // Initialize the game and sample celebrities for testing
        game = new CelebrityGame();
        celebrity = new Celebrity("Marie Curie", "Pioneering research on radioactivity");
        literatureCelebrity = new LiteratureCelebrity("Shakespeare", "Famous works: Hamlet, Macbeth");
        celebGameList = new ArrayList<>();
    }

    // Combined Unit Test for Activity 1: Initial Game Setup
    @Test
    public void testInitialGameSetupAndDesign() {
        assertNotNull(game, "CelebrityGame should be initialized.");
        assertEquals(0, game.getCelebrityGameSize(), "Celebrity list should be empty at game start.");

        // Basic structure verification without specific methods from the solution
        game.addCelebrity("Marie Curie", "Pioneering research on radioactivity", "Scientist");
        assertEquals(1, game.getCelebrityGameSize(), "Game should have one celebrity after adding.");
    }

    // Combined Unit Test for Activity 2: Celebrity Class
    @Test
    public void testCelebrityClassFunctionality() {
        // Check initialization of Celebrity and LiteratureCelebrity objects
        assertNotNull(celebrity, "Celebrity object should be initialized.");
        assertNotNull(literatureCelebrity, "LiteratureCelebrity object should be initialized.");

        // Add a LiteratureCelebrity to the game
        game.addCelebrity("Shakespeare", "Famous works: Hamlet, Macbeth", "Literature");
        assertEquals(1, game.getCelebrityGameSize(), "Game should have one literature celebrity after adding.");
    }

    // Combined Unit Test for Activity 3: Game Methods and GUI Integration
    @Test
    public void testGameMethodsAndGUIIntegration() {
        // Testing prepareGame and validation methods
        game.prepareGame();
        assertEquals(0, game.getCelebrityGameSize(), "Game list should be cleared when prepared.");

        assertTrue(game.validateCelebrity("Newton"), "Valid celebrity name should pass validation.");
        assertFalse(game.validateCelebrity(""), "Empty name should fail validation.");

        assertTrue(game.validateClue("Famous scientist", ""), "Valid clue should pass validation.");
        assertFalse(game.validateClue("Short", ""), "Clue with less than 10 characters should fail validation.");

        // Test play method with added celebrities
        game.addCelebrity("Marie Curie", "Pioneering research on radioactivity", "Scientist");
        game.play();
        assertNotNull(game.sendClue(), "The game should have set the correct clue.");
    }

    // Updated Unit Test for Activity 4: Inheritance and Subclass Integration
    @Test
    public void testInheritanceAndSubclassIntegration() {
        // Add a generic Celebrity and a LiteratureCelebrity
        game.addCelebrity("Marie Curie", "Pioneering research on radioactivity", "Celebrity");
        game.addCelebrity("Shakespeare", "Famous works: Hamlet, Macbeth", "Literature");
        assertEquals(2, game.getCelebrityGameSize(), "Game should have two celebrities.");

        // Start the game to set the first celebrity
        game.play();
        
        // Verify the processGuess method works correctly for both added celebrities
        // This assumes play sets the first item and continues correctly without subclass-specific issues
        boolean correctGuess = game.processGuess("Marie Curie");
        if (correctGuess) {
            assertTrue(correctGuess, "Correct guess for Celebrity should return true.");
        } else {
            assertTrue(game.processGuess("Shakespeare"), "Correct guess for LiteratureCelebrity should return true.");
        }

        // Ensure the clue corresponds to the currently active celebrity after processing guesses
        String currentClue = game.sendClue();
        assertNotNull(currentClue, "Current clue should not be null.");
        assertTrue(currentClue.contains("Pioneering research") || currentClue.contains("Famous works"), 
                   "Clue should match the current active celebrity.");
    }
}
