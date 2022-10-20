package Lesson_08;

public class dog extends pet {

    String breed;

    public dog(String nickname, int age, String breed) {
        super(nickname, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof Woof");

    }

}
