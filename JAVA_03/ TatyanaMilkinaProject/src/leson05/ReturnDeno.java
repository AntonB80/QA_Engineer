package leson05;

public class ReturnDeno {
    public static void main(String[] args) {
        double d = getRandomValue(7);
        System.out.println(d);
    }

    public static double getRandomValue(int i) {
        return Math.random() * i;
    }
}
