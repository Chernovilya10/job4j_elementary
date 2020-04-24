package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result1 = Point.distance(16,14,56,18);
        System.out.println("result1 (16, 14) to (56, 18) " + result1);

        double result2 = Point.distance(-43,9,15,-98);
        System.out.println("result1 (-43, 9) to (15, -98) " + result2);
    }
}
