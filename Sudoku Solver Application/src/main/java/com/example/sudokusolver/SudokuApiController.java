package com.example.sudokusolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class SudokuApiController {

    private final SudokuSolver solver = new SudokuSolver();

    @PostMapping("/Api/solve")
    public ArrayList<ArrayList<Integer>> solveSudoku(@RequestBody ArrayList<ArrayList<Integer>> inputBoard) {
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Integer value = inputBoard.get(i).get(j);
                board[i][j] = (value == null) ? 0 : value;
            }
        }

        if (solver.solveSudoku(board)) {
            ArrayList<ArrayList<Integer>> solvedBoard = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < 9; j++) {
                    row.add(board[i][j]);
                }
                solvedBoard.add(row);
            }
            return solvedBoard;
        } else {
            return null;
        }
    }
}

@Controller
class SudokuViewController {

    @GetMapping("/View")
    public String getSudokuPage(Model model) {
        model.addAttribute("board", new int[9][9]);
        return "index";
    }
}