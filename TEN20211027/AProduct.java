package TEN20211027;

public abstract class AProduct implements IProduct {
    private final String name;
    private final double price, weight;


    public AProduct(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Product: " + name + ", price(kr): " + price + ", weight(kg): " + weight;
    }
}