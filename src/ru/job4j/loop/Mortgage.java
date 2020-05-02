package ru.job4j.loop;

public class Mortgage {
    public int year(float amount, int salary, float percent) {      //используем float и int для оптимизации памяти
        //amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту
        int year = 0;
        while (amount > 0) {
            amount = (amount + amount * percent / 100) - salary;
            year++;
        }
        return year;
    }
}
