package com.csplusplus;
import java.util.ArrayList;

/**
 * Subclass of Celebrity to show how methods can be overridden and super can be called while changing functionality.
 * @author cody.henrichsen
 * @version 1.0 15/09/2018
 */
public class LiteratureCelebrity extends Celebrity
{
	/**
	 * The list of clues for the Literature Celebrity. They can be titles of texts, important characters, settings, etc...s
	 */
	private ArrayList<String> clueList;

	/**
	 * Builds a LiteratureCelebrity instance with an answer and a series of clues as a String separated by commas.
	 * @param answer The literature celebrity
	 * @param clues Clues for the literature celebrity 
	 */
	// TODO: Implement constructor
	
	/**
	 * Processes the series of clues for the LiteratureCelebrity by adding all the values to an ArrayList<String> by
	 * splitting the original clue to an array of String.
	 * The original value is not impacted, thus preserving data and inheritance integrity.
	 */
	 // TODO: Implement processClues

	
	/**
	 * Overridden version of the getClue() method that cycles through each of the individual clues in the series.
	 * It recreates the clueList if the user has finished the series of clues.
	 */
	//TODO: Implement getClue
	
	
	//TODO: Implement toString

}
