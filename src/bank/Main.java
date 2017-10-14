package bank;

import bank.dto.Account;
import bank.dto.User;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(2000);
        User user = new User("Honza",account1);




    }
}
