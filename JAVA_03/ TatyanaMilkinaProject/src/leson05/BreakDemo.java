package leson05;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // если убрать if break цикл продолжиться да 10
            if (i == 5) {
                break;
            }
            System.out.print("Пpoxoд " + i + " : ");
            for (int j = 0; j < 100; j++) {
                // если убрать if break цикл продолжиться да 100
                if (j == 10) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены");

        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
