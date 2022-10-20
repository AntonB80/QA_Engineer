import java.util.Scanner;

import javax.print.attribute.standard.Sides;

import java.io.*;
import java.util.Locale;

public class Lesson_05 {

    public static void main(String[] args) throws IOException {

        // ЦИКЛЫ

        // task#1
        // Напечатать ряд чисел 20 ввиде: 20 20 20 20 20 20 20 20 20 20.

        for (double i = 0; i < 10; i++) {
            System.out.print(20 + " ");
        }

        // task#2
        // Напечатать числа следующим образом:
        // 10 10.4
        // 11 11.4
        // ...
        // 25 25.4

        for (int i = 10; i <= 25; i++) {
            System.out.printf("%d,%d.4\n", i, i);
        }

        // tsk#3
        // Напечатать таблицу умножения на 7:
        // 1 х 7 = 7
        // 2 х 7 = 14
        // ...
        // 9 х 7 = 63

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d*7 = %d\n", i, i * 7);
        }

        // task#4
        // Найти:
        // 1.сумму всех целых чисел от 100 до 500 включительно;
        // 2.сумму всех целых чисел от a до b (значения a и b водятся с клавиатуры;
        // b>=a).

        int sum = 0;
        for (int i = 100; i <= 500; i++) {
            System.out.println("============");
            System.out.println("i = " + i);
            System.out.println("Сумма ДО внесения изменения" + sum);

            sum = sum + i;

            System.out.println("Сумма ПОСЛЕ внесения изменения" + sum);
        }
        System.out.println("Сумма диапозона равна " + sum);

        int a = 2;
        int b = 7;
        int sum1 = 0;
        for (int i = a; i <= b; i++) {
            System.out.println("============");
            System.out.println("i = " + i);
            System.out.println("Сумма ДО внесения изменения" + sum1);
            sum = sum + i;
            System.out.println("Сумма ПОСЛЕ внесения изменения" + sum1);
        }
        System.out.println("Сумма диапозона равна " + sum1);

        // task#5
        // Даны натуральное число n и вещественные числа a1, a2, ..., an. Определить
        // среднее арифметическое вещественных чисел

        String str = "2.5 7.3 7.2 0.5 5.1 6.3 4.2 3.1 8.2 1.2";
        Scanner sc = new Scanner(str).useLocale(Locale.US); // связываем scanner c объектом строка str

        int n = 10;

