package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left.length && j < right.length) {   //работатем до самого короткого массива
            if (left[i] < right[j]) {
                rsl[index] = left[i];
                    i++;
            } else if (left[i] > right[j]) {
                rsl[index] = right[j];
                j++;
            } else {
                rsl[index] = left[i];
                index++;
                rsl[index] = right[j];
                i++;
                j++;
            }
            index++;
        }
        while (i < left.length) {       //когда длинна массива right закончилась дописываем остатки второго массива
            rsl[index] = left[i];
            i++;
            index++;
        }
        while (j < right.length) {      //когда длинна массива left закончилась дописываем остатки второго массива
            rsl[index] = right[j];
            j++;
            index++;
        }

/*Если рассмотреть 2 массива {3, 6} и {1, 4, 7, 2} , третий массив будет {1, 3, 4, 6, 7, 2}, такой результат получится,
исходя из того, что последний элемент в первом массиве будет записан в итоговый массив и далее уже сравнения эл-ов
производиться не будет и число 2 будет записано в последний эл-нт итогового массива. Для упорядочивания по возростанию
элементов необходимо выполнить алгоритм сортировки элементов массива.
 */

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
                );
        System.out.println(Arrays.toString(rsl));
    }
}
