import math

class SudokuPuzzle:

    def is_safe(self, board, row, col, num):
        if num in board[row]:
            return False

        if num in [board[r][col] for r in range(len(board))]:
            return False

        sqrt = int(math.sqrt(len(board)))
        box_row_start = row - row % sqrt
        box_col_start = col - col % sqrt

        for r in range(box_row_start, box_row_start + sqrt):
            for c in range(box_col_start, box_col_start + sqrt):
                if board[r][c] == num:
                    return False

        return True

    def solve_sudoku(self, board):
        row, col = -1, -1
        is_vacant = True

        for i in range(len(board)):
            for j in range(len(board)):
                if board[i][j] == 0:
                    row, col = i, j
                    is_vacant = False
                    break
            if not is_vacant:
                break

        if is_vacant:
            return True

        for num in range(1, len(board) + 1):
            if self.is_safe(board, row, col, num):
                board[row][col] = num
                if self.solve_sudoku(board):
                    return True
                board[row][col] = 0

        return False

    def display(self, board):
        for row in board:
            print(" ".join(map(str, row)))

if __name__ == "__main__":
    board = [
    #Since this is a DynamicSudokuSolver, it provides the solution for
    #both(4x4 & 9x9) of the following Puzzles:
        [4, 0, 1, 0],
        [0, 0, 0, 0],
        [0, 3, 0, 0],
        [0, 0, 0, 2]
        # [8, 0, 0, 0, 0, 0, 0, 0, 0],
        # [0, 0, 3, 6, 0, 0, 0, 0, 0],
        # [0, 7, 0, 0, 9, 0, 2, 0, 0],
        # [0, 5, 0, 0, 0, 7, 0, 0, 0],
        # [0, 0, 0, 0, 4, 5, 7, 0, 0],
        # [0, 0, 0, 1, 0, 0, 0, 3, 0],
        # [0, 0, 1, 0, 0, 0, 0, 6, 8],
        # [0, 0, 8, 5, 0, 0, 0, 1, 0],
        # [0, 9, 0, 0, 0, 0, 4, 0, 0]
    ]

    puzzle = SudokuPuzzle()

    print("The grid is:")
    puzzle.display(board)

    if puzzle.solve_sudoku(board):
        print("\nThe solution of the grid is:")
        puzzle.display(board)
    else:
        print("\nThere is no solution available.")