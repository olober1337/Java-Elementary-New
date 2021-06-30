package lesson5;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Vadym", "not Vadym");
        Client client1 = new Client("Vadym", "not Vadym");

//        Integer integer1 = new Integer(1);
//        Integer integer2 = new Integer(1);
//        Class<?> classClient = client.getClass();
//        System.out.println(client.getClass());

        //460141958
        //System.out.println(client.hashCode());
        //1163157884
        //System.out.println(client1.hashCode());

//        client.setName("dym");
       // System.out.println(client.hashCode());
        //System.out.println(client1.hashCode());

//        HashSet<Client> clients = new HashSet<>();
//        clients.add(client);
//        clients.add(client1);
//
//        System.out.println(clients);

        Client client2 = new Client("Vadym", "not Vadym");
        Client client3 = new Client("not Vadym", "Vadym");

        System.out.println(client2 == client3);

    }

    public static void test(Client client) {

    }
}
