
/**
 * Lesson_09_01
 */

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Lesson_09 {

    public static void printArray(double[] array) { // Инициализация метода печати
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f\t ", array[i]);
        }
        System.out.println(); // Для перехода на следующую строку

    }

    public static double[] scanArray(int n) { // Функция считывания и создание массива
        double[] array = new double[n];
        String str = "43 24 3 21 2 3 42 35 87 34 32 14 67 98";
        try (Scanner sc = new Scanner(str).useLocale(Locale.US)) {
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextDouble();
            }
        }
        return array;
    }

    // task#2

    // Используя датчик случайных чисел, заполнить массив из двадцати элементов не
    // повторяющимися числами. Вывести полученные массивы на экран.

    public static double[] generateArray(int n) { // Функция генерирует рандомно массив
        double[] array = new double[n];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        return array;
    }

    // task#4
    // Дан массив. Все его элементы:
    // 1.увеличить в 2 раза

    public static double[] multiplyArrayByNumber(double[] array, double number) { // Функция умножает массив на
                                                                                  // определенное число и возвращает его
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * number;
        }
        return array;
    }

    // 2.уменьшить на число А

    public static double[] decreaseArrayByNumber(double[] array, double number) { // Функция уменьшает массив на
                                                                                  // определенное число и возвращает его
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - number;
        }
        return array;
    }

    // 3.разделить на первый элемент.
    public static double[] divideArrayByFirstElement(double[] array) { // Функция делит массив на первый его элемент

        double temp = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / temp;
        }
        return array;
    }

    // task#5
    // Дан массив. Напечатать:
    // 1. все не отрицательные элементы
    public static void printNonNegativeNumber(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                System.out.print(array[i] + "\t");

            }
        }
        System.out.println();
    }

    // 2. все элементы, не превышающие число 100
    public static void printNoMoreHundred(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] < 100) {
                System.out.print(array[i] + "\t");

            }
        }
        System.out.println();
    }

    // task#6
    // Дан массив. Определить:
    // 1.максимальный элемент
    public static double findMaxElement(double[] array) { // Функция которая находит максимальный элемент массива и его
                                                          // возвращает
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    // 2.минимальный элемент
    public static double findMinElement(double[] array) { // Функция которая находит минимальный элемент массива и его
                                                          // возвращает
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    // 4.индекс максимального элемента
    public static int findIndexOfMaxElement(double[] array) {
        int indexMax = 0;
        double max = findMaxElement(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) { // если элемент массива равен максимальному (max)
                indexMax = i; // то индекс равен этому элементу
            }
        }
        return indexMax;
    }

    // 5.индекс минимального элемента
    public static int findIndexOfMinElement(double[] array) {
        int indexMin = 0;
        double min = findMinElement(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
                break;
            }
        }
        return indexMin;
    }

    // task#7
    // Дан массив. Поменять местами:
    // 1.второй и пятый элементы;

    public static double[] swopElements(double[] array, int index1, int index2) {
        if ((index1 >= array.length) || (index2 >= array.length)) { // учитывае выход за пределы масива

            return array;
        } else { // для перемены индекса местами
            double temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            return array;
        }
    }

    // 2.третий и максимальный элементы.
    // Если элементов с максимальным значением несколько, то в обмене должен
    // участвовать первый из них.

    public static double[] swopMaxElements(double[] array, int index1) {

        if (index1 >= array.length) { // учитывае выход за пределы масива

            return array;
        } else { // для перемены индекса местами
            int index2 = findIndexOfMaxElement(array);
            double temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            return array;
        }
    }

    public static void main(String[] args) {

        // task#0
        // Заполнить массив из пяти элементов значениями, вводимыми с клавиатуры в
        // ходевы полнения программы.

        Scanner sc = new Scanner(System.in);
        int[] arrayMy = new int[5];
        System.out.println("Введите число: ");
        arrayMy[0] = sc.nextInt();
        System.out.println("Введите число: ");
        arrayMy[1] = sc.nextInt();
        System.out.println("Введите число: ");
        arrayMy[2] = sc.nextInt();
        System.out.println("Введите число: ");
        arrayMy[3] = sc.nextInt();
        System.out.println("Введите число: ");
        arrayMy[4] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Массив " + arrayMy[i]);

        }
        sc.close();

        int[] arrayMy = { 1, 4, 7, 43, 5, 7, 2, 5 };
        int i = arrayMy.length; // Считывает длину массива
        System.out.println("Длина массива = " + i);
        printArray(arrayMy);

        // task#1
        // Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в
        // ходе выполнения программы.

        int[] array = scanArray(10);
        printArray(array);

        // task#2
        // Используя датчик случайных чисел, заполнить массив из двадцати элементов не
        // повторяющимися числами. Вывести полученные массивы на экран.

        double[] array = generateArray(20);
        printArray(array);

        // task#4
        // Дан массив. Все его элементы:
        // 1.увеличить в 2 раза
        // 2.уменьшить на число А
        // 3.разделить на первый элемент.

        double[] array = generateArray(5);
        printArray(array);

        multiplyArrayByNumber(array, 5);
        printArray(array);

        decreaseArrayByNumber(array, 15);
        printArray(array);

        divideArrayByFirstElement(array);
        printArray(array);

        // task#5
        // Дан массив. Напечатать:
        // 1. все не отрицательные элементы
        // 2. все элементы, не превышающие число 100

        double[] array = { -2, 0, 101, 77, 5, -3 };
        printArray(array);
        printNonNegativeNumber(array);
        printNoMoreHundred(array);

        // task#6
        // Дан массив. Определить:

        double[] array = generateArray(7);
        printArray(array);
        // 1.максимальный элемент
        System.out.println("максимальный элемент\t" + findMaxElement(array));
        // 2.минимальный элемент
        System.out.println("минимальный элемент\t" + findMinElement(array));

        // 3.на сколько максимальный элемент больше минимального
        double differenceMaxMinElement = findMaxElement(array) -
                findIndexOfMinElement(array);
        System.out.println("Максимальный элемент больше минимального на " +
                differenceMaxMinElement);

        // 4.индекс максимального элемента
        System.out.println("индекс максимального элемента\t" +
                findIndexOfMaxElement(array));
        // 5.индекс минимального элемента
        System.out.println("индекс минимального элемента\t" +
                findIndexOfMinElement(array));

        // task#7
        // Дан массив. Поменять местами:
        // 1.второй и пятый элементы;

        double[] array = generateArray(7);
        printArray(array);

        swopElements(array, 1, 4);
        printArray(array);
        swopElements(array, 1, 9);
        printArray(array);

        // 2.третий и максимальный элементы.
        // Если элементов с максимальным значением несколько, то в обмене должен
        // участвовать первый из них.
        swopMaxElements(array, 2);
        printArray(array);
    }

}
