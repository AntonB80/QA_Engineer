package Lesson_10.Array_List.Printer;

public class person {

    String name;
    int age;
    String sex;

    public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void print() {
        System.out.printf("%s, %d,%s\n", this.name, this.age, this.sex);
    }

    public void usePrintre(printer p) {
        System.out.printf("%s пользуется %s\n", this.name, p.model);
        p.users.add(this); // обращаем к классу принтер, там есть переменная users которая является
                           // списочным массивом, add(this) - добавляет данного пользователя в конец

    }
}
