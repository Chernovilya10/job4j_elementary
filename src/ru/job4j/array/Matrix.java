package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int index1 = 0; index1 < size; index1++) {
            for (int index2 = 0; index2 < size; index2++) {
                table[index1][index2] = (index1 + 1) * (index2 + 1);
            }
        }
        return table;
    }
}
