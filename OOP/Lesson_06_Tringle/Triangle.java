package Lesson_06_Tringle;

public class Triangle {

    Line a;
    Line b;
    Line c;

    double perimetr;
    double squore;

    static int countOfTriangles;

    public Triangle(Line a, Line b, Line c) {

        if ((a.length > 0) && (b.length > 0) & (c.length > 0) & (a.length + b.length > c.length)
                & (a.length + c.length > b.length) & (a.length + b.length > c.length))
            this.a = a;
        this.b = b;
        this.c = c;
        this.perimetr = generatePerimetr();
        this.squore = generateSquare();
        countOfTriangles++;
    }

    public double generatePerimetr() {
        return this.a.length + this.b.length + this.c.length;
    }

    public double generateSquare() {

        double p = generatePerimetr() / 2;

        return Math.sqrt(p * (p - this.a.length) * (p - this.b.length) * (p - this.c.length));
    }

    public void print() {
        System.out.printf("Tringle consists of lines %s, %s, %s. Perimetr = %.2f, Square = %.2f\n ", this.a.name,
                this.b.name, this.c.name, this.perimetr, this.squore);

    }

    public void printNumberOfTriangles() {
        System.out.println("Количество триугольников = " + countOfTriangles);

    }

    public void compareTriangles(Triangle tr) { // метод сравнения триугольников
        if (this.squore > tr.squore) {
            System.out.println("Текущий триугольник БОЛЬШЕ");
        } else {
            if (this.squore < tr.squore) {
                System.out.println("Текущий триугольник МЕНЬШЕ");
            }

            else {
                System.out.println("Триугольники РАВНЫ");

            }
        }
    }
}
