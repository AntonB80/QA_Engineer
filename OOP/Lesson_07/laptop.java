package Lesson_07;

public class laptop {

    public String model;
    public int price;
    public int id;
    public employee owner;

    public laptop(String model, int price, int id) {
        this.model = model;
        this.price = price;
        this.id = id;
    }

    public void printInfoLaptop() {
        System.out.printf("Model = %s, Price = %d, Id = %d\n", this.model, this.price, this.id);

    }

    public void setOwnar(employee owner) {
        this.owner = owner;
        owner.laptop = this;
    }

}
