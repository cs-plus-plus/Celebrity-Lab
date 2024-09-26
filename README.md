# Celebrity Game

The Celebrity Game is a Java-based project designed to teach students object-oriented programming concepts, including class design, inheritance, polymorphism, and GUI integration using Java Swing. The project involves creating a game where players guess the names of celebrities based on given clues.

## Objectives

- Understand and apply basic object-oriented programming principles.
- Implement classes and methods based on specific design requirements.
- Integrate GUI components to create an interactive user interface.
- Extend functionality through inheritance and polymorphism.

## Activities Overview

### **Activity 1: Introduction to Celebrity**
- Learn the rules of the Celebrity game and brainstorm a computer-based implementation.
- Identify necessary classes, instance variables, and methods for the game.
- Design a `play` method for the game class.

### **Activity 2: The Celebrity Class**
- Create the `Celebrity` class with appropriate constructors and methods.
- Understand the purpose of constructors and how they are used in class initialization.
- Write tests to verify the correct functionality of the `Celebrity` class.

### **Activity 3: Putting It All Together**
- Integrate the `Celebrity` class into the `CelebrityGame`.
- Set up GUI components including `StartPanel` and `CelebrityPanel`.
- Implement methods like `prepareGame`, `validateCelebrity`, `validateClue`, `addCelebrity`, `play`, `getCelebrityGameSize`, `processGuess`, and `sendClue`.

### **Activity 4: Extending the Celebrity Class**
- Extend the `Celebrity` class by creating a subclass (e.g., `LiteratureCelebrity`).
- Add attributes and behaviors specific to the subclass.
- Update the GUI to support the new subclass.

### **Activity 5: Open-Ended Activity**
- Work collaboratively to create a program involving a superclass and at least one subclass.
- Utilize polymorphism by overriding methods in the subclass.
- Implement and test the program, then answer reflective questions on the implementation process.

## Project Structure

- `Celebrity.java`: The base class for a celebrity in the game.
- `CelebrityGame.java`: Manages the game's logic and state.
- `LiteratureCelebrity.java`: A subclass of `Celebrity` with additional attributes and behaviors.
- `CelebrityFrame.java`: The main JFrame for the GUI, managing different panels.
- `StartPanel.java`: The panel for adding celebrities and starting the game.
- `CelebrityPanel.java`: The gameplay panel where clues are given and guesses are made.
- `CelebrityRunner.java`: The main entry point to launch the game.
- `CelebrityTester.java`: Contains JUnit tests for verifying the functionality of the classes.

## Setup and Running the Game

### Prerequisites
- Java Development Kit (JDK) installed.
- Eclipse IDE or any other Java-compatible IDE.

### Steps to Run
1. **Clone the Repository**: Clone the project repository to your local machine.
2. **Open in IDE**: Open the project in Eclipse or your preferred Java IDE.
3. **Compile the Code**: Ensure all classes compile without errors.
4. **Run the Game**:
   - Run `CelebrityRunner.java` to start the GUI.
   - Use the GUI to add celebrities, start the game, and make guesses.

### Running Tests
- Run `CelebrityTester.java` to execute JUnit tests and verify the functionality of your implementation.

## Scoring Guidelines

Points are distributed across the activities as follows:
- **Activity 1**: 10 points
- **Activity 2**: 20 points
- **Activity 3**: 25 points
- **Activity 4**: 25 points
- **Activity 5**: 20 points

Total: 100 points

## Support

If you encounter any issues or have questions about the assignment, please reach out during office hours or post in the course discussion forum.

For additional assistance, contact: **Kevin** at [kevin@csplusplus.com](mailto:kevin@csplusplus.com).

---
