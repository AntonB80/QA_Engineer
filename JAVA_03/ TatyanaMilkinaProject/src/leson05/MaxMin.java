package leson05;

import java.util.Arrays;

public class MaxMin {
    int max = 0;

    public static void main(String[] args) {
        int[][] array = {
                { 4, 3, 7, 42, 5, 86 },
                { 6, 3, 54, 5465, 522, 5 }
        };
        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
            findMax(i);
            findMin(i);
            System.out.println("Max = " + findMax(i) + "; Min = " + findMin(i));
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
