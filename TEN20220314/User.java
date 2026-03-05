package TEN20220314;

public class User {
    private final String name;
    private final int id;
    private Email email;

    public User(String name, int id, Email email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String toString() {
        return "User[" + id + ", " + name + ", " + email + "]";
    }
}