package ru.job4j.calculator;

public class Fit {

        public static double manWeight(double height) {
            double rsl = (height - 100) * 1.15; //ф-ла идеального веса для мужчин
            return rsl;
        }


        public static double womanWeight(double height) {
            double rsl = (height - 110) * 1.15; //ф-ла идеального веса для женщин
            return rsl;
        }

        public static void main(String[] args) {
            double man = Fit.manWeight(180);    //Вес мужчины при росте 180 см
            System.out.println("Man 180 is " + man);
            double woman = Fit.womanWeight(160);    //Вес женщины при росте 160 см
            System.out.println("Woman 160 is " + woman);
        }

}
