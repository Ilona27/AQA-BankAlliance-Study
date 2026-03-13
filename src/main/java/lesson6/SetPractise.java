package lesson6;

import java.util.*;

public class SetPractise {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("SUCCESS");
        set.add("ERROR");
        set.add("ERROR");

        System.out.println(set.size());
        System.out.println(set.contains("SUCCESS"));
        System.out.println(set.isEmpty());

        System.out.println(set);

        Set<User> userSet = new HashSet<>();
        userSet.add(new User("a@gmail.com"));
        userSet.add(new User("a123@gmail.com"));

        //a.equals(b) == true тоді і a.hashcode() == b.hashcode()
        System.out.println(userSet.size());

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Cat");
        linkedHashSet.add("Bird");
        System.out.println(linkedHashSet);

        TreeSet<String> sorted = new TreeSet<>();
        sorted.add("B");
        sorted.add("A");
        sorted.add("C");
        sorted.add("A");
        System.out.println(sorted);

        List<String> logs = List.of("ERROR: invalid card", "ERROR: invalid card", "ERROR_BUSINESS", "SUCCESS", "ERROR_TECHNICAL");
        Set<String> uniqueLogs = new HashSet<>(logs);

        boolean hasDuplicated = logs.size() != uniqueLogs.size();
        System.out.println(hasDuplicated);

        LinkedHashSet<String> uniqueLogsLinked = new LinkedHashSet<>(logs);
        System.out.println(uniqueLogs);
        System.out.println(uniqueLogsLinked);

        Set<String> sortedList = new TreeSet<>(logs);
        System.out.println(sortedList);
    }
}
