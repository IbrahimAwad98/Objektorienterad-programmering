package TEN20230314;

public class Car extends Vehicle {
    private final int nrOfdoors;


    public Car(Person owner, String regNumber, Color color, int nrOfdoors) {
        super(owner, regNumber, color);
        this.nrOfdoors = nrOfdoors;
    }

    public int getNrOfdoors() {
        return nrOfdoors;
    }

    public LicenseClass getLicenseClass() {
        return LicenseClass.B;
    }

    public String toString() {
        return super.toString() + ", Total doors: " + nrOfdoors;
    }
}