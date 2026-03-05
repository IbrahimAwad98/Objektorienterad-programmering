package TEN20221024;

public class RegNumber {
    private final String number;

    private RegNumber(String number) {
        this.number = number;
    }

    public static RegNumber getInstance(String number) {
        if (!number.matches("[A-Z]{3}[0-9]{3}")) {
            throw new IllegalArgumentException("Not Allowed register");
        }
        return new RegNumber(number);
    }

    public String getNumber() {
        return number;
    }

    public String toString() {
        return "[" + number + "]";
    }
}