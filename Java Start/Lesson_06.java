public class Lesson_06 {

    /// Пример функции которая возврашает
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // Пример функции которая ничего не возврашает
    public static void print(String value) {
        System.out.println(value);
    }

    // Пример функции которая ничего не возврашает
    public static void printBiggestValue(int a, int b) {
        if (a > b)
            System.out.println("Большее число\t" + a);
        else if (a < b)
            System.out.println("Большее число\t" + b);
        else
            System.out.println("Числа одинаковые");

    }

    // task#1
    // Напечатать числа в виде следующей таблицы:
    // 5 5 5 5 5 5
    // 5 5 5 5 5 5
    // 5 5 5 5 5 5
    // 5 5 5 5 5 5

    public static void printNumber(int number, int columns, int rows) {
        for (int i = 0; i < rows; i++) { // задаем нужное количество строчек
            for (int j = 0; j < columns; j++) { // задаем нужное количество колонок
                System.out.print(number + " ");
            }
            System.out.println();

        }
    }

    // Напечатать текст
    public static void printText(String line, int columns, int rows) {
        for (int i = 0; i < rows; i++) { // задаем нужное количество строчек
            for (int j = 0; j < columns; j++) { // задаем нужное количество колонок
                System.out.print(line + " ");
            }
            System.out.println();

        }
    }

    // task#2
    // Напечатать числа в виде следующей таблицы:
    // 5
    // 5 5
    // 5 5 5
    // 5 5 5 5
    // 5 5 5 5 5

    public static void printTree(int number, int columns, int rows) {
        for (int i = 0; i < rows; i++) { // задаем нужное количество строчек
            for (int j = 0; j < columns; j++) { // задаем нужное количество колонок
                if (i >= j) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }

    // через массив
    public static void printArrayTree(int[] array, int number, int columns) {
        for (int i = 0; i < array.length; i++) { // задаем нужное количество строчек
            for (int j = 0; j < columns; j++) { // задаем нужное количество колонок
                if (i >= j) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }

    }

    // task#3
    // Напечатать полную таблицу сложения в виде:
    // 1 + 1 = 2 1 + 2 = 3 ... 1 + 9 = 10
    // 2 + 1 = 3 2 + 2 = 4 ... 2 + 9 = 11
    // ...
    // 9 + 1 = 10 9 + 2 = 11 ... 9 + 9 = 18

    public static void printElement(int a, int b) {
        System.out.printf("%d + %d = %d\t", a, b, a + b);

    }

    public static void printLine(int n) {
        for (int i = 1; i <= 9; i++) {
            printElement(n, i);
        }
        System.out.println();

    }

    public static void printTable() {
        for (int i = 1; i <= 9; i++) {
            printLine(i);
        }
    }

    // task#4
    // 1.Найти k-й член последовательности Фибоначчи.
    public static int fibonachi(int n) {
        if (n < 1) {
            return n;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }

    }

    // 2.Получить первые n членов последовательности Фибоначчи. Решить задачу с
    // помощью рекурсивных функций. !!!!!!!!!!!!!!!!!!!!
    public static int printFibonachi(int n) {
        if (n == 0) {
            System.out.println(n);
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(fibonachi(i) + " ");

            }
        }
        return n;
    }

    // task#5
    // Написать рекурсивную функцию для вычисления факториала натурального числа n.
    // класическим способом
    public static long factorialClassic(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    // через рекурсию
    public static long factorialRecursion(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorialRecursion(n - 1);
    }

    // task#6
    // Реализовать функцию нахождения минимума:
    // 1. Из трёх чисел
    // 2. Из четырёх чисел
    public static int minOfTwo(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    // 1. Из трёх чисел
    public static int minOfThree(int a, int b, int c) {
        return minOfTwo(minOfTwo(a, b), c);
    }

    // 2. Из четырёх чисел
    public static int minOfFour(int a, int b, int c, int k) {
        return minOfTwo(minOfTwo(a, b), minOfTwo(a, b));
    }

    // task#7
    // расчитать премию от з/п
    public static int bonus(int a) {
        if (a < 40000) {
            double bonus = a * 0.5;
            System.out.printf("При з/п %d Ваша премия %.2f", a, bonus);
        }
        if (a >= 40000 & a < 80000) {
            double bonus = a * 0.7;
            System.out.printf("При з/п %d Ваша премия %.2f", a, bonus);
        }
        if (a > 80000) {
            double bonus = a * 1.1;
            System.out.printf("При з/п %d Ваша премия %.2f", a, bonus);
        }

        return a;
    }

    // task#8
    // метод принимает на вход натуральное чсло и возврвщвет true если число четное
    public static boolean evenNumbers(int a) {
        if (a % 2 == 0) {
            System.out.println("Число четное");
            return true;
        } else {
            System.out.println("Число НЕ четное");
        }
        return false;
    }

    // task#9
    // Даны стороны двух треугольников. Найти сумму их периметров и сумму их
    // площадей. (Определить процедуру для расчета периметра и площади треугольника
    // по его сторонам.)

    // Проверка, что триугольник существует

    public static boolean isTriangle(double a, double b, double c) {
        if ((a > 0) && (b > 0) & (c > 0) & (a + b > c) & (a + c > b) & (a + b > c))
            return true;
        else {
            return false;
        }
    }

    // Периметр

    public static double perimetr(double a, double b, double c) {
        if (isTriangle(a, b, c) == true)
            return a + b + c;
        else
            return 0;
    }

    // Площадь

    public static double square(double a, double b, double c) {
        if (isTriangle(a, b, c) == true) {
            double p = perimetr(a, b, c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return s;
        } else
            return 0;
    }

    // информация о триугольнике

    public static void printInfo(double a, double b, double c) {
        if (isTriangle(a, b, c) == true) {
            System.out.printf("Треугольник со сторонами %.0f, %.0f, %.0f существует\n",
                    a, b, c);
            System.out.printf("Площадь равна %.0f Периметр равен %.0f\n", square(a, b,
                    c), perimetr(a, b, c));
        } else
            System.out.printf("Треугольник со сторонами %.0f, %.0f, %.0f НЕ существует\n", a, b, c);

    }

    public static void main(String[] args) {

        // Пример функции которая возврашает

        int x = 15; // задаем переменный
        int v = 20; // задаем переменный
        int maximum = max(x, v); // вызываем цункцию указывая переменные
        System.out.println("Макс. значение" + maximum); // выводим значения переменной

        int maximum1 = max(8, 6); // вызов функции передав 2 аргумента
        System.out.println("Макс. значение" + maximum1); // выводим значение переменной

        System.out.println("Макс. значение" + max(9, 11)); // метод вывода при обращении сразу к функции и переменным

        // Пример функции которая ничего не возврашает

        int e = 35; // задаем переменный
        int r = 14; // задаем переменный
        int maximum2 = max(e, r); // вызываем функцию указывая переменные
        print("Макс. значение" + maximum2); // выводим значения переменной

        int maximum3 = max(55, 6123); // вызов функции передав 2 аргумента
        print("Макс. значение" + maximum3); // выводим значение переменной

        print("Макс. значение" + max(134, 497)); // метод вывода при обращении сразу к функции и переменным

        // Пример функции которая ничего не возврашает

        int a = 10;
        int b = 20;
        int c = 20;
        printBiggestValue(a, b);
        printBiggestValue(c, a);
        printBiggestValue(b, c);

        // task#1
        // Напечатать числа в виде следующей таблицы:
        // 5 5 5 5 5 5
        // 5 5 5 5 5 5
        // 5 5 5 5 5 5
        // 5 5 5 5 5 5

        printNumber(15, 7, 7);

        // Напечатать текст
        printText("HI", 3, 3);

        // task#2
        // Напечатать числа в виде следующей таблицы:
        /*
         * 5
         * 5 5
         * 5 5 5
         * 5 5 5 5
         * 5 5 5 5 5
         * printTree(5, 7, 7);
         */

        // через массив
        int[] array = { 5, 5, 5, 5, 5 };
        printArrayTree(array, 7, 9);

        // task#3
        // Напечатать полную таблицу сложения в виде:
        // 1 + 1 = 2 1 + 2 = 3 ... 1 + 9 = 10
        // 2 + 1 = 3 2 + 2 = 4 ... 2 + 9 = 11
        // ...
        // 9 + 1 = 10 9 + 2 = 11 ... 9 + 9 = 18
        printTable();

        // task#4
        // 1.Найти k-й член последовательности Фибоначчи.
        System.out.println(fibonachi(10));

        // 2.Получить первые n членов последовательности Фибоначчи.
        printFibonachi(2);

        // task#5
        // Написать рекурсивную функцию для вычисления факториала натурального числа n.
        // класическим способом

        System.out.println(factorialClassic(1));
        System.out.println(factorialClassic(3));
        System.out.println(factorialClassic(5));
        System.out.println(factorialClassic(10));
        System.out.println(factorialClassic(13));

        // через рекурсию

        System.out.println(factorialRecursion(1));
        System.out.println(factorialRecursion(3));
        System.out.println(factorialRecursion(5));
        System.out.println(factorialRecursion(10));
        System.out.println(factorialRecursion(13));

        // task#6
        // Реализовать функцию нахождения минимума:
        // 1. Из трёх чисел

        System.out.println(minOfThree(1, 2, 3));
        System.out.println(minOfThree(7, -5, 1));
        System.out.println(minOfThree(11, 2, 3));

        // 2. Из четырёх чисел

        System.out.println(minOfFour(3, 6, 8, 2));
        System.out.println(minOfFour(3, -6, 8, 2));
        System.out.println(minOfFour(3, 1, 8, 2));

        // task#7
        // расчитать премию от з/п
        bonus(100000);

        // task#8
        // метод принимает на вход натуральное чсло и возврвщвет true если число четное
        evenNumbers(496);

        // task#9 см. в ООП
        // Даны стороны двух треугольников. Найти сумму их периметров и сумму их
        // площадей. (Определить процедуру для расчета периметра и площади треугольника
        // по его сторонам.)
        System.out.println("Периметр " + perimetr(3, 4, 5));
        System.out.println("Площадь " + square(3, 4, 5));
        printInfo(3, 4, 5);

    }

}
