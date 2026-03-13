package homework.lesson2;

public class Lesson2VitaNumber {

    public static void main(String[] args) {

        int number = 5;

        boolean isPositive = isPositive(number);

        System.out.println(isPositive);
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

}



