package helper;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        return email != null && email.length() > 5;
    }
}
