package Lesson_06_Tringle;

public class main01 {
    public static void main(String[] args) {

        Point p1 = new Point("A", 2, 3);
        Point p2 = new Point("B", 3, 5);
        Point p3 = new Point("C", 1, 6);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p1, p3);
        Line l3 = new Line(p2, p3);

        // l1.print();
        // l2.print();
        // l3.print();

        // task#9
        // Даны стороны двух треугольников. Найти сумму их периметров и сумму их
        // площадей. (Определить процедуру для расчета периметра и площади треугольника
        // по его сторонам.)

        Triangle t1 = new Triangle(l1, l2, l3);
        t1.print();
        // t1.printNumberOfTriangles();

        Point p4 = new Point("D", 4, 3);
        Line l4 = new Line(p1, p4);
        // l4.print();

        Triangle t2 = new Triangle(l1, l2, l4);
        t2.print();
        System.out.printf("Сумма периметров двух триугольников = %.1f\n", t1.perimetr
                + t2.perimetr);
        System.out.printf("Сумма площадей двух триугольников = %.1f\n", t1.squore +
                t2.squore);

        Triangle t3 = new Triangle(l1, l2, l3);
        t3.printNumberOfTriangles();
        Triangle t4 = new Triangle(l1, l2, l3);
        t4.printNumberOfTriangles();
        Triangle t5 = new Triangle(l1, l2, l3);
        t5.printNumberOfTriangles();

        // метод сравнения триугольников внутри класса

        t1.compareTriangles(t2); // Текущий триугольник БОЛЬШЕ
        t2.compareTriangles(t1); // Текущий триугольник МЕНЬШЕ
        t1.compareTriangles(t1); // ==

        // метод сравнения триугольников в отдельном классе

        TrianglesCompare tc1 = new TrianglesCompare();
        tc1.compareTriangles(t1, t2);

        // возвращение наибольшего триугольника при помощи класса
        tc1.whoIsBigger(t1, t2).print();
        ;

    }
}