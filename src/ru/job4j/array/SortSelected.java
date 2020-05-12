package ru.job4j.array;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {
    /**
     *
     * SwitchArray.swap(data, index, i);       //Используем метод, который меняет местами заданные элементы
     *
     * Method sort - сотртирует массив по возврастанию
     * @param data - Массив, который нужно отсортировать
     * @return
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.minDiapason(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, index, i);       //Используем метод, который меняет местами заданные элементы
        }
        return data;
    }
}