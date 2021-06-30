package lesson4.homework.utils;

import lesson4.homework.exceptions.UserExpectedError;
import lesson4.homework.exceptions.WrongFieldException;
import lesson4.homework.exceptions.WrongSumException;
import lesson5.Client;

public class Helper {

    public void checkIdLength(String clientID) throws WrongFieldException {

        if (clientID.length() != 10) {
            throw new WrongFieldException();
        }
    }

    public void checkSum(Double sum) throws WrongSumException {

        if (sum >= 1000.00) {
            throw new WrongSumException();
        }
    }

    public void checkAccountId(String senderID, String receiverId) {

        if (senderID.equals(receiverId)) {
            throw new UserExpectedError();
        }
    }
}
