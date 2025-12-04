import java.util.*;
class Solution {
    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] boxes = new boolean[9][10];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    int val = board[r][c] - '0';
                    rows[r][val] = true;
                    cols[c][val] = true;
                    boxes[(r / 3) * 3 + (c / 3)][val] = true;
                }
            }
        }
        backtrack(board, 0, rows, cols, boxes);
    }
    private boolean backtrack(char[][] board, int pos, boolean[][] rows, boolean[][] cols, boolean[][] boxes) {
        if (pos == 81) return true;
        int r = pos / 9;
        int c = pos % 9;
        if (board[r][c] != '.') return backtrack(board, pos + 1, rows, cols, boxes);

        int boxIndex = (r / 3) * 3 + (c / 3);
        for (int num = 1; num <= 9; num++) {
            if (!rows[r][num] && !cols[c][num] && !boxes[boxIndex][num]) {
                board[r][c] = (char) ('0' + num);
                rows[r][num] = cols[c][num] = boxes[boxIndex][num] = true;

                if (backtrack(board, pos + 1, rows, cols, boxes)) return true;

                board[r][c] = '.';
                rows[r][num] = cols[c][num] = boxes[boxIndex][num] = false;
            }
        }
        return false;
    }
}
class Test {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        Solution s = new Solution();
        s.solveSudoku(board);
        printBoard(board);
    }
    static void printBoard(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                System.out.print(board[r][c]);
                if (c < 8) System.out.print(' ');
            }
            System.out.println();
        }
    }
}
