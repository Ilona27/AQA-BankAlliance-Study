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
}
