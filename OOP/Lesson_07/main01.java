package Lesson_07;

public class main01 {
    public static void main(String[] args) {

        person p1 = new person();

        p1.name = "Anton";
        p1.age = 41;
        p1.sex = "male";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.sex);

        // Сеттеры и Геттеры Setter and Getter

        person p2 = new person("Ivan");
        p2.print();
        p2.setAge(-32);
        p2.print();

        person p3 = new person("Aleksandra", 25, "female");
        p3.print();

        person p4 = new person("Aleksey", -5, "pickachu");
        p4.print();

        employee e1 = new employee("Vasilisa", -5, "female", 50000, 5);
        e1.print();

        laptop l1 = new laptop("MacBook Pro", 90000, 33674);
        l1.printInfoLaptop();

        e1.setLaptop(l1);// сотруднику е1 даем laptop l1
        e1.laptop.printInfoLaptop();// сотруднику е1 имеет поле laptop а классе laptop есть функция printInfoLaptop

        l1.owner.print();

        System.out.println(e1.laptop.owner.name);

        employee e3 = new employee("Artur", 33, "male", 100000, 9);
        laptop l2 = new laptop("EliteBook G855", 110000, 77777);
        e3.print();
        l2.printInfoLaptop();

        l2.setOwnar(e3);
        l2.owner.print();
        System.out.println(e3.laptop.owner.name);

        e3.returnLaptop(); // сдаем laptop
        System.out.println(e3.laptop.model); // null
        System.out.println(l2.owner.name); // null

        manager m1 = new manager("Aleksey", 35, "male", 12000, 10);
        m1.print();
        System.out.println(m1.getBonus());

        m1.setSalary(15000);
        m1.print();
        System.out.println(m1.getBonus());

    }
}
