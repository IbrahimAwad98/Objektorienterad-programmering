package Lessons;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

   public void addInterest(){
        double interest = getBalance() * interestRate;
        deposite(interest);
   }


   public String toString(){
        return super.toString() + ", Rate = " + interestRate;
    }

}
