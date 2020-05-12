package ru.job4j.loop;

public class Mortgage {
    /**
     * Method year - расчитывает количество лет ипотеки необходимо будет платить
     * @param amount - сумма выданная по кредиту
     * @param salary - годовой доход
     * @param percent - процентная ставка по кредиту
     * @return
     */
    public int year(float amount, int salary, float percent) {
        int year = 0;
        while (amount > 0) {
            amount = (amount + amount * percent / 100) - salary;
            year++;
        }
        return year;
    }
}
