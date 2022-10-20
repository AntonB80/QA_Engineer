package Lesson_08;

public class cat extends pet {

    public cat(String nickname, int age) {
        super(nickname, age);

    }

    @Override
    public void makeSound() {
        System.out.println("Meow ! Meow ! Meow !");

    }

}
