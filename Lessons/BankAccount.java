package Lessons;

public class BankAccount implements Describable {
    private double balance;

    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Cant be: " + balance);
        }
        this.balance = balance;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Cant be: " + amount);
        }
    }

    public void withDraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Not positiv");
        }
        balance -= amount;
    }

    public String describe() {
        return getBalance() + "kr";
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Balance = " + balance;
    }
}