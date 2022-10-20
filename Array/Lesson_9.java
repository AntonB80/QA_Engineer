package Array;

import java.util.Random;

public class Lesson_9 {

  // task #5
  // Дан массив. Напечатать:
  // 1.всенеотрицательныеэлементы
  // 2.всеэлементы, непревышающие число 100
  /*
   * public static void printArray(double[] array) {
   * for (int i = 0; i < array.length; i++) {
   * System.out.printf("%.2f\t", array[i]);
   * }
   * System.out.println();
   * }
   * 
   * public static void printNonNegativeNumbers(double[] array) {
   * for (int i = 0; i < array.length; i++) {
   * if (array[i] >= 0) {
   * System.out.print(array[i] + "\t");
   * }
   * }
   * System.out.println();
   * }
   * 
   * public static void printLessHundred(double[] array) {
   * for (int i = 0; i < array.length; i++) {
   * if (array[i] < 100) {
   * System.out.print(array[i] + "\t");
   * }
   * }
   * System.out.println();
   * }
   * 
   * public static void main(String[] args) {
   * 
   * double[] array = { -2, 0, -3, -6, 5, -3, 99, 120 };
   * printArray(array);
   * 
   * printNonNegativeNumbers(array);
   * 
   * printLessHundred(array);
   * }
   */

  // task #6
  // Дан массив. Определить:
  // 1. максимальный элемент
  // 2.минимальный элемент
  // 3.на сколько максимальный элемент больше минимального
  // 4.индекс максимального элемента
  // 5.индекс минимального элемента

  /*
   * public static void printArray(double[] array) {
   * for (int i = 0; i < array.length; i++) {
   * System.out.printf("%.2f\t", array[i]);
   * }
   * System.out.println();
   * }
   * 
   * public static double[] generateArray(int n) {
   * 
   * double[] array = new double[n];
   * Random r = new Random();
   * 
   * for (int i = 0; i < array.length; i++) {
   * array[i] = r.nextInt(100); // 0 - 100
   * }
   * 
   * return array;
   * }
   * 
   * public static double findMaxElement(double[] array) {
   * 
   * double max = array[0];
   * 
   * for (int i = 1; i < array.length; i++) {
   * if (array[i] > max) {
   * max = array[i];
   * }
   * }
   * 
   * return max;
   * }
   * 
   * public static double findMinElement(double[] array) {
   * 
   * double min = array[0];
   * 
   * for (int i = 1; i < array.length; i++) {
   * if (array[i] < min) {
   * min = array[i];
   * }
   * }
   * 
   * return min;
   * }
   * 
   * public static int findIndexOfMaxElement(double[] array) {
   * 
   * int index = 0;
   * 
   * double max = findMaxElement(array);
   * 
   * for (int i = 0; i < array.length; i++) {
   * if (array[i] == max) {
   * index = i;
   * break;
   * }
   * }
   * 
   * return index;
   * }
   * 
   * public static int findIndexOfMinElement(double[] array) {
   * 
   * int index = 0;
   * 
   * double min = findMinElement(array);
   * 
   * for (int i = 0; i < array.length; i++) {
   * if (array[i] == min) {
   * index = i;
   * break;
   * }
   * }
   * 
   * return index;
   * }
   * 
   * public static void main(String[] args) {
   * 
   * double[] array = generateArray(7);
   * printArray(array);
   * 
   * System.out.println(findMaxElement(array));
   * System.out.println(findMinElement(array));
   * 
   * double max = findMaxElement(array);
   * double min = findMinElement(array);
   * double findHowManyTimesMaxMin = max / min;
   * System.out.println(findHowManyTimesMaxMin);
   * 
   * System.out.println(findIndexOfMaxElement(array));
   * System.out.println(findIndexOfMinElement(array));
   * }
   */

  // task#7
  // Дан массив.
  // Поменять местами:
  // 1.второй и пятый элементы;
  // 2.третий и максимальный элементы. Если элементов с максимальным значением
  // несколько, то в обмене должен участвовать первый из них.!!!!!!!!!!!!

  public static void printArray(double[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%.2f\t", array[i]);
    }
    System.out.println();
  }

  public static double[] generateArray(int n) {

    double[] array = new double[n];
    Random r = new Random();

    for (int i = 0; i < array.length; i++) {
      array[i] = r.nextInt(100); // 0 - 100
    }

    return array;
  }

  public static double findMaxElement(double[] array) {

    double max = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
  }

  public static double[] swapElements(double[] array, int index1, int index2) {

    if ((index1 >= array.length) || (index2 >= array.length)) {
      return array;
    } else {
      double temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;

      return array;
    }
  }

  public static void main(String[] args) {

    double[] array = generateArray(7);
    printArray(array);

    swapElements(array, 1, 4);
    printArray(array);

    swapElements(array, 0, 5);
    printArray(array);

    swapElements(array, 2, 8);
    printArray(array);

  }

}
