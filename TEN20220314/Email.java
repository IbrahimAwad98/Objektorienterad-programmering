package TEN20220314;

public class Email {
    private String address;

    private Email(String email) {
        this.address = email;
    }

    public static Email getInstance(String address) {
        if (!address.contains("@")) {
            throw new IllegalArgumentException("Wrong email");
        }
        return new Email(address);
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return address;
    }
}