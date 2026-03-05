package TEN20230314;

public class Motorcycle extends Vehicle {
    private final boolean isLightWeight;

    public Motorcycle(Person owner, String regNumber, Color color, boolean isLightWeight) {
        super(owner, regNumber, color);
        this.isLightWeight = isLightWeight;
    }

    public boolean isLightWeight() {
        return isLightWeight;
    }

    public LicenseClass getLicenseClass() {
        if (isLightWeight) {
            return LicenseClass.A1;
        }
        return LicenseClass.A;
    }

    public String toString() {
        return super.toString() + ",is lightWeight: " + isLightWeight;
    }
}