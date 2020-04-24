package ru.job4j.calculator;

public class Calculator {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        int one = 1;
        int two = 2;

        int onePlusTwo = one + two;

        int six = 6;
        int four = 4;
        int five = 5;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println("sixDivTwo=" + sixDivTwo + " fiveMinusTwo=" + fiveMinusTwo + " fourTimeTwo=" + fourTimeTwo);

        one = 10;
        two = 11;
        onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int age = 18;
        age = age + 10;


    }
}
