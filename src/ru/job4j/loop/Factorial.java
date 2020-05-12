package ru.job4j.loop;

public class Factorial {
    /**
     * Method calc - расчитывает факториал
     * Факториал состоит только из неотрицательных целых чисел
     * @param n - число факториала
     * @return
     */
    public static int calc(int n) {
        int result = 1;
                for (int i = 1; i <= n; i++) {
                    result = result * i;
            }
        return result;
    }
}
