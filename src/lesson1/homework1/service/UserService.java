package lesson1.homework1.service;

import lesson1.homework1.entities.Human;

public class UserService extends AbstractService implements Service {

    public static final String ERROR_MESSAGE = "WriteHumanInfo cannot be applied to UserService";

    @Override
    public void writeHumanInfo(Human human) {
        System.out.println(ERROR_MESSAGE);
    }
}
