package lesson4.homework.exceptions;

public class WrongFieldException extends Exception{

    public WrongFieldException() {
        super("The length of the id is not 10 digits!");
    }
}
