package Lesson_10.Array_List.Printer;

import java.util.ArrayList;

public class printer {
    String model;
    ArrayList<person> users;

    public printer(String model) {
        this.model = model;
        this.users = new ArrayList<>();
    }

    public void listOfUsers() {
        if (this.users.size() == 0)
            System.out.println(this.model + " Никто не use принтер");
        else {
            System.out.print(this.model + " пользовались: " + " : ");
            for (int i = 0; i < this.users.size(); i++) {
                System.out.print(this.users.get(i).name
                        + " | "); // this - обращаемся к текущему объекту принтера.
                                  // this.users - списочный масив который у него есть.
                                  // this.users.get(i) - получаем i элемент/пользователя и
                                  // name - и печатаем его имя
            }
            System.out.println();

        }
    }

    // Пользовался ли данный человек данным принтером
    public void checkUsedByUser(person p) {

        if (this.users.contains(p) == true) {
            System.out.printf("%s пользовался принтером %s\n", p.name, this.model);
        } else {
            System.out.printf("%s НЕ пользовался принтером %s\n", p.name, this.model);
        }
    }
}
