package Lesson_07;

public class manager extends employee {

    private int bonus;

    public manager(String name, int age, String sex, int salary, int experience) {
        super(name, age, sex, salary, experience);
        this.bonus = generateBonus();

    }

    private int generateBonus() {
        return this.salary * this.experience / 10;
    }

    public int getBonus() { // выводит результат бонуса, но не работа с ним
        return this.bonus;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        this.bonus = this.generateBonus();
    }

}
