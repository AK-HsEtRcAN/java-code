// File: Balance/Account.java
package Balance;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}
