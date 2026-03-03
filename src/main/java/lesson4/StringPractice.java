package lesson4;

public class StringPractice {

    public boolean isErrorContains(String message) {
        return message != null && message.equalsIgnoreCase("error");
    }

    public boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.length() > 10;
    }
}
