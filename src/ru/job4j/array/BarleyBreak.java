package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] example = new int[3][3];
        int k = 0;
        for (int i = 0; i < example.length; i++) {
            for (int j = 0; j < example.length; j++) {
                example[i][j] = k++;
                System.out.print(example[i][j] + " ");
            }
            System.out.println();
        }
    }
}
