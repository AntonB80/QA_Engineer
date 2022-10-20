package Lesson_11.Exception;

import java.util.Random;

public class Exceppthion {

    // public static void method1() {
    // method2();
    // }

    // public static void method2() {
    // int a = 10;
    // int b = 0;
    // int c = a / b;
    // method3();
    // }

    // public static void method3() {
    // method4();
    // }

    // public static void method4() {
    // System.out.println("Hellow, Wold");

    // }

    public static void main(String[] args) {

        // ловим Exception
        int a = 10;
        int b = 2;
        int[] array = new int[10];
        Random r = new Random();

        try {
            int c = a / b;
            // array[10] = 11;
            for (int i = 0; i <= 10; i++) {
                array[i] = r.nextInt(1000);
            }
        } catch (ArithmeticException ae) {
            System.out.println("Делить на ноль нельзя");
            ae.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("Ой! Вышли за границы массива");
            ai.printStackTrace();

        } catch (Exception e) {
            System.out.println("Что-то пошло не так...");
            e.printStackTrace();

        }
        System.out.println("Я живая");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        // method1();
    }

}
