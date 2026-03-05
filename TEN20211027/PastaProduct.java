package TEN20211027;

public class PastaProduct extends AProduct {
    private final Type pastType;

    public PastaProduct(String name, double price, double weight, Type pastType) {
        super(name, price, weight);
        this.pastType = pastType;
    }

    public Type getPastType() {
        return pastType;
    }

    public String toString() {
        return super.toString() + ",Type: " + pastType;
    }

}
