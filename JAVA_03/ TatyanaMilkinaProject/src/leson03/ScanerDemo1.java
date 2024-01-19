package leson03;

import java.util.Scanner;

public class ScanerDemo1 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите целое число: ");
        // if (scanner.hasNextInt()) {
        // // hasNextInt ожидает что введут целое чило
        // // hasNextDouble ожидет, что введут дробное число
        // int i = scanner.nextInt();
        // System.out.println("Ввел целое число: " + i);
        // } else {
        // System.out.println("Ввел не целое число");

        // }
        // Scanner sc = new Scanner(System.in);
        // String s1, s2;
        // System.out.println("Введ символы/текст");
        // s1 = sc.nextLine(); // nextLine ожидает на ввод символы/текст
        // System.out.println("Введ символы/текст еще раз");
        // s2 = sc.nextLine(); // nextLine ожидает на ввод символы/текст
        // System.out.println("Что за фигню ты ввел: \"" + s1 + "\" & \"" + s2 + "\"");

        // арифметические операторы Java
        System.out.println("арифметические операторы Java");
        int a = 4 + 5 - 2 * 3;
        int s = 4 + (5 - 2) * 3;
        System.out.println(a);
        System.out.println(s);

        int d = 7 % 5;
        double f = 16.0 / 5;
        System.out.println(d);
        System.out.println(f);

        int q = 1;
        int w = q--;
        System.out.println(q);
        System.out.println(w);
        System.out.println('\u2663'); // ♣

        boolean u = true;
        boolean y = true;
        if (u == true | y == true) {
            System.out.println("1");

        } else {
            System.out.println("2");

        }

        /*
         * Меньшее по модулю число
         * Создать программу, которая будет выводить на экран меньшее по модулю из трёх
         * введённых пользователем вещественных чисел.
         * Для вычисления модуля используйте тернарную условную операцию.
         * Для ввода чисел используем класс Scanner.
         */

        // System.out.println("Меньшее по модулю число");
        // Scanner smallestNumber = new Scanner(System.in);
        // System.out.println("Введите первое число");
        // int j = smallestNumber.nextInt();
        // System.out.println("Введите второе число");
        // int k = smallestNumber.nextInt();
        // System.out.println("Введите третье число");
        // int l = smallestNumber.nextInt();

        // if (Math.abs(j) < Math.abs(k) && Math.abs(j) < Math.abs(l)) {
        // System.out.println("Меньшее по модулю число - " + j);
        // } else if (Math.abs(k) < Math.abs(j) && Math.abs(k) < Math.abs(l)){
        // System.out.println("Меньшее по модулю число - " + k);
        // } else {
        // System.out.println("Меньшее по модулю число - " + l);
        // }

        // Метод преобразование из String в int
        System.out.println("Метод преобразование из String в int");

        String tr = "4";
        int inInteger = Integer.parseInt(tr);
        System.out.println(inInteger * 2);

        /*
         * Среднее значение чисел
         * Вычислить среднее значение трех вещественных чисел передаваемых на вход
         * программы в качестве аргументов.
         */

        Scanner averageValue = new Scanner(System.in);
        System.out.println("Введите первое число");
        double jj = averageValue.nextDouble();
        System.out.println("Введите второе число");
        double kj = averageValue.nextDouble();
        System.out.println("Введите третье число");
        double lj = averageValue.nextDouble();

        System.out.println("Среднее значение чисел = " + ((jj + kj + lj) / 3));

        Scanner averageValue02 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int er = getEe(averageValue02);
        System.out.println("Введите второе число");
        int ef = getEe(averageValue02);
        System.out.println("Введите третье число");
        int ed = getEe(averageValue02);

        System.out.println("Среднее значение чисел = " + ((er + ef + ed) / 3));

    }

    private static int getEe(Scanner averageValue02) {
        if (averageValue02.hasNextInt()) {
            int ee = averageValue02.nextInt();
            return ee;
        } else {
            System.out.println("Error");
            return averageValue02.nextInt();
        }

    }
}
