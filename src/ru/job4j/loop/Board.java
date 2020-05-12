package ru.job4j.loop;

public class Board {
    public static void paint(int widht, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < widht; cell++) {
                int k = (row + cell) % 2;
                if (k == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);

    }
}
