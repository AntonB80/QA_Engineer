package Lesson_08;

public class main01 {
    public static void main(String[] args) {

        person p1 = new person("Anton", 31);
        p1.makeSound();

        dog d1 = new dog("Jessie", 7, "siam");
        d1.makeSound();
        d1.whoIsYouOwner();

        cat c1 = new cat("Mart", 10);
        c1.makeSound();
        c1.whoIsYouOwner();

        p1.setPet(d1);
        d1.whoIsYouOwner();
    }

}
