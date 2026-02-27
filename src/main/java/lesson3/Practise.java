package lesson3;

public class Practise {

    public boolean isAdult(int age) {
        return age >= 18;
    }

    public boolean isAmount(int amount) {
        if (amount > 1000) {
            return true;
        } else {
            return false;
        }
    }

    public String isAmountString(int amount) {
        if (amount > 1000) {
            return "true";
        } else {
            return "false";
        }
    }
//задание 1
    public boolean isPosNum (int num) { return num > 0;}
//задание 2
    public String isPosTemp (double temp) {
        if (temp > 37.2) {
            return "true";
        }
        else {
            return "false";
        }
    }
//задание 3
    public int rectangleArea(int a, int b) {
        return a * b;
    }
}

