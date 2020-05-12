package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        /**
         *         Исходный мой код.
         *         int lengthP = 3;    //длина родительского массива
         *         int lengthS = 3;    //длина дочернего массива
         *         int[][] example = new int[lengthP][lengthS];
         *         int k = 0;
         *         for (int i = 0; i < lengthP; i++) {
         *             for (int j = 0; j < lengthS; j++) {
         *                 example[i][j] = k++;
         *                 System.out.print(example[i][j] + " ");
         *             }
         *             System.out.println();
         *         }
         *
         * Для любого количества элементов вложенных массивов с заданной lengthP (кол-во эл-ов родительского массива),
         * если увеличиваем кол-во эл-ов родительского массива (lengthP),
         * то необходимо определеить количество элементов для каждого нового вложенного массива
         */
        int lengthP = 3;
        int[][] example = new int[lengthP][];
        example[0] = new int[4];
        example[1] = new int[2];
        example[2] = new int[6];
        int k = 0;
        for (int i = 0; i < lengthP; i++) {
            for (int j = 0; j < example[i].length; j++) {
                example[i][j] = k++;
                System.out.print(example[i][j] + " ");
            }
            System.out.println();
        }
    }
}
