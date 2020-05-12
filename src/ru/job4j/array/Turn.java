package ru.job4j.array;

public class Turn {
    /**
     * Method back - переворачивает массив
     * for (int index = 0; index < array.length / 2; index++) - цикл работает только до середины массива
     * @param array
     * @return
     */
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
        return array;
    }
}
