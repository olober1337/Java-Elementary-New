package lesson2.classwork2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        List list = new ArrayList<>();
//        System.out.println(list.isEmpty());
//        list.add("element");
//        list.add("element");
//        list.add("element1");
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
//        System.out.println(list.contains("element"));
//        System.out.println(list.remove("element"));
//        System.out.println(list.size());
//        System.out.println(list);
//
//        Set set = new HashSet(list);
//        System.out.println(set);
//
//        set.add("hello");
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        Map map = new HashMap();
        map.put("key", "value");
        map.put(1, "value1");

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get(1));
        System.out.println(map.get("key"));
        System.out.println(map.remove("key"));
        System.out.println(map.remove("key", "value"));
    }
}
