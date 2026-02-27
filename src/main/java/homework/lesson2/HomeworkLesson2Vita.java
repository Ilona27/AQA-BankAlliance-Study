package homework.lesson2;

public class HomeworkLesson2Vita {

    public static void main(String[] args) {

        HomeworkLesson2Vita hw = new HomeworkLesson2Vita();

        int number = 5;
        double temperature = 38.5;
        double base = 10;
        double height = 5;

        boolean isPositive = hw.isPositive(number);
        boolean isHigh = hw.isHighTemperature(temperature);
        double area = hw.calculateTriangleArea(base, height);

        System.out.println(isPositive);
        System.out.println(isHigh);
        System.out.println(area);
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public boolean isHighTemperature(double temperature) {
        return temperature > 37.2;
    }

    public double calculateTriangleArea(double a, double h) {
        return (a * h) / 2;
    }
}