package ru.job4j.array;

public class MinDiapason {
    /**
     * Method minDiapason - метод для поиска минимального числа в заданном диапазоне массива
     * @param array - исходный массив
     * @param start - индекс первого элемента требуемого диапазона
     * @param finish - индекс последнего элемента требуемого диапазона
     * @return - возвращаемое минимальное число
     */
    public static int minDiapason(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
