package TEN20221024;

public class Vehicle {
    private final Type type;
    private final String model;
    private final RegNumber regNumber;

    public Vehicle(Type type, String model, RegNumber regNumber) {
        this.type = type;
        this.model = model;
        this.regNumber = regNumber;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public RegNumber getRegNumber() {
        return regNumber;
    }

    public String toString() {
        return type + " | " + model + " | " + regNumber;
    }
}