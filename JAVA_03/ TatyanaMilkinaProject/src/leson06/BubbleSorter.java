package leson06;

import java.util.Arrays;

public class BubbleSorter {

    public static void main(String[] args) {
        int[][] data = {
                { 324, 2, 4, 5 },
                { 3, 33, 444, 3, 56 },
                { 65, 4, 3, 99, 8, 432, 424, 6, 5, 225, 6 }
        };
        for (int[] is : data) {
            // System.out.print(Arrays.toString(is) + " => ");
            // sort(is);
            // System.out.println(Arrays.toString(is));
            System.out.print(Arrays.toString(is) + " => ");
            sortConversely(is);
            System.out.println(Arrays.toString(is));
        }

    }

    public static void sort(int[] array) {
        // i - номер/количество проходов
        for (int i = 0; i < array.length - 1; i++) {
            // j - перебор элементов внутри каждого прохода

            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sortConversely(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                boolean bool = true;
                if (bool = true) {
                    if (array[j - 1] < array[j]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        bool = true;
                    }
                } else {
                    bool = false;
                }

            }
        }
    }
}
