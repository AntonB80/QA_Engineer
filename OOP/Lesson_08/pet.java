package Lesson_08;

public abstract class pet extends animail {

    String nickname;
    int age;
    person owner;

    public pet(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void whoIsYouOwner() {
        if (this.owner == null) {
            System.out.println("There is no owner (");
        } else {
            System.out.println("Owner of pet is " + owner.name);
        }
    }
}
