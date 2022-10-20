public class Lesson_03 {
    public static void main(String args[]) {

        // Арифметика

        double a = 7.6;
        double b = 2.9;

        double result1 = a + b;
        System.out.println(result1);

        double result2 = a - b;
        System.out.println(result2);

        double result3 = a * b;
        System.out.println(result3);

        double result4 = a / b;
        System.out.println(result4);

        double result5 = a % b;
        System.out.println(result5);

        // Снекоторого момента прошло 234 дня.
        // Сколько полных недель прошло за это тпериод?
        // Амесяцев?

        short days = 234;

        short week = (short) (days / 7);
        System.out.println(week);

        int month = days / 30;
        System.out.println(month);

        // Дано двузначноечисло 39. Найти:
        // a.число десятков внем;
        // b.числ оединиц внем;
        // c.сумму его цифр;
        // d.произведение его цифр.

        int number = 39;

        int d = number / 10 % 10;
        int e = number % 10;

        System.out.printf("%d = %d*10 + %d\n", number, d, e);

        int sum = d + e;
        int multiplication = d * e;

        System.out.println("Sum =" + sum);
        System.out.println("Multiplication =" + multiplication);

    }

}
