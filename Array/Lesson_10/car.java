package Lesson_10;

public class car {
    String model;
    String color;
    int id;

    public car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public void print() {
        System.out.printf("Car = %s, color = %s, ID = %d", this.model, this.color, this.id);
    }
}
