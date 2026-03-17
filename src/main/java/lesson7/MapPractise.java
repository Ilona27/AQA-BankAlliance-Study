package lesson7;

import java.util.*;

public class MapPractise {

//    public static void main(String[] args) {
//        Map<String, String> credentials = new HashMap<>();
//        credentials.put("login", "admin");
//        credentials.put("password", "123");
//        credentials.put("login", "test");
//        System.out.println(credentials.get("login"));
//        System.out.println(credentials.get("token"));
//        System.out.println(credentials.containsKey("token"));
//        System.out.println(credentials.containsValue("test"));
//        System.out.println(credentials.size());
//        System.out.println(credentials.isEmpty());
//
//        String removed = credentials.remove("login");
//        System.out.println(removed);
//        credentials.put("login", "admin");
//
////        boolean isRemoved = credentials.remove("login", "admin");
////        System.out.println(isRemoved);
//
//        String token = credentials.getOrDefault("token", "NO_TOKEN");
//        System.out.println(token);
//
//        credentials.putIfAbsent("login", "newLogin");
//        System.out.println(credentials.get("login"));
//
//        for(String key: credentials.keySet()) {
//            System.out.println("key: " + key);
//        }
//
//        for (String value: credentials.values()) {
//            System.out.println("value: " + value);
//        }
//
//        for (Map.Entry<String, String> entry: credentials.entrySet()) {
//            System.out.println(entry.getKey() + "-> " + entry.getValue());
//        }
//
//        credentials.forEach((k, v) -> System.out.println(k + " -> " + v));
//    }

    public static void main(String[] args) {
        String[] statuses = {"ERROR", "SUCCESS", "ERROR", "FAILED", "ERROR", "SUCCESS"};

        Map<String, Integer> statusCounts = new HashMap<>();

        for (String status: statuses) {
            statusCounts.put(status, statusCounts.getOrDefault(status, 0) + 1);
        }

        System.out.println(statusCounts);

        String topStatus = null;
        int max = 0;

        for (Map.Entry<String, Integer> entry: statusCounts.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                topStatus = entry.getKey();
            }
        }
        System.out.println(topStatus);

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        for (Map<String, Integer> map : List.of(hashMap, linkedHashMap, treeMap)) {
            map.put("B", 2);
            map.put("A", 1);
            map.put("C", 3);

            System.out.println(map.getClass().getSimpleName() + ": " + map);
        }
    }
}
