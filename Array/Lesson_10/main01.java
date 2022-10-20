package Lesson_10;

// Динамические массивы очередь
public class main01 {
    public static void main(String[] args) {

        // создаем машины
        car c1 = new car(1, "Audi", "green");
        car c2 = new car(2, "Skoda", "black");
        car c3 = new car(3, "Skoda", "white");
        car c4 = new car(43, "Toyota", "yellow");
        car c5 = new car(448, "lada", "lilac");

        // создаем ноды
        sNode s1Node = new sNode(c1);
        sNode s2Node = new sNode(c2);
        sNode s3Node = new sNode(c3);
        sNode s4Node = new sNode(c4);
        sNode s5Node = new sNode(c5);

        // создаем очередь
        sQueue q = new sQueue();
        q.print();
        // добавляем в очередь машины

        q.push(s1Node);
        q.print();
        q.push(s2Node);
        q.print();
        q.push(s3Node);
        q.print();
        q.push(s4Node);
        q.print();
        q.push(s5Node);
        q.print();

        // достаем из очереди
        q.pop();
        q.print();
        q.pop();
        q.print();
        q.pop();
        q.print();

        q.findCar("Skoda");

    }
}
