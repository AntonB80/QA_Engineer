public class Method {
    public static void main(String[] args) {
        int x, y;
        // вызов метода
        x = square(5);
        System.out.println(x);
        x = square(9);
        System.out.println(x);
        /*
         * Передача в метод square другую переменную того же типа (в данном случае int)
         */
        // инициализация переменной у
        y = 2;
        // х = переданной переменной у в метод square
        x = square(y);
        System.out.println(x); // 4

        int a = sum(3, 4);
        System.out.println(a);

        int w = subtraction(10, 12);
        System.out.println(w);

        byte b1 = 50, b2 = -99;
        short k = (short) (b1 + b2);
        int k1 = b1 + b2;
        b1 += b2; // равноценно записи short k = (short) (b1 + b2);
        System.out.println("k = " + k);
        System.out.println("k1 = " + k1);
        System.out.println("b1 = " + b1);

        byte r1 = 2;
        byte r2 = (byte) (2 * r1);
        r2 *= 4;
        System.out.println("r2 = " + r2);

    }

    static int square(int number) {
        return number * number;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;

    }

}
