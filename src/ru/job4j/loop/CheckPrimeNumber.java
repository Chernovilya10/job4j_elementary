package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        /**
         * любое число меньше 2 является непростым
         */
        boolean prime = number >= 2;
            for (int i = 2; i < number; i++) {
                /**
                 * //если число делится не только на себя и единицу, то оно непростое
                 */
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        return prime;
    }
}