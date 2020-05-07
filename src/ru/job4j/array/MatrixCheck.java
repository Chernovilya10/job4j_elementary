package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char check = 'X';
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (board[i][j] != check) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
            if (result) {     //оператор, закрывающий цикл при нахождении любой строки заполненной символом Х
                break;
            }
        }
        return result;
    }
}
