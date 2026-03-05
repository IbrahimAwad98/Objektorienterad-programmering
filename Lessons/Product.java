package Lessons;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int compareTo(Product other) {
        int result = Double.compare(this.price, other.price);
        if (result == 0) {
            result = this.name.compareTo(other.name);
        }
        return result;
    }

    public boolean equals(Product other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product p = (Product) other;
        return Double.compare(this.price, p.price) == 0 &&
                this.name.equals(other.name);
    }

    public int hashCode() {
        return Objects.hash(price, name);
    }

    public String toString() {
        return name + ", " + price + " kr.";
    }


    public static void main(String[] args) {
        Product product1 = new Product("Apple", 20.40);
        Product product2 = new Product("Kiwi", 15.05);
        Product product3 = new Product("Kiwi", 15.05);
        System.out.println(product2.equals(product3));
        System.out.println(product2.compareTo(product3));
        System.out.println(product1.compareTo(product2));
    }
}