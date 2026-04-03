import lesson3.Practise;
import lesson4.StringPractice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        String message = " Hello World ";
//        String message2 = "World";
//        System.out.println(message.replace("1", "").trim());
////        System.out.println( message + " " + message2);
//        char [] characters = message.trim().toCharArray();
//        for (char character: characters) {
//            System.out.println(character);
//        }
//
//        StringPractice stringPractice = new StringPractice();
//        System.out.println(stringPractice.isErrorContains("Error"));
//        System.out.println(stringPractice.isValidEmail("ikokhan@gmail.com"));
//
//        String [] messages = {
//                "Payment SUCCESS",
//                "Payment ERROR",
//                "Payment FAIL",
//                "Business Error"
//        };
//
//        for (String string: messages) {
//            if (string.contains("ERROR")) {
//                System.out.println("ERROR FOUND");
//            }
//        }

//        String result = "";
//        for (int i = 0; i<10000; i++) {
//            result += i;
//        }

        //1 ітерація "";
        //2 ітерація "0";
        //3 ітерація "01";


//        StringBuilder practise = new StringBuilder();
//        practise.append("Hello World");
//        practise.append("Beautiful");
//
//        String name = "Hello" + "World" + "Beautiful";
//        practise.toString();
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i<5; i++) {
//            stringBuilder.append(i);
//        }
//
//        String result = stringBuilder.toString();

        StringBuilder stringBuilder = new StringBuilder("Hello World");
//        stringBuilder.insert(6, "Beautiful ");
//        stringBuilder.delete(6, 15);
        stringBuilder.replace(6, 11, "Java");
        stringBuilder.reverse();
        int a = stringBuilder.length();

        StringBuilder practise = new StringBuilder();
        int capacity = practise.capacity();
        System.out.println(capacity);
//        System.out.println(a);
    }
}
