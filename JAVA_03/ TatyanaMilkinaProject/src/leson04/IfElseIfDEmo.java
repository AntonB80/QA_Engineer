package leson04;

import java.util.Scanner;

public class IfElseIfDEmo {
    public static void main(String[] args) {

        Scanner dayOfWeek = new Scanner(System.in);
        System.out.println("Какой день недели вывести???");
        int day = dayOfWeek.nextInt();
        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else {
            System.out.println("И так далее");
        }

        int a, b, c;
        a = 1;
        b = 2;
        c = 0;

        for (int i = 0; i < 10; i++) {
            a++;
            b *= 2;
            c = a + b;
        }

        System.out.println(c);
    }
}
