package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int lengthP = 3;    //длина родительского массива
        int lengthS = 3;    //длина дочернего массива
        int[][] example = new int[lengthP][lengthS];
        int k = 0;
        for (int i = 0; i < lengthP; i++) {
            for (int j = 0; j < lengthS; j++) {
                example[i][j] = k++;
                System.out.print(example[i][j] + " ");
            }
            System.out.println();
        }
    }
}
