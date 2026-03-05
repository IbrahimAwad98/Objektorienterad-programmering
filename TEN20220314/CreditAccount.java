package TEN20220314;

public class CreditAccount extends Account {
    private int creditLimit;


    public CreditAccount(User user, String accountNumber, double balance, int creditLimit) {
        super(user, accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > getBalance() + creditLimit) {
            throw new IllegalArgumentException("Wrong: " + amount);
        }
        balance -= amount;
    }

    public String toString() {
        return super.toString() + ", credit limit: " + creditLimit;
    }
}