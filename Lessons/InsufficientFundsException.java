package Lessons;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(double amount) {
        super("Insufficient balance: " + amount);
    }
}
