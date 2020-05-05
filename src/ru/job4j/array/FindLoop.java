package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
    /**
     * Method indexOF Метод по поиску числа в определенном диапозоне массива
     * @param data - исходный массив
     * @param el - элемент, который нужно найти
     * @param start - индекс элемента массива, с которого начинаем поиск
     * @param finish - индекс, на котором заканчиваем поиск
     * @return - возвращает индекс найденного элемента
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}
