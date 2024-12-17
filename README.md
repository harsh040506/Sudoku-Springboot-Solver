# Sudoku Solver Application
This application is a powerful Sudoku solver built using Java JDK 21 and Thymeleaf as the template engine. It allows users to manually input the numbers of a Sudoku puzzle into a web-based interface and instantly provides the solution. The user-friendly interface makes solving Sudoku puzzles seamless and efficient.

## Features
- Solve Sudoku puzzles by manually entering the numbers.
- Instant solution generation.
- Clean and responsive interface built with Thymeleaf.
- Runs on `localhost` for easy testing and development.

## Prerequisites
- Ensure you have Java JDK 21 and Maven installed on your system.
- Verify that port `8080` is available on your machine.

## Steps to Run the Application

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/harsh040506/Sudoku-Springboot-Solver
   cd Sudoku-Springboot-Solver/Sudoku%20Solver%20Application
   ```

2. **Build the Application**:
   Run the following command to build the application using Maven:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   Start the application by executing:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**:
   Open your web browser and navigate to:
   ```bash
   http://localhost:8080/View
   ```

## Using the Application

1. On the Sudoku Solver page, manually input the numbers of your Sudoku puzzle into the respective boxes.
2. Leave empty cells blank.
3. Click the **Solve** button.
4. Instantly, the solution to your puzzle will be displayed on the screen.

## Notes
- The application currently supports standard 9x9 Sudoku puzzles.
- Ensure that the numbers entered follow Sudoku rules (e.g., no duplicates in rows, columns, or 3x3 grids).
- This application is for demonstration purposes and can be further enhanced for more complex puzzles or additional features.

## Troubleshooting
If the application fails to run or solve the puzzle:

1. Check the console logs for error messages.
2. Ensure that port `8080` is not in use by another application.
3. Verify that the entered numbers follow standard Sudoku rules.

## Repository Links
- [Main Repository](https://github.com/harsh040506/Sudoku-Springboot-Solver)
- [Sudoku Solver Application Folder](https://github.com/harsh040506/Sudoku-Springboot-Solver/tree/main/Sudoku%20Solver%20Application)

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Contributions
Contributions are welcome! Please fork the repository and submit a pull request with your improvements.

---
Happy coding!
