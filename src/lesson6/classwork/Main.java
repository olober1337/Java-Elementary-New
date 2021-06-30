package lesson6.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String USER_STATUS_INFO = "User with id=%d has status %s";

    public static void main(String[] args) {

//        Client client1 = new Client("name", "surname");
//        Client client2 = new Client("name", "surname");
//
//        Map<Client, String> map = new HashMap<>();
//
//        map.put(client1, "test");
//        System.out.println(map);
//        System.out.println(map.get(client2));
//
//        client1.setName("name1");
//        System.out.println(map.get(client2));

//        System.out.printf(USER_STATUS_INFO, 1231, "active");
//        System.out.printf(USER_STATUS_INFO, 1231, "active");

        Pattern pattern = Pattern.compile("^St");
        Matcher matcher = pattern.matcher("Start dfgdf sdfgdg");

        System.out.println(matcher.find());
//        System.out.println(matcher.find());

    }
}
