package Lesson_07;

public class person {

    public String name;
    public int age;
    public String sex;

    public person() {
    }

    public person(String name) {
        this.name = name;
    }

    // Сеттеры, сто-то проставляют
    public void setAge(int age) {
        if (age <= 0) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    // Геттеры, что-то получает, возвращает
    public int getAde() {
        return this.age;
    }

    public person(String name, int age, String sex) {
        this.name = name;
        if (age <= 0) {
            this.age = 18;
        } else {
            this.age = age;
        }
        if ((sex == "male") || (sex == "female")) {
            this.sex = sex;
        } else {
            this.sex = null;
        }

    }

    public void print() {
        System.out.printf("Name = %s, Age = %d, Sex = %s\n", this.name, this.age, this.sex);

    }

}
