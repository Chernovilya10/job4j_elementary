package ru.job4j.loop;

/**
 * Class Slash Класс для построения креста в псевдографике.
 *
 * @author Ilia Chernov (i.chernov93@yandex.ru)
 */
public class Slash {        //"правильный" крест строится только по нечетному размеру поля 3х3 и тд.
    /**
     * Method draw Метод построения креста в псевдографике.
     * @param size - размер поля креста
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;     //если значения row и cell равны - строим диагональ слева направо
                boolean right = (row + cell) == (size - 1);     //с этим условием строим диагональ справа налево
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Method main Метод для вывода в консоль креста в псевдографике.
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("If Draw 3x3");
        draw(3);
        System.out.println("If Draw 5x5");
        draw(5);
    }
}
