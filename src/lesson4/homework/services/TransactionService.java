package lesson4.homework.services;

import lesson4.homework.entities.Client;
import lesson4.homework.utils.Helper;

public class TransactionService {

    public void moneyTransaction(String senderAccountId, String clientAccountId) {

        Helper helper = new Helper();
        helper.checkAccountId(senderAccountId, clientAccountId);
    }
}
