package Lesson_06_Tringle;

// метод сравнения триугольников в отдельном классе
public class TrianglesCompare {

    public void compareTriangles(Triangle tr1, Triangle tr2) {
        if (tr1.squore > tr2.squore) {
            System.out.println("Триугольник с большей площадью");
            tr1.print();
        } else {
            if (tr1.squore < tr2.squore) {
                System.out.println("Триугольник с большей площадью");
                tr2.print();
            } else {
                System.out.println("Триугольники равны");

            }

        }
    }

    // возвращение наибольшего триугольника
    public Triangle whoIsBigger(Triangle tr1, Triangle tr2) {
        if (tr1.squore > tr2.squore)
            return tr1;
        else
            return tr2;
    }
}
