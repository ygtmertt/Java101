package Patika_Capstone_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesweeperGUI extends JFrame implements ActionListener {
    private final Minesweeper game;
    private final JButton[][] buttons;

    public MinesweeperGUI(int rows, int columns) {
        game = new Minesweeper(rows, columns);
        buttons = new JButton[rows][columns];

        setTitle("Minesweeper");
        setLayout(new GridLayout(rows, columns));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        initializeButtons();

        setVisible(true);
    }

    private void initializeButtons() {
        for (int i = 0; i < game.rows; i++) {
            for (int j = 0; j < game.columns; j++) {
                buttons[i][j] = new JButton("-");
                buttons[i][j].setActionCommand(i + " " + j);
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        String[] parts = command.split(" ");
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);

        if (game.selectCell(row, col)) { // Pass row and col to selectCell
            // Game over, show mines
            showMines();
            JOptionPane.showMessageDialog(this, "You hit a mine! Game Over.");
            disableAllButtons();
        } else {
            int nearbyMines = game.minesAround(row, col);
            buttons[row][col].setText(Integer.toString(nearbyMines));
            buttons[row][col].setEnabled(false);

            if (game.checkWin()) {
                JOptionPane.showMessageDialog(this, "Congratulations! You won.");
                disableAllButtons();
            }
        }
    }

    private void showMines() {
        for (int i = 0; i < game.rows; i++) {
            for (int j = 0; j < game.columns; j++) {
                if (game.adminMatrix[i][j].equals("*")) {
                    buttons[i][j].setText("*");
                }
            }
        }
    }

    private void disableAllButtons() {
        for (int i = 0; i < game.rows; i++) {
            for (int j = 0; j < game.columns; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        new MinesweeperGUI(4, 4); // Initialize a 5x5 Minesweeper game
    }
}
