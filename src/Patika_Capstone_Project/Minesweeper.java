package Patika_Capstone_Project;

import java.util.Random;

public class Minesweeper {
    public int rows;
    public int columns;
    public String[][] userMatrix;  // Will show this to users.
    public String[][] adminMatrix; // Will show the location of mines.
    public int mineCount;
    public boolean gameOver;

    Random rand = new Random();

    public Minesweeper(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.mineCount = (rows * columns) / 4;
        this.userMatrix = new String[rows][columns];
        this.adminMatrix = new String[rows][columns];
        this.gameOver = false;

        fillFields();
        placeMines();
    }

    public void fillFields() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                userMatrix[i][j] = "-";
                adminMatrix[i][j] = "-";
            }
        }
    }

    public void placeMines() {
        int minesPlaced = 0;
        while (minesPlaced < mineCount) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(columns);
            if (!adminMatrix[row][col].equals("*")) {
                adminMatrix[row][col] = "*";
                minesPlaced++;
            }
        }
    }

    // Updated method to accept row and column as parameters
    public boolean selectCell(int row, int col) {
        if (adminMatrix[row][col].equals("*")) {
            gameOver = true;
            return true; // Mine hit
        } else {
            int nearbyMines = minesAround(row, col);
            userMatrix[row][col] = Integer.toString(nearbyMines);
            return false; // Safe move
        }
    }

    public int minesAround(int row, int col) {
        int mineCounter = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
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
        return revealedCells == (rows * columns - mineCount);
    }
}
