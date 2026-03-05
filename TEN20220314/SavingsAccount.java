package TEN20220314;

public class SavingsAccount extends Account {
    private int withDrawCount;

    public SavingsAccount(User user, String accountNumber, double balance) {
        super(user, accountNumber, balance);
        this.withDrawCount = 0;
    }

    public int getNewBalance() {
        return withDrawCount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > getBalance()) {
            throw new IllegalArgumentException("Wrong: " + amount);
        }
        if (withDrawCount > 5) {
            amount += 10;
        }
        balance -= amount;
        withDrawCount++;
    }


    public String toString() {
        return super.toString() + ", Number withdraws: " + withDrawCount;
    }

}
