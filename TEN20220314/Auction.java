package TEN20220314;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Auction {
    private final User user;
    private final String itemName;
    private final LocalDateTime endTime;
    private List<Bid> bids;

    public Auction(User user, String name, LocalDateTime endTime) {
        this.user = user;
        this.itemName = name;
        this.endTime = endTime;
        bids = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public String getItemName() {
        return itemName;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    //kopia
    public List<Bid> getBids() {
        return new ArrayList<>(bids);
    }

    public void addBid(User user, double amount) {
        if (amount < getHighestBid() || LocalDateTime.now().isAfter(endTime)) {
            throw new IllegalBidException("Wrong: " + amount + ", " + endTime);
        }
        bids.add(new Bid(user, amount));
    }

    private double getHighestBid() {
        double highest = 0.0;
        for (Bid b : bids) {
            if (b.getAmount() > highest) {
                highest = b.getAmount();
            }
        }
        return highest;
    }

    public boolean isClosed() {
        return LocalDateTime.now().isAfter(endTime);
    }

    @Override
    public String toString() {
        return "Auction{" +
                "user=" + user +
                ", itemName='" + itemName + '\'' +
                ", endTime=" + endTime +
                ", bids=" + bids +
                '}';
    }
}
