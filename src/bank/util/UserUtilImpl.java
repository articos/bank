package bank.util;

import bank.dto.User;

public class UserUtilImpl implements UserUtil {

    @Override
    public void transferMoney(User withdrawUser, User depositUser, float ammount) {
        withdrawUser.getAccount().setBalance(withdrawUser.getAccount().getBalance() - ammount);
        depositUser.getAccount().setBalance(depositUser.getAccount().getBalance() + ammount);
    }

    @Override
    public void reportBalance(User user) {
        System.out.println(user.getAccount().getBalance());
    }
}
