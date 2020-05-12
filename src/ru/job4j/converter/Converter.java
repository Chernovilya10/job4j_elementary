package ru.job4j.converter;

/**
 * Class Converter Класс для ковертации валюты: рубля в доллар и рубля в евро.
 *
 * @author Ilia Chernov (i.chernov93@yandex.ru)
 */
public class Converter {
    /**
     * Method rubleToEuro Метод конвертации из рубля в евро.
     * @param value Сумма в рублях.
     * @return Сумма в евро.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * Method rubleToDollar Метод конвертации из рубля в доллар.
     * @param value Сумма в рублях.
     * @return Сумма в долларах.
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    /**
     * Main Пример порядка тестирования.
     * @param args - args.
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        int dollar = Converter.rubleToDollar(1800);
        System.out.println("1800 rubles are " + dollar + " dollars");

        System.out.println("Testing:");         //Процесс тестирования
        int in1 = 140;                          //Входные данные
        int expected1 = 2;                      //Ожидаемый результат
        int out1 = rubleToEuro(in1);            //Результат работы программы
        boolean passed1 = expected1 == out1;    //Если ожидаемый результат и результат работы программы равны, то passed1 возвращает true
        System.out.println("140 rubles are 2 euro. Test result:  " + passed1);

        int in2 = 1800;
        int expected2 = 30;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("1800 rubles are 30 dollars. Test result: " + passed2);
    }
}
