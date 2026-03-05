package TEN20211027;

import java.time.LocalDate;

public class DairyProduct extends AProduct {
    private final LocalDate bestBefore;

    public DairyProduct(String name, double price, double weight, LocalDate bestBefore) {
        super(name, price, weight);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    public String toString() {
        return super.toString() + "Best before: " + bestBefore.toString();
    }
}