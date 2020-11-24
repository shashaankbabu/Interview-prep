package LeetCode;
import java.util.*;

class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        init(board);
        helper(board, res, 0);
        return res;
    }

    private void init(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }
    }

    private List<String> generate(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (char c: row) {
                sb.append(c);
            }

            list.add(sb.toString());
        }

        return list;
    }

    private void helper(char[][] board, List<List<String>> res,
                        int rowIndex) {
        if (rowIndex == board.length) {
            res.add(generate(board));
            return;
        }

        for (int colIndex = 0; colIndex < board.length; colIndex++) {
            if (isValid(board, rowIndex, colIndex)) {
                board[rowIndex][colIndex] = 'Q';
                helper(board, res, rowIndex + 1);
                board[rowIndex][colIndex] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int rowIndex, int colIndex) {
        for (int i = rowIndex - 1; i >= 0; i--) {
            if (board[i][colIndex] == 'Q') return false;
        }

        for (int i = rowIndex - 1, j = colIndex - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = rowIndex - 1, j = colIndex + 1;
             i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}