package leson03;

public class SwitchDemo {
    public static void main(String[] args) {
        // цвета световора
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Желтый");
                break;
            case 3:
                System.out.println("Зеленый");
                break;
            // default можно не указывать
            default:
                System.out.println("Такого цвета нет");
                break;
        }
    }
}
