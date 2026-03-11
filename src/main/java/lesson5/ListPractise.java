package lesson5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPractise {

    public static void main(String[] args) {
        List<String> statuses = new ArrayList<>();
        statuses.add("SUCCESS");
        statuses.add("FAIL");
        statuses.add("ERROR");
        statuses.add("ERROR");

//        statuses.get(0);
//        statuses.get(1);
//        statuses.get(2);
//        statuses.get(3);

        int count = 0;
        for (String status: statuses) {
            if (status.equals("ERROR")) {
                count++;
            }
        }

        for (int i = 0; i < statuses.size(); i ++) {
            if (statuses.get(i).equals("ERROR")) {
                statuses.remove(i);
                i--;
            }
        }

        System.out.println(statuses);

//        System.out.println(count);

//        long count = statuses
//                .stream()
//                .filter(status -> status.equals("ERROR"))
//                .count();

//        LinkedList<String> animal = new LinkedList<>();
//        animal.add("Dog");
//        animal.addFirst("Cat");
//        animal.addLast("Bird");
//
//        System.out.println(animal.getFirst());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < statuses.size(); i++) {
            stringBuilder.append(statuses.get(i));

            if (i < statuses.size() - 1) {
                stringBuilder.append(", ");
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
