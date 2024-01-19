package leson05;

import java.util.Arrays;

public class ArrayDemo02 {
    public static void main(String[] args) {

        /*
         * 3. Двумерный массив типа String.
         * Создать массив типа String размером 3х6.
         * И записать в него значения:
         * a1 a2 a3 a4 a5 a6
         * b1 b2 b3 b4 b5 b6
         * c1 c2 c3 c4 c5 c6
         * Распечатать массив.
         */
        // 1 способ
        String[][] array = {
                { "a1", "a2", "a3", "a4", "a5", "a6" },
                { "b1", "b2", "b3", "b4", "b5", "b6" },
                { "c1", "c2", "c3", "c4", "c5", "c6" }
        };
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));
        System.out.println("=======================");

        // 2 способ
        char symbol = 'a';
        String[][] array01 = new String[7][12];
        for (int i = 0; i < array01.length; i++) {
            for (int j = 0; j < array01[0].length; j++) {
                array01[i][j] = symbol + "";
                System.out.print(array01[i][j] + (j + 1) + " ");
            }
            symbol++;
            System.out.println();
        }
        /*
         * 4. Двумерный массив типа char.
         * Создать двумерный массив типа char размером 4х2.
         * Записать в него значения с помощью блока для инициализации.
         * Распечатать значения массива.
         */
        System.out.println("=======================");
        char[][] array03 = {
                { 'a', 'd' },
                { 'f', 'f' },
                { 'd', 'r' },
                { '3', 'v' },
                { 'd', 't', 'w', 'e' } };
        for (char[] row : array03) {
            for (char cs : row) {
                System.out.print(cs + " : ");
            }
            System.out.println();
        }

        /*
         * 5. Поиск максимального и минимального значения в каждой строке массива.
         * Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока
         * для инициализации.
         * Найти максимальное и минимальное значение в каждой "строке" и записать эти
         * значения в двухмерный массив 5х2.
         * Распечатать массив, содержащий максимальное и минимальное значение.
         */
        System.out.println("=======================");
    }
}