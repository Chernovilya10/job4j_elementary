package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if ((index + array.length - 1) % 2 == 0) {      //для нечетного количества эл-ов массива
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            } else if ((index + array.length - 1) % 2 != 0) {   //для четного количества эл-ов массива
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
            if ((index == array.length - 1 - index) || (index + 1 == array.length - 1 - index)) {
                break;
            }
        }
        return array;
    }
}
