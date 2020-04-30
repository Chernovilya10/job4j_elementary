package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;         //Факториал состоит только из неотрицательных целых чисел
            if (n > 0) {
                result++;       //добавляем 1, чтобы в дальнейшем при умножении не было нуля
                for (int i = 1; i <= n; i++) {
                    result = result * i;
                }
            } else if (n == 0) {
                result = 1;
            }
        return result;
    }
}
