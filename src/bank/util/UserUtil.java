package bank.util;

import bank.dto.User;

public interface UserUtil {

    /**
     * whidraw from one accoutn to another
     * @param withdrawUser
     * @param depositUser
     * @param ammount
     */

    void transferMoney(User withdrawUser, User depositUser, float ammount);

    /**
     * sout balance
     * @param user
     */
    void reportBalance(User user);

}
