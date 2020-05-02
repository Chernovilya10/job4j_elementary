package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number >= 2;       //любое число меньше 2 является непростым
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {    //если число делится не только на себя и единицу, то оно непростое
                    prime = false;
                    break;
                }
            }
        return prime;
    }
}