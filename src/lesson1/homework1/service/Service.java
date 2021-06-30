package lesson1.homework1.service;

import lesson1.homework1.entities.Human;

import java.io.IOException;

public interface Service {

    boolean humanChecker(Human human) throws IOException;

    void writeHumanInfo(Human human) throws IOException;

}
