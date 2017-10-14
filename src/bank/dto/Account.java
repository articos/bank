package bank.dto;

public class Account {

    float balance = 0;
    float startingDeposit;

    public Account(float startingDeposit) {
        if (startingDeposit > 999) {this.startingDeposit = startingDeposit;}
        else {System.out.println("ucet nelze zalozit, malo penez"); }
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
