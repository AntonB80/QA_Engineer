package Lesson_10.Array_List;

import java.util.ArrayList;

public class array_list {

    public static void print(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }

    // метод замены имен
    public static void setByName(ArrayList<String> list, String name1, String name2) {
        if (list.contains(name1) == true) { // проверка есть ли поисковое имя
            int index = list.indexOf(name1);
            list.set(index, name2);
        }
    }

    // метод удаления всех имен
    public static void removeByName(ArrayList<String> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(name) == true) {
                int index = list.indexOf(name);
                list.remove(index);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); // создание масива
        list.add("Kate");
        print(list);

        list.add("Anton");
        print(list);

        list.add("Sergey");
        print(list);

        list.add("Nataly");
        print(list);

        // list.set(3, "Feniks"); // замена элемента с указанием индекса
        // print(list);

        list.add("Nessi");
        print(list);
        list.add("Artur");
        print(list);
        list.add("Ivan");
        print(list);
        list.add("Alex");
        print(list);

        setByName(list, "Sergey", "Regina"); // метод замены имен
        print(list);
        list.add("Oleg");
        print(list);
        list.add("Anna");
        print(list);
        list.add("Alex");
        print(list);
        list.add("Olga");
        print(list);
        // list.add(0, "Feniks"); // встав элемента в массив с указанием индекса
        // print(list);

        // list.set(4, "Feniks"); // замена элемента с указанием индекса
        // print(list);

        // метод замены имен содержания индекса
        setByName(list, "Sergey", "Regina");
        print(list);
        System.out.println(list.size());
        // удаление элемента по индексу
        // list.remove(3);
        // print(list);
        // удаление элемента по типу, первого вхождения
        // list.remove("Alex");

        removeByName(list, "Alex");
        print(list);
        System.out.println(list.size());

    }
}
