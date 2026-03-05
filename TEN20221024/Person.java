package TEN20221024;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private String email;
    private final List<Vehicle> vehicles = new ArrayList<>();

    public Person(String name, String email) {
        this.name = name;
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Wrong: " + email);
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }

    public void addVehicle(Vehicle v) {
        if (vehicles.contains(v)) {
            throw new IllegalStateException("Already owned: " + v);
        }
        vehicles.add(v);
    }

    public boolean removeVehicle(Vehicle v) {
        return vehicles.remove(v);
    }

    public String toString() {
        return "Ower information: " + name + ", Email: " + email + " Owns: " + vehicles;
    }
}