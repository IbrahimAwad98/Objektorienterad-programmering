package TEN20220314;

public abstract class Account implements Comparable<Account> {
    private final User user;
    private final String accountNumber;
    protected double balance;

    public Account(User user, String accountNumber, double balance) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Wrong: " + amount);
        }
        balance += amount;
    }

    public abstract void withdraw(double amount);

    public int compareTo(Account other) {
        return this.accountNumber.compareTo(other.accountNumber);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account a = (Account) obj;
        return this.compareTo(a) == 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "user=" + user +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
