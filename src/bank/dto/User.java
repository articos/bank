package bank.dto;

public class User {
    String name;
    Account account;

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
