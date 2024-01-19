package leson04;

import java.util.Scanner;

public class SwichDemo {
    public static void main(String[] args) {
        Scanner dayOfWeekSwiTch = new Scanner(System.in);
        System.out.println("Какой день недели вывести???");
        int day1 = dayOfWeekSwiTch.nextInt();
        switch (day1) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;

            default:
                System.out.println("И так далее");
                break;
        }
    }

}
