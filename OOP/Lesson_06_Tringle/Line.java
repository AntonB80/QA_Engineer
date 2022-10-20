package Lesson_06_Tringle;

public class Line {
    Point begin;
    Point end;
    String name;
    double length;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;

        this.name = begin.name + end.name;

        this.length = generateLength();
    }

    private double generateLength() {
        return Math.sqrt(Math.pow(end.x - begin.x, 2) + Math.pow(end.y - begin.y, 2));
    }

    public void print() {
        System.out.printf("Line has name %s,length is %.2f\n", this.name, this.length);

    }

}
