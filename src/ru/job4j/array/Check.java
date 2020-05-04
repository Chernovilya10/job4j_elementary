package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index < data.length; index++) {
            if (data[0] == data[index]) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
