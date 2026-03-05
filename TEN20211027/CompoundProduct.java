package TEN20211027;

import java.util.ArrayList;
import java.util.List;

public class CompoundProduct implements IProduct {
    private final String name;
    private final ArrayList<IProduct> products;

    public CompoundProduct(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    //en kopia
    public List<IProduct> getProducts() {
        return new ArrayList<>(products);
    }

    public void addProduct(IProduct product) {
        products.add(product);
    }

    public boolean remove(IProduct product) {
        return products.remove(product);
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (IProduct p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public double getWeight() {
        double total = 0;
        for (IProduct p : products) {
            total += p.getWeight();
        }
        return total;
    }

    public String toString() {
        return name + ",[" + products.toString() + "]";
    }
}
