package Lesson_08;

public class person extends animail {

    String name;
    pet pet;
    int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("I want to sleep!!!");
    }

    public void setPet(pet pet) {
        this.pet = pet;
        pet.owner = this;
        System.out.printf("Now %s belongs to %s\t", pet.nickname, this.name);
        pet.makeSound();

    }

}
