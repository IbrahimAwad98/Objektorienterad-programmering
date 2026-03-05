package TEN20151028;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final int id;
    private final String userName;
    private String displayName;
    private String password;
    private List<Blog> blogList;


    public User(int id, String userName, String displayName, String password) {
        this.id = id;
        this.userName = userName;
        this.displayName = displayName;
        this.password = password;
        this.blogList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public List<Blog> getBlogList() {
        return new ArrayList<>(blogList);
    }

    void addtoList(Blog blog) {
        blogList.add(blog);
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String newName) {
        this.displayName = newName.toUpperCase();
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public boolean isCorrectPassword(String password) {
        return this.password.equals(password);
    }

    public String toString() {
        return "Username: " + userName + ", name: " + displayName + ", ID [" + id + "].";
    }

}
