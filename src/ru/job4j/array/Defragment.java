package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (point < array.length) {
                    if (array[point] != null) {
                        String k = array[point];
                        array[point] = array[index];
                        array[index] = k;
                        break;
                    }
                    point++;
                }
           }
            System.out.println(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.println(compressed[index] + " ");
        }
    }
}
