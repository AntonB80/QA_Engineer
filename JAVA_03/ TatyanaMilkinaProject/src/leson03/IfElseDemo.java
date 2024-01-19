package leson03;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {

        /*
         * Создать программу, которая будет сообщать, является ли целое число, введённое
         * пользователем, чётным или нет.
         * Ввод числа осуществлять с помощью класса Scanner.
         * Если пользователь введёт не целое число, то сообщать ему об ошибке.
         */

        // Scanner scanerIneger = new Scanner(System.in);
        // System.out.println("Введите целое число");
        // if (scanerIneger.hasNextInt()) {
        // // такой код не читаемый!!! надо вынести в отдельный метод
        // int number = scanerIneger.nextInt();
        // if (number % 2 == 0) {
        // System.out.println("Введеное число " + number + " является четным");
        // } else {
        // System.out.println("Введеное число " + number + " является НЕ четным");
        // }

        // } else {
        // System.out.println("Введено НЕ целое число");
        // }

        Scanner scanerIneger = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (scanerIneger.hasNextInt()) {
            int number = scanerIneger.nextInt();
            extracted(number);
        } else {
            System.out.println("Введено НЕ целое число");
        }
    }

    private static void extracted(int number) {
        if (number % 2 == 0) {
            System.out.println("Введеное число " + number + " является четным");
        } else {
            System.out.println("Введеное число " + number + " является НЕ четным");
        }
    }

}
