package leson04;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("for" + i);
        }
        // вывести пять символов в ряд начиная с символа 'h'
        char symbol = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(symbol++ + "_");
        }
        System.out.println();
        // задаем массив длиною 10
        int[] firstArray = new int[10];
        System.out.println(firstArray.length);

        // садаем массив длиною 4 и указываем что в них хранится
        String[] seasons = { "Winter", "Spring", "Summer", "Autumn" };
        for (String str : seasons) {
            System.out.println("Значения масива seasons " + str);
        }
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]); // вывод на печать значений масива
            System.out.println();

            /*
             * Реализовать подсчет факториала используя цикл for. Пример вычисления
             * факториала:
             * 
             * Math.random() * 10 рандомно выбирает число от 1 до 10
             * Math.random() * 10 яляется double. Делаем перобразование из double в int
             * (int) (Math.random() * 10)
             */
            int e = (int) (Math.random() * 10);
            System.out.println(e);
            System.out.println("факториал числа " + e + "=" + getFactorial(e));
        }

    }

    // Реализовать подсчет факториала используя цикл for. Пример вычисления
    // факториала:
    public static int getFactorial(int q) {
        int result = 1;
        for (int i = 1; i < q; i++) {
            result = result * i;
        }
        return result;

    }
}
