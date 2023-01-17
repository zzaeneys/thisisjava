package ch06.verify.num19;

public class Account {
    int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
            this.balance = getBalance();
        } else {
            this.balance = balance;
        }
    }
}
