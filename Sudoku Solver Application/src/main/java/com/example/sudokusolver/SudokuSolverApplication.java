package com.example.sudokusolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SudokuSolverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SudokuSolverApplication.class, args);
    }

}
//localhost:8080/api/solve
//[
//        [8, 0, 0, 0, 0, 0, 0, 0, 0],
//        [0, 0, 3, 6, 0, 0, 0, 0, 0],
//        [0, 7, 0, 0, 9, 0, 2, 0, 0],
//        [0, 5, 0, 0, 0, 7, 0, 0, 0],
//        [0, 0, 0, 0, 4, 5, 7, 0, 0],
//        [0, 0, 0, 1, 0, 0, 0, 3, 0],
//        [0, 0, 1, 0, 0, 0, 0, 6, 8],
//        [0, 0, 8, 5, 0, 0, 0, 1, 0],
//        [0, 9, 0, 0, 0, 0, 4, 0, 0]
//]