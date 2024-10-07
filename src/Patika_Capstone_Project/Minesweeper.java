package Patika_Capstone_Project;

import java.util.*;

public class Minesweeper {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    int rows;
    int columns;
    String[][] userMatrix;  // Will show this to users.
    String[][] adminMatrix;   // Will show the location of mines.
    int mineCount;
    int fieldSize;
    boolean gameOver;

    public void setRowsAndColumns() {
        System.out.println("Please enter the number of rows:");
        int numRows = scanner.nextInt();
        while (numRows < 2) {
            System.out.println("There must be at least two rows. Please enter a valid number:");
            numRows = scanner.nextInt();
        }
        this.rows = numRows;

        System.out.println("Please enter the number of columns:");
        int numCols = scanner.nextInt();
        while (numCols < 2) {
            System.out.println("There must be at least two columns. Please enter a valid number:");
            numCols = scanner.nextInt();
        }
        this.columns = numCols;

        // Initialize matrices and field properties
        this.userMatrix = new String[rows][columns];
        this.adminMatrix = new String[rows][columns];
        this.fieldSize = rows * columns;
        this.mineCount = fieldSize / 4;

        // Fill the fields initially with placeholders
        fillFields();
    }

    public void fillFields() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                userMatrix[i][j] = "-";
                adminMatrix[i][j] = "-";
            }
        }
    }

    public void placeMines() {  // Places mines to random coordinates.
        int minesPlaced = 0;
        while (minesPlaced < mineCount) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(columns);
            if (!adminMatrix[row][col].equals("*")) { // Check if the mine is already placed
                adminMatrix[row][col] = "*"; // Place a mine
                minesPlaced++;
            }
        }
    }

    public void printAdminMatrix() {
        System.out.println("Admin Matrix:");
        for (String[] row : adminMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void printUserMatrix() {
        System.out.println("User Matrix:");
        for (String[] row : userMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public boolean selectCoordinates() {
        System.out.println("Enter a row coordinate.");
        int rowCoordinate = scanner.nextInt();
        while (rowCoordinate < 0 || rowCoordinate >= rows) {
            System.out.println("Invalid row. Try again:");
            rowCoordinate = scanner.nextInt();
        }

        System.out.println("Enter a column coordinate.");
        int columnCoordinate = scanner.nextInt();
        while (columnCoordinate < 0 || columnCoordinate >= columns) {
            System.out.println("Invalid column. Try again:");
            columnCoordinate = scanner.nextInt();
        }

        if (adminMatrix[rowCoordinate][columnCoordinate].equals("*")) {
            System.out.println("You hit a mine! Game over.");
            gameOver = true;
            return true;  // Indicates that the player hit a mine.
        } else {
            int nearbyMines = minesAround(rowCoordinate, columnCoordinate);
            userMatrix[rowCoordinate][columnCoordinate] = Integer.toString(nearbyMines);
            return false;  // Safe move, no mine hit.
        }
    }

    public int minesAround(int row, int col) {
        int mineCounter = 0;

        // Check the 8 neighboring cells
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                // Calculate the new coordinates to check
                int newRow = row + i;
                int newCol = col + j;

                // Check if the new coordinates are within bounds
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                    // Check if the neighboring cell contains a mine
                    if (adminMatrix[newRow][newCol].equals("*")) {
                        mineCounter++;
                    }
                }
            }
        }
        return mineCounter;
    }

    public boolean checkWin() {
        int revealedCells = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (!userMatrix[i][j].equals("-")) {
                    revealedCells++;
                }
            }
        }
        return revealedCells == (fieldSize - mineCount);
    }

    public void runMinesweeper() {   // Runs the whole program.
        setRowsAndColumns();
        placeMines();
        gameOver = false;

        while (!gameOver) {
            printUserMatrix();
            boolean hitMine = selectCoordinates();
            if (hitMine) {
                printAdminMatrix();
                System.out.println("Game Over! You lost.");
                break;
            }
            if (checkWin()) {
                printUserMatrix();
                System.out.println("Congratulations! You've cleared the field.");
                break;
            }
        }
    }
}
