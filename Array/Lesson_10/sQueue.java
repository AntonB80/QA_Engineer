package Lesson_10;

public class sQueue {
    sNode first;
    sNode last;
    int size;

    public sQueue() {
    }

    public void push(sNode n) {
        if (n == null)
            return;
        else {
            if (first == null) { // если очередь пустая и приходит первая нода n
                last = n; // то последний становится n
                first = last; // первый становится последним
                size++; // размер очереди увеличивается
            } else { // как стать последним когда в очереди уже кто-то есть
                last.next = n; // создается указатель, что за последним появился самый последний
                last = last.next; // говорим о том, что последним становится самый последний
                size++; // увеличиваем очередь
            }
        }
    }

    public sNode pop() { // когда ктото уходит, возвращаем ноду
        if (first == null)
            return null;
        else {
            if (first == last) {
                sNode temp = first;
                first = null;
                last = null;
                size--;
                return temp;
            } else {
                sNode temp = first;
                first = first.next; // первым становится тот, кто был следующим за первым
                size--;
                return temp;
            }
        }

    }

    public void print() {
        System.out.print("Очередь состоит из:");

        sNode temp = first;

        while (temp != null) {
            System.out.print(temp.data.model + " | "); // обращаемся к temp типа sNode, в классе sNode есть переменная
                                                       // data типа car, а
            // в кар есть метод объект model
            temp = temp.next;
        }
        System.out.println("Очередь = " + this.getSize());
    }

    public int getSize() {
        if (this == null)
            return 0;
        else
            return this.size;
    }

    // метод который будет выводить количество машин определенной марки
    public void findCar(String model) {

        sNode temp = first;
        int quantity = 0;

        while (temp != null) {
            if (temp.data.model == model) {
                quantity++;
                temp = temp.next;
            } else {
                temp = temp.next;
            }
        }
        System.out.printf("Количество %s-s = %d\n", model, quantity);

    }

}
