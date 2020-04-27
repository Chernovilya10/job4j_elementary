package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean first = ab + ac > bc;
        boolean second = ac + ac > ab;
        boolean third = bc + ab > ac;
        boolean result = first && second && third ? true : false;
        return result;
    }
}

