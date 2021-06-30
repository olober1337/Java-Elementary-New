package lesson4.homework.exceptions;

public class WrongSumException extends Exception{

    public WrongSumException() {
        super("The sum is more than 1000!");
    }
}
