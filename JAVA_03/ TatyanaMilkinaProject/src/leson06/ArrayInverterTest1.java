package leson06;

import java.util.Arrays;

public class ArrayInverterTest1 {
    public static void main(String[] args) {
        testInverter(new int[] {});
        testInverter(new int[] { 0 });
        testInverter(new int[] { 0, 1 });
        testInverter(new int[] { 0, 1, 2 });
        testInverter(new int[] { 0, 1, 2, 3 });
        testInverter(new int[] { 0, 1, 2, 3, 4 });
    }

    private static void testInverter(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        // вызываем метод inverter из класса ArrayInverter
        ArrayInverter.inverter(array);
        System.out.println(Arrays.toString(array));

    }
}
