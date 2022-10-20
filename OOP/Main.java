public class Main {

    public static void main(String[] args) {
        // Create different persons
        /*
         * Person p1 = new Person();
         * p1.print();
         * 
         * Person p2 = new Person("Ivan", 32);
         * p2.print();
         * 
         * Person p3 = new Person("Aleks", 25, "pikachu");
         * p3.print();
         * 
         * Person p4 = new Person("Aleksandra", -3, "female");
         * p4.print();
         */
        // Setter and Getter
        /*
         * Person p2 = new Person("Ivan", 32);
         * p2.print();
         * p2.setAge(-32);
         * System.out.println(p2.getAge());
         * p2.print();
         */

        Employee e1 = new Employee();
        e1.print();

        Employee e2 = new Employee("Oleg", 24, "abrakodabra", 50000, 3);
        e2.print();

        // Laptop
        Laptop l1 = new Laptop("Air", 90000, 111);
        l1.printInfo();

        e2.setLaptop(l1);
        e2.Laptop.printInfo();

        l1.owner.print();
    }
}
