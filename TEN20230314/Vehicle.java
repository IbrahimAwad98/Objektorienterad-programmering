package TEN20230314;

public abstract class Vehicle {
    private final String regNumber;
    private Person owner;
    private final Color color;


    public Vehicle(Person owner, String regNumber, Color color) {
        this.owner = owner;
        if (regNumber.length() != 6) {
            throw new IllegalArgumentException("Cant be less than: " + regNumber);
        }
        this.regNumber = regNumber;
        this.color = color;
    }

    public abstract LicenseClass getLicenseClass();

    public String toString() {
        return owner + " ,[" + regNumber + "], " + color;
    }
}
