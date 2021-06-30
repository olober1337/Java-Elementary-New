package lesson4.homework.exceptions;

public class UserExpectedError extends RuntimeException{

    public UserExpectedError() {
        super("The sender id and receiver id is the same!");
    }
}
