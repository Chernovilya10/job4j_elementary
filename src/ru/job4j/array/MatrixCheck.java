package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char check = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != check) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char check = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != check) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extraDiagonal(char[][] board) {
        char[] rst = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rst[i] = board[i][i];
        }
        return rst;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        char k = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != k) {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                    break;
                }

            }
        }
        return result;
    }
}
