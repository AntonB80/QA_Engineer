package Lesson_10.Array_List.Printer;

public class main01 {

    // Task Просмотр кто пользовался принтером
    public static void main(String[] args) {

        person p1 = new person("Anton", 33, "male");
        person p2 = new person("Anna", 18, "female");
        person p3 = new person("Irina", 25, "female");
        person p4 = new person("Oleg", 50, "male");

        printer pr1 = new printer("HP LaserJet");
        printer pr2 = new printer("Epson XL");

        pr1.listOfUsers();
        pr2.listOfUsers();

        p1.usePrintre(pr1);

        p1.usePrintre(pr1);

        pr1.listOfUsers();
        pr2.listOfUsers();

        p2.usePrintre(pr2);
        pr1.listOfUsers();
        pr2.listOfUsers();

        p3.usePrintre(pr2);
        pr1.listOfUsers();
        pr2.listOfUsers();

        p2.usePrintre(pr2);
        p3.usePrintre(pr1);
        p2.usePrintre(pr2);
        p4.usePrintre(pr1);

        pr1.listOfUsers();
        pr2.listOfUsers();
        // Пользовался ли данный человек данным принтером
        pr1.checkUsedByUser(p1);
        pr1.checkUsedByUser(p2);
        pr1.checkUsedByUser(p3);
        pr1.checkUsedByUser(p4);
        pr2.checkUsedByUser(p1);
        pr2.checkUsedByUser(p2);
        pr2.checkUsedByUser(p3);
        pr2.checkUsedByUser(p4);

    }
}