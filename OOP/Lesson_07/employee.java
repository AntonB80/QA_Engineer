package Lesson_07;

public class employee extends person {

    public int salary;
    public int experience;
    public boolean isHappy;
    public laptop laptop;

    public employee(String name, int age, String sex, int salary, int experience) {
        super(name, age, sex); // super - наследует конструкторы из класса person
        this.salary = salary;
        this.experience = experience;

        if (salary > 40000) {
            this.isHappy = true;
        } else {
            this.isHappy = false;
        }
    }

    public void print() {
        System.out.printf("Name = %s, Age = %d, Sex = %s, salary = %d, experience = %d, iaHappy = %b\n", this.name,
                this.age,
                this.sex, this.salary, this.experience, this.isHappy);

    }

    public void setLaptop(laptop laptop) {
        this.laptop = laptop;
        laptop.owner = this;
    }

    public void returnLaptop() {
        this.laptop.owner = null;// обращаемся к сотруднику(текущий объект), обращаемся к его laptop, обращаемся
                                 // к владельцу (owner) и обнуляем его
        this.laptop = null;// обнуляем поле laptop для текщего объекта - сотрудника
    }
}
