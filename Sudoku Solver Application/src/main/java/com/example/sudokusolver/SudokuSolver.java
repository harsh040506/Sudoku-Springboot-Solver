package com.example.sudokusolver;

class SudokuSolver {

    // Check if the number is safe to place at (row, col)
    public boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if the number is already present in the current row
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == num) {
                return false; // If the number is in the row, it's not safe
            }
        }

        // Check if the number is already present in the current column
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == num) {
                return false; // If the number is in the column, it's not safe
            }
        }

        // Check if the number is already present in the current 3x3 subgrid
        // Calculate the starting row and column index of the 3x3 box
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;

        // Check the 3x3 subgrid
        for (int r = boxRowStart; r < boxRowStart + 3; r++) {
            for (int c = boxColStart; c < boxColStart + 3; c++) {
                if (board[r][c] == num) {
                    return false; // If the number is in the 3x3 grid, it's not safe
                }
            }
        }

        // If the number is not in the row, column, or 3x3 grid, it's safe to place
        return true;
    }

    // Solve the Sudoku puzzle using backtracking
    public boolean solveSudoku(int[][] board) {

        // Loop through all cells of the board to find an empty cell (represented by 0)
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {  // If we find an empty cell
                    // Try numbers from 1 to 9 for the empty cell
                    for (int num = 1; num <= 9; num++) {
                        // Check if it's safe to place the number in the current cell
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place the number in the empty cell

                            // Recursively solve the rest of the board
                            if (solveSudoku(board)) {
                                return true; // If the rest of the board is solved, return true
                            }

                            // Backtrack: if placing the number didn't lead to a solution, reset the cell
                            board[row][col] = 0;
                        }
                    }
                    // If no number can be placed in the current empty cell, return false to backtrack
                    return false;
                }
            }
        }

        // If no empty cell is found, the board is solved
        return true;
    }
}