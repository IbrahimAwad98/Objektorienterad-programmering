package TEN20220314;

import java.time.LocalDateTime;

public class Bid {
    private final User bidder;
    private final double amount;
    private final LocalDateTime time;


    public Bid(User bidder, double amount) {
        this.bidder = bidder;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    public User getBidder() {
        return bidder;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getBidTime() {
        return time;
    }

    public String toString() {
        return "Bid information [" + bidder + ", amount= " + amount + "(kr), Time(" + time + ")]";
    }
}