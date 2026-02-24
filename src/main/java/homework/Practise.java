package homework;

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

    public boolean checkPositive(int number)
    {if (number > 0){
        return true;
    } else {
        return false;
    }
    }

    public boolean temperature(double amount) {
        if (amount > 37.2) {
            return true;
        } else {
            return false;
        }
    }

    public int calculate(int a, int b)
    {return (a+b)*2;
    }



    public String isAmountString(int amount) {
        if (amount > 1000) {
            return "true";
        } else {
            return "false";
        }
    }


}
