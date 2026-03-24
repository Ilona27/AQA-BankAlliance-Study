package homework.lesson2;

public class Lesson2VitaTemperature {

    public static void main(String[] args) {
        double temp = 36.5;
        System.out.println(isHighTemperature(temp));
    }
    public static boolean isHighTemperature(double temperature) {
        if (temperature > 37.2) {
            return true;
        } else {
            return false;
        }
    }
}

