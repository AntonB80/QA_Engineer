public class Employee extends Person {

    public int salary;
    public int experience;
    public boolean isHappy;
    public Laptop Laptop;

    public Employee() {
    };

    public Employee(String name, int age, String sex, int salary, int experience) {
        super(name, age, sex);
        this.salary = salary;
        this.experience = experience;

        if (salary > 40000) {
            this.isHappy = true;
        } else {
            this.isHappy = false;
        }
    }

    public void print() {
        System.out.printf("Name = %s, age = %d, sex = %s salary = %d experience = %s isHappy = %b \n", this.name,
                this.age, this.sex, this.salary, this.experience, this.isHappy);

    }

    public void setLaptop(Laptop Laptop) {
        this.Laptop = Laptop;
        Laptop.owner = this;
    }

}
