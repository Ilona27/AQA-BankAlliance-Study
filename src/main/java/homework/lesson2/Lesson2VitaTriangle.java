package homework.lesson2;

public class Lesson2VitaTriangle {

    public static void main(String[] args) {

        double base = 10;
        double height = 5;

        double area = calculateTriangleArea(base, height);

        System.out.println(area);
    }

    public static double calculateTriangleArea(double a, double h) {
        return (a * h) / 2;
    }
}