        double sum2 = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("=============");
            System.out.println("i = " + i);
            double temp = sc.nextDouble();
            System.out.println(temp);
            sum2 = sum2 + temp;
        }
        sc.close();

        double avg = sum2 / n;

        System.out.printf("AVG = %.2f", avg);

        // import java.util.Scanner;
        // import java.io.*;
        // public static void main(String[] args) throws IOException {
        // Добавлять эти элементы при данных из файлов

        File file = new File("test.txt");
        Scanner sc = new Scanner(file).useLocale(Locale.US); // связываем scanner c
        объектом файл test.txt

        int n = 10;

        double sum3 = 0;

        for (int i = 0; i < n; i++) {
        System.out.println("=============");
        System.out.println("i = " + i);
        double temp = sc.nextDouble();
        System.out.println(temp);
        sum3 = sum3 + temp;
        }
        sc.close();

        double avg = sum3 / n;

        System.out.printf("AVG = %.2f", avg);

        // task#6
        // Последовательность Фибоначчи образуется так: первый и второй члены
        // последовательности равны 1, каждый следующий равен сумме двух предыдущих (1,
        // 1, 2, 3, 5, 8, 13, ...). Дано натуральное число n.
        // 1.Найти k-й член последовательности Фибоначчи.
        // 2.Получить первые n членов последовательности Фибоначчи.
        // 3.Верноли, что сумма первых n членов последовательности Фибоначчи есть четное
        // число?

        // task#7 ЦИКЛ WHILE
        // Дана не пустая последовательность целых чисел, оканчивающаяся нулем. Найти:
        // 1.сумму всех чисел последовательности;
        // 2.количество всех чисел последовательности.

        int sum4 = 0;
        int count = 0;

        String str = "51 12 23 37 5 37 58 21 0 32 21 3";
        Scanner sc = new Scanner(str).useLocale(Locale.US);

        int temp = sc.nextInt();

        while (temp != 0) {
        // System.out.println("==============");
        // System.out.println("Scsnning " + temp);

        sum4= sum4 + temp;
        count++;
        temp = sc.nextInt();
        }
        sc.close();

        System.out.printf("Сумма ряда %d Количество чисел %d\n", sum4, count);

        // 3. Найти сумму всего ряда чисел

        
          int sum = 0;
          int count = 0;
          
          String str = "1 2 3 4 5";
          Scanner sc = new Scanner(str).useLocale(Locale.US);
          
          while (sc.hasNextInt()) {
          int temp = sc.nextInt();
          sum = sum + temp;
          count++;
          }
          
          sc.close();
          
          System.out.printf("Сумма ряда %d Количество чисел %d\n", sum, count);
         

        // task#8
        // Дано натуральное число. Определить:

        
          int number = 193003860;
          System.out.println("Натуральное число " + number);
          
          number = Math.abs(number); // защита от ввода отрицательных чисел
         

        // 1.количество цифр 3 в нем;

        
          
          int countOfThre = 0;
          
          while (number != 0) {
         int ending = number % 10;
          
          if (ending == 3) {
          countOfThre++;
         }
          number = number / 10;
          }
          System.out.println("Цифра 3 встречается в нем " + countOfThre);
        

        // 2.сколько раз в нем встречается последняя цифра;

        
          int lastNamber = 0;
          int temp = number % 10;
          while (number != 0) {
          int ending = number % 10;
          
          if (ending == temp) {
          lastNamber++;
          }
          number = number / 10;
          }
          System.out.println("Последняя цифра встречается " + lastNamber + "\tраза");
         

        // 3.количество четных цифр в нем;

        
          int evenNumbers = 0;
          while (number != 0) {
          int ending = number % 10;
          
          if (ending % 2 == 0) {
          evenNumbers++;
          }
          number = number / 10;
          }
          System.out.println("Количество четных чисел " + evenNumbers);
         

        // 4.сумму его цифр, больших пяти;

        
          int moreFive = 0;
          while (number != 0) {
          int ending = number % 10;
          
          if (ending > 5) {
          moreFive = moreFive + ending;
          }
          number = number / 10;
          }
          System.out.println("Сумму цифр, больших пяти " + moreFive);
         

        // 5.произведение его цифр, больших семи;
        
          int moreSeven = 1;
          while (number != 0) {
         int ending = number % 10;
         
         if (ending > 7) {
          moreSeven = moreSeven * ending;
          }
          number = number / 10;
          }
          System.out.println("Произведение цифр, больших семи " + moreSeven);
         

        // 6.сколько раз внем встречаются цифры 0 и 5 (всего).
        
          int numberFiveAndZero = 0;
          while (number != 0) {
          int ending = number % 10;
          
          if (ending == 0 || ending == 5) {
          numberFiveAndZero++;
          }
          number = number / 10;
          }
          System.out.println("Количество цифр 5 и 0 всего раз =" + numberFiveAndZero);
         

        // task#9
        // Имеется фрагмент программы в видео ператора цикла с параметром,
        // обеспечивающий вывод на экран "столбиком" всех целых чисел от 10 до 30.
        // Оформить этот фрагмент в виде:
        // 1.оператора цикла с предусловием;

        
          String str = "27 5 7 10 12 33";
          Scanner sc = new Scanner(str).useLocale(Locale.US);
          
          
          while (sc.hasNext()) {
          int temp = sc.nextInt();
          
          if (temp > 10 & temp < 30) {
          
          System.out.printf("Целые числа > 10, < 30: %d\n", temp);
          }
          }
          sc.close();
         

        // task#11
        // Найти максимальное из натуральных чисел, непревышающих 5000, которое нацело
        // делитсяна 39.
        
          for (int i = 5000; i > 0; i--) {
          if (i % 39 == 0) {
          System.out.println(i);
          break;
          }
          }
         

        // task#12
        // Составить программу вывода любого числа любое заданное число раз.
        
          int a = 44;
          int b = 10;
          
          for (int i = 0; i < b; i++) {
          System.out.print(a + " ");
          }
         

        // Вод с панели
        
          Scanner sc = new Scanner(System.in);
          System.out.println("Введите число: ");
          int namber1 = sc.nextInt();
          System.out.println("Сколько раз повторить?");
          int namber2 = sc.nextInt();
          
          for (int i = 0; i < namber2; i++) {
          System.out.print(namber1 + " ");
          }
          sc.close();
         
        // task#13
        // Напечатать таблицу соответствия между весом в фунтах и весом в килограммах
        // для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).

        
         for (int i = 1; i <= 10; i++) {
          System.out.printf("%d фунт = %.2f\n", i, i / 2.2);
          }
         

        // task#14
        // Вычислить сумму 1+1/2+1/3+...+1/n.

        double sum5 = 0;
        for (double i = 1; i < 15; i++) {

            System.out.println("============");
            System.out.println("i = " + i);
            System.out.println("Сумма ДО внесения изменения" + sum5);

            sum5 = sum5 + 1 / i;

            System.out.println("Сумма ПОСЛЕ внесения изменения" + sum5);
        }
        System.out.println("Сумма диапозона равна " + sum5);

    }

}
