package leson04;

public class WhileDemo {
    public static void main(String[] args) {
        // Распечатать 10 строк циклом while.
        int n = 1;
        while (n <= 10) {
            // System.out.printf("Task %d\n", n++);
            System.out.println("Тик " + n++);
        }
        // Распечатать 100 строк циклом do while.
        do {
            System.out.println("do while " + n++);
        } while (n <= 100);

        // Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
        // Используем цикл do-while.

        int a = 0;
        do {
            if (a % 5 == 0) {
                System.out.println("числа от 1 до 100, которые делятся на 5 без остатка - " + a++);
            } else {
                a++;
            }
        } while (a <= 100);

        char e = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(e++ + " ");

        }

    }

}
