package leson05;

public class ArrayDemo01 {
    public static void main(String[] args) {

        /*
         * 1. Одномерный массив типа String.
         * Создать массив типа String с размером 7.
         * Записать в него значения дней недели.
         * Вывести на консоль значение последнего элемента.
         */
        System.out.println("1. Одномерный массив типа String.");

        String[] daysOfTheWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday" };
        System.out.println(daysOfTheWeek[1]);
        for (int i = 0; i < daysOfTheWeek.length; i++) {
            System.out
                    .println("Массив \"daysOfTheWeek\" имеет значение в ячейке " + i + " равное " + daysOfTheWeek[i]);
        }

        double[] array = { 5.4, 6, 4.3, 3.3 };
        System.out.println(array[0]);

        // в методе принт создаем массив и задаем его значения
        print(new String[] { "String01", "String02", "String03" });

        // Многомерные массивы
        int[][] twoArray = new int[4][5];
        System.out.println("Многомерные массивы");
        // int i, j, k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoArray[i][j] = (int) (Math.random() * 7);
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        int[] ia = { 1, 3, 5, 7, 9 };
        for (int x : ia) {
            for (int j = 0; j < 3; j++) {
                if (x > 4 && x < 8)
                    continue;
                System.out.print(" " + x);
                if (j == 1)
                    break;
                continue;
            }
            continue;
        }
        System.out.println();

        System.out.println("-----------");

        foreach: for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" " + j);
                if (j == 3 && k == 1)
                    break foreach;
                if (j == 0 || j == 2)
                    break;
            }
        }

    }

    public static void print(String[] array) {
        for (String i : array) {
            System.out.println(i);

        }
    }
}
