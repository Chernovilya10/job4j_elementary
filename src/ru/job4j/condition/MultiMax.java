package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {

        boolean x1 = first > second;
        boolean x2 = first > third;
        boolean x3 = second > third;
        int result = x1 && x2 ? first : x3 ? second : third;
        return result;
    }
}
